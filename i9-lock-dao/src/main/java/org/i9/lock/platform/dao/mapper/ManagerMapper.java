package org.i9.lock.platform.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.i9.lock.platform.model.Manager;
import org.i9.lock.platform.model.ManagerExample;

public interface ManagerMapper {
    int countByExample(@Param("example") ManagerExample example);

    int deleteByExample(ManagerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Manager record);

    int insertSelective(Manager record);

    List<Manager> selectByExample(ManagerExample example);

    Manager selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Manager record, @Param("example") ManagerExample example);

    int updateByExample(@Param("record") Manager record, @Param("example") ManagerExample example);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
    
    List<Manager> selectByLimitPage(@Param("example") ManagerExample managerExample, @Param("offset") int offset, @Param("limit") int pageSize);
}