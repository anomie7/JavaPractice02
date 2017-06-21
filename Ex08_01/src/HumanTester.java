import java.util.Scanner;

public class HumanTester {
	
	static Scanner stdIn = new Scanner(System.in);
	static int sel = 0;
	static Human[] h;
	static int n;
	
	public static void main(String[] args){
		while(true){
			System.out.print("$ ");
			String str = stdIn.next();
			
			if(str.equals("create")){
				System.out.print("��� �� : ");
				
				n = stdIn.nextInt();
				h = new Human[n];
				
				for(int i = 0; i < n; i++){
					h[i] = new Human();
				}
				
			} else if(str.equals("add")){
				selectId();
				System.out.print("�̸�, Ű, ������ ������ �Է����ּ���.");
				h[sel].setAll(stdIn.next(), stdIn.nextInt(), stdIn.nextDouble() );
				
			} else if(str.equals("list")){
				bubbleSort();
				System.out.println("ü���� ���� ������� ����մϴ�.");
				for(Human j : h){
					System.out.println(j.getAll());
				}
			}else if(str.equals("check")){
				selectId();
				chkWeight(h[sel]);
			}else if(str.equals("eat")){
				selectId();
				String[] food = new String[]{"¥���", "������", "«��", "���", "ġ������ũ", 
											"������", "�δ��", "Į����", "����", "�ҹ�"};
				String str1 = "���� ����: ";
				movement(food, str1, h);
			}else if(str.equals("exercise")){
				selectId();
				String[] exercise = new String[]{"���", "����", "����", "����κ�", "��Ű", 
												"����", "�豸", "�߱�", "����Ű", "�ٳѱ�"};
				String str2 = "� ���� : ";
				movement(exercise, str2, h);
			}else if(str.equals("exit")){
				break;
			}
		}
	}
	
	public static void bubbleSort() {
		
		for(int i = h.length-1; i > 0; i--){
			for(int j = 0; j < i; j++){
				if(h[j].getWeight() < h[j+1].getWeight()){
					Human tmp = h[j];
					h[j] = h[j+1];
					h[j+1] = tmp;
				}
			}
		}
	}

	public static void movement(String[] food, String str1, Human[] h) {
		
			do{
			
			int n = 0;
			
			for(String i : food){
				System.out.print(n + "--" + i + " ");
				n++;
			}
			System.out.println();
			
			System.out.print(str1);
			int foodNum = stdIn.nextInt();
			
			h[sel].eat(foodNum);
			
			System.out.println("����Ͻðڽ��ϱ�? [1---Yes/0---No]");
			
		}while(isStop(stdIn.nextInt()));
	}

	public static boolean isStop(int n) {
		if(n == 1){
			return true;			
		}else{
			return false;
		}
	}
	
	public static void chkWeight(Human h){
		do{
			System.out.print("[ü��Ȯ�� ---1/ �񸸵� Ȯ��---0]");
			
			if(isStop(stdIn.nextInt())){
				System.out.println("����� ü���� " + h.getWeight() + "kg");			
			}else{
				System.out.println("����� �񸸵��� " + h.toBMI());
			}
			
			System.out.println("����Ͻðڽ��ϱ�? [1---Yes/0---No]");
		    }while(isStop(stdIn.nextInt() ) );
	}
	
	public static void selectId(){
		do{
			System.out.print("���̵� �Է� : ");
			sel = stdIn.nextInt();	
		}while(sel < 0 || sel >= n);
	}

}
