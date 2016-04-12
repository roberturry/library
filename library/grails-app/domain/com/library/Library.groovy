package com.library

class Library {

	String location

	String openingHours

	String book

	String student

	String librarian

static hasMany=[students: Student, books: Book, librarians: Librarian]
	
	String toString(){

	"$location,$openingHours,$book,$student,$librarian"
}

    static constraints = {

	location()

	openingHours()

	book()

	student()

	librarian()
    }
}
