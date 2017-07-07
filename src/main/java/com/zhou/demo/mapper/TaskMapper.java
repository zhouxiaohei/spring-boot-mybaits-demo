package com.zhou.demo.mapper;

import com.zhou.demo.bean.Task;
import com.zhou.demo.bean.TaskPageCondition;
import com.zhou.demo.provider.TaskProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 17:46 2017/6/28
 */
public interface TaskMapper extends BaseMapper<Task> {

    @Select("select * from new_ent_task where id = #{id}")
    Task getTaskById(@Param("id") String id);

    @Select("select * from new_ent_task")
    List<Task> page();

    @SelectProvider(type= TaskProvider.class, method= "pageByCondition")
    List<Task> pageByCondition(TaskPageCondition condition);

//    @Insert("insert into new_ent_task(id,task_name,insert_time,user_id,status,file_id,file_type,file_split,file_record_count)" +
//            " values(#{task.id},#{task.taskName},#{task.insertTime},#{task.userId},#{task.status},#{task.fileId},#{task.fileType},#{task.fileSplit},#{task.fileRecordCount})")
//   int insert(@Param("task") Task task);

    @Update("update new_ent_task set status = #{status} where id =  #{id}")
    int updateStatus(@Param("status") int status, @Param("id") String id);

}
