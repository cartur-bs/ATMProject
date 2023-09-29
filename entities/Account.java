package entities;

import model.exceptions.Exceptions;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double limit;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getLimit() {
		return limit;
	}

	public Account(Integer number, String holder, Double balance, Double limit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.limit = limit;
	}

	public void deposit(Double amount) {
		balance = balance + amount;
	}

	public void withdraw(Double amount) throws Exceptions {
		if (amount > getBalance())
			throw new Exceptions("Not enough balance, try an amount equal or bellow $" + this.balance);
		else
			balance = balance - amount;
	}

	public void limit(Double amount) throws Exceptions {
		if (amount > getLimit())
			throw new Exceptions("The amount inserted exceeds your  withdraw limit");
	}
}
