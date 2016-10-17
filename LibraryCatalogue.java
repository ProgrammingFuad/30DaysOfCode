import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

	
	Map<String,Book> bookCollection= new HashMap<String,Book>();
	int currentDay=0;
	int lengthOfCheckoutPeriod=7;
	double initialLateFee=0.50;
	double feePerLateDay=1.0;
	
	
	//Constructors
	public LibraryCatalogue(Map<String,Book>collection){
		
		this.bookCollection= collection;
	}
	
	
	public LibraryCatalogue(Map<String,Book>collection, int lengthOfCheckoutPeriod, double initialLateFee, double feePerLateDay){
		this.bookCollection= collection;
		this.lengthOfCheckoutPeriod=lengthOfCheckoutPeriod;
		this.initialLateFee=initialLateFee;
		this.feePerLateDay= feePerLateDay;
	}
	
	//Getters
	public int getCurrentDay(){
		return currentDay;
	}
	
	public double getInitialLateFee(){
		return initialLateFee;
	}
	
	public double getFeePerLateDay(){
		return feePerLateDay;
	}
	
	public int getLengthofCheckout(){
		return lengthOfCheckoutPeriod;
	}
	
	
	public Map<String,Book> getBookCollection(){
		return this.bookCollection;
	}
	
	public Book getBook(String bookTitle){
		return getBookCollection().get(bookTitle);
	}
	
	//Setters
	
	public void nextDay(){
		currentDay++;
	}
	
	public void setDay(int day){
		this.currentDay=day;
	}
	
	public void checkOut(String title){
		Book book= getBook(title);
		if(book.isCheckedOut()){
			sorryBookAllreadyCheckedOut(book);
		}
		else{
			book.setIsCheckedOut(true, currentDay);
			System.out.println("You just checked out " + title+" . It is due on day "+ (getCurrentDay()+getLengthofCheckout())+ " .");
		}
	}
	
	public void returnBook(String title){
		Book book= getBook(title);
		int daysLate= currentDay- (book.dayCheckedOut + getLengthofCheckout());
		if(daysLate>0){
			System.out.println("You owe the library $"+(getInitialLateFee()+ daysLate*getFeePerLateDay()) +" because your book is "+ daysLate+ " days overdue.");
		}
		else{
			System.out.println("Book Returned");
			book.setIsCheckedOut(false, -1);
		}
	}
	
	public void sorryBookAllreadyCheckedOut(Book book){
		System.out.println("Sorry " +book.getTitle() +" is already checked out. it should be back " +(book.dayCheckedOut()+ getLengthofCheckout()) +" days from now.");
	}
	
	
	public static void main(String[] args) {
		
		Book abdi = new Book("SomaliCraze", 300, 1);
		Book selma = new Book("LiberiaSinceDay1", 150, 2);
		Book elvin= new Book("KenyattiPride", 22, 4);
		Book harry= new Book("HarryPotter", 22, 7);
		Book hersi= new Book("LightUp", 900, 9);
		
		Map<String,Book>bookCollection = new HashMap<String,Book>();
		
		bookCollection.put("SomaliCraze", abdi);
		bookCollection.put("LiberiaSinceDay1", selma);
		bookCollection.put("KenyattiPride", elvin);
		bookCollection.put("HarryPotter", harry);
		bookCollection.put("LightUp", hersi);
		
		LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
		
		lib.checkOut("LightUp");
		lib.nextDay();
		lib.nextDay();
		lib.checkOut("LightUp");
		lib.setDay(17);
		lib.returnBook("LightUp");
		lib.checkOut("KenyattiPride");
		lib.nextDay();
		lib.returnBook("KenyattiPride");
		
		
		
		
		
		
	}

}
