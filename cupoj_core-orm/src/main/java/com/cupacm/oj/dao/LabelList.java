package com.cupacm.oj.dao;

public class LabelList {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column label_list.label_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer labelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column label_list.label_name
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private String labelName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column label_list.prev_label_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    private Integer prevLabelId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column label_list.label_id
     *
     * @return the value of label_list.label_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getLabelId() {
        return labelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column label_list.label_id
     *
     * @param labelId the value for label_list.label_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column label_list.label_name
     *
     * @return the value of label_list.label_name
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getLabelName() {
        return labelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column label_list.label_name
     *
     * @param labelName the value for label_list.label_name
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column label_list.prev_label_id
     *
     * @return the value of label_list.prev_label_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Integer getPrevLabelId() {
        return prevLabelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column label_list.prev_label_id
     *
     * @param prevLabelId the value for label_list.prev_label_id
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setPrevLabelId(Integer prevLabelId) {
        this.prevLabelId = prevLabelId;
    }
}