package RowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.projetoc.escalade.model.Topo;

/* 
Implementation pour définir le mapping entre les lignes de résultats d'une requête Sql et les objets java à créer.
*/

public class TopoMapper implements RowMapper<Topo> {
    
	
	public Topo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Topo topo = new Topo();
		topo.setRef(rs.getString("ref"));
		topo.setNom(rs.getString("nom"));
		topo.setDescriptif(rs.getString("descriptif"));
		topo.setNiveau_du_topo(rs.getString("niveau_du_topo"));
		topo.setType_de_topo(rs.getString("niveau_du_topo"));
		topo.setNom_du_site(rs.getString("nom_du_site"));


		return topo;
	}

}
