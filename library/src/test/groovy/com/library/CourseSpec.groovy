package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
when:"A course has title, code and department"

def course=new Course(title:'Web Systems Design',
		
	   	      code:'WSD101',
	
		      tutor:'Penny Collier',

		      department:'Computing',

		      description:'Lorem ipsum dolor sit amet consectetur')

then:"the to String method will merge them."

course.toString()=='Web Systems Design,WSD101,Penny Collier,Computing,Lorem ipsum dolor sit amet consectetur'
       
    }
}
