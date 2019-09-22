package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity(name = "transfer_tbl")

public class transferEntity {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long Id;
	
	//Variables
	private String Name;
	private String SourcePassport;
	private String DestinationPassport; 
	private String DestinationBank;
	private String DestationCountry;
	private String AccountNumber;
	private double Amount;
	private String TransactionCode;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSourcePassport() {
		return SourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		SourcePassport = sourcePassport;
	}
	public String getDestinationPassport() {
		return DestinationPassport;
	}
	public void setDestinationPassport(String destinationPassport) {
		DestinationPassport = destinationPassport;
	}
	public String getDestinationBank() {
		return DestinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		DestinationBank = destinationBank;
	}
	public String getDestationCountry() {
		return DestationCountry;
	}
	public void setDestationCountry(String destationCountry) {
		DestationCountry = destationCountry;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public String getTransactionCode() {
		return TransactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		TransactionCode = transactionCode;
	}
		
	
}
