package ccs.com.vhr.mapper;

import ccs.com.vhr.model.Employeeec;

public interface EmployeeecMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    int insert(Employeeec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    int insertSelective(Employeeec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    Employeeec selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    int updateByPrimaryKeySelective(Employeeec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeec
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    int updateByPrimaryKey(Employeeec record);
}