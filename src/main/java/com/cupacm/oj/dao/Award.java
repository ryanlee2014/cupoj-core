package com.cupacm.oj.dao;

public class Award {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column award.award_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Integer awardId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column award.user_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column award.award
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String award;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column award.year
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Integer year;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column award.award_id
     *
     * @return the value of award.award_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Integer getAwardId() {
        return awardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column award.award_id
     *
     * @param awardId the value for award.award_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setAwardId(Integer awardId) {
        this.awardId = awardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column award.user_id
     *
     * @return the value of award.user_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column award.user_id
     *
     * @param userId the value for award.user_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column award.award
     *
     * @return the value of award.award
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getAward() {
        return award;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column award.award
     *
     * @param award the value for award.award
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setAward(String award) {
        this.award = award;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column award.year
     *
     * @return the value of award.year
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Integer getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column award.year
     *
     * @param year the value for award.year
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setYear(Integer year) {
        this.year = year;
    }
}