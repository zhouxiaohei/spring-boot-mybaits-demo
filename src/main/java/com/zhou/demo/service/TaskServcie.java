package com.zhou.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhou.demo.bean.Task;
import com.zhou.demo.bean.TaskPageCondition;
import com.zhou.demo.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.ConditionMapper;

import java.util.List;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 18:23 2017/6/28
 */
@Service
public class TaskServcie {

    @Autowired
    private TaskMapper taskMapper;

    public Task getTask(String id){
        return  taskMapper.getTaskById(id);
    }

    public int updateStatus(int status, String id){
        return  taskMapper.updateStatus(status, id);
    }

    public PageInfo page(int pageNo, int pageSize){
        PageHelper.startPage(pageNo, pageSize, true);
        List<Task> list = taskMapper.page();
        return  new PageInfo<>(list);
    }

    public PageInfo pageByCondition(TaskPageCondition condition){
        PageHelper.startPage(condition.getPageNo(), condition.getPageSize(), true);
        List<Task> list = taskMapper.pageByCondition(condition);
        return  new PageInfo<>(list);
    }

    public void insert(Task task){
        taskMapper.insert(task);
    }

}
