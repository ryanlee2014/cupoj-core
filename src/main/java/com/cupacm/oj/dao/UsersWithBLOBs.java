package com.cupacm.oj.dao;

public class UsersWithBLOBs extends Users {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.blog
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String blog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.github
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String github;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.biography
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String biography;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.blog
     *
     * @return the value of users.blog
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getBlog() {
        return blog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.blog
     *
     * @param blog the value for users.blog
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setBlog(String blog) {
        this.blog = blog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.github
     *
     * @return the value of users.github
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getGithub() {
        return github;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.github
     *
     * @param github the value for users.github
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setGithub(String github) {
        this.github = github;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.biography
     *
     * @return the value of users.biography
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getBiography() {
        return biography;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.biography
     *
     * @param biography the value for users.biography
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setBiography(String biography) {
        this.biography = biography;
    }
}