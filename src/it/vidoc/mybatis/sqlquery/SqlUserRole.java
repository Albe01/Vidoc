package it.vidoc.mybatis.sqlquery;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import it.vidoc.mybatis.javaclient.UserroleMapper;
import it.vidoc.mybatis.javamodel.Userrole;
import it.vidoc.mybatis.javamodel.UserroleExample;
import it.vidoc.utils.MyBatisConnectionFactory;
public class SqlUserRole implements ISqlGeneric {
	
	
	private final Logger logger = Logger.getLogger(getClass());

	public SqlUserRole() {
	}

	@SuppressWarnings("unchecked")
	public <T, U> T setWhereCondition(U oggetto, String orderBy) {
		Userrole object = (Userrole) oggetto;
		UserroleExample where = new UserroleExample();
		it.vidoc.mybatis.javamodel.UserroleExample.Criteria criteria = where.createCriteria();
		
		if (object.getUsername() != null) {
			criteria.andUsernameEqualTo(object.getUsername());
		}
		return (T) where;
	}

	public <T, U> T selectByPrimaryKey(U idOggetto) {
		return null;	}

	@SuppressWarnings("unchecked")
	public <T> List<T> selectByExample(T oggetto, String orderBy) {
		List<T> list = new ArrayList<T>();
		try {
			UserroleExample exampleWhere = setWhereCondition((Userrole) oggetto, orderBy);
			list = (List<T>) MyBatisConnectionFactory.getSqlSession().getMapper(UserroleMapper.class).selectByExample(exampleWhere);			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return (List<T>) list;
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
	
