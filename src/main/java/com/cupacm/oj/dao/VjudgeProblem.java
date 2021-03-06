package com.cupacm.oj.dao;

import java.util.Date;

public class VjudgeProblem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjudge_problem.vjudge_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Integer vjudgeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjudge_problem.problem_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Integer problemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjudge_problem.title
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjudge_problem.label
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String label;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjudge_problem.accepted
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Integer accepted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjudge_problem.submit
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Integer submit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjudge_problem.time_limit
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Integer timeLimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjudge_problem.memory_limit
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Integer memoryLimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjudge_problem.source
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjudge_problem.spj
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Byte spj;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjudge_problem.defunct
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private String defunct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vjudge_problem.in_date
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    private Date inDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjudge_problem.vjudge_id
     *
     * @return the value of vjudge_problem.vjudge_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Integer getVjudgeId() {
        return vjudgeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjudge_problem.vjudge_id
     *
     * @param vjudgeId the value for vjudge_problem.vjudge_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setVjudgeId(Integer vjudgeId) {
        this.vjudgeId = vjudgeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjudge_problem.problem_id
     *
     * @return the value of vjudge_problem.problem_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Integer getProblemId() {
        return problemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjudge_problem.problem_id
     *
     * @param problemId the value for vjudge_problem.problem_id
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjudge_problem.title
     *
     * @return the value of vjudge_problem.title
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjudge_problem.title
     *
     * @param title the value for vjudge_problem.title
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjudge_problem.label
     *
     * @return the value of vjudge_problem.label
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjudge_problem.label
     *
     * @param label the value for vjudge_problem.label
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjudge_problem.accepted
     *
     * @return the value of vjudge_problem.accepted
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Integer getAccepted() {
        return accepted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjudge_problem.accepted
     *
     * @param accepted the value for vjudge_problem.accepted
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setAccepted(Integer accepted) {
        this.accepted = accepted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjudge_problem.submit
     *
     * @return the value of vjudge_problem.submit
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Integer getSubmit() {
        return submit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjudge_problem.submit
     *
     * @param submit the value for vjudge_problem.submit
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setSubmit(Integer submit) {
        this.submit = submit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjudge_problem.time_limit
     *
     * @return the value of vjudge_problem.time_limit
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Integer getTimeLimit() {
        return timeLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjudge_problem.time_limit
     *
     * @param timeLimit the value for vjudge_problem.time_limit
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjudge_problem.memory_limit
     *
     * @return the value of vjudge_problem.memory_limit
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Integer getMemoryLimit() {
        return memoryLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjudge_problem.memory_limit
     *
     * @param memoryLimit the value for vjudge_problem.memory_limit
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setMemoryLimit(Integer memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjudge_problem.source
     *
     * @return the value of vjudge_problem.source
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjudge_problem.source
     *
     * @param source the value for vjudge_problem.source
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjudge_problem.spj
     *
     * @return the value of vjudge_problem.spj
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Byte getSpj() {
        return spj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjudge_problem.spj
     *
     * @param spj the value for vjudge_problem.spj
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setSpj(Byte spj) {
        this.spj = spj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjudge_problem.defunct
     *
     * @return the value of vjudge_problem.defunct
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getDefunct() {
        return defunct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjudge_problem.defunct
     *
     * @param defunct the value for vjudge_problem.defunct
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setDefunct(String defunct) {
        this.defunct = defunct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vjudge_problem.in_date
     *
     * @return the value of vjudge_problem.in_date
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Date getInDate() {
        return inDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vjudge_problem.in_date
     *
     * @param inDate the value for vjudge_problem.in_date
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }
}