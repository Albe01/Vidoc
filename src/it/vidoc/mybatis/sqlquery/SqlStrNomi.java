package it.vidoc.mybatis.sqlquery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import it.vidoc.mybatis.javaclient.ext.StrnomiMapperExt;
import it.vidoc.utils.CreaNomeTabStringhe;
import it.vidoc.utils.MyBatisConnectionFactory;

public class SqlStrNomi implements ISqlGeneric {
	
	private final Logger logger = Logger.getLogger(getClass());

	@Override
	public <T, U> T setWhereCondition(U oggetto, String orderBy) {
		return null;
	}

	public List<Integer> getStrNomi(String parola) {
		StrnomiMapperExt strnomiMapperExt = MyBatisConnectionFactory.getSqlSession().getMapper(StrnomiMapperExt.class);
		Map<String, String> param = new HashMap<String, String>();
		param.put("tableName", new CreaNomeTabStringhe().creaNomeTabStringhe("nome", parola.length()));
		param.put("parola", parola);
		List<Integer> listKanagra = strnomiMapperExt.selectKanagra(param);
		MyBatisConnectionFactory.closeSqlSession();
		return listKanagra;
	}

	@Override
	public <T, U> T selectByPrimaryKey(U idOggetto) {
		return null;
	}

	@Override
	public <T> List<T> selectByExample(T oggetto, String orderBy) {
		return null;
	}

	@Override
	public <T> List<T> selectByExampleWithBlobs(T oggetto, String orderBy) {
		return null;
	}

	@Override
	public <T> int countByExample(T oggetto) {
		return 0;
	}

	@Override
	public <T> int insert(T oggetto) {
		return 0;
	}

	@Override
	public <T> int insertSelective(T oggetto) {
		return 0;
	}

	@Override
	public <T, U> int deleteByExample(U oggetto) {
		return 0;
	}

	@Override
	public <T, U> int deleteByPrimaryKey(U idOggetto) {
		return 0;
	}

	@Override
	public <T, Z> int updateByExample(T oggetto, Z whereCondition) {
		return 0;
	}

	@Override
	public <T> int updateByPrimaryKey(T oggetto) {
		return 0;
	}

	@Override
	public <T> int updateByPrimaryKeySelective(T oggetto) {
		return 0;
	}

	@Override
	public <T> int updateByPrimaryKeyWithBlobs(T oggetto) {
		return 0;
	}

	@Override
	public <T, Z> int updateByExampleWithBlobs(T oggetto, Z whereCondition) {
		return 0;
	}

	@Override
	public <T, Z> int updateByExampleSelective(T oggetto, Z whereCondition) {
		return 0;
	}
}