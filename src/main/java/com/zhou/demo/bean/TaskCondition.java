package com.zhou.demo.bean;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 14:01 2017/7/6
 */
public class TaskCondition extends  QueryCondition{

    @ApiModelProperty(value="任务名称", required = true)
    private String taskName;

    @ApiModelProperty(value="用户id", required = true)
    private String userId;

    @ApiModelProperty(value="文件类型,json/xml")
    private String fileType;

    @ApiModelProperty(value="是否切割；0:不切割,1:切割")
    private int fileSplit;

    @ApiModelProperty(value="条数/每个文件")
    private int  fileRecordCount;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public int getFileSplit() {
        return fileSplit;
    }

    public void setFileSplit(int fileSplit) {
        this.fileSplit = fileSplit;
    }

    public int getFileRecordCount() {
        return fileRecordCount;
    }

    public void setFileRecordCount(int fileRecordCount) {
        this.fileRecordCount = fileRecordCount;
    }
}
