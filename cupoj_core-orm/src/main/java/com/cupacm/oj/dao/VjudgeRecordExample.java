package com.cupacm.oj.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VjudgeRecordExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public VjudgeRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
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
     * This method corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOjNameIsNull() {
            addCriterion("oj_name is null");
            return (Criteria) this;
        }

        public Criteria andOjNameIsNotNull() {
            addCriterion("oj_name is not null");
            return (Criteria) this;
        }

        public Criteria andOjNameEqualTo(String value) {
            addCriterion("oj_name =", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameNotEqualTo(String value) {
            addCriterion("oj_name <>", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameGreaterThan(String value) {
            addCriterion("oj_name >", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameGreaterThanOrEqualTo(String value) {
            addCriterion("oj_name >=", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameLessThan(String value) {
            addCriterion("oj_name <", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameLessThanOrEqualTo(String value) {
            addCriterion("oj_name <=", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameLike(String value) {
            addCriterion("oj_name like", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameNotLike(String value) {
            addCriterion("oj_name not like", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameIn(List<String> values) {
            addCriterion("oj_name in", values, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameNotIn(List<String> values) {
            addCriterion("oj_name not in", values, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameBetween(String value1, String value2) {
            addCriterion("oj_name between", value1, value2, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameNotBetween(String value1, String value2) {
            addCriterion("oj_name not between", value1, value2, "ojName");
            return (Criteria) this;
        }

        public Criteria andProblemIdIsNull() {
            addCriterion("problem_id is null");
            return (Criteria) this;
        }

        public Criteria andProblemIdIsNotNull() {
            addCriterion("problem_id is not null");
            return (Criteria) this;
        }

        public Criteria andProblemIdEqualTo(String value) {
            addCriterion("problem_id =", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotEqualTo(String value) {
            addCriterion("problem_id <>", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThan(String value) {
            addCriterion("problem_id >", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThanOrEqualTo(String value) {
            addCriterion("problem_id >=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThan(String value) {
            addCriterion("problem_id <", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThanOrEqualTo(String value) {
            addCriterion("problem_id <=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLike(String value) {
            addCriterion("problem_id like", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotLike(String value) {
            addCriterion("problem_id not like", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdIn(List<String> values) {
            addCriterion("problem_id in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotIn(List<String> values) {
            addCriterion("problem_id not in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdBetween(String value1, String value2) {
            addCriterion("problem_id between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotBetween(String value1, String value2) {
            addCriterion("problem_id not between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Integer value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Integer value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Integer value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Integer value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Integer value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Integer> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Integer> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Integer value1, Integer value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Integer value1, Integer value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andTimeRunningIsNull() {
            addCriterion("time_running is null");
            return (Criteria) this;
        }

        public Criteria andTimeRunningIsNotNull() {
            addCriterion("time_running is not null");
            return (Criteria) this;
        }

        public Criteria andTimeRunningEqualTo(Integer value) {
            addCriterion("time_running =", value, "timeRunning");
            return (Criteria) this;
        }

        public Criteria andTimeRunningNotEqualTo(Integer value) {
            addCriterion("time_running <>", value, "timeRunning");
            return (Criteria) this;
        }

        public Criteria andTimeRunningGreaterThan(Integer value) {
            addCriterion("time_running >", value, "timeRunning");
            return (Criteria) this;
        }

        public Criteria andTimeRunningGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_running >=", value, "timeRunning");
            return (Criteria) this;
        }

        public Criteria andTimeRunningLessThan(Integer value) {
            addCriterion("time_running <", value, "timeRunning");
            return (Criteria) this;
        }

        public Criteria andTimeRunningLessThanOrEqualTo(Integer value) {
            addCriterion("time_running <=", value, "timeRunning");
            return (Criteria) this;
        }

        public Criteria andTimeRunningIn(List<Integer> values) {
            addCriterion("time_running in", values, "timeRunning");
            return (Criteria) this;
        }

        public Criteria andTimeRunningNotIn(List<Integer> values) {
            addCriterion("time_running not in", values, "timeRunning");
            return (Criteria) this;
        }

        public Criteria andTimeRunningBetween(Integer value1, Integer value2) {
            addCriterion("time_running between", value1, value2, "timeRunning");
            return (Criteria) this;
        }

        public Criteria andTimeRunningNotBetween(Integer value1, Integer value2) {
            addCriterion("time_running not between", value1, value2, "timeRunning");
            return (Criteria) this;
        }

        public Criteria andMemoryIsNull() {
            addCriterion("memory is null");
            return (Criteria) this;
        }

        public Criteria andMemoryIsNotNull() {
            addCriterion("memory is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryEqualTo(Integer value) {
            addCriterion("memory =", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotEqualTo(Integer value) {
            addCriterion("memory <>", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryGreaterThan(Integer value) {
            addCriterion("memory >", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("memory >=", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLessThan(Integer value) {
            addCriterion("memory <", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLessThanOrEqualTo(Integer value) {
            addCriterion("memory <=", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryIn(List<Integer> values) {
            addCriterion("memory in", values, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotIn(List<Integer> values) {
            addCriterion("memory not in", values, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryBetween(Integer value1, Integer value2) {
            addCriterion("memory between", value1, value2, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotBetween(Integer value1, Integer value2) {
            addCriterion("memory not between", value1, value2, "memory");
            return (Criteria) this;
        }

        public Criteria andCodeLengthIsNull() {
            addCriterion("code_length is null");
            return (Criteria) this;
        }

        public Criteria andCodeLengthIsNotNull() {
            addCriterion("code_length is not null");
            return (Criteria) this;
        }

        public Criteria andCodeLengthEqualTo(Integer value) {
            addCriterion("code_length =", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthNotEqualTo(Integer value) {
            addCriterion("code_length <>", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthGreaterThan(Integer value) {
            addCriterion("code_length >", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_length >=", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthLessThan(Integer value) {
            addCriterion("code_length <", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthLessThanOrEqualTo(Integer value) {
            addCriterion("code_length <=", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthIn(List<Integer> values) {
            addCriterion("code_length in", values, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthNotIn(List<Integer> values) {
            addCriterion("code_length not in", values, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthBetween(Integer value1, Integer value2) {
            addCriterion("code_length between", value1, value2, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("code_length not between", value1, value2, "codeLength");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table vjudge_record
     *
     * @mbg.generated do_not_delete_during_merge Sun Nov 08 15:06:46 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table vjudge_record
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
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