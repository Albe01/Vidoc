package it.vidoc.mybatis.sqlquery;

import java.util.List;

import org.apache.log4j.Logger;

import it.vidoc.mybatis.javaclient.UserMapper;
import it.vidoc.mybatis.javamodel.User;
import it.vidoc.mybatis.javamodel.UserExample;
import it.vidoc.utils.MyBatisConnectionFactory;

public class SqlUser implements ISqlGeneric {
	
	private final Logger logger = Logger.getLogger(getClass());

	public SqlUser() {
	}

	@SuppressWarnings("unchecked")
	public <T, U> T setWhereCondition(U oggetto, String orderBy) {
		User object = (User) oggetto;
		UserExample where = new UserExample();
		it.vidoc.mybatis.javamodel.UserExample.Criteria criteria = where.createCriteria();
		
		if (object.getUsername() != null && !"".equals(object.getUsername())) {
			if (object.getUsername().contains("%")) {
				criteria.andUsernameLike(object.getUsername());				
			} else {
				criteria.andUsernameEqualTo(object.getUsername());
			}
		}
		if (object.getCodcontratto() != null && !"".equals(object.getCodcontratto())) {
			if (object.getCodcontratto().contains("%")) {
				criteria.andCodcontrattoLike(object.getCodcontratto());				
			} else {
				criteria.andCodcontrattoEqualTo(object.getCodcontratto());
			}
		}

		return (T) where;
	}

	@SuppressWarnings("unchecked")
	public <T, U> T selectByPrimaryKey(U idOggetto) {
		User object = null;			
		try {
			object = MyBatisConnectionFactory.getSqlSession().getMapper(UserMapper.class).selectByPrimaryKey((String) idOggetto);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}			
		MyBatisConnectionFactory.closeSqlSession();
		return (T) object;
	}

	public <T> List<T> selectByExample(T oggetto, String orderBy) {
		return null;
	}

	public <T> List<T> selectByExampleWithBlobs(T oggetto, String orderBy) {
		return null;
	}

	public <T> int countByExample(T oggetto) {
		return 0;
	}

	public <T> int insert(T oggetto) {
		return 0;
	}

	public <T> int insertSelective(T oggetto) {
		return 0;
	}

	public <T, U> int deleteByExample(U oggetto) {
		return 0;
	}

	public <T, U> int deleteByPrimaryKey(U idOggetto) {
		return 0;
	}

	public <T, Z> int updateByExample(T oggetto, Z whereCondition) {
		return 0;
	}

	public <T> int updateByPrimaryKey(T oggetto) {
		return 0;
	}

	public <T> int updateByPrimaryKeySelective(T oggetto) {
		return 0;
	}

	public <T> int updateByPrimaryKeyWithBlobs(T oggetto) {
		return 0;
	}

	public <T, Z> int updateByExampleWithBlobs(T oggetto, Z whereCondition) {
		return 0;
	}

	public <T, Z> int updateByExampleSelective(T oggetto, Z whereCondition) {
		return 0;
	}

}
	
