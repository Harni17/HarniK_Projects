package com.HarniK.Practice_Project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class appBugFix {
	public static void main(String[] args) {
       
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        optionsSelection();

    }
    private static void optionsSelection() {
        String[] arr = {"1.Review the expense",
                "2. Add the expense",
                "3. Delete the expense",
                "4. Sort the expense",
                "5. Search the expense",
                "6. Close the application"
        };
        int[] arr1 = {1,2,3,4,5,6};
        int  strlen = arr1.length;
        for(int i=0; i<strlen;i++){
            System.out.println(arr[i]);
            // to display the all the array String
        }
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(150);
        expenses.add(255);
        expenses.add(5800);
        expenses.add(2020);
        expenses.addAll(arrlist);
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  choice =  sc.nextInt();
        for(int j=1;j<=strlen;j++){
            if(choice==j){
                switch (choice){
                    case 1:
                        System.out.println("Your saved expenses are: \n");
                        System.out.println(expenses+"\n");
                        System.out.println("----------------------------------");
                        optionsSelection();
                        break;
                    case 2:
                        System.out.println("Enter the amount to add in your Expense: \n");
                        int amount = sc.nextInt();
                        expenses.add(amount);
                        System.out.println("Your amount is added\n");
                        expenses.addAll(arrlist);
                        System.out.println(expenses+"\n");
                        System.out.println("----------------------------------");
                        optionsSelection();

                        break;
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int choose = sc.nextInt();
                        if(choose==choice){
                               expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                            System.out.println("----------------------------------");
                        } else {
                            System.out.println("try again please!");
                        }
                        optionsSelection();
                        break;
                    case 4:
                        sortExpenses(expenses);
                        optionsSelection();
                        System.out.println("\n----------------------------------");
                        break;
                    case 5:
                        searchExpenses(expenses);
                        optionsSelection();
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have entered invalid choice!");
                        break;
                }
            }
        }

    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!!!");
            }
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
        System.out.println("Enter the expense you want to search:\t");
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        //Linear Search
        for(int i=0;i<leng;i++) {
        	if(arrayList.get(i)==input) {
        		System.out.println("Found the expense " + input + " at " + i + " position");
        		System.out.println("\n----------------------------------");
        	}
        }
    }
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
       //sorted in ascending order.
        
        Collections.sort(arrayList);
        System.out.println("Sorted the expenses: ");
        for(Integer i: arrayList) {
        	System.out.print(i + " ");
        }
        System.out.println("\n----------------------------------");   
    }

}
