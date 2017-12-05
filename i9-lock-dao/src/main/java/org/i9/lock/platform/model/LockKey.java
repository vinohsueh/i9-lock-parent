package org.i9.lock.platform.model;

import java.math.BigDecimal;
import java.util.Date;

public class LockKey {
    private Integer id;
    
    /**
     * 锁id
     */
    private Long lockId;
    
    /**
     * 租户电话
     */
    private String hirerPhone;
    
    /**
     * 开门密码
     */
    private String password;
    
    /**
     * 出租类型(月日时) 日0  月1 时2
     */
    private Byte hireType;
    
    /**
     * 租金
     */
    private BigDecimal hirePrice;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;
    
    /**
     * 钥匙类型 0:租户钥匙   1:临时钥匙
     */
    private Byte type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getLockId() {
        return lockId;
    }

    public void setLockId(Long lockId) {
        this.lockId = lockId;
    }

    public String getHirerPhone() {
        return hirerPhone;
    }

    public void setHirerPhone(String hirerPhone) {
        this.hirerPhone = hirerPhone == null ? null : hirerPhone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getHireType() {
        return hireType;
    }

    public void setHireType(Byte hireType) {
        this.hireType = hireType;
    }

    public BigDecimal getHirePrice() {
        return hirePrice;
    }

    public void setHirePrice(BigDecimal hirePrice) {
        this.hirePrice = hirePrice;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }
}