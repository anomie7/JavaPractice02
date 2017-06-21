
public class Account {
		//클래스 변수 (정적 필드) static field
		private static int counter = 0; 
		
		//인스턴스 변수 (비정적 필드) non-static field
		private String name;
		private String no;
		private long balance;
		private int id; 	//인스턴스별 식별번호(넘버링)
		
		public Account(String name, String no, long balance){
			this.name = name;
			this.no = no;
			this.balance = balance;
			this.id = ++counter;
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
		public int getId(){
			return id;
		}
		public void deposit(long k){
			balance += k;
		}
		public void withdraw(long k){
			balance -= k;
		}
	}



