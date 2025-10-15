package datastructure;

public class StringTest {

	public static void main(String[] args) {
		
	selectQuery("manolo", "d");
	}
	private static String selectQuery(String username, String email) {
		String querySQL =
				"select * from user where username = 'Manolo' and email = 'manolo@gmail.com'";
		querySQL = 
				"select * from user where username = ?";
		 char[] characters =querySQL.toCharArray();
		 
		 return "";
	}
}
