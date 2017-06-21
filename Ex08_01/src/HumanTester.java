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
				System.out.print("사람 수 : ");
				
				n = stdIn.nextInt();
				h = new Human[n];
				
				for(int i = 0; i < n; i++){
					h[i] = new Human();
				}
				
			} else if(str.equals("add")){
				selectId();
				System.out.print("이름, 키, 몸무게 순으로 입력해주세요.");
				h[sel].setAll(stdIn.next(), stdIn.nextInt(), stdIn.nextDouble() );
				
			} else if(str.equals("list")){
				bubbleSort();
				System.out.println("체중이 높은 순서대로 출력합니다.");
				for(Human j : h){
					System.out.println(j.getAll());
				}
			}else if(str.equals("check")){
				selectId();
				chkWeight(h[sel]);
			}else if(str.equals("eat")){
				selectId();
				String[] food = new String[]{"짜장면", "볶음밥", "짬뽕", "라면", "치즈케이크", 
											"갈비탕", "부대찌개", "칼국수", "삼겹살", "쌀밥"};
				String str1 = "음식 선택: ";
				movement(food, str1, h);
			}else if(str.equals("exercise")){
				selectId();
				String[] exercise = new String[]{"등산", "조깅", "수영", "에어로빅", "스키", 
												"볼링", "배구", "야구", "수상스키", "줄넘기"};
				String str2 = "운동 선택 : ";
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
	
	public static void selectId(){
		do{
			System.out.print("아이디 입력 : ");
			sel = stdIn.nextInt();	
		}while(sel < 0 || sel >= n);
	}

}
