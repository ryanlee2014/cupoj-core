package com.cupacm.oj.dao;

import java.util.Date;

public class Contest {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.contest_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Integer contestId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.title
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.start_time
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.end_time
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.defunct
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String defunct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.private
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Byte Private;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.vjudge
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Byte vjudge;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.cmod_visible
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Byte cmodVisible;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.homework
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Byte homework;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.langmask
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Long langmask;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.password
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.ip_policy
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String ipPolicy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.limit_hostname
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String limitHostname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.maker
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String maker;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.show_all_ranklist
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Byte showAllRanklist;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.show_sim
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Byte showSim;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contest.description
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.contest_id
     *
     * @return the value of contest.contest_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Integer getContestId() {
        return contestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.contest_id
     *
     * @param contestId the value for contest.contest_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setContestId(Integer contestId) {
        this.contestId = contestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.title
     *
     * @return the value of contest.title
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.title
     *
     * @param title the value for contest.title
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.start_time
     *
     * @return the value of contest.start_time
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.start_time
     *
     * @param startTime the value for contest.start_time
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.end_time
     *
     * @return the value of contest.end_time
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.end_time
     *
     * @param endTime the value for contest.end_time
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.defunct
     *
     * @return the value of contest.defunct
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getDefunct() {
        return defunct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.defunct
     *
     * @param defunct the value for contest.defunct
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setDefunct(String defunct) {
        this.defunct = defunct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.private
     *
     * @return the value of contest.private
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Byte getPrivate() {
        return Private;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.private
     *
     * @param Private the value for contest.private
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setPrivate(Byte Private) {
        this.Private = Private;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.vjudge
     *
     * @return the value of contest.vjudge
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Byte getVjudge() {
        return vjudge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.vjudge
     *
     * @param vjudge the value for contest.vjudge
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setVjudge(Byte vjudge) {
        this.vjudge = vjudge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.cmod_visible
     *
     * @return the value of contest.cmod_visible
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Byte getCmodVisible() {
        return cmodVisible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.cmod_visible
     *
     * @param cmodVisible the value for contest.cmod_visible
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setCmodVisible(Byte cmodVisible) {
        this.cmodVisible = cmodVisible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.homework
     *
     * @return the value of contest.homework
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Byte getHomework() {
        return homework;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.homework
     *
     * @param homework the value for contest.homework
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setHomework(Byte homework) {
        this.homework = homework;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.langmask
     *
     * @return the value of contest.langmask
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Long getLangmask() {
        return langmask;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.langmask
     *
     * @param langmask the value for contest.langmask
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setLangmask(Long langmask) {
        this.langmask = langmask;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.password
     *
     * @return the value of contest.password
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.password
     *
     * @param password the value for contest.password
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.ip_policy
     *
     * @return the value of contest.ip_policy
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getIpPolicy() {
        return ipPolicy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.ip_policy
     *
     * @param ipPolicy the value for contest.ip_policy
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setIpPolicy(String ipPolicy) {
        this.ipPolicy = ipPolicy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.limit_hostname
     *
     * @return the value of contest.limit_hostname
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getLimitHostname() {
        return limitHostname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.limit_hostname
     *
     * @param limitHostname the value for contest.limit_hostname
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setLimitHostname(String limitHostname) {
        this.limitHostname = limitHostname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.maker
     *
     * @return the value of contest.maker
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getMaker() {
        return maker;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.maker
     *
     * @param maker the value for contest.maker
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setMaker(String maker) {
        this.maker = maker;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.show_all_ranklist
     *
     * @return the value of contest.show_all_ranklist
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Byte getShowAllRanklist() {
        return showAllRanklist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.show_all_ranklist
     *
     * @param showAllRanklist the value for contest.show_all_ranklist
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setShowAllRanklist(Byte showAllRanklist) {
        this.showAllRanklist = showAllRanklist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.show_sim
     *
     * @return the value of contest.show_sim
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Byte getShowSim() {
        return showSim;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.show_sim
     *
     * @param showSim the value for contest.show_sim
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setShowSim(Byte showSim) {
        this.showSim = showSim;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contest.description
     *
     * @return the value of contest.description
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contest.description
     *
     * @param description the value for contest.description
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setDescription(String description) {
        this.description = description;
    }
}