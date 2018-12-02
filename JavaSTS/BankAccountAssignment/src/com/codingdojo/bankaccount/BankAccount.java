package com.codingdojo.bankaccount;
import java.util.*;

public class BankAccount {

	private String accountNumber;
	public String getAccountNumber() {
		return accountNumber;
	}

	private double checkingBalance;
	private double savingBalance;
	private static int  numbersOfAccount = 0;
	public  static double totalAmount =0;
	
	public  BankAccount() {
		this.accountNumber=generateRand();

		BankAccount.numbersOfAccount++;
		

	}

	
	public double getCheckingBalance() {

		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}



	public static int AccountCount() {
		numbersOfAccount++;
		System.out.println("User has Created the account"+ numbersOfAccount);
		return numbersOfAccount;

	}
	

	private String generateRand() {
       StringBuilder builder = new StringBuilder();
        Random r = new Random();
        int low = 0;
        int high = 10;
        for (int i = 0; i <10; i++) {
            int result = r.nextInt(high - low) + low;
            builder.append(result);
                    }
       
        return builder.toString();
    }

	
	public  double deposite( String  wichAccount ,double depositAmount) {

		if (wichAccount =="checking" || wichAccount =="saving") {
			if(wichAccount =="checking") {
				this.checkingBalance = this.checkingBalance  + depositAmount;
			}
			if (wichAccount=="saving") {
				this.savingBalance =this.savingBalance+ depositAmount;
			}
			BankAccount.totalAmount += depositAmount;

		}else {
			System.out.print("Did not Make any Deposit");
			System.out.println();
		}



		return this.totalAmount;
	}

	public double withdraw( double withd) {
		if (withd > this.checkingBalance) {
			System.out.println("we are afraid to say that you donot have enogh money");
		}else {
			
			checkingBalance=  checkingBalance-withd;
			System.out.println("here is you money sir and madam you draw the money =  " +withd);
			System.out.println(checkingBalance);
		}

		return this.checkingBalance;
	}
	
	
	
}




