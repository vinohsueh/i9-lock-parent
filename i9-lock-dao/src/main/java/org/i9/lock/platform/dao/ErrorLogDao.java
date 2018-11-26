package org.i9.lock.platform.dao;

import org.i9.lock.platform.model.ErrorLog;

/**
 * 错误日志Dao
* @ClassName: ErrorLogDao
* @author xph
* @date 2018年11月23日
 */
public interface ErrorLogDao {
    
    /**
     * 新增异常
    * @Title: insertErrorlog
    * @param @param errorLog
    * @param @throws Exception
     */
    void insertErrorlog(ErrorLog errorLog) throws Exception;
    
    /**
     * 根据lockid，ordernumber查询状态
    * @Title: selectErrorlogBylockIdAndOrderNumber
    * @param @param lockId
    * @param @param orderNumber
    * @param @throws Exception
     * @return 
     */
    int selectErrorlogBylockIdAndOrderNumber(Integer lockId, Integer orderNumber) throws Exception;
    
    /**
     * 根据lockid，ordernumber删除状态
    * @Title: selectErrorlogBylockIdAndOrderNumber
    * @param @param lockId
    * @param @param orderNumber
    * @param @throws Exception
     * @return 
     */
    void deleteErrorlogBylockIdAndOrderNumber(Integer lockId, Integer orderNumber)throws Exception;

}
