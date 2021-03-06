package RowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.projetoc.escalade.model.Sites;

/* 
Implementation pour définir le mapping entre les lignes de résultats d'une requête Sql et les objets java à créer.
*/

public class SitesMapper implements RowMapper<Sites> {
    
	
	public Sites mapRow(ResultSet rs, int rowNum) throws SQLException {
		Sites sites = new Sites();
		sites.setNom_du_site(rs.getString("nom_du_site"));
		sites.setNombre_de_secteur(rs.getInt("nombre_de_secteur"));


		return sites;

}
}
