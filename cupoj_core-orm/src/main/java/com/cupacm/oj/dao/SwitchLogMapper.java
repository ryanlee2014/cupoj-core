package com.cupacm.oj.dao;

import com.cupacm.oj.dao.SwitchLog;
import com.cupacm.oj.dao.SwitchLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SwitchLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table switch_log
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    long countByExample(SwitchLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table switch_log
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int deleteByExample(SwitchLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table switch_log
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table switch_log
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int insert(SwitchLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table switch_log
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int insertSelective(SwitchLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table switch_log
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<SwitchLog> selectByExampleWithRowbounds(SwitchLogExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table switch_log
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<SwitchLog> selectByExample(SwitchLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table switch_log
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    SwitchLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table switch_log
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") SwitchLog record, @Param("example") SwitchLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table switch_log
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExample(@Param("record") SwitchLog record, @Param("example") SwitchLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table switch_log
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByPrimaryKeySelective(SwitchLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table switch_log
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByPrimaryKey(SwitchLog record);
}