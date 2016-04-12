package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {

when: "A Book has title, author and isbn"

def book=new Book(title:'Disney Animation The Illusion of Life',
			
		  author:'Ollie Johnston',

	  	  isbn:'89659',

		  student:'Robert Urry')

then: "the to String method will merge them."

book.toString()=='Disney Animation The Illusion of Life,Ollie Johnston,89659,Robert Urry'
    }
}
