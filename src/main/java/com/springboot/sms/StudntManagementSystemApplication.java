package com.springboot.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.sms.entity.Student;
import com.springboot.sms.repository.StudentRepository;

@SpringBootApplication
public class StudntManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudntManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student1=new Student("Harsh","Aryan","harsh@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2=new Student("awanish","kumar","awanish@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3=new Student("Rajat","kumar","rajat@gmail.com");
//		studentRepository.save(student3);
	}

}
