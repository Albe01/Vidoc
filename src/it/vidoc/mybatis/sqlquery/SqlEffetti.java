package it.vidoc.mybatis.sqlquery;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import it.vidoc.mybatis.javaclient.EffettiMapper;
import it.vidoc.mybatis.javamodel.Effetti;
import it.vidoc.mybatis.javamodel.EffettiExample;
import it.vidoc.utils.MyBatisConnectionFactory;

public class SqlEffetti  implements ISqlGeneric {
	
	private final Logger logger = Logger.getLogger(getClass());

	@SuppressWarnings("unchecked")
	@Override
	public <T, U> T setWhereCondition(U oggetto, String orderBy) {
		Effetti object = (Effetti) oggetto;
		EffettiExample where = new EffettiExample();
		it.vidoc.mybatis.javamodel.EffettiExample.Criteria criteria = where.createCriteria();
		
		if (object.getKanagra() != null && !"".equals(object.getKanagra())) {
			criteria.andKanagraEqualTo(object.getKanagra());
		}
		if (object.getCciaapubblicazione() != null && !"".equals(object.getCciaapubblicazione())) {
			if (object.getCciaapubblicazione().contains("%")) {
				criteria.andCciaapubblicazioneLike(object.getCciaapubblicazione());				
			} else {
				criteria.andCciaapubblicazioneEqualTo(object.getCciaapubblicazione());
			}
		}

		if (!"".equals(orderBy) && orderBy != null) {
			where.setOrderByClause(orderBy);
		}
		return (T) where;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T, U> T selectByPrimaryKey(U idOggetto) {
		Effetti object = null;			
		try {
			object = MyBatisConnectionFactory.getSqlSession().getMapper(EffettiMapper.class).selectByPrimaryKey((Integer) idOggetto);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}			
		MyBatisConnectionFactory.closeSqlSession();
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> selectByExample(T oggetto, String orderBy) {
		List<T> list = new ArrayList<T>();
		try {
			EffettiExample exampleWhere = setWhereCondition((Effetti) oggetto, orderBy);
			list = (List<T>) MyBatisConnectionFactory.getSqlSession().getMapper(EffettiMapper.class).selectByExample(exampleWhere);				
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return (List<T>) list;
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
	
