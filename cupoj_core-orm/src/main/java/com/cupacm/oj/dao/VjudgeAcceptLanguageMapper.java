package com.cupacm.oj.dao;

import com.cupacm.oj.dao.VjudgeAcceptLanguage;
import com.cupacm.oj.dao.VjudgeAcceptLanguageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VjudgeAcceptLanguageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_accept_language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    long countByExample(VjudgeAcceptLanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_accept_language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int deleteByExample(VjudgeAcceptLanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_accept_language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int insert(VjudgeAcceptLanguage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_accept_language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int insertSelective(VjudgeAcceptLanguage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_accept_language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<VjudgeAcceptLanguage> selectByExampleWithBLOBsWithRowbounds(VjudgeAcceptLanguageExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_accept_language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<VjudgeAcceptLanguage> selectByExampleWithBLOBs(VjudgeAcceptLanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_accept_language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<VjudgeAcceptLanguage> selectByExampleWithRowbounds(VjudgeAcceptLanguageExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_accept_language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<VjudgeAcceptLanguage> selectByExample(VjudgeAcceptLanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_accept_language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") VjudgeAcceptLanguage record, @Param("example") VjudgeAcceptLanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_accept_language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") VjudgeAcceptLanguage record, @Param("example") VjudgeAcceptLanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_accept_language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExample(@Param("record") VjudgeAcceptLanguage record, @Param("example") VjudgeAcceptLanguageExample example);
}