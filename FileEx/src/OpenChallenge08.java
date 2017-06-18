import java.io.*;
import java.util.*;

public class OpenChallenge08 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		File f = new File("words.txt");
		BufferedReader in = null;
		
		ArrayList<String> strList = new ArrayList<String>();
		try {
			in = new BufferedReader(new FileReader(f));
			
			while(true){
				String tmp = in.readLine();
				if(tmp == null) break;
				strList.add(tmp);
			}
			
			
			while(true){
				int c = rand.nextInt(strList.size());
				char[] ch = strList.get(c).toCharArray();
				int[] r = new int[2];
				
				findRandNum(r, rand, ch);
				
				System.out.println(strList.get(c));
				System.out.println(r[0] + " " + r[1]);
				
				boolean isRun  = runGame(ch, r, stdIn);
				
				if(isRun){
					if(!isNext(stdIn)){
						break;
					}
				}else{
					break;
				}
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}catch (IOException e){
			System.out.println("입출력 예외 발생");
		}
	}

	private static boolean isNext(Scanner stdIn) {
		// TODO Auto-generated method stub
		System.out.println("Next(y/n)?");
		char tmp = stdIn.next().charAt(0);
		
		if(tmp == 'n'){
			return false;
		} else if(tmp == 'y'){
			System.out.println("새로운 게임을 시작합니다.");
		}
		return true;
	}

	private static boolean runGame(char[] ch, int[] r, Scanner stdIn) {
		boolean[] isRight = { false, false };
		printWord(ch, r, isRight);
		
		for(int i = 0; i < 5; i++){
			char tmp = stdIn.next().charAt(0);
			if(ch[r[0]] == tmp && !isRight[0]){
				isRight[0] = true;
			} else if(ch[r[1]] == tmp && !isRight[1]){
				isRight[1] = true;
			}
			printWord(ch, r, isRight);
			
			if(isRight[0] && isRight[1]){
				return true;				
			}
		}
		System.out.println("5번 실패 하였습니다.");
		return false;
	}

	private static void findRandNum(int[] r, Random rand, char[] ch) {
		// TODO Auto-generated method stub
		while(true){
			r[0] = rand.nextInt(ch.length);
			r[1] = rand.nextInt(ch.length);
			
			if(r[0] != r[1] && r[0] < r[1]) break;
		}
	}

	private static void printWord(char[] ch, int[] r, boolean[] isRight) {
		int a = 1, b = 1;
		if(isRight[0]){
			a = 0;
		} else{
			a = 1;
		}
		
		if(isRight[1]){
			b = 0;
		} else {
			b = 1;
		}
		
		for(int i = 0; i < r[0]; i++){
			System.out.print(ch[i]);
		}
		if(!isRight[0]) System.out.print("_");
		
		for(int i = r[0]+a; i < r[1]; i++){
			System.out.print(ch[i]);
		}
		
		if(!isRight[1]) System.out.print("_");
		
		for(int i = r[1]+b; i < ch.length; i++){
			System.out.print(ch[i]);
		}
		System.out.println();
	}

}
