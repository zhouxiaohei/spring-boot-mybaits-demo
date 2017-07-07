package com.zhou.demo.bean;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 16:37 2017/7/6
 */
public class TaskPageCondition extends PageCondition {
    @ApiModelProperty(value="任务名称")
    private String taskName;

//    @ApiModelProperty(value="入库时间")
//    private Date insertTime;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

}
