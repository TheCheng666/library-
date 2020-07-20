package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNumberIsNull() {
            addCriterion("book_number is null");
            return (Criteria) this;
        }

        public Criteria andBookNumberIsNotNull() {
            addCriterion("book_number is not null");
            return (Criteria) this;
        }

        public Criteria andBookNumberEqualTo(Integer value) {
            addCriterion("book_number =", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberNotEqualTo(Integer value) {
            addCriterion("book_number <>", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberGreaterThan(Integer value) {
            addCriterion("book_number >", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_number >=", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberLessThan(Integer value) {
            addCriterion("book_number <", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberLessThanOrEqualTo(Integer value) {
            addCriterion("book_number <=", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberIn(List<Integer> values) {
            addCriterion("book_number in", values, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberNotIn(List<Integer> values) {
            addCriterion("book_number not in", values, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberBetween(Integer value1, Integer value2) {
            addCriterion("book_number between", value1, value2, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("book_number not between", value1, value2, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookPhotoIsNull() {
            addCriterion("book_photo is null");
            return (Criteria) this;
        }

        public Criteria andBookPhotoIsNotNull() {
            addCriterion("book_photo is not null");
            return (Criteria) this;
        }

        public Criteria andBookPhotoEqualTo(String value) {
            addCriterion("book_photo =", value, "bookPhoto");
            return (Criteria) this;
        }

        public Criteria andBookPhotoNotEqualTo(String value) {
            addCriterion("book_photo <>", value, "bookPhoto");
            return (Criteria) this;
        }

        public Criteria andBookPhotoGreaterThan(String value) {
            addCriterion("book_photo >", value, "bookPhoto");
            return (Criteria) this;
        }

        public Criteria andBookPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("book_photo >=", value, "bookPhoto");
            return (Criteria) this;
        }

        public Criteria andBookPhotoLessThan(String value) {
            addCriterion("book_photo <", value, "bookPhoto");
            return (Criteria) this;
        }

        public Criteria andBookPhotoLessThanOrEqualTo(String value) {
            addCriterion("book_photo <=", value, "bookPhoto");
            return (Criteria) this;
        }

        public Criteria andBookPhotoLike(String value) {
            addCriterion("book_photo like", value, "bookPhoto");
            return (Criteria) this;
        }

        public Criteria andBookPhotoNotLike(String value) {
            addCriterion("book_photo not like", value, "bookPhoto");
            return (Criteria) this;
        }

        public Criteria andBookPhotoIn(List<String> values) {
            addCriterion("book_photo in", values, "bookPhoto");
            return (Criteria) this;
        }

        public Criteria andBookPhotoNotIn(List<String> values) {
            addCriterion("book_photo not in", values, "bookPhoto");
            return (Criteria) this;
        }

        public Criteria andBookPhotoBetween(String value1, String value2) {
            addCriterion("book_photo between", value1, value2, "bookPhoto");
            return (Criteria) this;
        }

        public Criteria andBookPhotoNotBetween(String value1, String value2) {
            addCriterion("book_photo not between", value1, value2, "bookPhoto");
            return (Criteria) this;
        }

        public Criteria andBookTypeidIsNull() {
            addCriterion("book_typeid is null");
            return (Criteria) this;
        }

        public Criteria andBookTypeidIsNotNull() {
            addCriterion("book_typeid is not null");
            return (Criteria) this;
        }

        public Criteria andBookTypeidEqualTo(Integer value) {
            addCriterion("book_typeid =", value, "bookTypeid");
            return (Criteria) this;
        }

        public Criteria andBookTypeidNotEqualTo(Integer value) {
            addCriterion("book_typeid <>", value, "bookTypeid");
            return (Criteria) this;
        }

        public Criteria andBookTypeidGreaterThan(Integer value) {
            addCriterion("book_typeid >", value, "bookTypeid");
            return (Criteria) this;
        }

        public Criteria andBookTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_typeid >=", value, "bookTypeid");
            return (Criteria) this;
        }

        public Criteria andBookTypeidLessThan(Integer value) {
            addCriterion("book_typeid <", value, "bookTypeid");
            return (Criteria) this;
        }

        public Criteria andBookTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("book_typeid <=", value, "bookTypeid");
            return (Criteria) this;
        }

        public Criteria andBookTypeidIn(List<Integer> values) {
            addCriterion("book_typeid in", values, "bookTypeid");
            return (Criteria) this;
        }

        public Criteria andBookTypeidNotIn(List<Integer> values) {
            addCriterion("book_typeid not in", values, "bookTypeid");
            return (Criteria) this;
        }

        public Criteria andBookTypeidBetween(Integer value1, Integer value2) {
            addCriterion("book_typeid between", value1, value2, "bookTypeid");
            return (Criteria) this;
        }

        public Criteria andBookTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("book_typeid not between", value1, value2, "bookTypeid");
            return (Criteria) this;
        }

        public Criteria andAuthoridIsNull() {
            addCriterion("authorid is null");
            return (Criteria) this;
        }

        public Criteria andAuthoridIsNotNull() {
            addCriterion("authorid is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoridEqualTo(Integer value) {
            addCriterion("authorid =", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotEqualTo(Integer value) {
            addCriterion("authorid <>", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridGreaterThan(Integer value) {
            addCriterion("authorid >", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("authorid >=", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridLessThan(Integer value) {
            addCriterion("authorid <", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridLessThanOrEqualTo(Integer value) {
            addCriterion("authorid <=", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridIn(List<Integer> values) {
            addCriterion("authorid in", values, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotIn(List<Integer> values) {
            addCriterion("authorid not in", values, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridBetween(Integer value1, Integer value2) {
            addCriterion("authorid between", value1, value2, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotBetween(Integer value1, Integer value2) {
            addCriterion("authorid not between", value1, value2, "authorid");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishtime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishtime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(Date value) {
            addCriterionForJDBCDate("publishtime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("publishtime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("publishtime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publishtime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(Date value) {
            addCriterionForJDBCDate("publishtime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publishtime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<Date> values) {
            addCriterionForJDBCDate("publishtime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("publishtime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publishtime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publishtime not between", value1, value2, "publishtime");
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