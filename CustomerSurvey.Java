import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0 ;
        int total = 0;
        int sum = 0;

        System.out.println("Enter ratings between 1 and 5 (enter -1 to stop):");
        while (true) {
            int rating = scan.nextInt(); 
            if (rating == -1) {
                break;
            }
            
            if (rating >= 1 && rating <= 5) {
                total++;       
                sum += rating;   
    
                if (rating == 1) {
                    count1++;
                } else if (rating == 2) {
                    count2++;
                } else if (rating == 3) {
                    count3++;
                } else if (rating == 4) {
                    count4++;
                } else if (rating == 5) {
                    count5++;
                    System.out.println("Excellent rating"); 
            } else {
                
                System.out.println("Error. Enter rating between 1 and 5.");
            }
        }

        
        double average = (total > 0) ? (double) sum / total : 0.0;

       
        System.out.println("Summary report:");
        System.out.println("Total number of ratings: " + total);
        System.out.println("Average rating: " + average);
        System.out.println("1-star ratings: " + count1);
        System.out.println("2-star ratings: " + count2);
        System.out.println("3-star ratings: " + count3);
        System.out.println("4-star ratings: " + count4);
        System.out.println("5-star ratings: " + count5);


        scan.close();
        }
	}
}

