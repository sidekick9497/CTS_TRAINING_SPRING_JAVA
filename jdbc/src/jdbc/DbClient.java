package jdbc;


public class DbClient {
	public static void main(String[] args) {
		System.out.println("          welcome to DB");
		DbConnection dbConnection = new DbConnection();

		//dbConnection.insertRecords();
		dbConnection.displayRecords();
		dbConnection.deleteRecord();
		dbConnection.displayRecords();
	}
}
