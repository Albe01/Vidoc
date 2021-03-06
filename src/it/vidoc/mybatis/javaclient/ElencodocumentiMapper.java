package it.vidoc.mybatis.javaclient;

import it.vidoc.mybatis.javamodel.Elencodocumenti;
import it.vidoc.mybatis.javamodel.ElencodocumentiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElencodocumentiMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table elencodocumenti
	 * @mbggenerated
	 */
	int countByExample(ElencodocumentiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table elencodocumenti
	 * @mbggenerated
	 */
	int deleteByExample(ElencodocumentiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table elencodocumenti
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer progrriga);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table elencodocumenti
	 * @mbggenerated
	 */
	int insert(Elencodocumenti record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table elencodocumenti
	 * @mbggenerated
	 */
	int insertSelective(Elencodocumenti record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table elencodocumenti
	 * @mbggenerated
	 */
	List<Elencodocumenti> selectByExampleWithBLOBs(ElencodocumentiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table elencodocumenti
	 * @mbggenerated
	 */
	List<Elencodocumenti> selectByExample(ElencodocumentiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table elencodocumenti
	 * @mbggenerated
	 */
	Elencodocumenti selectByPrimaryKey(Integer progrriga);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table elencodocumenti
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Elencodocumenti record,
			@Param("example") ElencodocumentiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table elencodocumenti
	 * @mbggenerated
	 */
	int updateByExampleWithBLOBs(@Param("record") Elencodocumenti record,
			@Param("example") ElencodocumentiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table elencodocumenti
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Elencodocumenti record, @Param("example") ElencodocumentiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table elencodocumenti
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Elencodocumenti record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table elencodocumenti
	 * @mbggenerated
	 */
	int updateByPrimaryKeyWithBLOBs(Elencodocumenti record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table elencodocumenti
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Elencodocumenti record);
}