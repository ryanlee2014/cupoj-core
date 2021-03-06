package com.cupacm.oj.dao;

import com.cupacm.oj.dao.ArticleContent;
import com.cupacm.oj.dao.ArticleContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ArticleContentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    long countByExample(ArticleContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int deleteByExample(ArticleContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int deleteByPrimaryKey(Integer commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int insert(ArticleContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int insertSelective(ArticleContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<ArticleContent> selectByExampleWithBLOBsWithRowbounds(ArticleContentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<ArticleContent> selectByExampleWithBLOBs(ArticleContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<ArticleContent> selectByExampleWithRowbounds(ArticleContentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<ArticleContent> selectByExample(ArticleContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    ArticleContent selectByPrimaryKey(Integer commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExampleSelective(@Param("record") ArticleContent record, @Param("example") ArticleContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") ArticleContent record, @Param("example") ArticleContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExample(@Param("record") ArticleContent record, @Param("example") ArticleContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByPrimaryKeySelective(ArticleContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(ArticleContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_content
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByPrimaryKey(ArticleContent record);
}