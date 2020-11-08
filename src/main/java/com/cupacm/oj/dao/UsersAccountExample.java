package com.cupacm.oj.dao;

import java.util.ArrayList;
import java.util.List;

public class UsersAccountExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_account
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_account
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_account
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_account
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public UsersAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_account
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_account
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_account
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_account
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_account
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_account
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_account
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
     * This method corresponds to the database table users_account
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
     * This method corresponds to the database table users_account
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_account
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
     * This class corresponds to the database table users_account
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

        public Criteria andHduIsNull() {
            addCriterion("hdu is null");
            return (Criteria) this;
        }

        public Criteria andHduIsNotNull() {
            addCriterion("hdu is not null");
            return (Criteria) this;
        }

        public Criteria andHduEqualTo(String value) {
            addCriterion("hdu =", value, "hdu");
            return (Criteria) this;
        }

        public Criteria andHduNotEqualTo(String value) {
            addCriterion("hdu <>", value, "hdu");
            return (Criteria) this;
        }

        public Criteria andHduGreaterThan(String value) {
            addCriterion("hdu >", value, "hdu");
            return (Criteria) this;
        }

        public Criteria andHduGreaterThanOrEqualTo(String value) {
            addCriterion("hdu >=", value, "hdu");
            return (Criteria) this;
        }

        public Criteria andHduLessThan(String value) {
            addCriterion("hdu <", value, "hdu");
            return (Criteria) this;
        }

        public Criteria andHduLessThanOrEqualTo(String value) {
            addCriterion("hdu <=", value, "hdu");
            return (Criteria) this;
        }

        public Criteria andHduLike(String value) {
            addCriterion("hdu like", value, "hdu");
            return (Criteria) this;
        }

        public Criteria andHduNotLike(String value) {
            addCriterion("hdu not like", value, "hdu");
            return (Criteria) this;
        }

        public Criteria andHduIn(List<String> values) {
            addCriterion("hdu in", values, "hdu");
            return (Criteria) this;
        }

        public Criteria andHduNotIn(List<String> values) {
            addCriterion("hdu not in", values, "hdu");
            return (Criteria) this;
        }

        public Criteria andHduBetween(String value1, String value2) {
            addCriterion("hdu between", value1, value2, "hdu");
            return (Criteria) this;
        }

        public Criteria andHduNotBetween(String value1, String value2) {
            addCriterion("hdu not between", value1, value2, "hdu");
            return (Criteria) this;
        }

        public Criteria andPojIsNull() {
            addCriterion("poj is null");
            return (Criteria) this;
        }

        public Criteria andPojIsNotNull() {
            addCriterion("poj is not null");
            return (Criteria) this;
        }

        public Criteria andPojEqualTo(String value) {
            addCriterion("poj =", value, "poj");
            return (Criteria) this;
        }

        public Criteria andPojNotEqualTo(String value) {
            addCriterion("poj <>", value, "poj");
            return (Criteria) this;
        }

        public Criteria andPojGreaterThan(String value) {
            addCriterion("poj >", value, "poj");
            return (Criteria) this;
        }

        public Criteria andPojGreaterThanOrEqualTo(String value) {
            addCriterion("poj >=", value, "poj");
            return (Criteria) this;
        }

        public Criteria andPojLessThan(String value) {
            addCriterion("poj <", value, "poj");
            return (Criteria) this;
        }

        public Criteria andPojLessThanOrEqualTo(String value) {
            addCriterion("poj <=", value, "poj");
            return (Criteria) this;
        }

        public Criteria andPojLike(String value) {
            addCriterion("poj like", value, "poj");
            return (Criteria) this;
        }

        public Criteria andPojNotLike(String value) {
            addCriterion("poj not like", value, "poj");
            return (Criteria) this;
        }

        public Criteria andPojIn(List<String> values) {
            addCriterion("poj in", values, "poj");
            return (Criteria) this;
        }

        public Criteria andPojNotIn(List<String> values) {
            addCriterion("poj not in", values, "poj");
            return (Criteria) this;
        }

        public Criteria andPojBetween(String value1, String value2) {
            addCriterion("poj between", value1, value2, "poj");
            return (Criteria) this;
        }

        public Criteria andPojNotBetween(String value1, String value2) {
            addCriterion("poj not between", value1, value2, "poj");
            return (Criteria) this;
        }

        public Criteria andCodeforcesIsNull() {
            addCriterion("codeforces is null");
            return (Criteria) this;
        }

        public Criteria andCodeforcesIsNotNull() {
            addCriterion("codeforces is not null");
            return (Criteria) this;
        }

        public Criteria andCodeforcesEqualTo(String value) {
            addCriterion("codeforces =", value, "codeforces");
            return (Criteria) this;
        }

        public Criteria andCodeforcesNotEqualTo(String value) {
            addCriterion("codeforces <>", value, "codeforces");
            return (Criteria) this;
        }

        public Criteria andCodeforcesGreaterThan(String value) {
            addCriterion("codeforces >", value, "codeforces");
            return (Criteria) this;
        }

        public Criteria andCodeforcesGreaterThanOrEqualTo(String value) {
            addCriterion("codeforces >=", value, "codeforces");
            return (Criteria) this;
        }

        public Criteria andCodeforcesLessThan(String value) {
            addCriterion("codeforces <", value, "codeforces");
            return (Criteria) this;
        }

        public Criteria andCodeforcesLessThanOrEqualTo(String value) {
            addCriterion("codeforces <=", value, "codeforces");
            return (Criteria) this;
        }

        public Criteria andCodeforcesLike(String value) {
            addCriterion("codeforces like", value, "codeforces");
            return (Criteria) this;
        }

        public Criteria andCodeforcesNotLike(String value) {
            addCriterion("codeforces not like", value, "codeforces");
            return (Criteria) this;
        }

        public Criteria andCodeforcesIn(List<String> values) {
            addCriterion("codeforces in", values, "codeforces");
            return (Criteria) this;
        }

        public Criteria andCodeforcesNotIn(List<String> values) {
            addCriterion("codeforces not in", values, "codeforces");
            return (Criteria) this;
        }

        public Criteria andCodeforcesBetween(String value1, String value2) {
            addCriterion("codeforces between", value1, value2, "codeforces");
            return (Criteria) this;
        }

        public Criteria andCodeforcesNotBetween(String value1, String value2) {
            addCriterion("codeforces not between", value1, value2, "codeforces");
            return (Criteria) this;
        }

        public Criteria andUvaIsNull() {
            addCriterion("uva is null");
            return (Criteria) this;
        }

        public Criteria andUvaIsNotNull() {
            addCriterion("uva is not null");
            return (Criteria) this;
        }

        public Criteria andUvaEqualTo(String value) {
            addCriterion("uva =", value, "uva");
            return (Criteria) this;
        }

        public Criteria andUvaNotEqualTo(String value) {
            addCriterion("uva <>", value, "uva");
            return (Criteria) this;
        }

        public Criteria andUvaGreaterThan(String value) {
            addCriterion("uva >", value, "uva");
            return (Criteria) this;
        }

        public Criteria andUvaGreaterThanOrEqualTo(String value) {
            addCriterion("uva >=", value, "uva");
            return (Criteria) this;
        }

        public Criteria andUvaLessThan(String value) {
            addCriterion("uva <", value, "uva");
            return (Criteria) this;
        }

        public Criteria andUvaLessThanOrEqualTo(String value) {
            addCriterion("uva <=", value, "uva");
            return (Criteria) this;
        }

        public Criteria andUvaLike(String value) {
            addCriterion("uva like", value, "uva");
            return (Criteria) this;
        }

        public Criteria andUvaNotLike(String value) {
            addCriterion("uva not like", value, "uva");
            return (Criteria) this;
        }

        public Criteria andUvaIn(List<String> values) {
            addCriterion("uva in", values, "uva");
            return (Criteria) this;
        }

        public Criteria andUvaNotIn(List<String> values) {
            addCriterion("uva not in", values, "uva");
            return (Criteria) this;
        }

        public Criteria andUvaBetween(String value1, String value2) {
            addCriterion("uva between", value1, value2, "uva");
            return (Criteria) this;
        }

        public Criteria andUvaNotBetween(String value1, String value2) {
            addCriterion("uva not between", value1, value2, "uva");
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

        public Criteria andVjudgeEqualTo(String value) {
            addCriterion("vjudge =", value, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeNotEqualTo(String value) {
            addCriterion("vjudge <>", value, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeGreaterThan(String value) {
            addCriterion("vjudge >", value, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeGreaterThanOrEqualTo(String value) {
            addCriterion("vjudge >=", value, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeLessThan(String value) {
            addCriterion("vjudge <", value, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeLessThanOrEqualTo(String value) {
            addCriterion("vjudge <=", value, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeLike(String value) {
            addCriterion("vjudge like", value, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeNotLike(String value) {
            addCriterion("vjudge not like", value, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeIn(List<String> values) {
            addCriterion("vjudge in", values, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeNotIn(List<String> values) {
            addCriterion("vjudge not in", values, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeBetween(String value1, String value2) {
            addCriterion("vjudge between", value1, value2, "vjudge");
            return (Criteria) this;
        }

        public Criteria andVjudgeNotBetween(String value1, String value2) {
            addCriterion("vjudge not between", value1, value2, "vjudge");
            return (Criteria) this;
        }

        public Criteria andHustojUpcIsNull() {
            addCriterion("hustoj-upc is null");
            return (Criteria) this;
        }

        public Criteria andHustojUpcIsNotNull() {
            addCriterion("hustoj-upc is not null");
            return (Criteria) this;
        }

        public Criteria andHustojUpcEqualTo(String value) {
            addCriterion("hustoj-upc =", value, "hustojUpc");
            return (Criteria) this;
        }

        public Criteria andHustojUpcNotEqualTo(String value) {
            addCriterion("hustoj-upc <>", value, "hustojUpc");
            return (Criteria) this;
        }

        public Criteria andHustojUpcGreaterThan(String value) {
            addCriterion("hustoj-upc >", value, "hustojUpc");
            return (Criteria) this;
        }

        public Criteria andHustojUpcGreaterThanOrEqualTo(String value) {
            addCriterion("hustoj-upc >=", value, "hustojUpc");
            return (Criteria) this;
        }

        public Criteria andHustojUpcLessThan(String value) {
            addCriterion("hustoj-upc <", value, "hustojUpc");
            return (Criteria) this;
        }

        public Criteria andHustojUpcLessThanOrEqualTo(String value) {
            addCriterion("hustoj-upc <=", value, "hustojUpc");
            return (Criteria) this;
        }

        public Criteria andHustojUpcLike(String value) {
            addCriterion("hustoj-upc like", value, "hustojUpc");
            return (Criteria) this;
        }

        public Criteria andHustojUpcNotLike(String value) {
            addCriterion("hustoj-upc not like", value, "hustojUpc");
            return (Criteria) this;
        }

        public Criteria andHustojUpcIn(List<String> values) {
            addCriterion("hustoj-upc in", values, "hustojUpc");
            return (Criteria) this;
        }

        public Criteria andHustojUpcNotIn(List<String> values) {
            addCriterion("hustoj-upc not in", values, "hustojUpc");
            return (Criteria) this;
        }

        public Criteria andHustojUpcBetween(String value1, String value2) {
            addCriterion("hustoj-upc between", value1, value2, "hustojUpc");
            return (Criteria) this;
        }

        public Criteria andHustojUpcNotBetween(String value1, String value2) {
            addCriterion("hustoj-upc not between", value1, value2, "hustojUpc");
            return (Criteria) this;
        }

        public Criteria andUpcvjIsNull() {
            addCriterion("upcvj is null");
            return (Criteria) this;
        }

        public Criteria andUpcvjIsNotNull() {
            addCriterion("upcvj is not null");
            return (Criteria) this;
        }

        public Criteria andUpcvjEqualTo(String value) {
            addCriterion("upcvj =", value, "upcvj");
            return (Criteria) this;
        }

        public Criteria andUpcvjNotEqualTo(String value) {
            addCriterion("upcvj <>", value, "upcvj");
            return (Criteria) this;
        }

        public Criteria andUpcvjGreaterThan(String value) {
            addCriterion("upcvj >", value, "upcvj");
            return (Criteria) this;
        }

        public Criteria andUpcvjGreaterThanOrEqualTo(String value) {
            addCriterion("upcvj >=", value, "upcvj");
            return (Criteria) this;
        }

        public Criteria andUpcvjLessThan(String value) {
            addCriterion("upcvj <", value, "upcvj");
            return (Criteria) this;
        }

        public Criteria andUpcvjLessThanOrEqualTo(String value) {
            addCriterion("upcvj <=", value, "upcvj");
            return (Criteria) this;
        }

        public Criteria andUpcvjLike(String value) {
            addCriterion("upcvj like", value, "upcvj");
            return (Criteria) this;
        }

        public Criteria andUpcvjNotLike(String value) {
            addCriterion("upcvj not like", value, "upcvj");
            return (Criteria) this;
        }

        public Criteria andUpcvjIn(List<String> values) {
            addCriterion("upcvj in", values, "upcvj");
            return (Criteria) this;
        }

        public Criteria andUpcvjNotIn(List<String> values) {
            addCriterion("upcvj not in", values, "upcvj");
            return (Criteria) this;
        }

        public Criteria andUpcvjBetween(String value1, String value2) {
            addCriterion("upcvj between", value1, value2, "upcvj");
            return (Criteria) this;
        }

        public Criteria andUpcvjNotBetween(String value1, String value2) {
            addCriterion("upcvj not between", value1, value2, "upcvj");
            return (Criteria) this;
        }

        public Criteria andCupIsNull() {
            addCriterion("cup is null");
            return (Criteria) this;
        }

        public Criteria andCupIsNotNull() {
            addCriterion("cup is not null");
            return (Criteria) this;
        }

        public Criteria andCupEqualTo(String value) {
            addCriterion("cup =", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupNotEqualTo(String value) {
            addCriterion("cup <>", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupGreaterThan(String value) {
            addCriterion("cup >", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupGreaterThanOrEqualTo(String value) {
            addCriterion("cup >=", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupLessThan(String value) {
            addCriterion("cup <", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupLessThanOrEqualTo(String value) {
            addCriterion("cup <=", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupLike(String value) {
            addCriterion("cup like", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupNotLike(String value) {
            addCriterion("cup not like", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupIn(List<String> values) {
            addCriterion("cup in", values, "cup");
            return (Criteria) this;
        }

        public Criteria andCupNotIn(List<String> values) {
            addCriterion("cup not in", values, "cup");
            return (Criteria) this;
        }

        public Criteria andCupBetween(String value1, String value2) {
            addCriterion("cup between", value1, value2, "cup");
            return (Criteria) this;
        }

        public Criteria andCupNotBetween(String value1, String value2) {
            addCriterion("cup not between", value1, value2, "cup");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users_account
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
     * This class corresponds to the database table users_account
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