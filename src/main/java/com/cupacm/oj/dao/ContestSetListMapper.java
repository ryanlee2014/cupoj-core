package com.cupacm.oj.dao;

import com.cupacm.oj.dao.ContestSetList;
import com.cupacm.oj.dao.ContestSetListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ContestSetListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    long countByExample(ContestSetListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int deleteByExample(ContestSetListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int deleteByPrimaryKey(Integer contestSetRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int insert(ContestSetList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int insertSelective(ContestSetList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<ContestSetList> selectByExampleWithRowbounds(ContestSetListExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<ContestSetList> selectByExample(ContestSetListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    ContestSetList selectByPrimaryKey(Integer contestSetRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExampleSelective(@Param("record") ContestSetList record, @Param("example") ContestSetListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExample(@Param("record") ContestSetList record, @Param("example") ContestSetListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByPrimaryKeySelective(ContestSetList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByPrimaryKey(ContestSetList record);
}