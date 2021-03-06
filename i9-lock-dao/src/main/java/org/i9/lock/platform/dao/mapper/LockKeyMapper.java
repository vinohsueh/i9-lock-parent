package org.i9.lock.platform.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.i9.lock.platform.dao.vo.PriceDto;
import org.i9.lock.platform.model.LockKey;
import org.i9.lock.platform.model.LockKeyExample;
import org.i9.lock.platform.utils.BusinessException;

public interface LockKeyMapper {
    int countByExample(@Param("example") LockKeyExample example);

    int deleteByExample(LockKeyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LockKey record);

    int insertSelective(LockKey record);

    List<LockKey> selectByExample(LockKeyExample example);

    LockKey selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LockKey record, @Param("example") LockKeyExample example);

    int updateByExample(@Param("record") LockKey record, @Param("example") LockKeyExample example);

    int updateByPrimaryKeySelective(LockKey record);

    int updateByPrimaryKey(LockKey record);
    
    List<LockKey> selectByLimitPage(@Param("example") LockKeyExample example, @Param("offset") int offset, @Param("limit") int pageSize);

    List<Integer> selectExistOrderNumber(Long lockId);
    /**
     * 通过锁id和用户id查询锁钥匙
     * @param lockId
     * @param id
     * @return
     */
    LockKey selectLockKeyByLockIdAndUserId(@Param("lockId")Long lockId,@Param("userId") Long userId);
    /**
     * 通过锁id查询钥匙
     * @param lockId
     * @return
     * @throws BusinessException
     */
    List<LockKey> getLockKeyByLockId(Long lockId);

    void updateLockKeyByTwoId(LockKey lockKey);
    
    /**
     * 根据锁号删除全部钥匙
     * @param lockId
     */
    void deleteAll(Long lockId);

	PriceDto selectAllPrice(Integer id);

	void updateLockKeyState();
	
	int selectLockKeyCountByLockId(Integer lockId);

	int selectLockKeyCountByLockId(Long lockId);
	 /**
     * 根据锁号查询结束时间和ordernumber
     * @param lockId
     * @return
     */
	List<LockKey> getTimeAndOrderNum(Long lockId);
	
	 /**
     * 查询结束时间
     * @return
     */
	List<LockKey> getTime();

	void updateLockKeyrentState(String date);  
}