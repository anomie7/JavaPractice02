import java.util.Scanner;


public class Ex08_01 {
	static int sel = 0;
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] args){

		System.out.print("사람 수 : ");
		int n = stdIn.nextInt();
		
		Human[] h = new Human[n];
		
		System.out.println("이름, 키, 몸무게 순으로 입력해주세요.");
		
		for(int i = 0; i < n; i++){
			h[i] = new Human(stdIn.next(), stdIn.nextInt(), stdIn.nextDouble() );
		}
		
		for(Human j : h){
			System.out.println(j.getAll());
		}
		
		
		System.out.print("아이디 선택 : ");
		sel = stdIn.nextInt();
		
		System.out.println("당신의 체중은 " + h[sel].getWeight() + "kg");
		
		
		System.out.println("음식을 섭취하겠습니다.");
		String[] food = new String[]{"짜장면", "볶음밥", "짬뽕", "라면", "치즈케이크", "갈비탕", "부대찌개", "칼국수", "삼겹살", "쌀밥"};
		String str1 = "음식 선택: ";
		
		movement(food, str1, h);
		
		chkWeight(h[sel]);
			
		if(h[sel].toBMI() == "비만" || h[sel].toBMI() == "과체중"){
			System.out.println("운동을 하셔야합니다.");
			
			String[] exercise = new String[]{"등산", "조깅", "수영", "에어로빅", "스키", "볼링", "배구", "야구", "수상스키", "줄넘기"};
			String str2 = "운동 선택 : ";
			
			movement(exercise, str2, h);
			
		}else if(h[sel].toBMI() == "체중 부족"){
			System.out.println("더 드셔야합니다.");
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
			
			System.out.println("계속하시겠습니까? [1---Yes/0---No]");
			
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
			System.out.print("[체중확인 ---1/ 비만도 확인---0]");
			
			if(isStop(stdIn.nextInt())){
				System.out.println("당신의 체중은 " + h.getWeight() + "kg");			
			}else{
				System.out.println("당신의 비만도는 " + h.toBMI());
			}
			
			System.out.println("계속하시겠습니까? [1---Yes/0---No]");
		    }while(isStop(stdIn.nextInt() ) );
	}

}
