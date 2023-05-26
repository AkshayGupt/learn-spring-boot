package com.learnspringboot.crudapplication;

import com.learnspringboot.crudapplication.dao.StudentDAO;
import com.learnspringboot.crudapplication.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication
public class CrudapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudapplicationApplication.class, args);
	}

	// Executed after Springs beans have been created
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		// Lambda exp
		return runner -> {
			//createStudent(studentDAO);

			//findStudent(studentDAO);

			//findAllStudent(studentDAO);

			//removeStudent(studentDAO);

			removeAllStudents(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO){

		System.out.println("Creating student object...");
		Student tempStudent = new Student("Dinesh", "Singh",  "ramesh.singh@email.com");

		System.out.println("Saving the student"+tempStudent);
		studentDAO.save(tempStudent);

		System.out.println("Saved student successfully with Id: "+ tempStudent.getId());
	}

	private void findStudent(StudentDAO studentDAO){
		Student student = studentDAO.find("Ramesh");
		System.out.println(student);
	}

	private void findAllStudent(StudentDAO studentDAO){
		List<Student> allStudents = studentDAO.findAll();
		Consumer<Student> printStudent = student -> System.out.println(student);
		for(Student student: allStudents){
			printStudent.accept(student);
		}
	}

	private void removeStudent(StudentDAO studentDAO){
		String firstName = "Dinesh";
		studentDAO.delete(firstName);
	}

	private void removeAllStudents(StudentDAO studentDAO){
		int totalStudentsRemoved = studentDAO.deleteAll();
		System.out.println("Deleted "+totalStudentsRemoved+" students.");
	}
}
