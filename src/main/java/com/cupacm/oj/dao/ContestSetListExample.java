package com.cupacm.oj.dao;

import java.util.ArrayList;
import java.util.List;

public class ContestSetListExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public ContestSetListExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andContestSetRecordIdIsNull() {
            addCriterion("contest_set_record_id is null");
            return (Criteria) this;
        }

        public Criteria andContestSetRecordIdIsNotNull() {
            addCriterion("contest_set_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andContestSetRecordIdEqualTo(Integer value) {
            addCriterion("contest_set_record_id =", value, "contestSetRecordId");
            return (Criteria) this;
        }

        public Criteria andContestSetRecordIdNotEqualTo(Integer value) {
            addCriterion("contest_set_record_id <>", value, "contestSetRecordId");
            return (Criteria) this;
        }

        public Criteria andContestSetRecordIdGreaterThan(Integer value) {
            addCriterion("contest_set_record_id >", value, "contestSetRecordId");
            return (Criteria) this;
        }

        public Criteria andContestSetRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contest_set_record_id >=", value, "contestSetRecordId");
            return (Criteria) this;
        }

        public Criteria andContestSetRecordIdLessThan(Integer value) {
            addCriterion("contest_set_record_id <", value, "contestSetRecordId");
            return (Criteria) this;
        }

        public Criteria andContestSetRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("contest_set_record_id <=", value, "contestSetRecordId");
            return (Criteria) this;
        }

        public Criteria andContestSetRecordIdIn(List<Integer> values) {
            addCriterion("contest_set_record_id in", values, "contestSetRecordId");
            return (Criteria) this;
        }

        public Criteria andContestSetRecordIdNotIn(List<Integer> values) {
            addCriterion("contest_set_record_id not in", values, "contestSetRecordId");
            return (Criteria) this;
        }

        public Criteria andContestSetRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("contest_set_record_id between", value1, value2, "contestSetRecordId");
            return (Criteria) this;
        }

        public Criteria andContestSetRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contest_set_record_id not between", value1, value2, "contestSetRecordId");
            return (Criteria) this;
        }

        public Criteria andContestsetIdIsNull() {
            addCriterion("contestset_id is null");
            return (Criteria) this;
        }

        public Criteria andContestsetIdIsNotNull() {
            addCriterion("contestset_id is not null");
            return (Criteria) this;
        }

        public Criteria andContestsetIdEqualTo(Integer value) {
            addCriterion("contestset_id =", value, "contestsetId");
            return (Criteria) this;
        }

        public Criteria andContestsetIdNotEqualTo(Integer value) {
            addCriterion("contestset_id <>", value, "contestsetId");
            return (Criteria) this;
        }

        public Criteria andContestsetIdGreaterThan(Integer value) {
            addCriterion("contestset_id >", value, "contestsetId");
            return (Criteria) this;
        }

        public Criteria andContestsetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contestset_id >=", value, "contestsetId");
            return (Criteria) this;
        }

        public Criteria andContestsetIdLessThan(Integer value) {
            addCriterion("contestset_id <", value, "contestsetId");
            return (Criteria) this;
        }

        public Criteria andContestsetIdLessThanOrEqualTo(Integer value) {
            addCriterion("contestset_id <=", value, "contestsetId");
            return (Criteria) this;
        }

        public Criteria andContestsetIdIn(List<Integer> values) {
            addCriterion("contestset_id in", values, "contestsetId");
            return (Criteria) this;
        }

        public Criteria andContestsetIdNotIn(List<Integer> values) {
            addCriterion("contestset_id not in", values, "contestsetId");
            return (Criteria) this;
        }

        public Criteria andContestsetIdBetween(Integer value1, Integer value2) {
            addCriterion("contestset_id between", value1, value2, "contestsetId");
            return (Criteria) this;
        }

        public Criteria andContestsetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contestset_id not between", value1, value2, "contestsetId");
            return (Criteria) this;
        }

        public Criteria andContestIdIsNull() {
            addCriterion("contest_id is null");
            return (Criteria) this;
        }

        public Criteria andContestIdIsNotNull() {
            addCriterion("contest_id is not null");
            return (Criteria) this;
        }

        public Criteria andContestIdEqualTo(Integer value) {
            addCriterion("contest_id =", value, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdNotEqualTo(Integer value) {
            addCriterion("contest_id <>", value, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdGreaterThan(Integer value) {
            addCriterion("contest_id >", value, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contest_id >=", value, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdLessThan(Integer value) {
            addCriterion("contest_id <", value, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdLessThanOrEqualTo(Integer value) {
            addCriterion("contest_id <=", value, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdIn(List<Integer> values) {
            addCriterion("contest_id in", values, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdNotIn(List<Integer> values) {
            addCriterion("contest_id not in", values, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdBetween(Integer value1, Integer value2) {
            addCriterion("contest_id between", value1, value2, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contest_id not between", value1, value2, "contestId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table contest_set_list
     *
     * @mbg.generated do_not_delete_during_merge Sun Nov 08 15:44:09 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table contest_set_list
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}