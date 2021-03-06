package com.stylefeng.guns.modular.system.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 卡充值记录
 * </p>
 *
 * @author guiyj007
 * @since 2018-06-22
 */
@TableName("biz_card_recharge_log")
public class CardRechargeLog extends Model<CardRechargeLog> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    
    /**
     * 卡类型
     */
    @TableField("log_type")
    private Integer logType;
    
	/**
     * 俱乐部id
     */
    @TableField("club_id")
    private Integer clubId;

	/**
     * 私教卡ID
     */
    @TableField("card_id")
    private Integer cardId;
    /**
     * 用户id
     */
    @TableField("vip_id")
    private Integer vipId;
    /**
     * 姓名
     */
    private String realname;
    /**
     * 卡名
     */
    private String title;
    /**
     * 卡种类型ID
     */
    @TableField("card_type_id")
    private Integer cardTypeId;
    /**
     * 卡种类型名
     */
    @TableField("card_type_name")
    private String cardTypeName;
    /**
     * 总次数
     */
    private Integer counts;
    
    /**
     * 总金额
     */
    @TableField("sum_money")
    private BigDecimal sumMoney;
    
	/**
     * 实际添加时间
     */
    @TableField("actual_insert_time")
    private Integer actualInsertTime;
    /**
     * 开卡时间
     */
    @TableField("open_card_time")
    private Integer openCardTime;
    /**
     * 开始使用时间
     */
    @TableField("start_use_time")
    private Integer startUseTime;
    /**
     * 到期时间
     */
    @TableField("expire_time")
    private Integer expireTime;
    /**
     * 到期天数
     */
    @TableField("expire_days")
    private Integer expireDays;

	/**
     * 录入时间
     */
    @TableField("insert_time")
    private Integer insertTime;
    /**
     * 单价
     */
    @TableField("unit_price")
    private BigDecimal unitPrice;
    /**
     * 实收金额
     */
    @TableField("actual_money")
    private BigDecimal actualMoney;
    /**
     * 尾款金额
     */
    private BigDecimal retainage;
    /**
     * 余额
     */
    private BigDecimal balance;
    /**
     * 财务是否确认
     */
    private Integer banksure;
    /**
     * 合同编号
     */
    @TableField("contract_number")
    private String contractNumber;
    /**
     * 是否定金方式
     */
    @TableField("front_money_status")
    private Integer frontMoneyStatus;
    /**
     * 是否续卡
     */
    @TableField("is_renew_card")
    private Integer isRenewCard;
    /**
     * 是否通店卡
     */
    @TableField("is_united_card")
    private Integer isUnitedCard;
    /**
     * 所属教练ID
     */
    @TableField("coach_id")
    private Integer coachId;
    /**
     * 所属教练名称
     */
    @TableField("coach_name")
    private String coachName;
    /**
     * 会籍ID
     */
    @TableField("membership_id")
    private Integer membershipId;
    /**
     * 会籍名称
     */
    @TableField("membership_name")
    private String membershipName;
    /**
     * 经办人用户ID
     */
    @TableField("ope_user_id")
    private Integer opeUserId;
    /**
     * 经办人用户名
     */
    @TableField("ope_username")
    private String opeUsername;
    /**
     * 支付方式
     */
    @TableField("pay_method")
    private String payMethod;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 客户来源id
     */
    @TableField("source_id")
    private Integer sourceId;
    /**
     * 客户来源名
     */
    @TableField("source_name")
    private String sourceName;
    /**
     * 备注
     */
    private String remark;
    private String remarkby;
    
	/**
     * 是否自动打印
     */
    @TableField("is_auto_print")
    private Integer isAutoPrint;
    /**
     * 端口 1 充值新卡 2 续费
     */
    private Integer port;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLogType() {
		return logType;
	}

	public void setLogType(Integer logType) {
		this.logType = logType;
	}
	
    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(Integer cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    public String getCardTypeName() {
        return cardTypeName;
    }

    public void setCardTypeName(String cardTypeName) {
        this.cardTypeName = cardTypeName;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public BigDecimal getSumMoney() {
		return sumMoney;
	}

	public void setSumMoney(BigDecimal sumMoney) {
		this.sumMoney = sumMoney;
	}

    public Integer getActualInsertTime() {
        return actualInsertTime;
    }

    public void setActualInsertTime(Integer actualInsertTime) {
        this.actualInsertTime = actualInsertTime;
    }

    public Integer getOpenCardTime() {
        return openCardTime;
    }

    public void setOpenCardTime(Integer openCardTime) {
        this.openCardTime = openCardTime;
    }

    public Integer getStartUseTime() {
        return startUseTime;
    }

    public void setStartUseTime(Integer startUseTime) {
        this.startUseTime = startUseTime;
    }
    public Integer getExpireDays() {
		return expireDays;
	}

	public void setExpireDays(Integer expireDays) {
		this.expireDays = expireDays;
	}
    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Integer insertTime) {
        this.insertTime = insertTime;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getActualMoney() {
        return actualMoney;
    }

    public void setActualMoney(BigDecimal actualMoney) {
        this.actualMoney = actualMoney;
    }

    public BigDecimal getRetainage() {
        return retainage;
    }

    public void setRetainage(BigDecimal retainage) {
        this.retainage = retainage;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getBanksure() {
        return banksure;
    }

    public void setBanksure(Integer banksure) {
        this.banksure = banksure;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Integer getFrontMoneyStatus() {
        return frontMoneyStatus;
    }

    public void setFrontMoneyStatus(Integer frontMoneyStatus) {
        this.frontMoneyStatus = frontMoneyStatus;
    }

    public Integer getIsRenewCard() {
        return isRenewCard;
    }

    public void setIsRenewCard(Integer isRenewCard) {
        this.isRenewCard = isRenewCard;
    }

    public Integer getIsUnitedCard() {
        return isUnitedCard;
    }

    public void setIsUnitedCard(Integer isUnitedCard) {
        this.isUnitedCard = isUnitedCard;
    }

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public Integer getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Integer membershipId) {
        this.membershipId = membershipId;
    }

    public String getMembershipName() {
        return membershipName;
    }

    public void setMembershipName(String membershipName) {
        this.membershipName = membershipName;
    }

    public Integer getOpeUserId() {
        return opeUserId;
    }

    public void setOpeUserId(Integer opeUserId) {
        this.opeUserId = opeUserId;
    }

    public String getOpeUsername() {
        return opeUsername;
    }

    public void setOpeUsername(String opeUsername) {
        this.opeUsername = opeUsername;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemarkby() {
		return remarkby;
	}

	public void setRemarkby(String remarkby) {
		this.remarkby = remarkby;
	}
	
    public Integer getIsAutoPrint() {
        return isAutoPrint;
    }

    public void setIsAutoPrint(Integer isAutoPrint) {
        this.isAutoPrint = isAutoPrint;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CardPtraincardRecharge{" +
        "id=" + id +
        ", clubId=" + clubId +
        ", cardId=" + cardId +
        ", vipId=" + vipId +
        ", realname=" + realname +
        ", title=" + title +
        ", cardTypeId=" + cardTypeId +
        ", cardTypeName=" + cardTypeName +
        ", counts=" + counts +
        ", sumMoney=" + sumMoney +
        ", actualInsertTime=" + actualInsertTime +
        ", openCardTime=" + openCardTime +
        ", startUseTime=" + startUseTime +
        ", expireTime=" + expireTime +
        ", insertTime=" + insertTime +
        ", unitPrice=" + unitPrice +
        ", actualMoney=" + actualMoney +
        ", retainage=" + retainage +
        ", balance=" + balance +
        ", banksure=" + banksure +
        ", contractNumber=" + contractNumber +
        ", frontMoneyStatus=" + frontMoneyStatus +
        ", isRenewCard=" + isRenewCard +
        ", isUnitedCard=" + isUnitedCard +
        ", coachId=" + coachId +
        ", coachName=" + coachName +
        ", membershipId=" + membershipId +
        ", membershipName=" + membershipName +
        ", opeUserId=" + opeUserId +
        ", opeUsername=" + opeUsername +
        ", payMethod=" + payMethod +
        ", phone=" + phone +
        ", sourceId=" + sourceId +
        ", sourceName=" + sourceName +
        ", remark=" + remark +
        ", isAutoPrint=" + isAutoPrint +
        ", port=" + port +
        "}";
    }
}
