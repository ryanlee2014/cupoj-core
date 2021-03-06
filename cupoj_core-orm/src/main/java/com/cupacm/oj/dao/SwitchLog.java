package com.cupacm.oj.dao;

import java.util.Date;

public class SwitchLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column switch_log.id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column switch_log.operation
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer operation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column switch_log.key
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String key;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column switch_log.value
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column switch_log.comment
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column switch_log.createdAt
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Date createdat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column switch_log.updatedAt
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Date updatedat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column switch_log.id
     *
     * @return the value of switch_log.id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column switch_log.id
     *
     * @param id the value for switch_log.id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column switch_log.operation
     *
     * @return the value of switch_log.operation
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getOperation() {
        return operation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column switch_log.operation
     *
     * @param operation the value for switch_log.operation
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column switch_log.key
     *
     * @return the value of switch_log.key
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getKey() {
        return key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column switch_log.key
     *
     * @param key the value for switch_log.key
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column switch_log.value
     *
     * @return the value of switch_log.value
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column switch_log.value
     *
     * @param value the value for switch_log.value
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column switch_log.comment
     *
     * @return the value of switch_log.comment
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column switch_log.comment
     *
     * @param comment the value for switch_log.comment
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column switch_log.createdAt
     *
     * @return the value of switch_log.createdAt
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Date getCreatedat() {
        return createdat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column switch_log.createdAt
     *
     * @param createdat the value for switch_log.createdAt
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column switch_log.updatedAt
     *
     * @return the value of switch_log.updatedAt
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Date getUpdatedat() {
        return updatedat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column switch_log.updatedAt
     *
     * @param updatedat the value for switch_log.updatedAt
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }
}