package it.vidoc.mybatis.sqlquery;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import it.vidoc.mybatis.javaclient.LogelabMapper;
import it.vidoc.mybatis.javamodel.Logelab;
import it.vidoc.mybatis.javamodel.LogelabExample;
import it.vidoc.utils.MyBatisConnectionFactory;

public class SqlLogElab implements ISqlGeneric {
	
	private final Logger logger = Logger.getLogger(getClass());

	@SuppressWarnings("unchecked")
	@Override
	public <T, U> T setWhereCondition(U oggetto, String orderBy) {
		Logelab object = (Logelab) oggetto;
		LogelabExample where = new LogelabExample();
		it.vidoc.mybatis.javamodel.LogelabExample.Criteria criteria = where.createCriteria();
		
		if (object.getProgrriga() != null) {
			criteria.andProgrrigaEqualTo(object.getProgrriga());
		}
		
		if (object.getDatatime() != null && !"".equals(object.getDatatime())) {
			if (object.getDatatime().contains("%")) {
				criteria.andDatatimeLike(object.getDatatime());				
			} else {
				criteria.andDatatimeEqualTo(object.getDatatime());
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
		Logelab object = null;			
		try {
			object = MyBatisConnectionFactory.getSqlSession().getMapper(LogelabMapper.class).selectByPrimaryKey((Integer) idOggetto);
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
			LogelabExample exampleWhere = setWhereCondition((Logelab) oggetto, orderBy);
			list = (List<T>) MyBatisConnectionFactory.getSqlSession().getMapper(LogelabMapper.class).selectByExample(exampleWhere);				
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
		Integer ret = 0;
		try {
			LogelabExample exampleWhere = setWhereCondition((Logelab) oggetto, null);
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(LogelabMapper.class).countByExample(exampleWhere);				
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return ret;
	}

	@Override
	public <T> int insert(T oggetto) {
		int ret = 0;
		try {
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(LogelabMapper.class).insert((Logelab)oggetto);				
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return ret;
	}

	@Override
	public <T> int insertSelective(T oggetto) {
		int ret = 0;
		try {
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(LogelabMapper.class).insertSelective((Logelab)oggetto);				
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return ret;
	}

	@Override
	public <T, U> int deleteByExample(U oggetto) {
		int ret = 0;
		try {
			LogelabExample exampleWhere = setWhereCondition((Logelab) oggetto, null);
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(LogelabMapper.class).deleteByExample(exampleWhere);				
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return ret;
	}

	@Override
	public <T, U> int deleteByPrimaryKey(U idOggetto) {
		int ret = 0;			
		try {
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(LogelabMapper.class).deleteByPrimaryKey((Integer) idOggetto);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}			
		MyBatisConnectionFactory.closeSqlSession();
		return ret;
	}

	@Override
	public <T, Z> int updateByExample(T oggetto, Z whereCondition) {
		int ret = 0;
		try {
			LogelabExample exampleWhere = setWhereCondition((Logelab) whereCondition, null);
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(LogelabMapper.class).updateByExample((Logelab) oggetto, exampleWhere);				
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return ret;
	}

	@Override
	public <T> int updateByPrimaryKey(T oggetto) {
		int ret = 0;			
		try {
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(LogelabMapper.class).updateByPrimaryKey((Logelab) oggetto);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}			
		MyBatisConnectionFactory.closeSqlSession();
		return ret;
	}

	@Override
	public <T> int updateByPrimaryKeySelective(T oggetto) {
		int ret = 0;
		try {
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(LogelabMapper.class).updateByPrimaryKeySelective((Logelab)oggetto);				
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return ret;
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
		int ret = 0;
		try {
			LogelabExample exampleWhere = setWhereCondition((Logelab) whereCondition, null);
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(LogelabMapper.class).updateByExampleSelective((Logelab) oggetto, exampleWhere);				
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return ret;
	}
}
