// Problem Statement:

// Objective: Given a real world problem, be able to understand the need for programming fundamentals such as type conversion and casting.

// Problem Description: A retail store management wants to provide a discount on the bill amount for its customers. The bill details of the customer are as given below. Print the bill id, customer id, and the discounted bill amount for the customers.

// Use the following formula to calculate the discounted bill amount:

// discountedBillAmount = billAmount - billAmount * (discount/100)

// Consider the following values for input:

// Input 1 :

// Attributes	Values
// billId	1001
// customerId	101
// discount 	2%
// billAmount	199.99
// Input 2 :

// Attributes	Values
// billId	1002
// customerId	102
// discount	4%
// billAmount	210.5
// Note: the data type of billId, customerId, and discount are int, and billAmount, discountedBillAmount are double.

import java.io.*;
import java.util.*;

class GetDetails {

    private int billId, customerId, discount;
    private double billAmount, discountedBillAmount;

    Scanner sc = new Scanner(System.in);

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        if (billId > 0) {
            this.billId = billId;
        } else {
            System.out.println("Invalid billId");
        }
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public void getCustomerDetails() {
        System.out.print("Enter the Bill ID: ");
        setBillId(sc.nextInt());

        System.out.print("Enter the Customer ID: ");
        setCustomerId(sc.nextInt());

        System.out.print("Enter the discount (%): ");
        setDiscount(sc.nextInt());

        System.out.print("Enter the bill amount: ");
        setBillAmount(sc.nextDouble());
    }

    // Method to calculate and print the discounted bill amount
    public void calculateDiscountedBill() {
        discountedBillAmount = billAmount - (billAmount * (discount / 100.0));
        System.out.printf("Bill ID: %d\nCustomer ID: %d\nDiscounted Bill Amount: %.2f\n", billId, customerId, discountedBillAmount);
    }
}

public class customerDiscount {
    public static void main(String[] args) throws IOException {
        GetDetails obj = new GetDetails();
        obj.getCustomerDetails();
        obj.calculateDiscountedBill();
    }
}
