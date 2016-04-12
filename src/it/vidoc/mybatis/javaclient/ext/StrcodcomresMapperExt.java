package it.vidoc.mybatis.javaclient.ext;

import it.vidoc.mybatis.javamodel.Strcodcomres;
import it.vidoc.mybatis.javamodel.StrcodcomresExample;

import java.util.List;

public interface StrcodcomresMapperExt {
	/**
	 * QUERY PERSONALIZZATE
	 */

	List<Strcodcomres> selectKanagra(StrcodcomresExample example);
	
}