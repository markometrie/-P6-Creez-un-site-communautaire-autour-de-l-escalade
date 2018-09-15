package org.projetoc.escalade.consumer.impl.dao;

import java.sql.Types;

import org.projetoc.escalade.consumer.contract.dao.PublicationDao;
import org.projetoc.escalade.model.Publication;
import org.projetoc.escalade.model.Utilisateur;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import RowMapper.PublicationMapper;
import RowMapper.UtilisateurMapper;

public class PublicationDaoImpl extends AbstractDaoImpl implements PublicationDao {

	@Override
	public void addPublication(Publication publication) {
		String sql = "INSERT INTO publication (titre, description, date_maj, pseudo) VALUES (?,?,?,?)";
		MapSqlParameterSource args = new MapSqlParameterSource();
		args.addValue("publication_titre", publication.getTitre(), Types.VARCHAR);
		args.addValue("publication_description", publication.getDescription(), Types.VARCHAR);
		args.addValue("publication_date_maj", publication.getDate_maj(), Types.VARCHAR);
		args.addValue("publication_pseudo", publication.getPseudo(), Types.VARCHAR);

		try {
			getNamedParameterJdbcTemplate().update(sql, args);
		} catch (DuplicateKeyException exception) {
			System.out.println(exception.getMessage());
		}

	}

	@Override
	public Publication getPublication(Publication publication) {
		String sql = "SELECT * FROM publication WHERE date_maj = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		Object[] args = new Object[] {
				 publication.getDate_maj()
		};


		try {
			RowMapper<Publication> rowMapper = new PublicationMapper();
			Publication publicationQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);
    		return publicationQuery;

		} catch (EmptyResultDataAccessException exception) {
			System.out.println("Incorrect");
			return null;
		}

	}

	@Override
	public void deletePublicationPicture(Publication publication) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePublication(Publication publication) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePublication(Publication publication) {
		// TODO Auto-generated method stub

	}

}
