package encap;

public class Account {
	//Variables
private int id;
private double balance;
private String name;

//Constructor
Account(int id,String name,double balance){
	this.id=id;
	this.name=name;
	this.balance=balance;
}
//Getter
public int getId() {
	return id;
}
public double getBalance() {
	return balance;
}

public String getName() {
	return name;
}
//Setter
public void setId(int id) {
	this.id = id;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void setName(String name) {
	this.name = name;
}
//General method
void withdraw(double amount){
	if(this.balance-amount>5000)    //say minimum balance in bank is 5000
	{
		this.balance=this.balance-amount;
		
	}
	
}


}
