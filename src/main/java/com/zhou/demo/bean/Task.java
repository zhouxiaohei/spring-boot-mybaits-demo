package com.zhou.demo.bean;


import com.zhou.demo.common.BasicEntity;

import javax.persistence.Table;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 17:14 2017/6/26
 */
@Table(name = "new_ent_task")
public class Task extends BasicEntity {

    private static final long serialVersionUID = 8139236125578086255L;

    //任务名称
    private String taskName;

    /**
     * 任务下发人
     */
    private String userId;

    /**
     * 任务状态 1进行中、2已完成、3异常
     */
    private int status;

    /**
     * 文件id
     */
    private String fileId;

    /**
     *  文件类型XML/JSON
     */
    private String fileType;

    /**
     * 是否切割 0:不切割 1 切割
     */
    private int fileSplit;

    /**
     *	每个文件条数
     */
    private int  fileRecordCount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
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

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}


