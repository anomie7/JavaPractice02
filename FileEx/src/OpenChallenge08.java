import java.awt.Label;
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
				
				int n;
				int[] r;
				do{
					System.out.println("������ ������ ������ ���ڿ� ������ ���ݺ��� �۾ƾ��մϴ�.");
					n = stdIn.nextInt();
					r = new int[n];
				}while(n > ch.length/2 || n < 0);
				
				ArrayList<Integer> randList = getRandNum(r, rand, ch, n);
				TreeMap<Character, Integer> correct = getTreeMap(ch, r);
				
				System.out.println(strList.get(c));
				for(int i : r){
					System.out.print(i + " ");
				}
				System.out.println();
				
				boolean isRun  = runGame(ch, randList, stdIn, correct);
				
				if(isRun){
					if(!isNext(stdIn)){
						break;
					}
				}else{
					break;
				}
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}catch (IOException e){
			System.out.println("����� ���� �߻�");
		}
	}

	private static TreeMap<Character, Integer> getTreeMap(char[] ch, int[] r) {
		// TODO Auto-generated method stub
		TreeMap<Character, Integer> c = new TreeMap<Character, Integer>();
		for(int i = 0; i < r.length; i++){
			c.put(ch[r[i]], r[i]);
		}
		return c;
	}

	private static boolean isNext(Scanner stdIn) {
		// TODO Auto-generated method stub
		System.out.println("Next(y/n)?");
		char tmp = stdIn.next().charAt(0);
		
		if(tmp == 'n'){
			return false;
		} else if(tmp == 'y'){
			System.out.println("���ο� ������ �����մϴ�.");
		}
		return true;
	}

	private static boolean runGame(char[] ch, ArrayList<Integer> randList, Scanner stdIn, TreeMap<Character, Integer> c) {
		printWord(ch, randList, c);
		
		for(int i = 0; i < 5; i++){
			char tmp = stdIn.next().charAt(0);
			if(c.get(tmp) != null){
				ch[c.get(tmp)] = tmp;
				randList.remove(c.get(tmp));
				c.remove(tmp);
			}
			printWord(ch, randList, c);
			if(c.size() == 0) return true;
		}
		System.out.println("5�� ���� �Ͽ����ϴ�.");
		return false;
	}

	private static ArrayList<Integer> getRandNum(int[] r, Random rand, char[] ch, int n) {
		// TODO Auto-generated method stub
		while(true){
			for(int i = 0; i < n; i++){
				r[i] = rand.nextInt(ch.length);
			}
			
			boolean isequal = true;
			label1 : 
			for(int i = 0; i < n-1; i++)
				for(int j = i+1; j < n; j++){
					if(r[i] == r[j]){
						isequal = false;
						break label1;
					}
				}
//			if(r[0] != r[1] && r[0] < r[1]) break;
			if(isequal) break;
		}
		
		for(int i = n-1; i > 0; i--){
			for(int j = 0; j < i; j++){
				if(r[j] > r[j+1]){
					int tmp = r[j];
					r[j] = r[j+1];
					r[j+1] = tmp;
				}
			}
		}
		ArrayList<Integer> randList = new ArrayList<Integer>();
		for(int i : r){
			randList.add(i);
		}
		return randList;
	}

	private static void printWord(char[] ch, ArrayList<Integer> randList, TreeMap<Character, Integer> c) {
		for(int i = 0; i < randList.size(); i++){
			ch[randList.get(i)] = '_';
		}
		for(char ch1 : ch){
			System.out.print(ch1);
		}
		System.out.println();
		
	}

}
