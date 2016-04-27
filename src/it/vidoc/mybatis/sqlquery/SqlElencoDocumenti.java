package it.vidoc.mybatis.sqlquery;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import it.vidoc.mybatis.javaclient.ElencodocumentiMapper;
import it.vidoc.mybatis.javaclient.ext.ElencodocumentiMapperExt;
import it.vidoc.mybatis.javamodel.Account;
import it.vidoc.mybatis.javamodel.Elencodocumenti;
import it.vidoc.mybatis.javamodel.ElencodocumentiExample;
import it.vidoc.utils.MyBatisConnectionFactory;

public class SqlElencoDocumenti implements ISqlGeneric {

	private final Logger logger = Logger.getLogger(getClass());

	@SuppressWarnings("unchecked")
	@Override
	public <T, U> T setWhereCondition(U oggetto, String orderBy) {
		Elencodocumenti object = (Elencodocumenti) oggetto;
		ElencodocumentiExample where = new ElencodocumentiExample();
		it.vidoc.mybatis.javamodel.ElencodocumentiExample.Criteria criteria = where.createCriteria();

		if (object.getProgrriga() != null && !"".equals(object.getProgrriga())) {
			criteria.andProgrrigaEqualTo(object.getProgrriga());
		}

		if (object.getProgrrigaaccount() != null && !"".equals(object.getProgrrigaaccount())) {
			criteria.andProgrrigaaccountEqualTo(object.getProgrrigaaccount());
		}

		if (!"".equals(orderBy) && orderBy != null) {
			where.setOrderByClause(orderBy);
		}
		return (T) where;

	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public <T, U> T selectByPrimaryKey(U idOggetto) {
		Elencodocumenti elencodocumenti = new Elencodocumenti();
		elencodocumenti.setProgrriga((Integer) idOggetto);
		List<Elencodocumenti> lstElencodocumenti = selectByExample(elencodocumenti, null);
		if (lstElencodocumenti.size() > 0) {
			return (T) lstElencodocumenti.get(0);
		} else {
			return null;
		}
		//
		// try {
		// object =
		// MyBatisConnectionFactory.getSqlSession().getMapper(ElencodocumentiMapper.class).selectByPrimaryKey((Integer)
		// idOggetto);
		// } catch (Exception e) {
		// logger.error(e.getMessage());
		// }
		// MyBatisConnectionFactory.closeSqlSession();
		// return (T) object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> selectByExample(T oggetto, String orderBy) {
		List<T> list = new ArrayList<T>();
		try {
			ElencodocumentiExample exampleWhere = setWhereCondition((Elencodocumenti) oggetto, orderBy);
			list = (List<T>) MyBatisConnectionFactory.getSqlSession().getMapper(ElencodocumentiMapper.class)
					.selectByExample(exampleWhere);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return (List<T>) list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> selectByExampleWithBlobs(T oggetto, String orderBy) {
		List<T> list = new ArrayList<T>();
		try {
			ElencodocumentiExample exampleWhere = setWhereCondition((Elencodocumenti) oggetto, orderBy);
			list = (List<T>) MyBatisConnectionFactory.getSqlSession().getMapper(ElencodocumentiMapper.class)
					.selectByExampleWithBLOBs(exampleWhere);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return (List<T>) list;
	}

	@Override
	public <T> int countByExample(T oggetto) {
		return 0;
	}

	@Override
	public <T> int insert(T oggetto) {
		int ret = 0;
		Elencodocumenti elencodocumenti = (it.vidoc.mybatis.javamodel.Elencodocumenti) oggetto;
		if (elencodocumenti.getData() == null) {
			elencodocumenti.setData(new SimpleDateFormat("yyyyMMdd").format(new Date()));
		}
		try {
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(ElencodocumentiMapper.class).insert((Elencodocumenti) oggetto);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return ret;
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
		int ret = 0;
		try {
			ElencodocumentiExample exampleWhere = setWhereCondition((Elencodocumenti) whereCondition, null);
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(ElencodocumentiMapper.class)
					.updateByExampleSelective((Elencodocumenti) oggetto, exampleWhere);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return ret;
	}

	public Integer insertReturnID(Elencodocumenti oggetto) {
		Integer ret = 0;
		Elencodocumenti object = (Elencodocumenti) oggetto;
		if ("".equals(object.getData()) || object.getData() == null) {
			object.setData(new SimpleDateFormat("yyyyMMdd").format(new Date()));
		}

		try {
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(ElencodocumentiMapperExt.class).insertReturnID((Elencodocumenti) object);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return ret;
	}

}
