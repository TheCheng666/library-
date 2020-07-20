package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BrrowInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrrowInfoExample() {
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

        public Criteria andBroIdIsNull() {
            addCriterion("bro_id is null");
            return (Criteria) this;
        }

        public Criteria andBroIdIsNotNull() {
            addCriterion("bro_id is not null");
            return (Criteria) this;
        }

        public Criteria andBroIdEqualTo(Integer value) {
            addCriterion("bro_id =", value, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdNotEqualTo(Integer value) {
            addCriterion("bro_id <>", value, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdGreaterThan(Integer value) {
            addCriterion("bro_id >", value, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bro_id >=", value, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdLessThan(Integer value) {
            addCriterion("bro_id <", value, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdLessThanOrEqualTo(Integer value) {
            addCriterion("bro_id <=", value, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdIn(List<Integer> values) {
            addCriterion("bro_id in", values, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdNotIn(List<Integer> values) {
            addCriterion("bro_id not in", values, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdBetween(Integer value1, Integer value2) {
            addCriterion("bro_id between", value1, value2, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bro_id not between", value1, value2, "broId");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andBookidIsNull() {
            addCriterion("bookid is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("bookid is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(Integer value) {
            addCriterion("bookid =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(Integer value) {
            addCriterion("bookid <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(Integer value) {
            addCriterion("bookid >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookid >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(Integer value) {
            addCriterion("bookid <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(Integer value) {
            addCriterion("bookid <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<Integer> values) {
            addCriterion("bookid in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<Integer> values) {
            addCriterion("bookid not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(Integer value1, Integer value2) {
            addCriterion("bookid between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(Integer value1, Integer value2) {
            addCriterion("bookid not between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andLendtimeIsNull() {
            addCriterion("lendtime is null");
            return (Criteria) this;
        }

        public Criteria andLendtimeIsNotNull() {
            addCriterion("lendtime is not null");
            return (Criteria) this;
        }

        public Criteria andLendtimeEqualTo(Date value) {
            addCriterionForJDBCDate("lendtime =", value, "lendtime");
            return (Criteria) this;
        }

        public Criteria andLendtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("lendtime <>", value, "lendtime");
            return (Criteria) this;
        }

        public Criteria andLendtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("lendtime >", value, "lendtime");
            return (Criteria) this;
        }

        public Criteria andLendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lendtime >=", value, "lendtime");
            return (Criteria) this;
        }

        public Criteria andLendtimeLessThan(Date value) {
            addCriterionForJDBCDate("lendtime <", value, "lendtime");
            return (Criteria) this;
        }

        public Criteria andLendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lendtime <=", value, "lendtime");
            return (Criteria) this;
        }

        public Criteria andLendtimeIn(List<Date> values) {
            addCriterionForJDBCDate("lendtime in", values, "lendtime");
            return (Criteria) this;
        }

        public Criteria andLendtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("lendtime not in", values, "lendtime");
            return (Criteria) this;
        }

        public Criteria andLendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lendtime between", value1, value2, "lendtime");
            return (Criteria) this;
        }

        public Criteria andLendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lendtime not between", value1, value2, "lendtime");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNull() {
            addCriterion("returntime is null");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNotNull() {
            addCriterion("returntime is not null");
            return (Criteria) this;
        }

        public Criteria andReturntimeEqualTo(Date value) {
            addCriterionForJDBCDate("returntime =", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("returntime <>", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThan(Date value) {
            addCriterionForJDBCDate("returntime >", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("returntime >=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThan(Date value) {
            addCriterionForJDBCDate("returntime <", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("returntime <=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeIn(List<Date> values) {
            addCriterionForJDBCDate("returntime in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("returntime not in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("returntime between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("returntime not between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNull() {
            addCriterion("applytime is null");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNotNull() {
            addCriterion("applytime is not null");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(Integer value) {
            addCriterion("applytime =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(Integer value) {
            addCriterion("applytime <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(Integer value) {
            addCriterion("applytime >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("applytime >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(Integer value) {
            addCriterion("applytime <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(Integer value) {
            addCriterion("applytime <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIn(List<Integer> values) {
            addCriterion("applytime in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotIn(List<Integer> values) {
            addCriterion("applytime not in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(Integer value1, Integer value2) {
            addCriterion("applytime between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("applytime not between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andMoenyIsNull() {
            addCriterion("moeny is null");
            return (Criteria) this;
        }

        public Criteria andMoenyIsNotNull() {
            addCriterion("moeny is not null");
            return (Criteria) this;
        }

        public Criteria andMoenyEqualTo(Float value) {
            addCriterion("moeny =", value, "moeny");
            return (Criteria) this;
        }

        public Criteria andMoenyNotEqualTo(Float value) {
            addCriterion("moeny <>", value, "moeny");
            return (Criteria) this;
        }

        public Criteria andMoenyGreaterThan(Float value) {
            addCriterion("moeny >", value, "moeny");
            return (Criteria) this;
        }

        public Criteria andMoenyGreaterThanOrEqualTo(Float value) {
            addCriterion("moeny >=", value, "moeny");
            return (Criteria) this;
        }

        public Criteria andMoenyLessThan(Float value) {
            addCriterion("moeny <", value, "moeny");
            return (Criteria) this;
        }

        public Criteria andMoenyLessThanOrEqualTo(Float value) {
            addCriterion("moeny <=", value, "moeny");
            return (Criteria) this;
        }

        public Criteria andMoenyIn(List<Float> values) {
            addCriterion("moeny in", values, "moeny");
            return (Criteria) this;
        }

        public Criteria andMoenyNotIn(List<Float> values) {
            addCriterion("moeny not in", values, "moeny");
            return (Criteria) this;
        }

        public Criteria andMoenyBetween(Float value1, Float value2) {
            addCriterion("moeny between", value1, value2, "moeny");
            return (Criteria) this;
        }

        public Criteria andMoenyNotBetween(Float value1, Float value2) {
            addCriterion("moeny not between", value1, value2, "moeny");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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