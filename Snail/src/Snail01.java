

import java.util.Scanner;

/**
 * ����, 1707 
 * ������ �簢��
 * 
 * @author ADMIN
 *
 */
public class Snail01 {

    public static void main(String[] args) {
        
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        in.close();
        
        int n = 6;
        draw(n);
    }
    
    public static void draw(int n) {
        
        int[][] array = new int[n][n];
        
        int count = 1;        // �迭�� ��ǥ�� �ԷµǴ� ����
        int currentX = 0;    // ������ x ��ǥ
        int currentY = 0;    // ������ y ��ǥ
        int round = 0;        // ������ ����
        
        // n*n ���� count �� Ŀ���� ����
        while( count <= n*n ) {
            
            // �������� ���� ȸ���� 
            currentX = round;
            currentY = round;
            
            // ������
            for(currentY = round; currentY < n-round; currentY++) {
                array[currentX][currentY] = count++;
            }
            
            currentY--;
            currentX++;
            
            // �Ʒ�
            for(; currentX < n-round; currentX++) {
                array[currentX][currentY] = count++;
            }
            
            currentX--;
            currentY--;
            
            // ����
            for(; currentY >= round; currentY--) {
                array[currentX][currentY] = count++;
            }
            
            currentX--;
            currentY++;
            
            // ����
            for(; currentX >= round + 1; currentX--) {
                array[currentX][currentY] = count++;
            }
            
            round++;
        }
        
        
        for(int[] arr : array) {
            for(int a : arr) {
                System.out.printf("%2d ", a);
            }
            System.out.println();
        }
            
    }
}