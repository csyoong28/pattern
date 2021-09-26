package com.soonyoong.pattern;

public class T01_BuilderPattern {
	public static void main(String[] args) {
		
		//for mutable object
		BankAccount account = new BankAccount.Builder(1234L)
				.withOwner("Marge")
				.atBranch("Springfield")
				.openingBalance(100)
				.atRate(2.5).build();	
		BankAccount anotherAccount = new BankAccount.Builder(4567L)
				.withOwner("Homer")
				.atBranch("Springfield")
				.openingBalance(100)
				.atRate(2.5)
				.build();
		System.out.println(account);
		System.out.println(anotherAccount);
		
		//for immutable object
		User user1 = new User.UserBuilder("Lokesh", "Gupta")
		        .age(30)
		        .phone("1234567")
		        .address("Fake address 1234")
		        .build();		     
		System.out.println(user1);		     
		User user2 = new User.UserBuilder("Jack", "Reacher")
		        .age(40)
		        .phone("5655")
		        //no address
		        .build();		    
		System.out.println(user2);
		User user3 = new User.UserBuilder("Super", "Man")
		        //No age
		        //No phone
		        //no address
		        .build();		     
		System.out.println(user3);		
	}
}
