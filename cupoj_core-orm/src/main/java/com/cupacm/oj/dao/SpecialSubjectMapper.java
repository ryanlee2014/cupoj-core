package com.cupacm.oj.dao;

import com.cupacm.oj.dao.SpecialSubject;
import com.cupacm.oj.dao.SpecialSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SpecialSubjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    long countByExample(SpecialSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int deleteByExample(SpecialSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int deleteByPrimaryKey(Integer topicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int insert(SpecialSubject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int insertSelective(SpecialSubject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<SpecialSubject> selectByExampleWithBLOBsWithRowbounds(SpecialSubjectExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<SpecialSubject> selectByExampleWithBLOBs(SpecialSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<SpecialSubject> selectByExampleWithRowbounds(SpecialSubjectExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<SpecialSubject> selectByExample(SpecialSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    SpecialSubject selectByPrimaryKey(Integer topicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") SpecialSubject record, @Param("example") SpecialSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") SpecialSubject record, @Param("example") SpecialSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExample(@Param("record") SpecialSubject record, @Param("example") SpecialSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByPrimaryKeySelective(SpecialSubject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(SpecialSubject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByPrimaryKey(SpecialSubject record);
}