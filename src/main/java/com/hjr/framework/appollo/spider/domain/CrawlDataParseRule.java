package com.hjr.framework.appollo.spider.domain;

import java.util.Date;

public class CrawlDataParseRule {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CRAWL_DATA_PARSE_RULE.ID
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CRAWL_DATA_PARSE_RULE.TASK_ID
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    private Long taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CRAWL_DATA_PARSE_RULE.SRC_PAGE_TYPE
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    private String srcPageType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CRAWL_DATA_PARSE_RULE.DATA_NAME
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    private String dataName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CRAWL_DATA_PARSE_RULE.DATA_PARSE_RULE
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    private String dataParseRule;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CRAWL_DATA_PARSE_RULE.YN
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    private Byte yn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CRAWL_DATA_PARSE_RULE.CREATE_TIME
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CRAWL_DATA_PARSE_RULE.MODIFY_TIME
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    private Date modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CRAWL_DATA_PARSE_RULE.ID
     *
     * @return the value of CRAWL_DATA_PARSE_RULE.ID
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CRAWL_DATA_PARSE_RULE.ID
     *
     * @param id the value for CRAWL_DATA_PARSE_RULE.ID
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CRAWL_DATA_PARSE_RULE.TASK_ID
     *
     * @return the value of CRAWL_DATA_PARSE_RULE.TASK_ID
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CRAWL_DATA_PARSE_RULE.TASK_ID
     *
     * @param taskId the value for CRAWL_DATA_PARSE_RULE.TASK_ID
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CRAWL_DATA_PARSE_RULE.SRC_PAGE_TYPE
     *
     * @return the value of CRAWL_DATA_PARSE_RULE.SRC_PAGE_TYPE
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public String getSrcPageType() {
        return srcPageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CRAWL_DATA_PARSE_RULE.SRC_PAGE_TYPE
     *
     * @param srcPageType the value for CRAWL_DATA_PARSE_RULE.SRC_PAGE_TYPE
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public void setSrcPageType(String srcPageType) {
        this.srcPageType = srcPageType == null ? null : srcPageType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CRAWL_DATA_PARSE_RULE.DATA_NAME
     *
     * @return the value of CRAWL_DATA_PARSE_RULE.DATA_NAME
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public String getDataName() {
        return dataName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CRAWL_DATA_PARSE_RULE.DATA_NAME
     *
     * @param dataName the value for CRAWL_DATA_PARSE_RULE.DATA_NAME
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public void setDataName(String dataName) {
        this.dataName = dataName == null ? null : dataName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CRAWL_DATA_PARSE_RULE.DATA_PARSE_RULE
     *
     * @return the value of CRAWL_DATA_PARSE_RULE.DATA_PARSE_RULE
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public String getDataParseRule() {
        return dataParseRule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CRAWL_DATA_PARSE_RULE.DATA_PARSE_RULE
     *
     * @param dataParseRule the value for CRAWL_DATA_PARSE_RULE.DATA_PARSE_RULE
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public void setDataParseRule(String dataParseRule) {
        this.dataParseRule = dataParseRule == null ? null : dataParseRule.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CRAWL_DATA_PARSE_RULE.YN
     *
     * @return the value of CRAWL_DATA_PARSE_RULE.YN
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public Byte getYn() {
        return yn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CRAWL_DATA_PARSE_RULE.YN
     *
     * @param yn the value for CRAWL_DATA_PARSE_RULE.YN
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public void setYn(Byte yn) {
        this.yn = yn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CRAWL_DATA_PARSE_RULE.CREATE_TIME
     *
     * @return the value of CRAWL_DATA_PARSE_RULE.CREATE_TIME
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CRAWL_DATA_PARSE_RULE.CREATE_TIME
     *
     * @param createTime the value for CRAWL_DATA_PARSE_RULE.CREATE_TIME
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CRAWL_DATA_PARSE_RULE.MODIFY_TIME
     *
     * @return the value of CRAWL_DATA_PARSE_RULE.MODIFY_TIME
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CRAWL_DATA_PARSE_RULE.MODIFY_TIME
     *
     * @param modifyTime the value for CRAWL_DATA_PARSE_RULE.MODIFY_TIME
     *
     * @mbg.generated Sun May 13 14:54:45 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}