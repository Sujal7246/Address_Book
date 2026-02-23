package AddressBookPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class AddressBookMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, AddressBookImplementation> addressBookMap = new HashMap<>();

        while (true) {

            System.out.println("\n===== ADDRESS BOOK SYSTEM =====");
            System.out.println("1. Add New Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. View All Address Books");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter New Address Book Name: ");
                    String bookName = sc.next();

                    if (addressBookMap.containsKey(bookName)) {
                        System.out.println("Address Book with this name already exists!");
                    } else {
                        addressBookMap.put(bookName, new AddressBookImplementation());
                        System.out.println("Address Book created successfully!");
                    }
                    break;
                case 2:
                    System.out.print("Enter Address Book Name to Select: ");
                    String selectedBook = sc.next();

                    AddressBookImplementation book = addressBookMap.get(selectedBook);

                    if (book == null) {
                        System.out.println("Address Book not found!");
                        break;
                    }

                    while (true) {
                        System.out.println("\n ADDRESS BOOK MENU");
                        System.out.println("1. Add Contact ");
                        System.out.println("2. Display all Contacts");
                        System.out.println("3. Edit Contact Details");
                        System.out.println("4. Delete Contact");
                        System.out.println("5. Back to Main Menu");

                        System.out.print("Enter your choice: ");
                        int subchoice = sc.nextInt();
                            sc.nextLine();
                            switch(subchoice){
                                case 1 : book.addConatct();break;
                                case 2 : book.displaydetails();break;
                                case 3 : book.editConatactdetails();break;
                                case 4 : book.deletecontact();break;
                                case 5 : break;
                                default : System.out.println("Invalid input");
                                break;
                            }
                        }
                case 3:
                    if (addressBookMap.isEmpty()) {
                        System.out.println("No Address Books available.");
                    } else {
                        System.out.println("Available Address Books:");
                        for (String name : addressBookMap.keySet()) {
                            System.out.println("- " + name);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }

                   }
            }
        }



