package com.meridian.ccb.model;

public class Account {

	private AccessGroup accessGroup;
	private AccountManagementGroup accountManagementGroup;
	private AccountPersons accountPersons;
	private AutoPay autoPay;
	private ServerMessage serverMessage;

	public AccessGroup getAccessGroup() {
		return accessGroup;
	}

	public void setAccessGroup(AccessGroup accessGroup) {
		this.accessGroup = accessGroup;
	}

	public AccountManagementGroup getAccountManagementGroup() {
		return accountManagementGroup;
	}

	public void setAccountManagementGroup(AccountManagementGroup accountManagementGroup) {
		this.accountManagementGroup = accountManagementGroup;
	}

	public AccountPersons getAccountPersons() {
		return accountPersons;
	}

	public void setAccountPersons(AccountPersons accountPersons) {
		this.accountPersons = accountPersons;
	}

	public AutoPay getAutoPay() {
		return autoPay;
	}

	public void setAutoPay(AutoPay autoPay) {
		this.autoPay = autoPay;
	}

	public ServerMessage getServerMessage() {
		return serverMessage;
	}

	public void setServerMessage(ServerMessage serverMessage) {
		this.serverMessage = serverMessage;
	}

}
