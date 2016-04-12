package it.vidoc.mybatis.javaclient.ext;

import it.vidoc.mybatis.javamodel.Strcodprvres;
import it.vidoc.mybatis.javamodel.StrcodprvresExample;

import java.util.List;

public interface StrcodprvresMapperExt {
	/**
	 * QUERY PERSONALIZZATE
	 */

	List<Strcodprvres> selectKanagra(StrcodprvresExample example);
	
}