package it.vidoc.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;

public class MyBatisConnectionFactory {
	private static SqlSession sqlSession = null;
	private static SqlSessionFactory sqlSessionFactory = null;
	private static Session session = null;
	private static String resource = null;

	public static void openSqlSessionFactory() throws IOException {
		if (session == null) {
			session = Sessions.getCurrent();
		}
		if (session.getServerName().startsWith("localhost")) {
			resource = "MyBatisSqlMapConfig.xml";
		} else {
			resource = "MyBatisSqlMapConfigRemote.xml";
		}
		if (sqlSessionFactory == null) {
//			String resource = "MyBatisSqlMapConfig.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			sqlSessionFactory = (SqlSessionFactory) builder.build(reader);
		}
	}

	public static SqlSession getSqlSession() {
		openSqlSession();
		return sqlSession;
	}

	public static void openSqlSession() {
		try {
			openSqlSessionFactory();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			sqlSession = sqlSessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void closeSqlSession() {
		sqlSession.close();
	}

	// public static SqlSessionFactory myBatisConnectionFactory() throws
	// IOException {
	// String resource = "MyBatisSqlMapConfig.xml";
	// Reader reader = Resources.getResourceAsReader(resource);
	// SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
	//
	// sqlSessionFactory = (SqlSessionFactory) builder.build(reader);
	// return sqlSessionFactory;
	//
	//// return builder.build(reader);
	// }

	// public static Object myBatisConnectionFactory(Class classe) {
	// try {
	// String resource = "/MyBatisSqlMapConfig.xml";
	// Reader reader = Resources.getResourceAsReader(resource);
	// if (sqlSessionFactory == null) {
	// sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	// //sqlSessionFactory.getConfiguration().addMapper(CdsMapper.class);
	// sqlSessionFactory.getConfiguration().addMapper(classe.getClass());
	// }
	// }
	// catch (FileNotFoundException fileNotFoundException) {
	// fileNotFoundException.printStackTrace();
	// }
	// catch (IOException iOException) {
	// iOException.printStackTrace();
	// }
	// return sqlSessionFactory;
	// }
}