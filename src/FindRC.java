import java.util.Scanner;

class FindRC{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row= sc.nextInt();
        int column=sc.nextInt();
        int number[][]=new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                number[i][j] = sc.nextInt();
            }
        }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(number[i][j]+" ");
                }
                System.out.println();

            }
        }
    }
