package ccs.com.vhr.mapper;

import ccs.com.vhr.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> getEmployeeByPage(@Param("page") Integer page,
                                     @Param("size") Integer size,
                                     @Param("keyword") String keyword);

    Long getTotal(@Param("keyword") String keyword);

}