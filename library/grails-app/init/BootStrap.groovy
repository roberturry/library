import com.library.*

class BootStrap {

    def init = { servletContext ->

	def book1 = new Book(title:'Disney Animation The Illusion of Life',
			
		 	     author:'Ollie Johnston',

	  	 	     isbn:'89659',

		             dateBorrowed:new Date('29/03/2016'),

		  	     returnDate:new Date('31/03/2016'),

		 	      student:'Robert Urry').save()


	def course1 = new Course(title:'Web Systems Design',
		
	   	      		code:'WSD101',
	
		   		tutor:'Penny Collier',

		      		department:'Computing',
		
		      		description:'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin lacinia ipsum lorem, non hendrerit felis ornare quis. Suspendisse eros felis, blandit a suscipit tempus, accumsan vel enim. Fusce pharetra tempus felis ut feugiat. Phasellus porttitor, urna sed auctor aliquet').save()


	def librarian1 = new Librarian(name:'Neil Anderson',

			    	       email:'neilanderson@gmail.com',

			               userName:'b2924830',

			               password:'password12345',

			               telephone:'09478463291').save()


	def library1 = new Library(location:'Sheffield',

				   openingHours:'8:00am',

				   book:'Example Book',

				   student:'Robert Urry',

				   librarian:'Neil Anderson').save()


	def student1 = new Student(name:'Robert Urry',
			
				   email:'robert_urry@live.co.uk',
 
				   studentId:'b2024136',

				   course:'Interactive Media with Animation').save()

    }
    def destroy = {
    }
}	
