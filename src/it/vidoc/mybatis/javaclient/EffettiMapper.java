package it.vidoc.mybatis.javaclient;

import it.vidoc.mybatis.javamodel.Effetti;
import it.vidoc.mybatis.javamodel.EffettiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EffettiMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table effetti
	 * @mbggenerated
	 */
	int countByExample(EffettiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table effetti
	 * @mbggenerated
	 */
	int deleteByExample(EffettiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table effetti
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer progrriga);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table effetti
	 * @mbggenerated
	 */
	int insert(Effetti record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table effetti
	 * @mbggenerated
	 */
	int insertSelective(Effetti record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table effetti
	 * @mbggenerated
	 */
	List<Effetti> selectByExample(EffettiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table effetti
	 * @mbggenerated
	 */
	Effetti selectByPrimaryKey(Integer progrriga);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table effetti
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Effetti record, @Param("example") EffettiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table effetti
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Effetti record, @Param("example") EffettiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table effetti
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Effetti record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table effetti
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Effetti record);
}