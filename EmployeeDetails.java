package week2.day1;

public class EmployeeDetails {
 public void printEmployeeName(String empName,int empId)
 {
	 System.out.println("EMPLOYEE NAME = "+ empName);
	 System.out.println("EMPLOYEE ID = "+empId);
	 
 }
 public void getEmployeeAddress(String empAddress) {
	 System.out.println("EMPLOYEE ADDRESS = "+ empAddress);	 
 }
 public void printEmployeeSalary(double empSalary) {
	 System.out.println("EMPLOYEE SALARY = "+ empSalary);
 }
 public void printEmployeeMobileNumber(long mobNum) {
	 System.out.println("EMPLOYEE PHONE NUMBER ="+mobNum);
 }
 public static void main(String[] args) {
	EmployeeDetails data =new EmployeeDetails();
	data.printEmployeeName("DHANA", 1407);
	data.getEmployeeAddress("CHENNAI");
	data.printEmployeeSalary(50.000);
	data.printEmployeeMobileNumber(984756213018L);

}
}
