package com.meridian.ccb.model;

import java.util.Date;
import java.util.List;

public class AutoPay {
	private List<AutoPayDataItem> _data;

	public List<AutoPayDataItem> get_data() {
		return _data;
	}

	public void set_data(List<AutoPayDataItem> _data) {
		this._data = _data;
	}
}

class AutoPayDataItem {
	private AccountAutoPay accountAutoPay;
	private Date startDate;
	private Date endDate;
	private AutoPaySource autoPaySource;
	private String externalAccountId;
	private Date expireDate;
	private String entityName;
	private String comments;
	private double version;
	private Double autoPayMaxWithdrawalAmount;
	private AutoPayMethod autoPayMethod;

	public AccountAutoPay getAccountAutoPay() {
		return accountAutoPay;
	}

	public void setAccountAutoPay(AccountAutoPay accountAutoPay) {
		this.accountAutoPay = accountAutoPay;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public AutoPaySource getAutoPaySource() {
		return autoPaySource;
	}

	public void setAutoPaySource(AutoPaySource autoPaySource) {
		this.autoPaySource = autoPaySource;
	}

	public String getExternalAccountId() {
		return externalAccountId;
	}

	public void setExternalAccountId(String externalAccountId) {
		this.externalAccountId = externalAccountId;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public Double getAutoPayMaxWithdrawalAmount() {
		return autoPayMaxWithdrawalAmount;
	}

	public void setAutoPayMaxWithdrawalAmount(Double autoPayMaxWithdrawalAmount) {
		this.autoPayMaxWithdrawalAmount = autoPayMaxWithdrawalAmount;
	}

	public AutoPayMethod getAutoPayMethod() {
		return autoPayMethod;
	}

	public void setAutoPayMethod(AutoPayMethod autoPayMethod) {
		this.autoPayMethod = autoPayMethod;
	}

	// Getters and setters
}

class AccountAutoPay {
	private String _link;
	private String accountAutoPayId;

	public String get_link() {
		return _link;
	}

	public void set_link(String _link) {
		this._link = _link;
	}

	public String getAccountAutoPayId() {
		return accountAutoPayId;
	}

	public void setAccountAutoPayId(String accountAutoPayId) {
		this.accountAutoPayId = accountAutoPayId;
	}

	// Getters and setters
}

class AutoPaySource {
	private String _link;
	private String autoPaySource;

	public String get_link() {
		return _link;
	}

	public void set_link(String _link) {
		this._link = _link;
	}

	public String getAutoPaySource() {
		return autoPaySource;
	}

	public void setAutoPaySource(String autoPaySource) {
		this.autoPaySource = autoPaySource;
	}

	// Getters and setters
}

class AutoPayMethod {
	private String _link;
	private String autoPayMethod;

	public String get_link() {
		return _link;
	}

	public void set_link(String _link) {
		this._link = _link;
	}

	public String getAutoPayMethod() {
		return autoPayMethod;
	}

	public void setAutoPayMethod(String autoPayMethod) {
		this.autoPayMethod = autoPayMethod;
	}

	// Getters and setters
}
