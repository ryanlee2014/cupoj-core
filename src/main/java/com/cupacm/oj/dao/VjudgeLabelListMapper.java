package com.cupacm.oj.dao;

import com.cupacm.oj.dao.VjudgeLabelList;
import com.cupacm.oj.dao.VjudgeLabelListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VjudgeLabelListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    long countByExample(VjudgeLabelListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int deleteByExample(VjudgeLabelListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int deleteByPrimaryKey(Integer labelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int insert(VjudgeLabelList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int insertSelective(VjudgeLabelList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<VjudgeLabelList> selectByExampleWithRowbounds(VjudgeLabelListExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<VjudgeLabelList> selectByExample(VjudgeLabelListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    VjudgeLabelList selectByPrimaryKey(Integer labelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExampleSelective(@Param("record") VjudgeLabelList record, @Param("example") VjudgeLabelListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExample(@Param("record") VjudgeLabelList record, @Param("example") VjudgeLabelListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByPrimaryKeySelective(VjudgeLabelList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByPrimaryKey(VjudgeLabelList record);
}