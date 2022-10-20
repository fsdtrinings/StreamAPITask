package p4;

public class Transcation {

	private int amount;
	private String date;
	private String type; // deposit/ fund transfer/ATM widrawal/bill Payment
	public int getAmount() {
		return amount;
	}
	
	public Transcation(int amount, String date, String type) {
		super();
		this.amount = amount;
		this.date = date;
		this.type = type;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
