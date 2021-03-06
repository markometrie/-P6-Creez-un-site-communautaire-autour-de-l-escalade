package com.escalade.controllers;

import com.escalade.resources.AbstractResource;
import com.escalde.business.manager.UtilisateurManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.projetoc.escalade.model.Utilisateur;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  Controller chargé de synchroniser le Model et la Vue
 *  Récupérer les données utilisateur pour les filitrer via  
 *  le model et déléguer la production de sortie à la vue.
 * @author Matthieu Delomez
 */
@Controller
public class UtilisateurController extends AbstractResource {
    
    
    private UtilisateurManager utilisateurManager = getManagerFactory().getUtilisateurManager();

        
    @RequestMapping("/utilisateur")
    public String utilisateur(){
        
        
        return "utilisateur";
        
        
    }
    
    // Paramétrage des données d'inscription pour afficher dans la vue
    @PostMapping("/inscription")
   public String inscription (HttpServletRequest request){
       Utilisateur utilisateur = new Utilisateur();
       utilisateur.setEmail(request.getParameter("email" ));
       utilisateur.setNom(request.getParameter("nom" ));
       utilisateur.setPrenom(request.getParameter("prenom" ));
       utilisateur.setPseudo(request.getParameter("pseudo" ));
       utilisateur.setMotPasse(request.getParameter("motpasse" ));

              // Ajout d'un nouvel utilisateur dans la base
              utilisateurManager.addUser(utilisateur);

              return "redirect:/";

   }	

   /*
   GetMapping: Appel à la session utilisateur
   Si l'utilisateur est identifié alors session non active
   Sinon afficher la page inscription.jsp
   */
   @GetMapping("/inscription")
   public String initInscription(HttpServletRequest request) {
       HttpSession session = request.getSession();
       if (session.getAttribute("user") != null) {
           return "redirect:/";
       }
       return "inscription";
   }
   
   

   @PostMapping("/login")
   public String login (HttpServletRequest request){
            
            Utilisateur utilisateur = new Utilisateur();
            utilisateur.setEmail(request.getParameter("email"));
            utilisateur.setMotPasse(request.getParameter("motpasse"));
            
            HttpSession session = request.getSession();
            


                Utilisateur user = utilisateurManager.getUser(utilisateur);
                if(user != null ){
                    session.setAttribute("user", user);
                    
                   return "redirect:/";
                    
                }
            return "redirect:/login";
        }
	
        
           @GetMapping("/login")
           public String initLogin(HttpServletRequest request) {
           HttpSession session = request.getSession();
           if (session.getAttribute("user") != null) {
           return "redirect:/";
       }
       return "login";
   }
   
   

  }