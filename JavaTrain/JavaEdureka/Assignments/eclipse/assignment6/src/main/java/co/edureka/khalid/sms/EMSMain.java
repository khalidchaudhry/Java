package co.edureka.khalid.sms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.edureka.khalid.sms.configs.StudentServiceFactory;
import co.edureka.khalid.sms.dto.Student;
import co.edureka.khalid.sms.service.StudentService;

public class EMSMain {

	public static void main(String[] args) throws Exception{
		Integer id=null;
		String name="";
		String studentClass="";
		Float  marks=null;
		Student student=null;

		Scanner sc = new Scanner(System.in);
		StudentService service = StudentServiceFactory.getStudentService();		

		while(true) {
			System.out.println("1. New Student");
			System.out.println("2. Update Student");
			System.out.println("3. Search Student");
			System.out.println("4. Delete Student");
			System.out.println("5. All Students");
			System.out.println("6. Add Students in bulk");
			System.out.println("7. Exit");

			System.out.print("enter an option: ");
			int opt = sc.nextInt();

			switch(opt) {
			 case 1:				 
				System.out.print("enter student number: ");
				id = sc.nextInt();
				sc.nextLine();

				System.out.print("enter student name: ");
				name = sc.nextLine();

				System.out.print("enter student class: ");
				studentClass = sc.nextLine();

				System.out.print("enter student marks ");
				marks = sc.nextFloat();

				student = new Student(id, name,studentClass, marks);
				service.saveStudent(student);
				break;
			 case 2:
	    			System.out.print("enter student number: ");
					id = sc.nextInt();
					sc.nextLine();

					System.out.print("update student name: ");
					name = sc.nextLine();

					System.out.print("update student class: ");
					studentClass = sc.nextLine();

					System.out.print("update student marks ");
					marks = sc.nextFloat();
					
					Student currStudent = service.getStudentByID(id);
					if(currStudent != null)
					{
						currStudent.setStudentName(name);
						currStudent.setStudentClass(studentClass);
						currStudent.setStudentMarks(marks);
						service.updateStudent(currStudent);
					}
					else
						System.out.println("###--- No Matching Student Found!! ---###");
					break;			
			 case 3:
				System.out.print("search student with studentID =  ");
				id = sc.nextInt();
				student = service.getStudentByID(id);
				if(student != null)
					System.out.println(student);
				else
					System.out.println("###--- No Matching Student Found!! ---###");
				break;
			 case 4:
				System.out.print("enter the student number to delete: ");
				id = sc.nextInt();
				service.deleteStudentByID(id);
				break;
			 case 5:
				service.getAllStudent();
				break;
			 case 6:
				   List<Student> students=new ArrayList<Student>();
				   String moreStudents="Y";
				   while(moreStudents.equalsIgnoreCase("Y")) {
					   System.out.print("enter student number: ");
						id = sc.nextInt();
						sc.nextLine();

						System.out.print("enter student name: ");
					    name = sc.nextLine();

						System.out.print("enter student class: ");
						studentClass = sc.nextLine();

						System.out.print("enter student marks ");
						marks = sc.nextFloat();

						student = new Student(id, name,studentClass, marks);
					   students.add(student);
					   System.out.println("Add more students(Y/N)");
					   moreStudents=sc.next();;
				   }				 
					service.saveStudents(students);
					break;
			 case 7:
				sc.close();
				System.out.println("Application Designed & Developed by");
				System.out.println("\tKhalid @ edureka");
				System.exit(0); //to terminate the application
				break;
			 default:
				System.out.println("@@@--- INVALID OPTION --- TRY AGAIN ---@@@");				
			}
			System.out.println("--------------------------------------------------------------------------------");
		}//while		
		

	}

}
