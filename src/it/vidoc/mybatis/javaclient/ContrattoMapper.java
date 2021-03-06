package it.vidoc.mybatis.javaclient;

import it.vidoc.mybatis.javamodel.Contratto;
import it.vidoc.mybatis.javamodel.ContrattoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContrattoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contratto
	 * @mbggenerated
	 */
	int countByExample(ContrattoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contratto
	 * @mbggenerated
	 */
	int deleteByExample(ContrattoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contratto
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String codcontratto);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contratto
	 * @mbggenerated
	 */
	int insert(Contratto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contratto
	 * @mbggenerated
	 */
	int insertSelective(Contratto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contratto
	 * @mbggenerated
	 */
	List<Contratto> selectByExample(ContrattoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contratto
	 * @mbggenerated
	 */
	Contratto selectByPrimaryKey(String codcontratto);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contratto
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Contratto record, @Param("example") ContrattoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contratto
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Contratto record, @Param("example") ContrattoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contratto
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Contratto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contratto
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Contratto record);
}