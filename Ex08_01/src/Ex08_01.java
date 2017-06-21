import java.util.Scanner;


public class Ex08_01 {
	static int sel = 0;
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] args){

		System.out.print("��� �� : ");
		int n = stdIn.nextInt();
		
		Human[] h = new Human[n];
		
		System.out.println("�̸�, Ű, ������ ������ �Է����ּ���.");
		
		for(int i = 0; i < n; i++){
			h[i] = new Human(stdIn.next(), stdIn.nextInt(), stdIn.nextDouble() );
		}
		
		for(Human j : h){
			System.out.println(j.getAll());
		}
		
		
		System.out.print("���̵� ���� : ");
		sel = stdIn.nextInt();
		
		System.out.println("����� ü���� " + h[sel].getWeight() + "kg");
		
		
		System.out.println("������ �����ϰڽ��ϴ�.");
		String[] food = new String[]{"¥���", "������", "«��", "���", "ġ������ũ", "������", "�δ��", "Į����", "����", "�ҹ�"};
		String str1 = "���� ����: ";
		
		movement(food, str1, h);
		
		chkWeight(h[sel]);
			
		if(h[sel].toBMI() == "��" || h[sel].toBMI() == "��ü��"){
			System.out.println("��� �ϼž��մϴ�.");
			
			String[] exercise = new String[]{"���", "����", "����", "����κ�", "��Ű", "����", "�豸", "�߱�", "����Ű", "�ٳѱ�"};
			String str2 = "� ���� : ";
			
			movement(exercise, str2, h);
			
		}else if(h[sel].toBMI() == "ü�� ����"){
			System.out.println("�� ��ž��մϴ�.");
			movement(food, str1, h);
		}	
			
		chkWeight(h[sel]);
				
		stdIn.close();
		
		bubbleSort(h);
		
		for(Human j : h){
			System.out.println(j.getAll());
		}
	}

	public static void bubbleSort(Human[] h) {
		
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

}
