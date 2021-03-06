package RowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.projetoc.escalade.model.EspacePret;

/* 
Implementation pour définir le mapping entre les lignes de résultats d'une requête Sql et les objets java à créer.
*/

public class EspacePretMapper implements RowMapper<EspacePret>{
    

	public EspacePret mapRow(ResultSet rs, int rowNum) throws SQLException {
		EspacePret pret = new EspacePret();
		pret.setDate_de_location(rs.getString("date_de_location"));
		pret.setPseudo_proprio(rs.getString("pseudo_proprio"));
		pret.setRef(rs.getString("topo_ref"));


		return pret;
	}
}
