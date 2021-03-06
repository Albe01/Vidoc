package it.vidoc.mybatis.javaclient;

import it.vidoc.mybatis.javamodel.Strcodcomres;
import it.vidoc.mybatis.javamodel.StrcodcomresExample;
import it.vidoc.mybatis.javamodel.StrcodcomresKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StrcodcomresMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	int countByExample(StrcodcomresExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	int deleteByExample(StrcodcomresExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(StrcodcomresKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	int insert(Strcodcomres record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	int insertSelective(Strcodcomres record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	List<Strcodcomres> selectByExample(StrcodcomresExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	Strcodcomres selectByPrimaryKey(StrcodcomresKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Strcodcomres record, @Param("example") StrcodcomresExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Strcodcomres record, @Param("example") StrcodcomresExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Strcodcomres record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Strcodcomres record);
}