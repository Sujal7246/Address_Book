package AddressBookPackage;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressBookMainClass {
    public static void main(String[] args) {
        AdrdressBookMain book=new AddressBookImplementation("sujal","sachdeva","sa","148","p","22","@");
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n ADDRESS BOOK MENU");
            System.out.println("1. Add Contact ");
            System.out.println("2. Display all Contacts");
            System.out.println("3. Edit Contact Details");
            System.out.println("4. Delete Contact");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1 -> book.addConatct();
                case 2 -> book.displaydetails();
                case 3 -> book.editConatactdetails();
                case 4 -> book.deletecontact();
            }
        } while (choice != 5);
    }
    }

