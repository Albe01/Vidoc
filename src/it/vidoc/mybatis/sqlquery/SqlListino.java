package it.vidoc.mybatis.sqlquery;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import it.vidoc.mybatis.javaclient.ListinoMapper;
import it.vidoc.mybatis.javamodel.Listino;
import it.vidoc.mybatis.javamodel.ListinoExample;
import it.vidoc.utils.MyBatisConnectionFactory;

public class SqlListino  implements ISqlGeneric {
	
	private final Logger logger = Logger.getLogger(getClass());

	@SuppressWarnings("unchecked")
	@Override
	public <T, U> T setWhereCondition(U oggetto, String orderBy) {
		Listino object = (Listino) oggetto;
		ListinoExample where = new ListinoExample();
		it.vidoc.mybatis.javamodel.ListinoExample.Criteria criteria = where.createCriteria();
		
		if (object.getNumerolistino() != null && !"".equals(object.getNumerolistino())) {
			criteria.andNumerolistinoEqualTo(object.getNumerolistino());
		}
		if (object.getCodicelistino() != null && !"".equals(object.getCodicelistino())) {
			if (object.getCodicelistino().contains("%")) {
				criteria.andCodicelistinoLike(object.getCodicelistino());				
			} else {
				criteria.andCodicelistinoEqualTo(object.getCodicelistino());
			}
		}
		if (object.getCodicebancadati() != null && !"".equals(object.getCodicebancadati())) {
			if (object.getCodicebancadati().contains("%")) {
				criteria.andCodicebancadatiLike(object.getCodicebancadati());				
			} else {
				criteria.andCodicebancadatiEqualTo(object.getCodicebancadati());
			}
		}
		if (object.getCodicerichiesta() != null && !"".equals(object.getCodicerichiesta())) {
			if (object.getCodicerichiesta().contains("%")) {
				criteria.andCodicerichiestaLike(object.getCodicerichiesta());				
			} else {
				criteria.andCodicerichiestaEqualTo(object.getCodicerichiesta());
			}
		}
		if (object.getCodicerisposta() != null && !"".equals(object.getCodicerisposta())) {
			if (object.getCodicerisposta().contains("%")) {
				criteria.andCodicerispostaLike(object.getCodicerisposta());				
			} else {
				criteria.andCodicerispostaEqualTo(object.getCodicerisposta());
			}
		}
		if (object.getOnldiff() != null && !"".equals(object.getOnldiff())) {
			if (object.getOnldiff().contains("%")) {
				criteria.andOnldiffLike(object.getOnldiff());				
			} else {
				criteria.andOnldiffEqualTo(object.getOnldiff());
			}
		}
		if (object.getPosneg() != null && !"".equals(object.getPosneg())) {
			if (object.getPosneg().contains("%")) {
				criteria.andPosnegLike(object.getPosneg());				
			} else {
				criteria.andPosnegEqualTo(object.getPosneg());
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
		Listino object = null;			
		try {
			object = MyBatisConnectionFactory.getSqlSession().getMapper(ListinoMapper.class).selectByPrimaryKey((Integer) idOggetto);
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
			ListinoExample exampleWhere = setWhereCondition((Listino) oggetto, orderBy);
			list = (List<T>) MyBatisConnectionFactory.getSqlSession().getMapper(ListinoMapper.class).selectByExample(exampleWhere);				
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
	
