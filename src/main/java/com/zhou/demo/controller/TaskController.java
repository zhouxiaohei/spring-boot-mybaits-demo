package com.zhou.demo.controller;

import com.zhou.demo.bean.Task;
import com.zhou.demo.bean.TaskPageCondition;
import com.zhou.demo.common.BaseController;
import com.zhou.demo.common.WebResponse;
import com.zhou.demo.common.WebResult;
import com.zhou.demo.service.TaskServcie;
import com.zhou.demo.utils.RestTemplateUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 17:09 2017/6/26
 */
@RestController
@Api(tags= "任务管理")
public class TaskController extends BaseController {

    @Autowired
    private TaskServcie taskServcie;

    @Autowired
    private RestTemplateUtils restTemplateUtils;

    @ApiOperation(value="保存")
    @RequestMapping(value="task/save", method=RequestMethod.POST)
    public WebResult queryNum(@ModelAttribute Task task) {
        return new WebResponse() {
            @Override
            protected WebResult execute(WebResult result, Object obj) {
                taskServcie.insert(task);
                return result;
            }
        }.sendRequest();
    }

    @ApiOperation(value="分页")
    @RequestMapping(value="task/page", method=RequestMethod.POST)
    public WebResult page(@ModelAttribute TaskPageCondition condition){
        return new WebResponse() {
            @Override
            protected WebResult execute(WebResult result, Object obj) {
                result.setResult(taskServcie.pageByCondition(condition));
                return result;
            }
        }.sendRequest();
    }

    @ApiOperation(value="查询任务")
    @RequestMapping(value="task/getTask/{taskId}", method= RequestMethod.GET)
    public WebResult getTask(@ApiParam(value="任务id", required=true) @PathVariable String taskId){
        return new WebResponse() {
            @Override
            protected WebResult execute(WebResult result, Object obj) {
                result.setResult(taskServcie.getTask(taskId));
                return result;
            }
        }.sendRequest();
    }

}
