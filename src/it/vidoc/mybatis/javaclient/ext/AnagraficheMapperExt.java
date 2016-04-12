package it.vidoc.mybatis.javaclient.ext;

import java.util.List;
import java.util.Map;

import it.vidoc.mybatis.javamodel.Anagrafiche;
import it.vidoc.utils.ParamQuery;

public interface AnagraficheMapperExt {

	/**
	 * QUERY PERSONALIZZATE
	 */
	
	List<Anagrafiche> selectLimit(Map<String, Integer> map);
	List<Long> selectWithJoin(Map<String,List<ParamQuery>> map);

}