public class Account {
	private String name;
	private String no;
	private long balance;
	
	public Account(String name, String no, long balance){
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public long getBalance(){
		return balance;
	}
	public void deposit(long k){
		balance += k;
	}
	public void withdraw(long k){
		balance -= k;
	}
}