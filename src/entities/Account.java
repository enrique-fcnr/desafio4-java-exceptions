package entities;

import exception.BusinessException;

public class Account {
    //ATTRIBUTES//
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    //GETTERS AND SETTERS//
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
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    //CONSTRUCTORS//
    public Account(){}
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    //METHODS//
    public void deposit(Double amount){
    balance += amount;
    }
    public void withdraw(Double amount){
        validateWithdraw(amount);
        balance -= amount;
    }
    private void validateWithdraw(Double amount){
        if(getBalance() == 0){
            throw new BusinessException("Withdraw Error: There is no balance.");
        }
        if(amount > getWithdrawLimit()){
            throw new BusinessException("Withdraw Error: amount exceeds withdraw limit.");
        }
    }

}
