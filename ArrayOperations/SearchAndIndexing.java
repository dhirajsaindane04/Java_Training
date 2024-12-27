package ArrayOperations;
import java.util.Scanner;
public class SearchAndIndexing {
    public static void main(String[] args) {
        int [] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12}; 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int num = scanner.nextInt();
        for (int i=0; i<numbers.length; i++){
           if (numbers[i] == num){
            System.out.println("Number found is in index of : "+i);
            break;
           } 
        }
        scanner.close();
    }
    }
   
