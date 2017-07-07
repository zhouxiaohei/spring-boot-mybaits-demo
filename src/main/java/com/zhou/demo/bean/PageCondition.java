package com.zhou.demo.bean;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 16:34 2017/7/6
 */
public class PageCondition {
    @ApiModelProperty(value="页数",required = true)
    private int pageNo;

    @ApiModelProperty(value="条数",required = true)
    private int pageSize;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
