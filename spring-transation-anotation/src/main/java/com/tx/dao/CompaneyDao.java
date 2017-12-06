package com.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tx.bo.CompaneyBo;
@Repository
public class CompaneyDao {
	private final String SQL_INSERT_COMPANEY = "INSERT INTO COMPANEY(COMPANEY_ID,COMPANEY_NM,SERVICE_TYPE,LOCATION) VALUES (:companeyId,:companeyNm,:serviceType,:location)";
	@Autowired
	private NamedParameterJdbcTemplate npJdbcTemplate;

	public void saveCompaney(CompaneyBo bo) {

		/*		MapSqlParameterSource parameterSoruce=null;
		parameterSoruce=new MapSqlParameterSource();
		parameterSoruce.addValue("COMPANEY_ID",bo.getCompaneyId());
		parameterSoruce.addValue("COMPANEY_NM",bo.getCompaneyNm());
		parameterSoruce.addValue("SERVICE_TYPE",bo.getServiceType());
		parameterSoruce.addValue("LOCATION",bo.getLocation()); (or)*/

		BeanPropertySqlParameterSource parameterSoruce = null;
		parameterSoruce = new BeanPropertySqlParameterSource(bo);
		npJdbcTemplate.update(SQL_INSERT_COMPANEY, parameterSoruce);
		
	}

}
