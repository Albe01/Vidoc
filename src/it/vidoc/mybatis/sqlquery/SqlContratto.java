package it.vidoc.mybatis.sqlquery;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import it.vidoc.mybatis.javaclient.ContrattoMapper;
import it.vidoc.mybatis.javamodel.Contratto;
import it.vidoc.mybatis.javamodel.ContrattoExample;
import it.vidoc.utils.MyBatisConnectionFactory;

public class SqlContratto implements ISqlGeneric {

	private final Logger logger = Logger.getLogger(getClass());

	@SuppressWarnings("unchecked")
	@Override
	public <T, U> T setWhereCondition(U oggetto, String orderBy) {
		Contratto object = (Contratto) oggetto;
		ContrattoExample where = new ContrattoExample();
		it.vidoc.mybatis.javamodel.ContrattoExample.Criteria criteria = where.createCriteria();

		if (object.getCodcontratto() != null && !"".equals(object.getCodcontratto())) {
			if (object.getCodcontratto().contains("%")) {
				criteria.andCodcontrattoLike(object.getCodcontratto());
			} else {
				criteria.andCodcontrattoEqualTo(object.getCodcontratto());
			}
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
		if (object.getNominativo() != null && !"".equals(object.getNominativo())) {
			if (object.getNominativo().contains("%")) {
				criteria.andNominativoLike(object.getNominativo());
			} else {
				criteria.andNominativoEqualTo(object.getNominativo());
			}
		}
		if (object.getCodicefiscale() != null && !"".equals(object.getCodicefiscale())) {
			if (object.getCodicefiscale().contains("%")) {
				criteria.andCodicefiscaleLike(object.getCodicefiscale());
			} else {
				criteria.andCodicefiscaleEqualTo(object.getCodicefiscale());
			}
		}
		if (object.getTelefono() != null && !"".equals(object.getTelefono())) {
			if (object.getTelefono().contains("%")) {
				criteria.andTelefonoLike(object.getTelefono());
			} else {
				criteria.andTelefonoEqualTo(object.getTelefono());
			}
		}
		if (object.getIndirizzo() != null && !"".equals(object.getIndirizzo())) {
			if (object.getIndirizzo().contains("%")) {
				criteria.andIndirizzoLike(object.getIndirizzo());
			} else {
				criteria.andIndirizzoEqualTo(object.getIndirizzo());
			}
		}
		if (object.getComune() != null && !"".equals(object.getComune())) {
			if (object.getComune().contains("%")) {
				criteria.andComuneLike(object.getComune());
			} else {
				criteria.andComuneEqualTo(object.getComune());
			}
		}
		if (object.getProvincia() != null && !"".equals(object.getProvincia())) {
			if (object.getProvincia().contains("%")) {
				criteria.andProvinciaLike(object.getProvincia());
			} else {
				criteria.andProvinciaEqualTo(object.getProvincia());
			}
		}
		if (object.getRiferimento() != null && !"".equals(object.getRiferimento())) {
			if (object.getRiferimento().contains("%")) {
				criteria.andRiferimentoLike(object.getRiferimento());
			} else {
				criteria.andRiferimentoEqualTo(object.getRiferimento());
			}
		}
		if (object.getEmail() != null && !"".equals(object.getEmail())) {
			if (object.getEmail().contains("%")) {
				criteria.andEmailLike(object.getEmail());
			} else {
				criteria.andEmailEqualTo(object.getEmail());
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
		Contratto object = null;
		try {
			object = MyBatisConnectionFactory.getSqlSession().getMapper(ContrattoMapper.class)
					.selectByPrimaryKey((String) idOggetto);
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
			ContrattoExample exampleWhere = setWhereCondition((Contratto) oggetto, orderBy);
			list = (List<T>) MyBatisConnectionFactory.getSqlSession().getMapper(ContrattoMapper.class)
					.selectByExample(exampleWhere);
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
			ContrattoExample exampleWhere = setWhereCondition((Contratto) oggetto, null);
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(ContrattoMapper.class)
					.countByExample(exampleWhere);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return ret;
	}

	@Override
	public <T> int insert(T oggetto) {
		int ret = 0;
		Contratto object = (Contratto) oggetto;
		try {
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(ContrattoMapper.class).insert((Contratto) object);
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
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(ContrattoMapper.class)
					.insertSelective((Contratto) oggetto);
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
			ContrattoExample exampleWhere = setWhereCondition((Contratto) oggetto, null);
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(ContrattoMapper.class)
					.deleteByExample(exampleWhere);
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
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(ContrattoMapper.class)
					.deleteByPrimaryKey((String) idOggetto);
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
			ContrattoExample exampleWhere = setWhereCondition((Contratto) whereCondition, null);
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(ContrattoMapper.class)
					.updateByExample((Contratto) oggetto, exampleWhere);
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
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(ContrattoMapper.class)
					.updateByPrimaryKey((Contratto) oggetto);
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
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(ContrattoMapper.class)
					.updateByPrimaryKeySelective((Contratto) oggetto);
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
			ContrattoExample exampleWhere = setWhereCondition((Contratto) whereCondition, null);
			ret = MyBatisConnectionFactory.getSqlSession().getMapper(ContrattoMapper.class)
					.updateByExampleSelective((Contratto) oggetto, exampleWhere);
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
			ContrattoExample exampleWhere = setWhereCondition((Contratto) oggetto, orderBy);
			list = (List<T>) MyBatisConnectionFactory.getSqlSession().getMapper(ContrattoMapper.class)
					.selectByExample(exampleWhere);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		MyBatisConnectionFactory.closeSqlSession();
		return (List<T>) list;
	}


}
