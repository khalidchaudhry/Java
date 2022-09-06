package co.edureka.khalid.ems;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.khalid.ems.entity.Employee;
import co.edureka.khalid.ems.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee-beans.xml");

		int eno=0;		
		Scanner sc = new Scanner(System.in);

		EmployeeService service = (EmployeeService) context.getBean("employee-service");		

		while(true) {
			System.out.println("1. New Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Search Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. All Employees");
			System.out.println("6. Exit");

			System.out.print("enter an option: ");
			int opt = sc.nextInt();

			switch(opt) {
			 case 1:
				System.out.print("enter employee number: ");
				eno = sc.nextInt();
				sc.nextLine();

				System.out.print("enter employee name: ");
				String name = sc.nextLine();

				System.out.print("enter employee salary: ");
				float sal = sc.nextFloat();

				Employee emp = new Employee(eno, name, sal);
				service.saveEmployee(emp);
				break;
			 case 2:
				System.out.println("update employee-- you write logic"); 
				break;
			 case 3:
				System.out.print("search employee with empno =  ");
				eno = sc.nextInt();
				emp = service.getEmployeeByNo(eno);
				if(emp != null)
					System.out.println(emp);
				else
					System.out.println("###--- No Matching Employee Found!! ---###");
				break;
			 case 4:
				System.out.print("enter the employee number to delete: ");
				eno = sc.nextInt();
				service.deleteEmployee(eno);
				break;
			 case 5:
				service.getAllEmployees(); 
				break;
			 case 6:
				sc.close();
				System.out.println("Application Designed & Developed by");
				System.out.println("\tteam @ edureka");
				System.exit(0); //to terminate the application
				break;
			 default:
				System.out.println("@@@--- INVALID OPTION --- TRY AGAIN ---@@@");				
			}
			System.out.println("--------------------------------------------------------------------------------");
		}//while		
	}

}
