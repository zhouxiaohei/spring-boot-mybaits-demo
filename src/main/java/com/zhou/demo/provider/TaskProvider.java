package com.zhou.demo.provider;

import com.zhou.demo.bean.TaskPageCondition;
import org.apache.commons.lang.StringUtils;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 17:03 2017/7/6
 */
public class TaskProvider {

    public String pageByCondition(TaskPageCondition condition){
        StringBuilder sb = new StringBuilder("select * from new_ent_task where 1=1");
        String taskName = condition.getTaskName();
        if(!StringUtils.isBlank(taskName)){
            sb.append(" and task_name like '%").append(taskName).append("%'");
        }
        return sb.toString();
    }
}
