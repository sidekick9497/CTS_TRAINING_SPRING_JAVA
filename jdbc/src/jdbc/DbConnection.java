package jdbc;
import java.sql.*;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.Collection;
public class DbConnection {
	
	public void insertRecords()
	{
		String name;
		int age,mobile,branch;
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Enter name :");
			name = scanner.next();
			System.out.println("Enter age: ");
			
			age  = scanner.nextInt();
			System.out.println("enter mobile");
			
			mobile = scanner.nextInt();
			System.out.println("Enter brach Code");
			
			branch  = scanner.nextInt();
			String queryString = "INSERT INTO STUDENTS VALUES ('"+ name +"',"+age+","+mobile+"," +branch+")";
		try
		{
			Statement statement = getConnection().createStatement();
			int resultCode             = statement.executeUpdate(queryString);
			
			System.out.println("records updation "+ ((resultCode==1)?"success":"failed"));
		}
		catch (Exception e) {
			System.out.println(e);
		}
	
	}
	public void displayRecords()
	{
		String query = "SELECT * FROM STUDENTS";
		try {
			Statement statement = getConnection().createStatement();
			ResultSet result = statement.executeQuery(query);
			
			while(result.next())
			{
				System.err.println(result.getString(1) + " " + result.getInt(2) +" "+ result.getInt(3)+" "+ result.getInt(4));
				
				
			}
		
		} catch (Exception e) {
			
		}
		
		
	}
	public void deleteRecord()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name to delete");
		String name = scanner.next();
		
		String query = "DELETE FROM STUDENTS WHERE name= '"+name +"'";
		try {
			
			Statement statement = getConnection().createStatement();
			int resultCode = statement.executeUpdate(query);
			System.out.println("records updation "+ ((resultCode==1)?"success":"failed"));
			
		} 		
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
	
	private  Connection getConnection()
	{	Connection connection = null;
		try {
			//load the class           
			Class.forName("com.mysql.cj.jdbc.Driver");
			 
			  connection = DriverManager.getConnection("jdbc:mysql://localhost/studentdb?serverTimezone=UTC","root","");
			 
			 } catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}
	
	}

