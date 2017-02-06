
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Here ye Here ye : important announcement");
		System.out.println("Hello World");
		System.out.println("Good bye");
		
		System.out.println("This should cause merge conflict");
		System.out.println("Now it should");
                
                Date dateFormat = new SimpleDateFormat("MM/dd/YYYY");
		Date currDate = new Date();
		System.out.println(dateFormat.format(currDate));

		
	}
}
