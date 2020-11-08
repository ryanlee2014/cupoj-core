package com.cupacm.oj.dao;

import java.util.ArrayList;
import java.util.List;

public class SpecialSubjectExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public SpecialSubjectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
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
     * This method corresponds to the database table special_subject
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
     * This method corresponds to the database table special_subject
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject
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
     * This class corresponds to the database table special_subject
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

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Integer value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Integer value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Integer value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Integer value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Integer value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Integer> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Integer> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Integer value1, Integer value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDefunctIsNull() {
            addCriterion("defunct is null");
            return (Criteria) this;
        }

        public Criteria andDefunctIsNotNull() {
            addCriterion("defunct is not null");
            return (Criteria) this;
        }

        public Criteria andDefunctEqualTo(String value) {
            addCriterion("defunct =", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctNotEqualTo(String value) {
            addCriterion("defunct <>", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctGreaterThan(String value) {
            addCriterion("defunct >", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctGreaterThanOrEqualTo(String value) {
            addCriterion("defunct >=", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctLessThan(String value) {
            addCriterion("defunct <", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctLessThanOrEqualTo(String value) {
            addCriterion("defunct <=", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctLike(String value) {
            addCriterion("defunct like", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctNotLike(String value) {
            addCriterion("defunct not like", value, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctIn(List<String> values) {
            addCriterion("defunct in", values, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctNotIn(List<String> values) {
            addCriterion("defunct not in", values, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctBetween(String value1, String value2) {
            addCriterion("defunct between", value1, value2, "defunct");
            return (Criteria) this;
        }

        public Criteria andDefunctNotBetween(String value1, String value2) {
            addCriterion("defunct not between", value1, value2, "defunct");
            return (Criteria) this;
        }

        public Criteria andPrivateIsNull() {
            addCriterion("private is null");
            return (Criteria) this;
        }

        public Criteria andPrivateIsNotNull() {
            addCriterion("private is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateEqualTo(Byte value) {
            addCriterion("private =", value, "Private");
            return (Criteria) this;
        }

        public Criteria andPrivateNotEqualTo(Byte value) {
            addCriterion("private <>", value, "Private");
            return (Criteria) this;
        }

        public Criteria andPrivateGreaterThan(Byte value) {
            addCriterion("private >", value, "Private");
            return (Criteria) this;
        }

        public Criteria andPrivateGreaterThanOrEqualTo(Byte value) {
            addCriterion("private >=", value, "Private");
            return (Criteria) this;
        }

        public Criteria andPrivateLessThan(Byte value) {
            addCriterion("private <", value, "Private");
            return (Criteria) this;
        }

        public Criteria andPrivateLessThanOrEqualTo(Byte value) {
            addCriterion("private <=", value, "Private");
            return (Criteria) this;
        }

        public Criteria andPrivateIn(List<Byte> values) {
            addCriterion("private in", values, "Private");
            return (Criteria) this;
        }

        public Criteria andPrivateNotIn(List<Byte> values) {
            addCriterion("private not in", values, "Private");
            return (Criteria) this;
        }

        public Criteria andPrivateBetween(Byte value1, Byte value2) {
            addCriterion("private between", value1, value2, "Private");
            return (Criteria) this;
        }

        public Criteria andPrivateNotBetween(Byte value1, Byte value2) {
            addCriterion("private not between", value1, value2, "Private");
            return (Criteria) this;
        }

        public Criteria andVjudgeIsNull() {
            addCriterion("vjudge is null");
            return (Criteria) this;
        }

        public Criteria andVjudgeIsNotNull() {
            addCriterion("vjudge is not null");
            return (Criteria) this;
        }

        public Criteria andVjudgeEqualTo(Byte value) {
            addCriterion("vjudge =", value, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeNotEqualTo(Byte value) {
            addCriterion("vjudge <>", value, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeGreaterThan(Byte value) {
            addCriterion("vjudge >", value, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("vjudge >=", value, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeLessThan(Byte value) {
            addCriterion("vjudge <", value, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeLessThanOrEqualTo(Byte value) {
            addCriterion("vjudge <=", value, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeIn(List<Byte> values) {
            addCriterion("vjudge in", values, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeNotIn(List<Byte> values) {
            addCriterion("vjudge not in", values, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeBetween(Byte value1, Byte value2) {
            addCriterion("vjudge between", value1, value2, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeNotBetween(Byte value1, Byte value2) {
            addCriterion("vjudge not between", value1, value2, "vjudge");
            return (Criteria) this;
        }

        public Criteria andLangmaskIsNull() {
            addCriterion("langmask is null");
            return (Criteria) this;
        }

        public Criteria andLangmaskIsNotNull() {
            addCriterion("langmask is not null");
            return (Criteria) this;
        }

        public Criteria andLangmaskEqualTo(Integer value) {
            addCriterion("langmask =", value, "langmask");
            return (Criteria) this;
        }

        public Criteria andLangmaskNotEqualTo(Integer value) {
            addCriterion("langmask <>", value, "langmask");
            return (Criteria) this;
        }

        public Criteria andLangmaskGreaterThan(Integer value) {
            addCriterion("langmask >", value, "langmask");
            return (Criteria) this;
        }

        public Criteria andLangmaskGreaterThanOrEqualTo(Integer value) {
            addCriterion("langmask >=", value, "langmask");
            return (Criteria) this;
        }

        public Criteria andLangmaskLessThan(Integer value) {
            addCriterion("langmask <", value, "langmask");
            return (Criteria) this;
        }

        public Criteria andLangmaskLessThanOrEqualTo(Integer value) {
            addCriterion("langmask <=", value, "langmask");
            return (Criteria) this;
        }

        public Criteria andLangmaskIn(List<Integer> values) {
            addCriterion("langmask in", values, "langmask");
            return (Criteria) this;
        }

        public Criteria andLangmaskNotIn(List<Integer> values) {
            addCriterion("langmask not in", values, "langmask");
            return (Criteria) this;
        }

        public Criteria andLangmaskBetween(Integer value1, Integer value2) {
            addCriterion("langmask between", value1, value2, "langmask");
            return (Criteria) this;
        }

        public Criteria andLangmaskNotBetween(Integer value1, Integer value2) {
            addCriterion("langmask not between", value1, value2, "langmask");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table special_subject
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
     * This class corresponds to the database table special_subject
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