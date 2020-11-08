package com.cupacm.oj.dao;

import java.util.Date;

public class Article {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer articleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.user_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.title
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.defunct
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String defunct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.create_time
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.edit_time
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Date editTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.last_post
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Date lastPost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.content
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_id
     *
     * @return the value of article.article_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_id
     *
     * @param articleId the value for article.article_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.user_id
     *
     * @return the value of article.user_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.user_id
     *
     * @param userId the value for article.user_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.title
     *
     * @return the value of article.title
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.title
     *
     * @param title the value for article.title
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.defunct
     *
     * @return the value of article.defunct
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getDefunct() {
        return defunct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.defunct
     *
     * @param defunct the value for article.defunct
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setDefunct(String defunct) {
        this.defunct = defunct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.create_time
     *
     * @return the value of article.create_time
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.create_time
     *
     * @param createTime the value for article.create_time
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.edit_time
     *
     * @return the value of article.edit_time
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Date getEditTime() {
        return editTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.edit_time
     *
     * @param editTime the value for article.edit_time
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.last_post
     *
     * @return the value of article.last_post
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Date getLastPost() {
        return lastPost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.last_post
     *
     * @param lastPost the value for article.last_post
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setLastPost(Date lastPost) {
        this.lastPost = lastPost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.content
     *
     * @return the value of article.content
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.content
     *
     * @param content the value for article.content
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setContent(String content) {
        this.content = content;
    }
}