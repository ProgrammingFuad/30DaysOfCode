
public class Book {
	//Properties, fields, global variables
	String title;
	int pageCount;
	int ISBN;
	boolean isCheckedOut; //wether or not the bok is checked out or not 
	int dayCheckedOut= -1;
	
	// Constructor
	public Book(String bookTitle, int bookPages, int ISBN){
		this.title=bookTitle;
		this.pageCount= bookPages;
		this.ISBN= ISBN;
		isCheckedOut=false;
	}



	public String getTitle(){
		return this.title;
	}

	
	public int getBookPages(){
		return this.pageCount;
	}


	public int getISBN(){
		return this.ISBN;
	}  

	public boolean isCheckedOut(){
		return this.isCheckedOut;
	}
	

	public int dayCheckedOut(){
		return this.dayCheckedOut;
	}


	public void setIsCheckedOut(boolean status, int dayTaken){
		this.isCheckedOut=status;
		setDayCheckedOut(dayTaken);
		
	}
	
	private void setDayCheckedOut(int day){
		this.dayCheckedOut=day;
	}


}
