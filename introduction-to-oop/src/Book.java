
public class Book {
	private int noOfCopies;
	public void setNoOfCopies(int noOfCopies) {
		if(noOfCopies>0)
		this.noOfCopies = noOfCopies;
		
		
	}
	public void increasenoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies+howMuch);
	}
	public void decreasenoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies-howMuch);
	}
	
}
