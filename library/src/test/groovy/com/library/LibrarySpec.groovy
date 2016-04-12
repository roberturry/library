package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
when:"A Library has location, openingHours, book, student and librarian"

def library=new Library(location:'Sheffield',

			openingHours:'8:00am',

			book:'Example Book',

			student:'Robert Urry',

			librarian:'Neil Anderson')

then:"the to String method will merge them."

library.toString()=='Sheffield,8:00am,Example Book,Robert Urry,Neil Anderson'
    }
}
