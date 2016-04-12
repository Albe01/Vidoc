package it.vidoc.mybatis.sqlquery;

import java.util.List;

public interface ISqlGeneric {
	public <T,U> T       setWhereCondition(U oggetto, String orderBy);
	public <T,U> T       selectByPrimaryKey(U idOggetto);
	public <T>   List<T> selectByExample(T oggetto, String orderBy);
	public <T>   List<T> selectByExampleWithBlobs(T oggetto, String orderBy);
	public <T>   int     countByExample(T oggetto);
	public <T>   int     insert(T oggetto);
	public <T>   int     insertSelective(T oggetto);
	public <T,U> int     deleteByExample(U oggetto);
	public <T,U> int     deleteByPrimaryKey(U idOggetto);
	public <T,Z> int     updateByExample(T oggetto, Z whereCondition);
	public <T>   int     updateByPrimaryKey(T oggetto);
	public <T>   int     updateByPrimaryKeySelective(T oggetto);
	public <T>   int     updateByPrimaryKeyWithBlobs(T oggetto);
	public <T,Z> int     updateByExampleWithBlobs(T oggetto, Z whereCondition);
	public <T,Z> int     updateByExampleSelective(T oggetto, Z whereCondition);
}
