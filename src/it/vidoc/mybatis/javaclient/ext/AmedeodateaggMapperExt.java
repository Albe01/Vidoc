package it.vidoc.mybatis.javaclient.ext;

import java.util.List;

import it.vidoc.mybatis.javamodel.ext.AmedeodateaggExt;

public interface AmedeodateaggMapperExt {

	/**
	 * QUERY PERSONALIZZATE
	 */
	
	List<AmedeodateaggExt> selectDateAgg();

}