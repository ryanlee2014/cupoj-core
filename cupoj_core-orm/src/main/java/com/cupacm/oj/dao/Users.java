package com.cupacm.oj.dao;

import java.util.Date;

public class Users {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.email
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.submit
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer submit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.solved
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer solved;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.vjudge_submit
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer vjudgeSubmit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.vjudge_accept
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer vjudgeAccept;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.vjudge_solved
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer vjudgeSolved;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.defunct
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String defunct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.ip
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.accesstime
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Date accesstime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.volume
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer volume;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer language;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.password
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.newpassword
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String newpassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.authcode
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String authcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.reg_time
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Date regTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.nick
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String nick;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.school
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String school;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.confirmquestion
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String confirmquestion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.confirmanswer
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String confirmanswer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.avatar
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Boolean avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.money
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.avatarUrl
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String avatarurl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_id
     *
     * @return the value of users.user_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_id
     *
     * @param userId the value for users.user_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.email
     *
     * @return the value of users.email
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.email
     *
     * @param email the value for users.email
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.submit
     *
     * @return the value of users.submit
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getSubmit() {
        return submit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.submit
     *
     * @param submit the value for users.submit
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setSubmit(Integer submit) {
        this.submit = submit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.solved
     *
     * @return the value of users.solved
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getSolved() {
        return solved;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.solved
     *
     * @param solved the value for users.solved
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setSolved(Integer solved) {
        this.solved = solved;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.vjudge_submit
     *
     * @return the value of users.vjudge_submit
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getVjudgeSubmit() {
        return vjudgeSubmit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.vjudge_submit
     *
     * @param vjudgeSubmit the value for users.vjudge_submit
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setVjudgeSubmit(Integer vjudgeSubmit) {
        this.vjudgeSubmit = vjudgeSubmit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.vjudge_accept
     *
     * @return the value of users.vjudge_accept
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getVjudgeAccept() {
        return vjudgeAccept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.vjudge_accept
     *
     * @param vjudgeAccept the value for users.vjudge_accept
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setVjudgeAccept(Integer vjudgeAccept) {
        this.vjudgeAccept = vjudgeAccept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.vjudge_solved
     *
     * @return the value of users.vjudge_solved
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getVjudgeSolved() {
        return vjudgeSolved;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.vjudge_solved
     *
     * @param vjudgeSolved the value for users.vjudge_solved
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setVjudgeSolved(Integer vjudgeSolved) {
        this.vjudgeSolved = vjudgeSolved;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.defunct
     *
     * @return the value of users.defunct
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getDefunct() {
        return defunct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.defunct
     *
     * @param defunct the value for users.defunct
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setDefunct(String defunct) {
        this.defunct = defunct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.ip
     *
     * @return the value of users.ip
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.ip
     *
     * @param ip the value for users.ip
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.accesstime
     *
     * @return the value of users.accesstime
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Date getAccesstime() {
        return accesstime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.accesstime
     *
     * @param accesstime the value for users.accesstime
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.volume
     *
     * @return the value of users.volume
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getVolume() {
        return volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.volume
     *
     * @param volume the value for users.volume
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.language
     *
     * @return the value of users.language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.language
     *
     * @param language the value for users.language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setLanguage(Integer language) {
        this.language = language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.password
     *
     * @return the value of users.password
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.password
     *
     * @param password the value for users.password
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.newpassword
     *
     * @return the value of users.newpassword
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getNewpassword() {
        return newpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.newpassword
     *
     * @param newpassword the value for users.newpassword
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.authcode
     *
     * @return the value of users.authcode
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getAuthcode() {
        return authcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.authcode
     *
     * @param authcode the value for users.authcode
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setAuthcode(String authcode) {
        this.authcode = authcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.reg_time
     *
     * @return the value of users.reg_time
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.reg_time
     *
     * @param regTime the value for users.reg_time
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.nick
     *
     * @return the value of users.nick
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getNick() {
        return nick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.nick
     *
     * @param nick the value for users.nick
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.school
     *
     * @return the value of users.school
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getSchool() {
        return school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.school
     *
     * @param school the value for users.school
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.confirmquestion
     *
     * @return the value of users.confirmquestion
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getConfirmquestion() {
        return confirmquestion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.confirmquestion
     *
     * @param confirmquestion the value for users.confirmquestion
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setConfirmquestion(String confirmquestion) {
        this.confirmquestion = confirmquestion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.confirmanswer
     *
     * @return the value of users.confirmanswer
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getConfirmanswer() {
        return confirmanswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.confirmanswer
     *
     * @param confirmanswer the value for users.confirmanswer
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setConfirmanswer(String confirmanswer) {
        this.confirmanswer = confirmanswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.avatar
     *
     * @return the value of users.avatar
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Boolean getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.avatar
     *
     * @param avatar the value for users.avatar
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setAvatar(Boolean avatar) {
        this.avatar = avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.money
     *
     * @return the value of users.money
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.money
     *
     * @param money the value for users.money
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.avatarUrl
     *
     * @return the value of users.avatarUrl
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getAvatarurl() {
        return avatarurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.avatarUrl
     *
     * @param avatarurl the value for users.avatarUrl
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }
}