package com.hjr.framework.appollo.spider.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrawlResultExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
     */
    public CrawlResultExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
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
     * This method corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSrcUrlIsNull() {
            addCriterion("SRC_URL is null");
            return (Criteria) this;
        }

        public Criteria andSrcUrlIsNotNull() {
            addCriterion("SRC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSrcUrlEqualTo(String value) {
            addCriterion("SRC_URL =", value, "srcUrl");
            return (Criteria) this;
        }

        public Criteria andSrcUrlNotEqualTo(String value) {
            addCriterion("SRC_URL <>", value, "srcUrl");
            return (Criteria) this;
        }

        public Criteria andSrcUrlGreaterThan(String value) {
            addCriterion("SRC_URL >", value, "srcUrl");
            return (Criteria) this;
        }

        public Criteria andSrcUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SRC_URL >=", value, "srcUrl");
            return (Criteria) this;
        }

        public Criteria andSrcUrlLessThan(String value) {
            addCriterion("SRC_URL <", value, "srcUrl");
            return (Criteria) this;
        }

        public Criteria andSrcUrlLessThanOrEqualTo(String value) {
            addCriterion("SRC_URL <=", value, "srcUrl");
            return (Criteria) this;
        }

        public Criteria andSrcUrlLike(String value) {
            addCriterion("SRC_URL like", value, "srcUrl");
            return (Criteria) this;
        }

        public Criteria andSrcUrlNotLike(String value) {
            addCriterion("SRC_URL not like", value, "srcUrl");
            return (Criteria) this;
        }

        public Criteria andSrcUrlIn(List<String> values) {
            addCriterion("SRC_URL in", values, "srcUrl");
            return (Criteria) this;
        }

        public Criteria andSrcUrlNotIn(List<String> values) {
            addCriterion("SRC_URL not in", values, "srcUrl");
            return (Criteria) this;
        }

        public Criteria andSrcUrlBetween(String value1, String value2) {
            addCriterion("SRC_URL between", value1, value2, "srcUrl");
            return (Criteria) this;
        }

        public Criteria andSrcUrlNotBetween(String value1, String value2) {
            addCriterion("SRC_URL not between", value1, value2, "srcUrl");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andYnIsNull() {
            addCriterion("YN is null");
            return (Criteria) this;
        }

        public Criteria andYnIsNotNull() {
            addCriterion("YN is not null");
            return (Criteria) this;
        }

        public Criteria andYnEqualTo(Byte value) {
            addCriterion("YN =", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotEqualTo(Byte value) {
            addCriterion("YN <>", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnGreaterThan(Byte value) {
            addCriterion("YN >", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnGreaterThanOrEqualTo(Byte value) {
            addCriterion("YN >=", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnLessThan(Byte value) {
            addCriterion("YN <", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnLessThanOrEqualTo(Byte value) {
            addCriterion("YN <=", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnIn(List<Byte> values) {
            addCriterion("YN in", values, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotIn(List<Byte> values) {
            addCriterion("YN not in", values, "yn");
            return (Criteria) this;
        }

        public Criteria andYnBetween(Byte value1, Byte value2) {
            addCriterion("YN between", value1, value2, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotBetween(Byte value1, Byte value2) {
            addCriterion("YN not between", value1, value2, "yn");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andSrcSiteIsNull() {
            addCriterion("SRC_SITE is null");
            return (Criteria) this;
        }

        public Criteria andSrcSiteIsNotNull() {
            addCriterion("SRC_SITE is not null");
            return (Criteria) this;
        }

        public Criteria andSrcSiteEqualTo(String value) {
            addCriterion("SRC_SITE =", value, "srcSite");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNotEqualTo(String value) {
            addCriterion("SRC_SITE <>", value, "srcSite");
            return (Criteria) this;
        }

        public Criteria andSrcSiteGreaterThan(String value) {
            addCriterion("SRC_SITE >", value, "srcSite");
            return (Criteria) this;
        }

        public Criteria andSrcSiteGreaterThanOrEqualTo(String value) {
            addCriterion("SRC_SITE >=", value, "srcSite");
            return (Criteria) this;
        }

        public Criteria andSrcSiteLessThan(String value) {
            addCriterion("SRC_SITE <", value, "srcSite");
            return (Criteria) this;
        }

        public Criteria andSrcSiteLessThanOrEqualTo(String value) {
            addCriterion("SRC_SITE <=", value, "srcSite");
            return (Criteria) this;
        }

        public Criteria andSrcSiteLike(String value) {
            addCriterion("SRC_SITE like", value, "srcSite");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNotLike(String value) {
            addCriterion("SRC_SITE not like", value, "srcSite");
            return (Criteria) this;
        }

        public Criteria andSrcSiteIn(List<String> values) {
            addCriterion("SRC_SITE in", values, "srcSite");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNotIn(List<String> values) {
            addCriterion("SRC_SITE not in", values, "srcSite");
            return (Criteria) this;
        }

        public Criteria andSrcSiteBetween(String value1, String value2) {
            addCriterion("SRC_SITE between", value1, value2, "srcSite");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNotBetween(String value1, String value2) {
            addCriterion("SRC_SITE not between", value1, value2, "srcSite");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated do_not_delete_during_merge Sun May 13 13:58:09 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CRAWL_RESULT
     *
     * @mbg.generated Sun May 13 13:58:09 CST 2018
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