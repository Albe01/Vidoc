package it.vidoc.mybatis.javaclient.ext;

import it.vidoc.mybatis.javamodel.Account;

public interface AccountMapperExt {

	/**
	 * QUERY PERSONALIZZATE
	 */
	
	Integer insertReturnID(Account object);
}