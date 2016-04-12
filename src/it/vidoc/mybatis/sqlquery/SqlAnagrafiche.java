package it.vidoc.mybatis.sqlquery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import it.vidoc.mybatis.javaclient.AnagraficheMapper;
import it.vidoc.mybatis.javaclient.ext.AnagraficheMapperExt;
import it.vidoc.mybatis.javamodel.Anagrafiche;
import it.vidoc.utils.MyBatisConnectionFactory;
import it.vidoc.utils.ParamQuery;

public class SqlAnagrafiche implements ISqlGeneric {
	
	private final Logger logger = Logger.getLogger(getClass());

	@Override
	public <T, U> T setWhereCondition(U oggetto, String orderBy) {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T, U> T selectByPrimaryKey(U idOggetto) {
		Anagrafiche object = null;			
		try {
			object = MyBatisConnectionFactory.getSqlSession().getMapper(AnagraficheMapper.class).selectByPrimaryKey((Long) idOggetto);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}			
		MyBatisConnectionFactory.closeSqlSession();
		return (T) object;
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

	public ArrayList<Anagrafiche> getLimAnagrafiche(Integer offset, Integer maxNbOfRows) {
		AnagraficheMapperExt anagraficheMapperExt = MyBatisConnectionFactory.getSqlSession().getMapper(AnagraficheMapperExt.class);
		Map<String, Integer> param = new HashMap<String, Integer>();
		param.put("offset", offset);
		param.put("maxNbOfRows", maxNbOfRows);
		List<Anagrafiche> listAnag = anagraficheMapperExt.selectLimit(param);
		ArrayList<Anagrafiche> listAnagrafiche = new ArrayList<Anagrafiche>();
		for (int i = 0; i < listAnag.size(); i++) {
			listAnagrafiche.add(listAnag.get(i));
		}
		MyBatisConnectionFactory.closeSqlSession();
		return listAnagrafiche;
	}
	
	public List<Long> selectIn(Map<String, List<ParamQuery>> param) {
		AnagraficheMapperExt anagraficheMapperExt = MyBatisConnectionFactory.getSqlSession().getMapper(AnagraficheMapperExt.class);
		List<Long> listKanagra = anagraficheMapperExt.selectWithJoin(param);
		MyBatisConnectionFactory.closeSqlSession();
		return listKanagra;
	}

}
	
