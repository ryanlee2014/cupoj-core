package com.cupacm.oj.dao;

import com.cupacm.oj.dao.ContestClarification;
import com.cupacm.oj.dao.ContestClarificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ContestClarificationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    long countByExample(ContestClarificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int deleteByExample(ContestClarificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int deleteByPrimaryKey(Integer discussId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int insert(ContestClarification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int insertSelective(ContestClarification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<ContestClarification> selectByExampleWithBLOBsWithRowbounds(ContestClarificationExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<ContestClarification> selectByExampleWithBLOBs(ContestClarificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<ContestClarification> selectByExampleWithRowbounds(ContestClarificationExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<ContestClarification> selectByExample(ContestClarificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    ContestClarification selectByPrimaryKey(Integer discussId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") ContestClarification record, @Param("example") ContestClarificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") ContestClarification record, @Param("example") ContestClarificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExample(@Param("record") ContestClarification record, @Param("example") ContestClarificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByPrimaryKeySelective(ContestClarification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(ContestClarification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_clarification
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByPrimaryKey(ContestClarification record);
}