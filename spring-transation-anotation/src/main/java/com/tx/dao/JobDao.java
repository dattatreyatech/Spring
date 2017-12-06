package com.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tx.bo.JobBo;
@Repository
public class JobDao {
	private final String SQL_INSERT_JOB = "INSERT INTO JOB(JOB_NO,TITLE,DESCRIPTION,QUALIFICATION,EXPERIANCE) VALUES(:jobNo,:title,:description,:Qualification,:experiance)";
	@Autowired
	private NamedParameterJdbcTemplate npJdbcTemplate;
	public void saveJob(JobBo bo) {
		
		BeanPropertySqlParameterSource parameterSoruce = null;
		parameterSoruce = new BeanPropertySqlParameterSource(bo);
		npJdbcTemplate.update(SQL_INSERT_JOB, parameterSoruce);

	}

}
