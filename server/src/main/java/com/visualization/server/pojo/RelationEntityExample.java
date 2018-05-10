package com.visualization.server.pojo;

import java.util.ArrayList;
import java.util.List;

public class RelationEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelationEntityExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOutPointIsNull() {
            addCriterion("out_point is null");
            return (Criteria) this;
        }

        public Criteria andOutPointIsNotNull() {
            addCriterion("out_point is not null");
            return (Criteria) this;
        }

        public Criteria andOutPointEqualTo(String value) {
            addCriterion("out_point =", value, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointNotEqualTo(String value) {
            addCriterion("out_point <>", value, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointGreaterThan(String value) {
            addCriterion("out_point >", value, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointGreaterThanOrEqualTo(String value) {
            addCriterion("out_point >=", value, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointLessThan(String value) {
            addCriterion("out_point <", value, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointLessThanOrEqualTo(String value) {
            addCriterion("out_point <=", value, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointLike(String value) {
            addCriterion("out_point like", value, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointNotLike(String value) {
            addCriterion("out_point not like", value, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointIn(List<String> values) {
            addCriterion("out_point in", values, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointNotIn(List<String> values) {
            addCriterion("out_point not in", values, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointBetween(String value1, String value2) {
            addCriterion("out_point between", value1, value2, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointNotBetween(String value1, String value2) {
            addCriterion("out_point not between", value1, value2, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointTypeIsNull() {
            addCriterion("out_point_type is null");
            return (Criteria) this;
        }

        public Criteria andOutPointTypeIsNotNull() {
            addCriterion("out_point_type is not null");
            return (Criteria) this;
        }

        public Criteria andOutPointTypeEqualTo(String value) {
            addCriterion("out_point_type =", value, "outPointType");
            return (Criteria) this;
        }

        public Criteria andOutPointTypeNotEqualTo(String value) {
            addCriterion("out_point_type <>", value, "outPointType");
            return (Criteria) this;
        }

        public Criteria andOutPointTypeGreaterThan(String value) {
            addCriterion("out_point_type >", value, "outPointType");
            return (Criteria) this;
        }

        public Criteria andOutPointTypeGreaterThanOrEqualTo(String value) {
            addCriterion("out_point_type >=", value, "outPointType");
            return (Criteria) this;
        }

        public Criteria andOutPointTypeLessThan(String value) {
            addCriterion("out_point_type <", value, "outPointType");
            return (Criteria) this;
        }

        public Criteria andOutPointTypeLessThanOrEqualTo(String value) {
            addCriterion("out_point_type <=", value, "outPointType");
            return (Criteria) this;
        }

        public Criteria andOutPointTypeLike(String value) {
            addCriterion("out_point_type like", value, "outPointType");
            return (Criteria) this;
        }

        public Criteria andOutPointTypeNotLike(String value) {
            addCriterion("out_point_type not like", value, "outPointType");
            return (Criteria) this;
        }

        public Criteria andOutPointTypeIn(List<String> values) {
            addCriterion("out_point_type in", values, "outPointType");
            return (Criteria) this;
        }

        public Criteria andOutPointTypeNotIn(List<String> values) {
            addCriterion("out_point_type not in", values, "outPointType");
            return (Criteria) this;
        }

        public Criteria andOutPointTypeBetween(String value1, String value2) {
            addCriterion("out_point_type between", value1, value2, "outPointType");
            return (Criteria) this;
        }

        public Criteria andOutPointTypeNotBetween(String value1, String value2) {
            addCriterion("out_point_type not between", value1, value2, "outPointType");
            return (Criteria) this;
        }

        public Criteria andOutCustomerNameIsNull() {
            addCriterion("out_customer_name is null");
            return (Criteria) this;
        }

        public Criteria andOutCustomerNameIsNotNull() {
            addCriterion("out_customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andOutCustomerNameEqualTo(String value) {
            addCriterion("out_customer_name =", value, "outCustomerName");
            return (Criteria) this;
        }

        public Criteria andOutCustomerNameNotEqualTo(String value) {
            addCriterion("out_customer_name <>", value, "outCustomerName");
            return (Criteria) this;
        }

        public Criteria andOutCustomerNameGreaterThan(String value) {
            addCriterion("out_customer_name >", value, "outCustomerName");
            return (Criteria) this;
        }

        public Criteria andOutCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("out_customer_name >=", value, "outCustomerName");
            return (Criteria) this;
        }

        public Criteria andOutCustomerNameLessThan(String value) {
            addCriterion("out_customer_name <", value, "outCustomerName");
            return (Criteria) this;
        }

        public Criteria andOutCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("out_customer_name <=", value, "outCustomerName");
            return (Criteria) this;
        }

        public Criteria andOutCustomerNameLike(String value) {
            addCriterion("out_customer_name like", value, "outCustomerName");
            return (Criteria) this;
        }

        public Criteria andOutCustomerNameNotLike(String value) {
            addCriterion("out_customer_name not like", value, "outCustomerName");
            return (Criteria) this;
        }

        public Criteria andOutCustomerNameIn(List<String> values) {
            addCriterion("out_customer_name in", values, "outCustomerName");
            return (Criteria) this;
        }

        public Criteria andOutCustomerNameNotIn(List<String> values) {
            addCriterion("out_customer_name not in", values, "outCustomerName");
            return (Criteria) this;
        }

        public Criteria andOutCustomerNameBetween(String value1, String value2) {
            addCriterion("out_customer_name between", value1, value2, "outCustomerName");
            return (Criteria) this;
        }

        public Criteria andOutCustomerNameNotBetween(String value1, String value2) {
            addCriterion("out_customer_name not between", value1, value2, "outCustomerName");
            return (Criteria) this;
        }

        public Criteria andOutBirthIsNull() {
            addCriterion("out_birth is null");
            return (Criteria) this;
        }

        public Criteria andOutBirthIsNotNull() {
            addCriterion("out_birth is not null");
            return (Criteria) this;
        }

        public Criteria andOutBirthEqualTo(String value) {
            addCriterion("out_birth =", value, "outBirth");
            return (Criteria) this;
        }

        public Criteria andOutBirthNotEqualTo(String value) {
            addCriterion("out_birth <>", value, "outBirth");
            return (Criteria) this;
        }

        public Criteria andOutBirthGreaterThan(String value) {
            addCriterion("out_birth >", value, "outBirth");
            return (Criteria) this;
        }

        public Criteria andOutBirthGreaterThanOrEqualTo(String value) {
            addCriterion("out_birth >=", value, "outBirth");
            return (Criteria) this;
        }

        public Criteria andOutBirthLessThan(String value) {
            addCriterion("out_birth <", value, "outBirth");
            return (Criteria) this;
        }

        public Criteria andOutBirthLessThanOrEqualTo(String value) {
            addCriterion("out_birth <=", value, "outBirth");
            return (Criteria) this;
        }

        public Criteria andOutBirthLike(String value) {
            addCriterion("out_birth like", value, "outBirth");
            return (Criteria) this;
        }

        public Criteria andOutBirthNotLike(String value) {
            addCriterion("out_birth not like", value, "outBirth");
            return (Criteria) this;
        }

        public Criteria andOutBirthIn(List<String> values) {
            addCriterion("out_birth in", values, "outBirth");
            return (Criteria) this;
        }

        public Criteria andOutBirthNotIn(List<String> values) {
            addCriterion("out_birth not in", values, "outBirth");
            return (Criteria) this;
        }

        public Criteria andOutBirthBetween(String value1, String value2) {
            addCriterion("out_birth between", value1, value2, "outBirth");
            return (Criteria) this;
        }

        public Criteria andOutBirthNotBetween(String value1, String value2) {
            addCriterion("out_birth not between", value1, value2, "outBirth");
            return (Criteria) this;
        }

        public Criteria andOutCarrierNameIsNull() {
            addCriterion("out_carrier_name is null");
            return (Criteria) this;
        }

        public Criteria andOutCarrierNameIsNotNull() {
            addCriterion("out_carrier_name is not null");
            return (Criteria) this;
        }

        public Criteria andOutCarrierNameEqualTo(String value) {
            addCriterion("out_carrier_name =", value, "outCarrierName");
            return (Criteria) this;
        }

        public Criteria andOutCarrierNameNotEqualTo(String value) {
            addCriterion("out_carrier_name <>", value, "outCarrierName");
            return (Criteria) this;
        }

        public Criteria andOutCarrierNameGreaterThan(String value) {
            addCriterion("out_carrier_name >", value, "outCarrierName");
            return (Criteria) this;
        }

        public Criteria andOutCarrierNameGreaterThanOrEqualTo(String value) {
            addCriterion("out_carrier_name >=", value, "outCarrierName");
            return (Criteria) this;
        }

        public Criteria andOutCarrierNameLessThan(String value) {
            addCriterion("out_carrier_name <", value, "outCarrierName");
            return (Criteria) this;
        }

        public Criteria andOutCarrierNameLessThanOrEqualTo(String value) {
            addCriterion("out_carrier_name <=", value, "outCarrierName");
            return (Criteria) this;
        }

        public Criteria andOutCarrierNameLike(String value) {
            addCriterion("out_carrier_name like", value, "outCarrierName");
            return (Criteria) this;
        }

        public Criteria andOutCarrierNameNotLike(String value) {
            addCriterion("out_carrier_name not like", value, "outCarrierName");
            return (Criteria) this;
        }

        public Criteria andOutCarrierNameIn(List<String> values) {
            addCriterion("out_carrier_name in", values, "outCarrierName");
            return (Criteria) this;
        }

        public Criteria andOutCarrierNameNotIn(List<String> values) {
            addCriterion("out_carrier_name not in", values, "outCarrierName");
            return (Criteria) this;
        }

        public Criteria andOutCarrierNameBetween(String value1, String value2) {
            addCriterion("out_carrier_name between", value1, value2, "outCarrierName");
            return (Criteria) this;
        }

        public Criteria andOutCarrierNameNotBetween(String value1, String value2) {
            addCriterion("out_carrier_name not between", value1, value2, "outCarrierName");
            return (Criteria) this;
        }

        public Criteria andOutAreaIsNull() {
            addCriterion("out_area is null");
            return (Criteria) this;
        }

        public Criteria andOutAreaIsNotNull() {
            addCriterion("out_area is not null");
            return (Criteria) this;
        }

        public Criteria andOutAreaEqualTo(String value) {
            addCriterion("out_area =", value, "outArea");
            return (Criteria) this;
        }

        public Criteria andOutAreaNotEqualTo(String value) {
            addCriterion("out_area <>", value, "outArea");
            return (Criteria) this;
        }

        public Criteria andOutAreaGreaterThan(String value) {
            addCriterion("out_area >", value, "outArea");
            return (Criteria) this;
        }

        public Criteria andOutAreaGreaterThanOrEqualTo(String value) {
            addCriterion("out_area >=", value, "outArea");
            return (Criteria) this;
        }

        public Criteria andOutAreaLessThan(String value) {
            addCriterion("out_area <", value, "outArea");
            return (Criteria) this;
        }

        public Criteria andOutAreaLessThanOrEqualTo(String value) {
            addCriterion("out_area <=", value, "outArea");
            return (Criteria) this;
        }

        public Criteria andOutAreaLike(String value) {
            addCriterion("out_area like", value, "outArea");
            return (Criteria) this;
        }

        public Criteria andOutAreaNotLike(String value) {
            addCriterion("out_area not like", value, "outArea");
            return (Criteria) this;
        }

        public Criteria andOutAreaIn(List<String> values) {
            addCriterion("out_area in", values, "outArea");
            return (Criteria) this;
        }

        public Criteria andOutAreaNotIn(List<String> values) {
            addCriterion("out_area not in", values, "outArea");
            return (Criteria) this;
        }

        public Criteria andOutAreaBetween(String value1, String value2) {
            addCriterion("out_area between", value1, value2, "outArea");
            return (Criteria) this;
        }

        public Criteria andOutAreaNotBetween(String value1, String value2) {
            addCriterion("out_area not between", value1, value2, "outArea");
            return (Criteria) this;
        }

        public Criteria andOutCityIsNull() {
            addCriterion("out_city is null");
            return (Criteria) this;
        }

        public Criteria andOutCityIsNotNull() {
            addCriterion("out_city is not null");
            return (Criteria) this;
        }

        public Criteria andOutCityEqualTo(String value) {
            addCriterion("out_city =", value, "outCity");
            return (Criteria) this;
        }

        public Criteria andOutCityNotEqualTo(String value) {
            addCriterion("out_city <>", value, "outCity");
            return (Criteria) this;
        }

        public Criteria andOutCityGreaterThan(String value) {
            addCriterion("out_city >", value, "outCity");
            return (Criteria) this;
        }

        public Criteria andOutCityGreaterThanOrEqualTo(String value) {
            addCriterion("out_city >=", value, "outCity");
            return (Criteria) this;
        }

        public Criteria andOutCityLessThan(String value) {
            addCriterion("out_city <", value, "outCity");
            return (Criteria) this;
        }

        public Criteria andOutCityLessThanOrEqualTo(String value) {
            addCriterion("out_city <=", value, "outCity");
            return (Criteria) this;
        }

        public Criteria andOutCityLike(String value) {
            addCriterion("out_city like", value, "outCity");
            return (Criteria) this;
        }

        public Criteria andOutCityNotLike(String value) {
            addCriterion("out_city not like", value, "outCity");
            return (Criteria) this;
        }

        public Criteria andOutCityIn(List<String> values) {
            addCriterion("out_city in", values, "outCity");
            return (Criteria) this;
        }

        public Criteria andOutCityNotIn(List<String> values) {
            addCriterion("out_city not in", values, "outCity");
            return (Criteria) this;
        }

        public Criteria andOutCityBetween(String value1, String value2) {
            addCriterion("out_city between", value1, value2, "outCity");
            return (Criteria) this;
        }

        public Criteria andOutCityNotBetween(String value1, String value2) {
            addCriterion("out_city not between", value1, value2, "outCity");
            return (Criteria) this;
        }

        public Criteria andOutDegreeIsNull() {
            addCriterion("out_degree is null");
            return (Criteria) this;
        }

        public Criteria andOutDegreeIsNotNull() {
            addCriterion("out_degree is not null");
            return (Criteria) this;
        }

        public Criteria andOutDegreeEqualTo(Integer value) {
            addCriterion("out_degree =", value, "outDegree");
            return (Criteria) this;
        }

        public Criteria andOutDegreeNotEqualTo(Integer value) {
            addCriterion("out_degree <>", value, "outDegree");
            return (Criteria) this;
        }

        public Criteria andOutDegreeGreaterThan(Integer value) {
            addCriterion("out_degree >", value, "outDegree");
            return (Criteria) this;
        }

        public Criteria andOutDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_degree >=", value, "outDegree");
            return (Criteria) this;
        }

        public Criteria andOutDegreeLessThan(Integer value) {
            addCriterion("out_degree <", value, "outDegree");
            return (Criteria) this;
        }

        public Criteria andOutDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("out_degree <=", value, "outDegree");
            return (Criteria) this;
        }

        public Criteria andOutDegreeIn(List<Integer> values) {
            addCriterion("out_degree in", values, "outDegree");
            return (Criteria) this;
        }

        public Criteria andOutDegreeNotIn(List<Integer> values) {
            addCriterion("out_degree not in", values, "outDegree");
            return (Criteria) this;
        }

        public Criteria andOutDegreeBetween(Integer value1, Integer value2) {
            addCriterion("out_degree between", value1, value2, "outDegree");
            return (Criteria) this;
        }

        public Criteria andOutDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("out_degree not between", value1, value2, "outDegree");
            return (Criteria) this;
        }

        public Criteria andInPointIsNull() {
            addCriterion("in_point is null");
            return (Criteria) this;
        }

        public Criteria andInPointIsNotNull() {
            addCriterion("in_point is not null");
            return (Criteria) this;
        }

        public Criteria andInPointEqualTo(String value) {
            addCriterion("in_point =", value, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointNotEqualTo(String value) {
            addCriterion("in_point <>", value, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointGreaterThan(String value) {
            addCriterion("in_point >", value, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointGreaterThanOrEqualTo(String value) {
            addCriterion("in_point >=", value, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointLessThan(String value) {
            addCriterion("in_point <", value, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointLessThanOrEqualTo(String value) {
            addCriterion("in_point <=", value, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointLike(String value) {
            addCriterion("in_point like", value, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointNotLike(String value) {
            addCriterion("in_point not like", value, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointIn(List<String> values) {
            addCriterion("in_point in", values, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointNotIn(List<String> values) {
            addCriterion("in_point not in", values, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointBetween(String value1, String value2) {
            addCriterion("in_point between", value1, value2, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointNotBetween(String value1, String value2) {
            addCriterion("in_point not between", value1, value2, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointTypeIsNull() {
            addCriterion("in_point_type is null");
            return (Criteria) this;
        }

        public Criteria andInPointTypeIsNotNull() {
            addCriterion("in_point_type is not null");
            return (Criteria) this;
        }

        public Criteria andInPointTypeEqualTo(String value) {
            addCriterion("in_point_type =", value, "inPointType");
            return (Criteria) this;
        }

        public Criteria andInPointTypeNotEqualTo(String value) {
            addCriterion("in_point_type <>", value, "inPointType");
            return (Criteria) this;
        }

        public Criteria andInPointTypeGreaterThan(String value) {
            addCriterion("in_point_type >", value, "inPointType");
            return (Criteria) this;
        }

        public Criteria andInPointTypeGreaterThanOrEqualTo(String value) {
            addCriterion("in_point_type >=", value, "inPointType");
            return (Criteria) this;
        }

        public Criteria andInPointTypeLessThan(String value) {
            addCriterion("in_point_type <", value, "inPointType");
            return (Criteria) this;
        }

        public Criteria andInPointTypeLessThanOrEqualTo(String value) {
            addCriterion("in_point_type <=", value, "inPointType");
            return (Criteria) this;
        }

        public Criteria andInPointTypeLike(String value) {
            addCriterion("in_point_type like", value, "inPointType");
            return (Criteria) this;
        }

        public Criteria andInPointTypeNotLike(String value) {
            addCriterion("in_point_type not like", value, "inPointType");
            return (Criteria) this;
        }

        public Criteria andInPointTypeIn(List<String> values) {
            addCriterion("in_point_type in", values, "inPointType");
            return (Criteria) this;
        }

        public Criteria andInPointTypeNotIn(List<String> values) {
            addCriterion("in_point_type not in", values, "inPointType");
            return (Criteria) this;
        }

        public Criteria andInPointTypeBetween(String value1, String value2) {
            addCriterion("in_point_type between", value1, value2, "inPointType");
            return (Criteria) this;
        }

        public Criteria andInPointTypeNotBetween(String value1, String value2) {
            addCriterion("in_point_type not between", value1, value2, "inPointType");
            return (Criteria) this;
        }

        public Criteria andInCustomerNameIsNull() {
            addCriterion("in_customer_name is null");
            return (Criteria) this;
        }

        public Criteria andInCustomerNameIsNotNull() {
            addCriterion("in_customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andInCustomerNameEqualTo(String value) {
            addCriterion("in_customer_name =", value, "inCustomerName");
            return (Criteria) this;
        }

        public Criteria andInCustomerNameNotEqualTo(String value) {
            addCriterion("in_customer_name <>", value, "inCustomerName");
            return (Criteria) this;
        }

        public Criteria andInCustomerNameGreaterThan(String value) {
            addCriterion("in_customer_name >", value, "inCustomerName");
            return (Criteria) this;
        }

        public Criteria andInCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("in_customer_name >=", value, "inCustomerName");
            return (Criteria) this;
        }

        public Criteria andInCustomerNameLessThan(String value) {
            addCriterion("in_customer_name <", value, "inCustomerName");
            return (Criteria) this;
        }

        public Criteria andInCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("in_customer_name <=", value, "inCustomerName");
            return (Criteria) this;
        }

        public Criteria andInCustomerNameLike(String value) {
            addCriterion("in_customer_name like", value, "inCustomerName");
            return (Criteria) this;
        }

        public Criteria andInCustomerNameNotLike(String value) {
            addCriterion("in_customer_name not like", value, "inCustomerName");
            return (Criteria) this;
        }

        public Criteria andInCustomerNameIn(List<String> values) {
            addCriterion("in_customer_name in", values, "inCustomerName");
            return (Criteria) this;
        }

        public Criteria andInCustomerNameNotIn(List<String> values) {
            addCriterion("in_customer_name not in", values, "inCustomerName");
            return (Criteria) this;
        }

        public Criteria andInCustomerNameBetween(String value1, String value2) {
            addCriterion("in_customer_name between", value1, value2, "inCustomerName");
            return (Criteria) this;
        }

        public Criteria andInCustomerNameNotBetween(String value1, String value2) {
            addCriterion("in_customer_name not between", value1, value2, "inCustomerName");
            return (Criteria) this;
        }

        public Criteria andInBirthIsNull() {
            addCriterion("in_birth is null");
            return (Criteria) this;
        }

        public Criteria andInBirthIsNotNull() {
            addCriterion("in_birth is not null");
            return (Criteria) this;
        }

        public Criteria andInBirthEqualTo(String value) {
            addCriterion("in_birth =", value, "inBirth");
            return (Criteria) this;
        }

        public Criteria andInBirthNotEqualTo(String value) {
            addCriterion("in_birth <>", value, "inBirth");
            return (Criteria) this;
        }

        public Criteria andInBirthGreaterThan(String value) {
            addCriterion("in_birth >", value, "inBirth");
            return (Criteria) this;
        }

        public Criteria andInBirthGreaterThanOrEqualTo(String value) {
            addCriterion("in_birth >=", value, "inBirth");
            return (Criteria) this;
        }

        public Criteria andInBirthLessThan(String value) {
            addCriterion("in_birth <", value, "inBirth");
            return (Criteria) this;
        }

        public Criteria andInBirthLessThanOrEqualTo(String value) {
            addCriterion("in_birth <=", value, "inBirth");
            return (Criteria) this;
        }

        public Criteria andInBirthLike(String value) {
            addCriterion("in_birth like", value, "inBirth");
            return (Criteria) this;
        }

        public Criteria andInBirthNotLike(String value) {
            addCriterion("in_birth not like", value, "inBirth");
            return (Criteria) this;
        }

        public Criteria andInBirthIn(List<String> values) {
            addCriterion("in_birth in", values, "inBirth");
            return (Criteria) this;
        }

        public Criteria andInBirthNotIn(List<String> values) {
            addCriterion("in_birth not in", values, "inBirth");
            return (Criteria) this;
        }

        public Criteria andInBirthBetween(String value1, String value2) {
            addCriterion("in_birth between", value1, value2, "inBirth");
            return (Criteria) this;
        }

        public Criteria andInBirthNotBetween(String value1, String value2) {
            addCriterion("in_birth not between", value1, value2, "inBirth");
            return (Criteria) this;
        }

        public Criteria andInCarrierNameIsNull() {
            addCriterion("in_carrier_name is null");
            return (Criteria) this;
        }

        public Criteria andInCarrierNameIsNotNull() {
            addCriterion("in_carrier_name is not null");
            return (Criteria) this;
        }

        public Criteria andInCarrierNameEqualTo(String value) {
            addCriterion("in_carrier_name =", value, "inCarrierName");
            return (Criteria) this;
        }

        public Criteria andInCarrierNameNotEqualTo(String value) {
            addCriterion("in_carrier_name <>", value, "inCarrierName");
            return (Criteria) this;
        }

        public Criteria andInCarrierNameGreaterThan(String value) {
            addCriterion("in_carrier_name >", value, "inCarrierName");
            return (Criteria) this;
        }

        public Criteria andInCarrierNameGreaterThanOrEqualTo(String value) {
            addCriterion("in_carrier_name >=", value, "inCarrierName");
            return (Criteria) this;
        }

        public Criteria andInCarrierNameLessThan(String value) {
            addCriterion("in_carrier_name <", value, "inCarrierName");
            return (Criteria) this;
        }

        public Criteria andInCarrierNameLessThanOrEqualTo(String value) {
            addCriterion("in_carrier_name <=", value, "inCarrierName");
            return (Criteria) this;
        }

        public Criteria andInCarrierNameLike(String value) {
            addCriterion("in_carrier_name like", value, "inCarrierName");
            return (Criteria) this;
        }

        public Criteria andInCarrierNameNotLike(String value) {
            addCriterion("in_carrier_name not like", value, "inCarrierName");
            return (Criteria) this;
        }

        public Criteria andInCarrierNameIn(List<String> values) {
            addCriterion("in_carrier_name in", values, "inCarrierName");
            return (Criteria) this;
        }

        public Criteria andInCarrierNameNotIn(List<String> values) {
            addCriterion("in_carrier_name not in", values, "inCarrierName");
            return (Criteria) this;
        }

        public Criteria andInCarrierNameBetween(String value1, String value2) {
            addCriterion("in_carrier_name between", value1, value2, "inCarrierName");
            return (Criteria) this;
        }

        public Criteria andInCarrierNameNotBetween(String value1, String value2) {
            addCriterion("in_carrier_name not between", value1, value2, "inCarrierName");
            return (Criteria) this;
        }

        public Criteria andInAreaIsNull() {
            addCriterion("in_area is null");
            return (Criteria) this;
        }

        public Criteria andInAreaIsNotNull() {
            addCriterion("in_area is not null");
            return (Criteria) this;
        }

        public Criteria andInAreaEqualTo(String value) {
            addCriterion("in_area =", value, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaNotEqualTo(String value) {
            addCriterion("in_area <>", value, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaGreaterThan(String value) {
            addCriterion("in_area >", value, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaGreaterThanOrEqualTo(String value) {
            addCriterion("in_area >=", value, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaLessThan(String value) {
            addCriterion("in_area <", value, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaLessThanOrEqualTo(String value) {
            addCriterion("in_area <=", value, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaLike(String value) {
            addCriterion("in_area like", value, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaNotLike(String value) {
            addCriterion("in_area not like", value, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaIn(List<String> values) {
            addCriterion("in_area in", values, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaNotIn(List<String> values) {
            addCriterion("in_area not in", values, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaBetween(String value1, String value2) {
            addCriterion("in_area between", value1, value2, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaNotBetween(String value1, String value2) {
            addCriterion("in_area not between", value1, value2, "inArea");
            return (Criteria) this;
        }

        public Criteria andInCityIsNull() {
            addCriterion("in_city is null");
            return (Criteria) this;
        }

        public Criteria andInCityIsNotNull() {
            addCriterion("in_city is not null");
            return (Criteria) this;
        }

        public Criteria andInCityEqualTo(String value) {
            addCriterion("in_city =", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityNotEqualTo(String value) {
            addCriterion("in_city <>", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityGreaterThan(String value) {
            addCriterion("in_city >", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityGreaterThanOrEqualTo(String value) {
            addCriterion("in_city >=", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityLessThan(String value) {
            addCriterion("in_city <", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityLessThanOrEqualTo(String value) {
            addCriterion("in_city <=", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityLike(String value) {
            addCriterion("in_city like", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityNotLike(String value) {
            addCriterion("in_city not like", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityIn(List<String> values) {
            addCriterion("in_city in", values, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityNotIn(List<String> values) {
            addCriterion("in_city not in", values, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityBetween(String value1, String value2) {
            addCriterion("in_city between", value1, value2, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityNotBetween(String value1, String value2) {
            addCriterion("in_city not between", value1, value2, "inCity");
            return (Criteria) this;
        }

        public Criteria andInDegreeIsNull() {
            addCriterion("in_degree is null");
            return (Criteria) this;
        }

        public Criteria andInDegreeIsNotNull() {
            addCriterion("in_degree is not null");
            return (Criteria) this;
        }

        public Criteria andInDegreeEqualTo(Integer value) {
            addCriterion("in_degree =", value, "inDegree");
            return (Criteria) this;
        }

        public Criteria andInDegreeNotEqualTo(Integer value) {
            addCriterion("in_degree <>", value, "inDegree");
            return (Criteria) this;
        }

        public Criteria andInDegreeGreaterThan(Integer value) {
            addCriterion("in_degree >", value, "inDegree");
            return (Criteria) this;
        }

        public Criteria andInDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_degree >=", value, "inDegree");
            return (Criteria) this;
        }

        public Criteria andInDegreeLessThan(Integer value) {
            addCriterion("in_degree <", value, "inDegree");
            return (Criteria) this;
        }

        public Criteria andInDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("in_degree <=", value, "inDegree");
            return (Criteria) this;
        }

        public Criteria andInDegreeIn(List<Integer> values) {
            addCriterion("in_degree in", values, "inDegree");
            return (Criteria) this;
        }

        public Criteria andInDegreeNotIn(List<Integer> values) {
            addCriterion("in_degree not in", values, "inDegree");
            return (Criteria) this;
        }

        public Criteria andInDegreeBetween(Integer value1, Integer value2) {
            addCriterion("in_degree between", value1, value2, "inDegree");
            return (Criteria) this;
        }

        public Criteria andInDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("in_degree not between", value1, value2, "inDegree");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIsNull() {
            addCriterion("busi_type is null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIsNotNull() {
            addCriterion("busi_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeEqualTo(String value) {
            addCriterion("busi_type =", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotEqualTo(String value) {
            addCriterion("busi_type <>", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThan(String value) {
            addCriterion("busi_type >", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("busi_type >=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThan(String value) {
            addCriterion("busi_type <", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThanOrEqualTo(String value) {
            addCriterion("busi_type <=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLike(String value) {
            addCriterion("busi_type like", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotLike(String value) {
            addCriterion("busi_type not like", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIn(List<String> values) {
            addCriterion("busi_type in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotIn(List<String> values) {
            addCriterion("busi_type not in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeBetween(String value1, String value2) {
            addCriterion("busi_type between", value1, value2, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotBetween(String value1, String value2) {
            addCriterion("busi_type not between", value1, value2, "busiType");
            return (Criteria) this;
        }

        public Criteria andLengthImportanceIsNull() {
            addCriterion("length_importance is null");
            return (Criteria) this;
        }

        public Criteria andLengthImportanceIsNotNull() {
            addCriterion("length_importance is not null");
            return (Criteria) this;
        }

        public Criteria andLengthImportanceEqualTo(Integer value) {
            addCriterion("length_importance =", value, "lengthImportance");
            return (Criteria) this;
        }

        public Criteria andLengthImportanceNotEqualTo(Integer value) {
            addCriterion("length_importance <>", value, "lengthImportance");
            return (Criteria) this;
        }

        public Criteria andLengthImportanceGreaterThan(Integer value) {
            addCriterion("length_importance >", value, "lengthImportance");
            return (Criteria) this;
        }

        public Criteria andLengthImportanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("length_importance >=", value, "lengthImportance");
            return (Criteria) this;
        }

        public Criteria andLengthImportanceLessThan(Integer value) {
            addCriterion("length_importance <", value, "lengthImportance");
            return (Criteria) this;
        }

        public Criteria andLengthImportanceLessThanOrEqualTo(Integer value) {
            addCriterion("length_importance <=", value, "lengthImportance");
            return (Criteria) this;
        }

        public Criteria andLengthImportanceIn(List<Integer> values) {
            addCriterion("length_importance in", values, "lengthImportance");
            return (Criteria) this;
        }

        public Criteria andLengthImportanceNotIn(List<Integer> values) {
            addCriterion("length_importance not in", values, "lengthImportance");
            return (Criteria) this;
        }

        public Criteria andLengthImportanceBetween(Integer value1, Integer value2) {
            addCriterion("length_importance between", value1, value2, "lengthImportance");
            return (Criteria) this;
        }

        public Criteria andLengthImportanceNotBetween(Integer value1, Integer value2) {
            addCriterion("length_importance not between", value1, value2, "lengthImportance");
            return (Criteria) this;
        }

        public Criteria andWidthImportanceIsNull() {
            addCriterion("width_importance is null");
            return (Criteria) this;
        }

        public Criteria andWidthImportanceIsNotNull() {
            addCriterion("width_importance is not null");
            return (Criteria) this;
        }

        public Criteria andWidthImportanceEqualTo(Integer value) {
            addCriterion("width_importance =", value, "widthImportance");
            return (Criteria) this;
        }

        public Criteria andWidthImportanceNotEqualTo(Integer value) {
            addCriterion("width_importance <>", value, "widthImportance");
            return (Criteria) this;
        }

        public Criteria andWidthImportanceGreaterThan(Integer value) {
            addCriterion("width_importance >", value, "widthImportance");
            return (Criteria) this;
        }

        public Criteria andWidthImportanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("width_importance >=", value, "widthImportance");
            return (Criteria) this;
        }

        public Criteria andWidthImportanceLessThan(Integer value) {
            addCriterion("width_importance <", value, "widthImportance");
            return (Criteria) this;
        }

        public Criteria andWidthImportanceLessThanOrEqualTo(Integer value) {
            addCriterion("width_importance <=", value, "widthImportance");
            return (Criteria) this;
        }

        public Criteria andWidthImportanceIn(List<Integer> values) {
            addCriterion("width_importance in", values, "widthImportance");
            return (Criteria) this;
        }

        public Criteria andWidthImportanceNotIn(List<Integer> values) {
            addCriterion("width_importance not in", values, "widthImportance");
            return (Criteria) this;
        }

        public Criteria andWidthImportanceBetween(Integer value1, Integer value2) {
            addCriterion("width_importance between", value1, value2, "widthImportance");
            return (Criteria) this;
        }

        public Criteria andWidthImportanceNotBetween(Integer value1, Integer value2) {
            addCriterion("width_importance not between", value1, value2, "widthImportance");
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