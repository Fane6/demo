package com.perfect.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PiCiGrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PiCiGrExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSyscodeIsNull() {
            addCriterion("syscode is null");
            return (Criteria) this;
        }

        public Criteria andSyscodeIsNotNull() {
            addCriterion("syscode is not null");
            return (Criteria) this;
        }

        public Criteria andSyscodeEqualTo(String value) {
            addCriterion("syscode =", value, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeNotEqualTo(String value) {
            addCriterion("syscode <>", value, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeGreaterThan(String value) {
            addCriterion("syscode >", value, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeGreaterThanOrEqualTo(String value) {
            addCriterion("syscode >=", value, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeLessThan(String value) {
            addCriterion("syscode <", value, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeLessThanOrEqualTo(String value) {
            addCriterion("syscode <=", value, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeLike(String value) {
            addCriterion("syscode like", value, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeNotLike(String value) {
            addCriterion("syscode not like", value, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeIn(List<String> values) {
            addCriterion("syscode in", values, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeNotIn(List<String> values) {
            addCriterion("syscode not in", values, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeBetween(String value1, String value2) {
            addCriterion("syscode between", value1, value2, "syscode");
            return (Criteria) this;
        }

        public Criteria andSyscodeNotBetween(String value1, String value2) {
            addCriterion("syscode not between", value1, value2, "syscode");
            return (Criteria) this;
        }

        public Criteria andSjbbhIsNull() {
            addCriterion("sjbbh is null");
            return (Criteria) this;
        }

        public Criteria andSjbbhIsNotNull() {
            addCriterion("sjbbh is not null");
            return (Criteria) this;
        }

        public Criteria andSjbbhEqualTo(String value) {
            addCriterion("sjbbh =", value, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhNotEqualTo(String value) {
            addCriterion("sjbbh <>", value, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhGreaterThan(String value) {
            addCriterion("sjbbh >", value, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhGreaterThanOrEqualTo(String value) {
            addCriterion("sjbbh >=", value, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhLessThan(String value) {
            addCriterion("sjbbh <", value, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhLessThanOrEqualTo(String value) {
            addCriterion("sjbbh <=", value, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhLike(String value) {
            addCriterion("sjbbh like", value, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhNotLike(String value) {
            addCriterion("sjbbh not like", value, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhIn(List<String> values) {
            addCriterion("sjbbh in", values, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhNotIn(List<String> values) {
            addCriterion("sjbbh not in", values, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhBetween(String value1, String value2) {
            addCriterion("sjbbh between", value1, value2, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjbbhNotBetween(String value1, String value2) {
            addCriterion("sjbbh not between", value1, value2, "sjbbh");
            return (Criteria) this;
        }

        public Criteria andSjblxIsNull() {
            addCriterion("sjblx is null");
            return (Criteria) this;
        }

        public Criteria andSjblxIsNotNull() {
            addCriterion("sjblx is not null");
            return (Criteria) this;
        }

        public Criteria andSjblxEqualTo(String value) {
            addCriterion("sjblx =", value, "sjblx");
            return (Criteria) this;
        }

        public Criteria andSjblxNotEqualTo(String value) {
            addCriterion("sjblx <>", value, "sjblx");
            return (Criteria) this;
        }

        public Criteria andSjblxGreaterThan(String value) {
            addCriterion("sjblx >", value, "sjblx");
            return (Criteria) this;
        }

        public Criteria andSjblxGreaterThanOrEqualTo(String value) {
            addCriterion("sjblx >=", value, "sjblx");
            return (Criteria) this;
        }

        public Criteria andSjblxLessThan(String value) {
            addCriterion("sjblx <", value, "sjblx");
            return (Criteria) this;
        }

        public Criteria andSjblxLessThanOrEqualTo(String value) {
            addCriterion("sjblx <=", value, "sjblx");
            return (Criteria) this;
        }

        public Criteria andSjblxLike(String value) {
            addCriterion("sjblx like", value, "sjblx");
            return (Criteria) this;
        }

        public Criteria andSjblxNotLike(String value) {
            addCriterion("sjblx not like", value, "sjblx");
            return (Criteria) this;
        }

        public Criteria andSjblxIn(List<String> values) {
            addCriterion("sjblx in", values, "sjblx");
            return (Criteria) this;
        }

        public Criteria andSjblxNotIn(List<String> values) {
            addCriterion("sjblx not in", values, "sjblx");
            return (Criteria) this;
        }

        public Criteria andSjblxBetween(String value1, String value2) {
            addCriterion("sjblx between", value1, value2, "sjblx");
            return (Criteria) this;
        }

        public Criteria andSjblxNotBetween(String value1, String value2) {
            addCriterion("sjblx not between", value1, value2, "sjblx");
            return (Criteria) this;
        }

        public Criteria andScsjlIsNull() {
            addCriterion("scsjl is null");
            return (Criteria) this;
        }

        public Criteria andScsjlIsNotNull() {
            addCriterion("scsjl is not null");
            return (Criteria) this;
        }

        public Criteria andScsjlEqualTo(Integer value) {
            addCriterion("scsjl =", value, "scsjl");
            return (Criteria) this;
        }

        public Criteria andScsjlNotEqualTo(Integer value) {
            addCriterion("scsjl <>", value, "scsjl");
            return (Criteria) this;
        }

        public Criteria andScsjlGreaterThan(Integer value) {
            addCriterion("scsjl >", value, "scsjl");
            return (Criteria) this;
        }

        public Criteria andScsjlGreaterThanOrEqualTo(Integer value) {
            addCriterion("scsjl >=", value, "scsjl");
            return (Criteria) this;
        }

        public Criteria andScsjlLessThan(Integer value) {
            addCriterion("scsjl <", value, "scsjl");
            return (Criteria) this;
        }

        public Criteria andScsjlLessThanOrEqualTo(Integer value) {
            addCriterion("scsjl <=", value, "scsjl");
            return (Criteria) this;
        }

        public Criteria andScsjlIn(List<Integer> values) {
            addCriterion("scsjl in", values, "scsjl");
            return (Criteria) this;
        }

        public Criteria andScsjlNotIn(List<Integer> values) {
            addCriterion("scsjl not in", values, "scsjl");
            return (Criteria) this;
        }

        public Criteria andScsjlBetween(Integer value1, Integer value2) {
            addCriterion("scsjl between", value1, value2, "scsjl");
            return (Criteria) this;
        }

        public Criteria andScsjlNotBetween(Integer value1, Integer value2) {
            addCriterion("scsjl not between", value1, value2, "scsjl");
            return (Criteria) this;
        }

        public Criteria andScrqIsNull() {
            addCriterion("scrq is null");
            return (Criteria) this;
        }

        public Criteria andScrqIsNotNull() {
            addCriterion("scrq is not null");
            return (Criteria) this;
        }

        public Criteria andScrqEqualTo(Date value) {
            addCriterionForJDBCDate("scrq =", value, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("scrq <>", value, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqGreaterThan(Date value) {
            addCriterionForJDBCDate("scrq >", value, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("scrq >=", value, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqLessThan(Date value) {
            addCriterionForJDBCDate("scrq <", value, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("scrq <=", value, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqIn(List<Date> values) {
            addCriterionForJDBCDate("scrq in", values, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("scrq not in", values, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("scrq between", value1, value2, "scrq");
            return (Criteria) this;
        }

        public Criteria andScrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("scrq not between", value1, value2, "scrq");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNull() {
            addCriterion("success is null");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNotNull() {
            addCriterion("success is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessEqualTo(String value) {
            addCriterion("success =", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotEqualTo(String value) {
            addCriterion("success <>", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThan(String value) {
            addCriterion("success >", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThanOrEqualTo(String value) {
            addCriterion("success >=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThan(String value) {
            addCriterion("success <", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThanOrEqualTo(String value) {
            addCriterion("success <=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLike(String value) {
            addCriterion("success like", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotLike(String value) {
            addCriterion("success not like", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessIn(List<String> values) {
            addCriterion("success in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotIn(List<String> values) {
            addCriterion("success not in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessBetween(String value1, String value2) {
            addCriterion("success between", value1, value2, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotBetween(String value1, String value2) {
            addCriterion("success not between", value1, value2, "success");
            return (Criteria) this;
        }

        public Criteria andWbjjgbmIsNull() {
            addCriterion("wbjjgbm is null");
            return (Criteria) this;
        }

        public Criteria andWbjjgbmIsNotNull() {
            addCriterion("wbjjgbm is not null");
            return (Criteria) this;
        }

        public Criteria andWbjjgbmEqualTo(String value) {
            addCriterion("wbjjgbm =", value, "wbjjgbm");
            return (Criteria) this;
        }

        public Criteria andWbjjgbmNotEqualTo(String value) {
            addCriterion("wbjjgbm <>", value, "wbjjgbm");
            return (Criteria) this;
        }

        public Criteria andWbjjgbmGreaterThan(String value) {
            addCriterion("wbjjgbm >", value, "wbjjgbm");
            return (Criteria) this;
        }

        public Criteria andWbjjgbmGreaterThanOrEqualTo(String value) {
            addCriterion("wbjjgbm >=", value, "wbjjgbm");
            return (Criteria) this;
        }

        public Criteria andWbjjgbmLessThan(String value) {
            addCriterion("wbjjgbm <", value, "wbjjgbm");
            return (Criteria) this;
        }

        public Criteria andWbjjgbmLessThanOrEqualTo(String value) {
            addCriterion("wbjjgbm <=", value, "wbjjgbm");
            return (Criteria) this;
        }

        public Criteria andWbjjgbmLike(String value) {
            addCriterion("wbjjgbm like", value, "wbjjgbm");
            return (Criteria) this;
        }

        public Criteria andWbjjgbmNotLike(String value) {
            addCriterion("wbjjgbm not like", value, "wbjjgbm");
            return (Criteria) this;
        }

        public Criteria andWbjjgbmIn(List<String> values) {
            addCriterion("wbjjgbm in", values, "wbjjgbm");
            return (Criteria) this;
        }

        public Criteria andWbjjgbmNotIn(List<String> values) {
            addCriterion("wbjjgbm not in", values, "wbjjgbm");
            return (Criteria) this;
        }

        public Criteria andWbjjgbmBetween(String value1, String value2) {
            addCriterion("wbjjgbm between", value1, value2, "wbjjgbm");
            return (Criteria) this;
        }

        public Criteria andWbjjgbmNotBetween(String value1, String value2) {
            addCriterion("wbjjgbm not between", value1, value2, "wbjjgbm");
            return (Criteria) this;
        }

        public Criteria andTbdwIsNull() {
            addCriterion("tbdw is null");
            return (Criteria) this;
        }

        public Criteria andTbdwIsNotNull() {
            addCriterion("tbdw is not null");
            return (Criteria) this;
        }

        public Criteria andTbdwEqualTo(String value) {
            addCriterion("tbdw =", value, "tbdw");
            return (Criteria) this;
        }

        public Criteria andTbdwNotEqualTo(String value) {
            addCriterion("tbdw <>", value, "tbdw");
            return (Criteria) this;
        }

        public Criteria andTbdwGreaterThan(String value) {
            addCriterion("tbdw >", value, "tbdw");
            return (Criteria) this;
        }

        public Criteria andTbdwGreaterThanOrEqualTo(String value) {
            addCriterion("tbdw >=", value, "tbdw");
            return (Criteria) this;
        }

        public Criteria andTbdwLessThan(String value) {
            addCriterion("tbdw <", value, "tbdw");
            return (Criteria) this;
        }

        public Criteria andTbdwLessThanOrEqualTo(String value) {
            addCriterion("tbdw <=", value, "tbdw");
            return (Criteria) this;
        }

        public Criteria andTbdwLike(String value) {
            addCriterion("tbdw like", value, "tbdw");
            return (Criteria) this;
        }

        public Criteria andTbdwNotLike(String value) {
            addCriterion("tbdw not like", value, "tbdw");
            return (Criteria) this;
        }

        public Criteria andTbdwIn(List<String> values) {
            addCriterion("tbdw in", values, "tbdw");
            return (Criteria) this;
        }

        public Criteria andTbdwNotIn(List<String> values) {
            addCriterion("tbdw not in", values, "tbdw");
            return (Criteria) this;
        }

        public Criteria andTbdwBetween(String value1, String value2) {
            addCriterion("tbdw between", value1, value2, "tbdw");
            return (Criteria) this;
        }

        public Criteria andTbdwNotBetween(String value1, String value2) {
            addCriterion("tbdw not between", value1, value2, "tbdw");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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