package it.vidoc.mybatis.sqlquery;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import it.vidoc.mybatis.javaclient.ElencolistiniMapper;
import it.vidoc.mybatis.javamodel.Elencolistini;
import it.vidoc.mybatis.javamodel.ElencolistiniExample;
import it.vidoc.utils.MyBatisConnectionFactory;

public class SqlElencoListini implements ISqlGeneric {
	
	private final Logger logger = Logger.getLogger(getClass());
	
	@SuppressWarnings("unchecked")
	@Override
	public <T, U> T setWhereCondition(U oggetto, String orderBy) {
		Elencolistini object = (Elencolistini) oggetto;
		ElencolistiniExample where = new ElencolistiniExample();
		it.vidoc.mybatis.javamodel.ElencolistiniExample.Criteria criteria = where.createCriteria();

		if (object.getCodicelistino() != null && !"".equals(object.getCodicelistino())) {
			if (object.getCodicelistino().contains("%")) {
				criteria.andCodicelistinoLike(object.getCodicelistino());				
			} else {
				criteria.andCodicelistinoEqualTo(object.getCodicelistino());
			}
		}
		if (object.getNumerolistino() != null) {
			criteria.andNumerolistinoEqualTo(object.getNumerolistino());				
		}
		if (object.getDatainiziovalidita() != null && !"".equals(object.getDatainiziovalidita())) {
			if (object.getDatainiziovalidita().contains("%")) {
				criteria.andDatainiziovaliditaLike(object.getDatainiziovalidita());				
			} else {
				criteria.andDatainiziovaliditaEqualTo(object.getDatainiziovalidita());
			}
		}
		if (object.getDatafinevalidita() != null && !"".equals(object.getDatafinevalidita())) {
			if (object.getDatafinevalidita().contains("%")) {
				criteria.andDatafinevaliditaLike(object.getDatafinevalidita());				
			} else {
				criteria.andDatafinevaliditaEqualTo(object.getDatafinevalidita());
			}
		}
		if (!"".equals(orderBy) && orderBy != null) {
			where.setOrderByClause(orderBy);
		}
		return (T) where;
	}

	@Override
	public <T, U> T selectByPrimaryKey(U idOggetto) {
		return null;

	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> selectByExample(T oggetto, String orderBy) {
		List<T> list = new ArrayList<T>();
		try {
			ElencolistiniExample exampleWhere = setWhereCondition((Elencolistini) oggetto, orderBy);
			list = (List<T>) MyBatisConnectionFactory.getSqlSession().getMapper(ElencolistiniMapper.class).selectByExample(exampleWhere);				
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
	
	public Integer selectNumListinoAttivo(String codiceListino) {
		Integer ret = 0;
		Format formatter = new SimpleDateFormat("yyyyMMdd");
		ElencolistiniExample example = new ElencolistiniExample();
		example.createCriteria().
			andDatainiziovaliditaLessThanOrEqualTo(formatter.format(new Date())).
			andDatafinevaliditaGreaterThanOrEqualTo(formatter.format(new Date())).
			andCodicelistinoEqualTo(codiceListino);
		List<Elencolistini>  lst = MyBatisConnectionFactory.getSqlSession().getMapper(ElencolistiniMapper.class).selectByExample(example);
		MyBatisConnectionFactory.closeSqlSession();
		if (lst.size() > 0) {
			ret = lst.get(0).getNumerolistino();
		}
		return ret;
	}


}
	
