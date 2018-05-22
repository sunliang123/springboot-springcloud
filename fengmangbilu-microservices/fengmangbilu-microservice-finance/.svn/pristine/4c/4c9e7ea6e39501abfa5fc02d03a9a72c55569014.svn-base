package com.fengmangbilu.microservice.finance.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fengmangbilu.domain.BaseEntity;
import com.fengmangbilu.hibernate.SnowflakeGenerator;
import com.fengmangbilu.microservice.finance.enums.ChargeType;
import com.fengmangbilu.microservice.finance.enums.Currency;
import com.fengmangbilu.microservice.finance.enums.OrderStatus;
import com.fengmangbilu.microservice.finance.enums.OrderType;

@Entity
@Table(name = "fengmangbilu_order")
public class Order extends BaseEntity {

	/** 订单号 **/
	@Id
	@GenericGenerator(name = "snowflake", strategy = SnowflakeGenerator.TYPE)
	@GeneratedValue(generator = "snowflake")
	private Long orderId;

	/** 折扣 **/
	@Column(precision = 0, scale = 2)
	private BigDecimal discount;

	/** 原价 **/
	@Column(precision = 8, scale = 2)
	private BigDecimal originalAmount;

	/** 应付金额  **/
	@Column(precision = 8, scale = 2)
	private BigDecimal payAmount;

	/** 订单状态  **/
	private OrderStatus orderStatus;

	/** 买家 **/
	private String buyerId;

	/** 买家名称 **/
	private String buyerName;

	/** 付款人**/
	private String payerId;

	/** 货币类别  **/
	private Currency currency;

	/** 支付日期 **/
	private Date payDate;

	/** 产品编号 **/
	private String productCode;

	/** 产品名称 **/
	private String productName;

	/** 计费类型 **/
	private ChargeType chargeType;

	/** 订单类型 **/
	private OrderType orderType;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(BigDecimal originalAmount) {
		this.originalAmount = originalAmount;
	}

	public BigDecimal getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPayerId() {
		return payerId;
	}

	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}

	public ChargeType getChargeType() {
		return chargeType;
	}

	public void setChargeType(ChargeType chargeType) {
		this.chargeType = chargeType;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

}
