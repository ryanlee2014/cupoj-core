package com.cupacm.oj.dao;

import com.cupacm.oj.dao.ContestAssistant;
import com.cupacm.oj.dao.ContestAssistantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ContestAssistantMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_assistant
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    long countByExample(ContestAssistantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_assistant
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int deleteByExample(ContestAssistantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_assistant
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int deleteByPrimaryKey(Integer assistantId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_assistant
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int insert(ContestAssistant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_assistant
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int insertSelective(ContestAssistant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_assistant
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<ContestAssistant> selectByExampleWithRowbounds(ContestAssistantExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_assistant
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<ContestAssistant> selectByExample(ContestAssistantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_assistant
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    ContestAssistant selectByPrimaryKey(Integer assistantId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_assistant
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExampleSelective(@Param("record") ContestAssistant record, @Param("example") ContestAssistantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_assistant
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExample(@Param("record") ContestAssistant record, @Param("example") ContestAssistantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_assistant
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByPrimaryKeySelective(ContestAssistant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_assistant
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByPrimaryKey(ContestAssistant record);
}