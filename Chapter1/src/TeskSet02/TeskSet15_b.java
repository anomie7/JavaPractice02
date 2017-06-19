package TeskSet02;

import java.util.Random;
import java.util.Scanner;

public class TeskSet15_b {
	
    static int len = 0;
	static int max = 0;
    static int k;
    static int sp = 0, ep = 0;
    static int[] arr;
    
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		
		arr = new int[20];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = rand.nextInt(21)-10;
		}
		
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		for(int i = arr.length-1; i > 0; i--){ //endPoint �����ϴ� for statement
			for(int j = 0; j < i; j++){        //start Point �����ϴ� for statement
				
                getDecending(j, i);

                getAcending(i); 

                getMax(j);
				
				len = 0;
			}
		}
		
		printArray();
		
		kb.close();
	}
	
    public static void printArray() {
    	System.out.println("���� ������ ���̴� " + (max+1) );
		System.out.print("���� ������ �迭�� ");
		for(int i = sp; i <= ep; i++)
			System.out.print(arr[i] + " ");
	}

	public static void getDecending(int j, int i){
        for(k = j; k < i; k++){        //���������� ������ �����˻�
                    if(arr[k] > arr[k+1]){
                        len++;
                    } else{
                        return;
                    }
                }
    }
	
    public static void getAcending(int i){
        for(; k < i; k++){
            if(k != 0 && arr[k] < arr[k+1]){
                len++;
            } else{
                return;
            }
        }
    }
    
    public static void getMax(int j){
        if( len > max){ //getMax(j, k,len) max�� static ������ ��ȯ
            max = len;
            sp = j;
            ep = k;
        }
    }

}
