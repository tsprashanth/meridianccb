package com.meridian.ccb.model;

import java.util.List;

public class AccountPersons {
	private List<DataItem> _data;

	public List<DataItem> get_data() {
		return _data;
	}

	public void set_data(List<DataItem> _data) {
		this._data = _data;
	}
}

class DataItem {
	private PersonId personId;
	private AccountRelationshipType accountRelationshipType;
	private String billAddressSource;
	private boolean isMainCustomer;
	private boolean isFinanciallyResponsible;
	private boolean isThirdPartyGuarantor;
	private boolean shouldReceiveCopyOfBill;
	private BillRouteType billRouteType;
	private String billFormat;
	private int numberOfBillCopies;
	private double version;
	private String customerPOId;
	private boolean receivesNotification;
	private String prefixSuffixName;
	private String prefixOrSuffix;
	private QuoteRouteType quoteRouteType;
	private boolean shouldReceiveCopyOfQuote;
	private String webAccess;
	private List<PersonAddressOverride> personAddressOverride;

	public PersonId getPersonId() {
		return personId;
	}

	public void setPersonId(PersonId personId) {
		this.personId = personId;
	}

	public AccountRelationshipType getAccountRelationshipType() {
		return accountRelationshipType;
	}

	public void setAccountRelationshipType(AccountRelationshipType accountRelationshipType) {
		this.accountRelationshipType = accountRelationshipType;
	}

	public String getBillAddressSource() {
		return billAddressSource;
	}

	public void setBillAddressSource(String billAddressSource) {
		this.billAddressSource = billAddressSource;
	}

	public boolean isMainCustomer() {
		return isMainCustomer;
	}

	public void setMainCustomer(boolean isMainCustomer) {
		this.isMainCustomer = isMainCustomer;
	}

	public boolean isFinanciallyResponsible() {
		return isFinanciallyResponsible;
	}

	public void setFinanciallyResponsible(boolean isFinanciallyResponsible) {
		this.isFinanciallyResponsible = isFinanciallyResponsible;
	}

	public boolean isThirdPartyGuarantor() {
		return isThirdPartyGuarantor;
	}

	public void setThirdPartyGuarantor(boolean isThirdPartyGuarantor) {
		this.isThirdPartyGuarantor = isThirdPartyGuarantor;
	}

	public boolean isShouldReceiveCopyOfBill() {
		return shouldReceiveCopyOfBill;
	}

	public void setShouldReceiveCopyOfBill(boolean shouldReceiveCopyOfBill) {
		this.shouldReceiveCopyOfBill = shouldReceiveCopyOfBill;
	}

	public BillRouteType getBillRouteType() {
		return billRouteType;
	}

	public void setBillRouteType(BillRouteType billRouteType) {
		this.billRouteType = billRouteType;
	}

	public String getBillFormat() {
		return billFormat;
	}

	public void setBillFormat(String billFormat) {
		this.billFormat = billFormat;
	}

	public int getNumberOfBillCopies() {
		return numberOfBillCopies;
	}

	public void setNumberOfBillCopies(int numberOfBillCopies) {
		this.numberOfBillCopies = numberOfBillCopies;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String getCustomerPOId() {
		return customerPOId;
	}

	public void setCustomerPOId(String customerPOId) {
		this.customerPOId = customerPOId;
	}

	public boolean isReceivesNotification() {
		return receivesNotification;
	}

	public void setReceivesNotification(boolean receivesNotification) {
		this.receivesNotification = receivesNotification;
	}

	public String getPrefixSuffixName() {
		return prefixSuffixName;
	}

	public void setPrefixSuffixName(String prefixSuffixName) {
		this.prefixSuffixName = prefixSuffixName;
	}

	public String getPrefixOrSuffix() {
		return prefixOrSuffix;
	}

	public void setPrefixOrSuffix(String prefixOrSuffix) {
		this.prefixOrSuffix = prefixOrSuffix;
	}

	public QuoteRouteType getQuoteRouteType() {
		return quoteRouteType;
	}

	public void setQuoteRouteType(QuoteRouteType quoteRouteType) {
		this.quoteRouteType = quoteRouteType;
	}

	public boolean isShouldReceiveCopyOfQuote() {
		return shouldReceiveCopyOfQuote;
	}

	public void setShouldReceiveCopyOfQuote(boolean shouldReceiveCopyOfQuote) {
		this.shouldReceiveCopyOfQuote = shouldReceiveCopyOfQuote;
	}

	public String getWebAccess() {
		return webAccess;
	}

	public void setWebAccess(String webAccess) {
		this.webAccess = webAccess;
	}

	public List<PersonAddressOverride> getPersonAddressOverride() {
		return personAddressOverride;
	}

	public void setPersonAddressOverride(List<PersonAddressOverride> personAddressOverride) {
		this.personAddressOverride = personAddressOverride;
	}

	// getters and setters
}

class PersonId {
	private String _link;
	private String personId;

	public String get_link() {
		return _link;
	}

	public void set_link(String _link) {
		this._link = _link;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	// getters and setters
}

class AccountRelationshipType {
	private String _link;
	private String accountRelationshipType;

	public String get_link() {
		return _link;
	}

	public void set_link(String _link) {
		this._link = _link;
	}

	public String getAccountRelationshipType() {
		return accountRelationshipType;
	}

	public void setAccountRelationshipType(String accountRelationshipType) {
		this.accountRelationshipType = accountRelationshipType;
	}

	// getters and setters
}

class BillRouteType {
	private String _link;
	private String billRouteType;

	public String get_link() {
		return _link;
	}

	public void set_link(String _link) {
		this._link = _link;
	}

	public String getBillRouteType() {
		return billRouteType;
	}

	public void setBillRouteType(String billRouteType) {
		this.billRouteType = billRouteType;
	}

	// getters and setters
}

class QuoteRouteType {
	private String _link;
	private String quoteRouteType;

	public String get_link() {
		return _link;
	}

	public void set_link(String _link) {
		this._link = _link;
	}

	public String getQuoteRouteType() {
		return quoteRouteType;
	}

	public void setQuoteRouteType(String quoteRouteType) {
		this.quoteRouteType = quoteRouteType;
	}

	// getters and setters
}

class PersonAddressOverride {
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private String city;
	private String streetNumber1;
	private String streetNumber2;
	private String county;
	private String postal;
	private String houseType;
	private String taxVendorGeographicalCode;
	private boolean isInCityLimit;
	private State state;
	private Country country;
	private double version;

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreetNumber1() {
		return streetNumber1;
	}

	public void setStreetNumber1(String streetNumber1) {
		this.streetNumber1 = streetNumber1;
	}

	public String getStreetNumber2() {
		return streetNumber2;
	}

	public void setStreetNumber2(String streetNumber2) {
		this.streetNumber2 = streetNumber2;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public String getTaxVendorGeographicalCode() {
		return taxVendorGeographicalCode;
	}

	public void setTaxVendorGeographicalCode(String taxVendorGeographicalCode) {
		this.taxVendorGeographicalCode = taxVendorGeographicalCode;
	}

	public boolean isInCityLimit() {
		return isInCityLimit;
	}

	public void setInCityLimit(boolean isInCityLimit) {
		this.isInCityLimit = isInCityLimit;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	// getters and setters
}

class State {
	private String _link;
	private String state;

	public String get_link() {
		return _link;
	}

	public void set_link(String _link) {
		this._link = _link;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// getters and setters
}

class Country {
	private String _link;
	private String country;

	public String get_link() {
		return _link;
	}

	public void set_link(String _link) {
		this._link = _link;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// getters and setters
}
