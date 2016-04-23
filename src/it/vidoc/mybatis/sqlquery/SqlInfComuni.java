package it.vidoc.mybatis.sqlquery;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import it.vidoc.mybatis.javaclient.AnagraficheMapper;
import it.vidoc.mybatis.javaclient.InfcomuniMapper;
import it.vidoc.mybatis.javamodel.Anagrafiche;
import it.vidoc.mybatis.javamodel.Infcomuni;
import it.vidoc.mybatis.javamodel.InfcomuniExample;
import it.vidoc.utils.MyBatisConnectionFactory;

public class SqlInfComuni implements ISqlGeneric {
	
	private final Logger logger = Logger.getLogger(getClass());
	
	@SuppressWarnings("unchecked")
	@Override
	public <T, U> T setWhereCondition(U oggetto, String orderBy) {
		Infcomuni object = (Infcomuni) oggetto;
		InfcomuniExample where = new InfcomuniExample();
		it.vidoc.mybatis.javamodel.InfcomuniExample.Criteria criteria = where.createCriteria();

		if (object.getCodregione() != null && !"".equals(object.getCodregione())) {
			if (object.getCodregione().contains("%")) {
				criteria.andCodregioneLike(object.getCodregione());				
			} else {
				criteria.andCodregioneEqualTo(object.getCodregione());
			}
		}
		if (object.getCodiceprovincia() != null && !"".equals(object.getCodiceprovincia())) {
			if (object.getCodiceprovincia().contains("%")) {
				criteria.andCodiceprovinciaLike(object.getCodiceprovincia());				
			} else {
				criteria.andCodiceprovinciaEqualTo(object.getCodiceprovincia());
			}
		}
		if (object.getCodicecomune() != null && !"".equals(object.getCodicecomune())) {
			if (object.getCodicecomune().contains("%")) {
				criteria.andCodicecomuneLike(object.getCodicecomune());				
			} else {
				criteria.andCodicecomuneEqualTo(object.getCodicecomune());
			}
		}
		if (object.getCodistat() != null && !"".equals(object.getCodistat())) {
			if (object.getCodistat().contains("%")) {
				criteria.andCodistatLike(object.getCodistat());				
			} else {
				criteria.andCodistatEqualTo(object.getCodistat());
			}
		}
		if (object.getSiglaprovincia() != null && !"".equals(object.getSiglaprovincia())) {
			if (object.getSiglaprovincia().contains("%")) {
				criteria.andSiglaprovinciaLike(object.getSiglaprovincia());				
			} else {
				criteria.andSiglaprovinciaEqualTo(object.getSiglaprovincia());
			}
		}
		if (object.getInfcodicecomune() != null && !"".equals(object.getInfcodicecomune())) {
			if (object.getInfcodicecomune().contains("%")) {
				criteria.andInfcodicecomuneLike(object.getInfcodicecomune());				
			} else {
				criteria.andInfcodicecomuneEqualTo(object.getInfcodicecomune());
			}
		}

		return (T) where;
	}

	public List<Infcomuni> selectComuniOfPrv(String siglaPrv) {
		InfcomuniExample infcomuniExample = new InfcomuniExample();
		infcomuniExample.createCriteria().andSiglaprovinciaEqualTo(siglaPrv).andCodicecomuneNotEqualTo("999");
		infcomuniExample.setOrderByClause("denomcomune");
		List<Infcomuni> list = MyBatisConnectionFactory.getSqlSession().getMapper(InfcomuniMapper.class).selectByExample(infcomuniExample);
		MyBatisConnectionFactory.closeSqlSession();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T, U> T selectByPrimaryKey(U idOggetto) {
		Infcomuni object = null;			
		try {
			object = MyBatisConnectionFactory.getSqlSession().getMapper(InfcomuniMapper.class).selectByPrimaryKey((String) idOggetto);
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
			InfcomuniExample exampleWhere = setWhereCondition((Infcomuni) oggetto, orderBy);
			list = (List<T>) MyBatisConnectionFactory.getSqlSession().getMapper(InfcomuniMapper.class).selectByExample(exampleWhere);				
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
	
