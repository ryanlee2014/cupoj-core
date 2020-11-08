package com.cupacm.oj.dao;

import java.util.Date;

public class InvitedUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invited_user.user_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invited_user.inviter
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String inviter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invited_user.invite_date
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Date inviteDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invited_user.invite_code
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String inviteCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invited_user.user_id
     *
     * @return the value of invited_user.user_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invited_user.user_id
     *
     * @param userId the value for invited_user.user_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invited_user.inviter
     *
     * @return the value of invited_user.inviter
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getInviter() {
        return inviter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invited_user.inviter
     *
     * @param inviter the value for invited_user.inviter
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setInviter(String inviter) {
        this.inviter = inviter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invited_user.invite_date
     *
     * @return the value of invited_user.invite_date
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Date getInviteDate() {
        return inviteDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invited_user.invite_date
     *
     * @param inviteDate the value for invited_user.invite_date
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setInviteDate(Date inviteDate) {
        this.inviteDate = inviteDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invited_user.invite_code
     *
     * @return the value of invited_user.invite_code
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getInviteCode() {
        return inviteCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invited_user.invite_code
     *
     * @param inviteCode the value for invited_user.invite_code
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }
}