package com.library

class Librarian {

	String name

	String email

	String userName

	String password

	String telephone

	
	String toString(){
	
	"$name,$email,$telephone"

}
	
	static constraints={

	name()

	email()

	userName()

	password()

	telephone()
}
}

