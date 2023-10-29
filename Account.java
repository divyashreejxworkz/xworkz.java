package com.xworkz.darara1.things;
import com.xworkz.darara1.things.RD;
public class Account {
private String bankAddress;
private long accounNumber;
private String ifcCode;
private RD rd;
private FD fd;
public Account()
{
	System.out.println("no-arguments");
}
public Account(String bankAddress, long accounNumber, String ifcCode, RD rd, FD fd) {
	System.out.println("All arguments");
	this.bankAddress = bankAddress;
	this.accounNumber = accounNumber;
	this.ifcCode = ifcCode;
	this.rd = rd;
	this.fd = fd;
}
public String getBankAddress() {
	return bankAddress;
}
public void setBankAddress(String bankAddress) {
	this.bankAddress = bankAddress;
}
public long getAccounNumber() {
	return accounNumber;
}
public void setAccounNumber(long accounNumber) {
	this.accounNumber = accounNumber;
}
public String getIfcCode() {
	return ifcCode;
}
public void setIfcCode(String ifcCode) {
	this.ifcCode = ifcCode;
}
public RD getRd() {
	return rd;
}
public void setRd(RD rd) {
	this.rd = rd;
}
public FD getFd() {
	return fd;
}
public void setFd(FD fd) {
	this.fd = fd;
}

}
