package variables_datatypes;

import java.util.Scanner;

public class BillingOfItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of a pencil: ");
        float pencilcost = sc.nextFloat();
        System.out.print("Enter cost of a pen: ");
        float pencost = sc.nextFloat();
        System.out.print("Enter cost of a eraser: ");
        float erasercost = sc.nextFloat();


        float totalBill = pencilcost + pencost + erasercost;

        //total cost with gst
        float gst = 0.18f;
        float totalBillWithGST= totalBill + (totalBill * gst);

        // Output: Displaying the total cost and total cost with GST
        System.out.println("Total bill before GST: " + totalBill);
        System.out.println("Total bill after adding 18% GST: " + totalBillWithGST);

        sc.close();

    }

}
