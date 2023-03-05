package com.bridzelabz.employeepayrollJdbcDAY35;

	import java.sql.*;
	import java.util.ArrayList;
    import java.util.Date;
    import java.util.Iterator;
	import java.util.List;
	import java.util.Scanner;

	public class Manager {

	    public static void queryRunner(Employee employee) throws SQLException {

	        Connection con = MyConnection.connection();
	        String q = "select * from employee";
	        Statement statement = con.createStatement();
	        ResultSet resultSet = statement.executeQuery(q);

	        List<Employee> employeeList = new ArrayList<>();

	        while (resultSet.next()) {
	            employee = new Employee();
	            employee.setName(resultSet.getString(3));
	            employee.setPhone_number(resultSet.getString(1));
	            employee.setAddress(resultSet.getString(2));
	            employee.setGender(resultSet.getString(4));
	            employeeList.add(employee);
	        }
	        Iterator<Employee> iterator = employeeList.iterator();
	        while (iterator.hasNext()){
	            Employee next = iterator.next();
	            System.out.println(next);
	        }
	    }

	    public static Employee employee(){
	    	
		   
	        Scanner sc = new Scanner(System.in);
	        Employee employee = new Employee();
	        System.out.println("enter name");
	        employee.setName(sc.next());

	        System.out.println("enter phoneNumber");
	        employee.setPhone_number(sc.next());

	        System.out.println("enter address");
	        employee.setAddress(sc.next());

	        System.out.println("enter gender");
	        employee.setGender(sc.next());

	        System.out.println("enter date in =2006-07-04");
	        String string = sc.toString();

	        return employee;
	    }
	    public static boolean create() throws SQLException {
	        Connection con = MyConnection.connection();
	        Employee employee = employee();
	        boolean f = false;
	        try {
	            String q = "insert into employee(name, gender, phone_number, address,startDate)" +
	                    "values( ?,?,?,?,?)";
	            PreparedStatement pstp = con.prepareStatement(q);
	     
	            pstp.setString(1, employee.getPhone_number());
	            pstp.setString(2, employee.getAddress());
	            pstp.setString(3, employee.getName());
	            pstp.setString(4, employee.getGender());

	            pstp.executeUpdate();
	            f = true;
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	        return f;
	    }

}
