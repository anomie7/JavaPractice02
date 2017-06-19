package TeskSet02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TeskSet17_a{
    	public static void main(String[] args) {
		try {
			Scanner Filein = new Scanner(new File("MulArray.txt"));
			Scanner kb = new Scanner(System.in);

			int n = Filein.nextInt();
			int[][] arr = new int[n][n];

			while (Filein.hasNext()) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						arr[i][j] = Filein.nextInt();
					}
				}
			}

			
			int max = 0;
            for(int r = 0; r < n; r++)
                for(int i = n; i > 0; i--  ){ //����, n�� �ݺ���
                    for(int j = 0; j < i; j++ ){  //������ n-1�� �ݺ���
                        int row = r;
                        int col = j;
                        int cnt = 0;
                        int p = 1;
                        for(int k = j; k < i && isEqual(arr, row, col); k++ ){ //ù���� ���� �˻��ϴ� for��
                            cnt++;
                            col += p;
                        }
                         // i == 0 then col == 1, i == 5 then col == 6;
								// arr[][] has not index 6.
                        if(cnt == i-j)      
                        	col--;
                        
                        boolean isPrint = true;
                        int forCnt = 0, a = 1;
                        while(i-j-1 > forCnt && isEqual(arr, row, col)){ //ù��° ���� ������ ������ �簢���� �˻�, n-1��ŭ �˻�
                            
                        	if(i-j > n-r){
                        		isPrint = false;
                        		break;
                        	}
                            for(int k = j; k < i-a && isEqual(arr, row += p, col); k++){
                               cnt++;
                            }

                            if(!isEqual(arr, row, col)){
                                break;
                            }

                            p *= -1;

                            for(int k = j; k < i-a && isEqual(arr, row, col += p); k++){
                                cnt++;
                            }

                            if(!isEqual(arr, row, col)){
                                break;
                            }

                            a++;
                            forCnt++;
                        }
                        
                        if((i-j) * (i-j) == cnt){
                            System.out.println("true");
                            max = getMax(cnt, max);
                        }else if(!isPrint){
                        	System.out.println("��¾ȵ�");
                        }else {
                        	System.out.println("false");
                        } 
                    }
                }
            	Filein.close();
            	kb.close();
            	System.out.println("���� ū ���簢���� ����" + max);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
    public static boolean isEqual(int[][] a, int r, int c){
        if (a[r][c] != 1) {
            return false;
        }
            return true;
    }
    public static int getMax(int c, int max){
    	if(c > max)
    		return c;
    	return max;
    }
    
}