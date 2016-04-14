package com.library

class Course {

	Student student

	String title

	String code

	String tutor

	String department

	String description

	String toString(){

	"$title,$code,$tutor,$department,$description"

}

    static constraints = {


	title()

	code()

	tutor()

	department()

	description maxSize:5000
	
    }
}
