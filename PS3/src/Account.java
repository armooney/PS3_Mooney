import java.util.Date;

public class Account {
private int id;
private double balance;
private double annualInterestRate;
private Date dateCreated;
//create constructors for default and specific cases
Account(){
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}
	Account(int newId, double newBalance, double newannualInterestRate){
		//validate newBalance is greater than 0.0;
		if(newBalance > 0.0){
			id = newId;
			balance = newBalance;
			annualInterestRate = newannualInterestRate;
			}
		else {
			throw new InsufficientFundsException("Error");
		}
	}
//getters and setters	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
//method for withdrawing money from account	
	public double withdraw (double amount){
		if (amount < balance){
			balance = balance - amount;
			return balance;
		}
		else{
			throw new InsufficientFundsException("Error");
		}
	}
//method for depositing money into account	
	public double deposit(double amount){
		balance = balance + amount;
		return balance;
	}
}	
