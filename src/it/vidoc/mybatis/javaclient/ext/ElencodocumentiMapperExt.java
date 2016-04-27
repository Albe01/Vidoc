package it.vidoc.mybatis.javaclient.ext;

import it.vidoc.mybatis.javamodel.Elencodocumenti;

public interface ElencodocumentiMapperExt {

	/**
	 * QUERY PERSONALIZZATE
	 */
	
	Integer insertReturnID(Elencodocumenti object);
}