package com.cupacm.oj.dao;

public class Runtimeinfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column runtimeinfo.solution_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer solutionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column runtimeinfo.error
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String error;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column runtimeinfo.solution_id
     *
     * @return the value of runtimeinfo.solution_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getSolutionId() {
        return solutionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column runtimeinfo.solution_id
     *
     * @param solutionId the value for runtimeinfo.solution_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setSolutionId(Integer solutionId) {
        this.solutionId = solutionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column runtimeinfo.error
     *
     * @return the value of runtimeinfo.error
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getError() {
        return error;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column runtimeinfo.error
     *
     * @param error the value for runtimeinfo.error
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setError(String error) {
        this.error = error;
    }
}