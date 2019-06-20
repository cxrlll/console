package com.rbac.console.dao;

import com.rbac.console.entity.ConsoleUserRole;
import com.rbac.console.entity.ConsoleUserRoleExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ConsoleUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_USER_ROLE
     *
     * @mbggenerated
     */
    int countByExample(ConsoleUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_USER_ROLE
     *
     * @mbggenerated
     */
    int deleteByExample(ConsoleUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_USER_ROLE
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_USER_ROLE
     *
     * @mbggenerated
     */
    int insert(ConsoleUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_USER_ROLE
     *
     * @mbggenerated
     */
    int insertSelective(ConsoleUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_USER_ROLE
     *
     * @mbggenerated
     */
    List<ConsoleUserRole> selectByExample(ConsoleUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_USER_ROLE
     *
     * @mbggenerated
     */
    ConsoleUserRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_USER_ROLE
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ConsoleUserRole record, @Param("example") ConsoleUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_USER_ROLE
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ConsoleUserRole record, @Param("example") ConsoleUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_USER_ROLE
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ConsoleUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_USER_ROLE
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ConsoleUserRole record);
}