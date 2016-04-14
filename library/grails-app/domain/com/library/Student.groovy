package com.library

class Student {

	Library library
	
	Book book

	String name

	String email

	String studentId

	Course course


	String toString(){

	"$name,$email,$studentId,$course"

}

    static constraints = {

	name()

	email()

	studentId()

	course()

    }
}
