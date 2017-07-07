package com.zhou.demo.common;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 18:10 2017/6/26
 */
public class BasicEntity implements Serializable{

    private static final long serialVersionUID = 6251879794316855880L;
    /** 主键id **/
    private String id;

    /** 新增时间 **/
    private Date insertTime = new Date();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}
