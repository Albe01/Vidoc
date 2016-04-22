package it.vidoc.mybatis.sqlquery;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import it.vidoc.mybatis.javaclient.AccountMapper;
import it.vidoc.mybatis.javamodel.Account;
import it.vidoc.mybatis.javamodel.AccountExample;
import it.vidoc.utils.MyBatisConnectionFactory;

public class SqlAccount implements ISqlGeneric {
	
	private final Logger logger = Logger.getLogger(getClass());

	@SuppressWarnings("unchecked")
	@Override
	public <T, U> T setWhereCondition(U oggetto, String orderBy) {
		Account object = (Account) oggetto;
		AccountExample where = new AccountExample();
		it.vidoc.mybatis.javamodel.AccountExample.Criteria criteria = where.createCriteria();
		
		if (object.getProgrriga() != null) {
			criteria.andProgrrigaEqualTo(object.getProgrriga());
		}
		if (object.getProgrrigalistino() != null) {
			criteria.andProgrrigalistinoEqualTo(object.getProgrrigalistino());
		}

		if (object.getUsername() != null && !"".equals(object.getUsername())) {
			if (object.getUsername().contains("%")) {
				criteria.andUsernameLike(object.getUsername());				
			} else {
				criteria.andUsernameEqualTo(object.getUsername());
			}
		}
		
		if (object.getData() != null && !"".equals(object.getData())) {
			if (object.getData().contains("%")) {
				criteria.andDataLike(object.getData());				
			} else {
				criteria.andDataEqualTo(object.getData());
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
		Account object = null;			
		try {
			object = MyBatisConnectionFactory.getSqlSession().getMapper(AccountMapper.class).selectByPrimaryKey((Integer) idOggetto);
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
			AccountExample exampleWhere = setWhereCondition((Account) oggetto, orderBy);
			list = (List<T>) MyBatisConnectionFactory.getSqlSession().getMapper(AccountMapper.class).selectByExample(exampleWhere);				
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
			AccountExample exampleWhere = setWhereCondition((Account) oggetto, null);
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(AccountMapper.class).countByExample(exampleWhere);				
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return ret;
	}

	@Override
	public <T> int insert(T oggetto) {
		int ret = 0;
		Account object = (Account) oggetto;
		if ("".equals(object.getData()) || object.getData() == null) {
			object.setData(new SimpleDateFormat("yyyyMMdd").format(new Date()));
		}
		try {
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(AccountMapper.class).insert((Account)object);				
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
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(AccountMapper.class).insertSelective((Account)oggetto);				
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
			AccountExample exampleWhere = setWhereCondition((Account) oggetto, null);
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(AccountMapper.class).deleteByExample(exampleWhere);				
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
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(AccountMapper.class).deleteByPrimaryKey((Integer) idOggetto);
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
			AccountExample exampleWhere = setWhereCondition((Account) whereCondition, null);
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(AccountMapper.class).updateByExample((Account) oggetto, exampleWhere);				
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
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(AccountMapper.class).updateByPrimaryKey((Account) oggetto);
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
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(AccountMapper.class).updateByPrimaryKeySelective((Account)oggetto);				
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
			AccountExample exampleWhere = setWhereCondition((Account) whereCondition, null);
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(AccountMapper.class).updateByExampleSelective((Account) oggetto, exampleWhere);				
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return ret;
	}
	
	@SuppressWarnings("unchecked")
	public <T> List<T> selectByExample(T oggetto, String dataDa, String dataA, String orderBy) {
		List<T> list = new ArrayList<T>();
		try {
			AccountExample exampleWhere = setWhereCondition((Account) oggetto, orderBy);
			if (dataDa != null && !"".equals(dataDa)) {
				exampleWhere.getOredCriteria().get(0).andDataGreaterThanOrEqualTo(dataDa);
			}
			if (dataA != null && !"".equals(dataA)) {
				exampleWhere.getOredCriteria().get(0).andDataLessThanOrEqualTo(dataA);
			}

			list = (List<T>) MyBatisConnectionFactory.getSqlSession().getMapper(AccountMapper.class).selectByExample(exampleWhere);				
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return (List<T>) list;
	}

}
