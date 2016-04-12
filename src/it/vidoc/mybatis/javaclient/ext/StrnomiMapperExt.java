package it.vidoc.mybatis.javaclient.ext;

import java.util.List;
import java.util.Map;

public interface StrnomiMapperExt {

	/**
	 * QUERY PERSONALIZZATE
	 */
	
//	List<Strnomi03> selectKanagra(Map<String, String> map);
	List<Integer> selectKanagra(Map<String, String> map);
}