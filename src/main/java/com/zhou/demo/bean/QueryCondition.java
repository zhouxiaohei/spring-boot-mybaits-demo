package com.zhou.demo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 14:35 2017/6/28
 */
@ApiModel
public class QueryCondition {

    @ApiModelProperty(value="企业登记日期FROM")
    private Date esDateFrom;

    @ApiModelProperty(value="登记日期TO")
    private Date esDateTo;

    @ApiModelProperty(value="所在行业")
    private String industry;

    @ApiModelProperty(value="全部行业0 ，行业白名单1，行业黑名单2")
    private int industryType;

    @ApiModelProperty(value="企业所在地区")
    private String district;

    @ApiModelProperty(value="全部地区0 ，地区白名单1，地区黑名单2")
    private int districtType;

    @ApiModelProperty(value="注册资本(起)")
    private Integer regCapMin;

    @ApiModelProperty(value="注册资本(止) ")
    private Integer regCapMax;

//    @ApiModelProperty(value="经营范围")
//    private String opscope;

    @ApiModelProperty(value="开始批次")
    private Date batchStart;

    @ApiModelProperty(value="结束批次")
    private Date batchEnd;

    public Date getEsDateFrom() {
        return esDateFrom;
    }

    public void setEsDateFrom(Date esDateFrom) {
        this.esDateFrom = esDateFrom;
    }

    public Date getEsDateTo() {
        return esDateTo;
    }

    public void setEsDateTo(Date esDateTo) {
        this.esDateTo = esDateTo;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getIndustryType() {
        return industryType;
    }

    public void setIndustryType(int industryType) {
        this.industryType = industryType;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getDistrictType() {
        return districtType;
    }

    public void setDistrictType(int districtType) {
        this.districtType = districtType;
    }

    public Integer getRegCapMin() {
        return regCapMin;
    }

    public void setRegCapMin(Integer regCapMin) {
        this.regCapMin = regCapMin;
    }

    public Integer getRegCapMax() {
        return regCapMax;
    }

    public void setRegCapMax(Integer regCapMax) {
        this.regCapMax = regCapMax;
    }

    public Date getBatchStart() {
        return batchStart;
    }

    public void setBatchStart(Date batchStart) {
        this.batchStart = batchStart;
    }

    public Date getBatchEnd() {
        return batchEnd;
    }

    public void setBatchEnd(Date batchEnd) {
        this.batchEnd = batchEnd;
    }

}
