package com.library

class Book {

	Library library

	String title

	String author

	String isbn

	Date dateBorrowed

	Date returnDate

	Student student


	String toString(){

	"$title,$author,$isbn,$student"

}

    static constraints = {

	title()

	author()

	isbn()

	dateBorrowed()

	returnDate()

	student()
    }
}
