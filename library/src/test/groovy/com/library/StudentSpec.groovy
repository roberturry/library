package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
when: "A Student has name, email, studentId and course"

def student=new Student(name:'Robert Urry',
			
			email:'robert_urry@live.co.uk',

			studentId:'b2024136',

			course:'Interactive Media with Animation')

then:"the to String method will merge them."

student.toString()=='Robert Urry,robert_urry@live.co.uk,b2024136,Interactive Media with Animation'

    }
}
