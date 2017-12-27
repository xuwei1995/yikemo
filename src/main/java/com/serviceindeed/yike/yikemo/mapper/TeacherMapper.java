package com.serviceindeed.yike.yikemo.mapper;

import com.serviceindeed.yike.yikemo.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long teacherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    int insert(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    int insertSelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    Teacher selectByPrimaryKey(Long teacherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Teacher record);

    List<Teacher> queryPageTeacherList(Teacher teacher);


}