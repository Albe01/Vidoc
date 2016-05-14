package it.vidoc.mybatis.sqlquery;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import it.vidoc.mybatis.javaclient.MatrixabilitazioniMapper;
import it.vidoc.mybatis.javamodel.Matrixabilitazioni;
import it.vidoc.mybatis.javamodel.MatrixabilitazioniExample;
import it.vidoc.utils.MyBatisConnectionFactory;

public class SqlMatrixAbilitazioni implements ISqlGeneric {
	
	private final Logger logger = Logger.getLogger(getClass());
	
	@SuppressWarnings("unchecked")
	@Override
	public <T, U> T setWhereCondition(U oggetto, String orderBy) {
		Matrixabilitazioni object = (Matrixabilitazioni) oggetto;
		MatrixabilitazioniExample where = new MatrixabilitazioniExample();
		it.vidoc.mybatis.javamodel.MatrixabilitazioniExample.Criteria criteria = where.createCriteria();

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
			MatrixabilitazioniExample exampleWhere = setWhereCondition((Matrixabilitazioni) oggetto, orderBy);
			list = (List<T>) MyBatisConnectionFactory.getSqlSession().getMapper(MatrixabilitazioniMapper.class).selectByExample(exampleWhere);				
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
	
