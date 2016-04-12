package it.vidoc.mybatis.sqlquery;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import it.vidoc.mybatis.javaclient.ext.StrcodprvresMapperExt;
import it.vidoc.mybatis.javamodel.Strcodprvres;
import it.vidoc.mybatis.javamodel.StrcodprvresExample;
import it.vidoc.utils.MyBatisConnectionFactory;

public class SqlStrPrvRes implements ISqlGeneric {
	
	private final Logger logger = Logger.getLogger(getClass());

	@SuppressWarnings("unchecked")
	@Override
	public <T, U> T setWhereCondition(U oggetto, String orderBy) {
		Strcodprvres object = (Strcodprvres) oggetto;
		StrcodprvresExample where = new StrcodprvresExample();
		it.vidoc.mybatis.javamodel.StrcodprvresExample.Criteria criteria = where.createCriteria();
		
		if (object.getParola() != null && !"".equals(object.getParola())) {
			if (object.getParola().contains("%")) {
				criteria.andParolaLike(object.getParola());				
			} else {
				criteria.andParolaEqualTo(object.getParola());
			}
		}
		if (object.getKanagra() != null && !"".equals(object.getKanagra())) {
			criteria.andKanagraEqualTo(object.getKanagra());
		}
		if (object.getDatatimeins() != null && !"".equals(object.getDatatimeins())) {
			if (object.getDatatimeins().contains("%")) {
				criteria.andDatatimeinsLike(object.getDatatimeins());				
			} else {
				criteria.andDatatimeinsEqualTo(object.getDatatimeins());
			}
		}
		
		if (!"".equals(orderBy) && orderBy != null) {
			where.setOrderByClause(orderBy);
		}
		return (T) where;
	}
	
	public ArrayList<Long> getStrPrvResxxxxx(Object where, String orderBy) {
		StrcodprvresExample exampleWhere = setWhereCondition((Strcodprvres) where, orderBy);
		StrcodprvresMapperExt strcodprvresMapperExt = MyBatisConnectionFactory.getSqlSession().getMapper(StrcodprvresMapperExt.class);
		List<Strcodprvres> listKanagraPrvRes = strcodprvresMapperExt.selectKanagra(exampleWhere);
		ArrayList<Long> listKanagraResult = new ArrayList<Long>();
		for (int i = 0; i < listKanagraPrvRes.size(); i++) {
			listKanagraResult.add(listKanagraPrvRes.get(i).getKanagra());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return listKanagraResult;
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
	
