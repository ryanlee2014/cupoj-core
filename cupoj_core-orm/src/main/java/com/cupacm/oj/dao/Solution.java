package com.cupacm.oj.dao;

import java.math.BigDecimal;
import java.util.Date;

public class Solution {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.solution_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer solutionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.problem_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer problemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.user_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.time
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.memory
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer memory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.in_date
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Date inDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.result
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Short result;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer language;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.ip
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.contest_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer contestId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.topic_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer topicId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.valid
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Byte valid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.pass_point
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Byte passPoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.num
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Byte num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.code_length
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer codeLength;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.judgetime
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Date judgetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.pass_rate
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private BigDecimal passRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.judger
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String judger;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.share
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Boolean share;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.fingerprint
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String fingerprint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column solution.fingerprintRaw
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String fingerprintraw;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.solution_id
     *
     * @return the value of solution.solution_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getSolutionId() {
        return solutionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.solution_id
     *
     * @param solutionId the value for solution.solution_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setSolutionId(Integer solutionId) {
        this.solutionId = solutionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.problem_id
     *
     * @return the value of solution.problem_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getProblemId() {
        return problemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.problem_id
     *
     * @param problemId the value for solution.problem_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.user_id
     *
     * @return the value of solution.user_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.user_id
     *
     * @param userId the value for solution.user_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.time
     *
     * @return the value of solution.time
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.time
     *
     * @param time the value for solution.time
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.memory
     *
     * @return the value of solution.memory
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.memory
     *
     * @param memory the value for solution.memory
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.in_date
     *
     * @return the value of solution.in_date
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Date getInDate() {
        return inDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.in_date
     *
     * @param inDate the value for solution.in_date
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.result
     *
     * @return the value of solution.result
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Short getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.result
     *
     * @param result the value for solution.result
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setResult(Short result) {
        this.result = result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.language
     *
     * @return the value of solution.language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.language
     *
     * @param language the value for solution.language
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setLanguage(Integer language) {
        this.language = language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.ip
     *
     * @return the value of solution.ip
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.ip
     *
     * @param ip the value for solution.ip
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.contest_id
     *
     * @return the value of solution.contest_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getContestId() {
        return contestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.contest_id
     *
     * @param contestId the value for solution.contest_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setContestId(Integer contestId) {
        this.contestId = contestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.topic_id
     *
     * @return the value of solution.topic_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getTopicId() {
        return topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.topic_id
     *
     * @param topicId the value for solution.topic_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.valid
     *
     * @return the value of solution.valid
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Byte getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.valid
     *
     * @param valid the value for solution.valid
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setValid(Byte valid) {
        this.valid = valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.pass_point
     *
     * @return the value of solution.pass_point
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Byte getPassPoint() {
        return passPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.pass_point
     *
     * @param passPoint the value for solution.pass_point
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setPassPoint(Byte passPoint) {
        this.passPoint = passPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.num
     *
     * @return the value of solution.num
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Byte getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.num
     *
     * @param num the value for solution.num
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setNum(Byte num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.code_length
     *
     * @return the value of solution.code_length
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getCodeLength() {
        return codeLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.code_length
     *
     * @param codeLength the value for solution.code_length
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setCodeLength(Integer codeLength) {
        this.codeLength = codeLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.judgetime
     *
     * @return the value of solution.judgetime
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Date getJudgetime() {
        return judgetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.judgetime
     *
     * @param judgetime the value for solution.judgetime
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setJudgetime(Date judgetime) {
        this.judgetime = judgetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.pass_rate
     *
     * @return the value of solution.pass_rate
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public BigDecimal getPassRate() {
        return passRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.pass_rate
     *
     * @param passRate the value for solution.pass_rate
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setPassRate(BigDecimal passRate) {
        this.passRate = passRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.judger
     *
     * @return the value of solution.judger
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getJudger() {
        return judger;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.judger
     *
     * @param judger the value for solution.judger
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setJudger(String judger) {
        this.judger = judger;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.share
     *
     * @return the value of solution.share
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Boolean getShare() {
        return share;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.share
     *
     * @param share the value for solution.share
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setShare(Boolean share) {
        this.share = share;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.fingerprint
     *
     * @return the value of solution.fingerprint
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getFingerprint() {
        return fingerprint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.fingerprint
     *
     * @param fingerprint the value for solution.fingerprint
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column solution.fingerprintRaw
     *
     * @return the value of solution.fingerprintRaw
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getFingerprintraw() {
        return fingerprintraw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column solution.fingerprintRaw
     *
     * @param fingerprintraw the value for solution.fingerprintRaw
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setFingerprintraw(String fingerprintraw) {
        this.fingerprintraw = fingerprintraw;
    }
}