package com.rbac.console.dao;


import com.rbac.console.entity.ConsoleRole;
import com.rbac.console.entity.ConsoleRoleExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ConsoleRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_ROLE
     *
     * @mbggenerated
     */
    int countByExample(ConsoleRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_ROLE
     *
     * @mbggenerated
     */
    int deleteByExample(ConsoleRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_ROLE
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_ROLE
     *
     * @mbggenerated
     */
    int insert(ConsoleRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_ROLE
     *
     * @mbggenerated
     */
    int insertSelective(ConsoleRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_ROLE
     *
     * @mbggenerated
     */
    List<ConsoleRole> selectByExample(ConsoleRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_ROLE
     *
     * @mbggenerated
     */
    ConsoleRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_ROLE
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ConsoleRole record, @Param("example") ConsoleRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_ROLE
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ConsoleRole record, @Param("example") ConsoleRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_ROLE
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ConsoleRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _CONSOLE_ROLE
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ConsoleRole record);
}