package com.cupacm.oj.dao;

import com.cupacm.oj.dao.LabelList;
import com.cupacm.oj.dao.LabelListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LabelListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    long countByExample(LabelListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int deleteByExample(LabelListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int deleteByPrimaryKey(Integer labelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int insert(LabelList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int insertSelective(LabelList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<LabelList> selectByExampleWithRowbounds(LabelListExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<LabelList> selectByExample(LabelListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    LabelList selectByPrimaryKey(Integer labelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExampleSelective(@Param("record") LabelList record, @Param("example") LabelListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExample(@Param("record") LabelList record, @Param("example") LabelListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByPrimaryKeySelective(LabelList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByPrimaryKey(LabelList record);
}