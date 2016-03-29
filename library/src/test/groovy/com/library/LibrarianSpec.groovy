package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
when:"A Librarian has a name, email or telephone"

def librarian=new Librarian(name:'Neil Anderson',

			    email:'neilanderson@gmail.com',

			    userName:'b2924830',

			    password:'password12345',

			    telephone:'09478463291')

then:"the to String method will merge them."

librarian.toString()=='Neil Anderson,neilanderson@gmail.com,b2924830,password12345,09478463291'
    }
}
