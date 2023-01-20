import java.util.Scanner;

public class TestDep {

	public static void main(String[] args) {
		
		
		Department department=new Department();
		
		System.out.println("Enter Department Name:");     
		Scanner scanner = new Scanner(System.in);
		department.DepName=scanner.nextLine();
		System.out.println(department.DepName);
		
		System.out.println("Enter Total Students:");
		department.Total_Students=scanner.nextInt();
		System.out.println(department.Total_Students);
		
		System.out.println("Enter Total Staffs:");
		department.Total_Staffs=scanner.nextInt();
		System.out.println(department.Total_Staffs);
		
		System.out.println("Enter HOD Name:");
		Scanner scanner1 = new Scanner(System.in);
		department.HodName=scanner1.nextLine();
		System.out.println(department.HodName);
		
		System.out.println("Enter College Name:");
		department.CollegeName=scanner1.nextLine();
		System.out.println(department.CollegeName);
		
		
	}
}
