package AddressBookPackage;



import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookImplementation  implements AdrdressBookMain {

    private String Address_book_name;
    ArrayList<Contacts> contactsArrayList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);




    @Override
    public void addConatct() {
       // System.out.println("Adding contact to Address Book: " + Address_book_name);

        System.out.print("First Name: ");
        String fn = sc.nextLine();

        System.out.print("Last Name: ");
        String ln = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("Pincode: ");
        String pin = sc.nextLine();


        System.out.print("State: ");
        String state = sc.nextLine();

        System.out.print("Phone Number: ");
        String phone = sc.nextLine();


        System.out.print("Email: ");
        String email = sc.nextLine();

        boolean isDuplicate = contactsArrayList.stream()
                .anyMatch(contact ->
                        contact.getFirst_name().equalsIgnoreCase(fn)
                );

        if (isDuplicate) {
            System.out.println("Duplicate Contact! Cannot Add.");
        } else {
            contactsArrayList.add(new Contacts(fn, ln, address, pin, state, phone, email));
            System.out.println("Contact created successfully");
        }


    }

    public void displaydetails() {
        if (contactsArrayList.isEmpty()) {
            System.out.println("No contacts found");
        } else {
            for (int i = 0; i < contactsArrayList.size(); i++) {
                contactsArrayList.get(i).DisplayDetails();
            }
        }
    }

    @Override
    public void editConatactdetails() {
        boolean found = false;
        System.out.println("Enter First Name to edit");
        String n = sc.nextLine();

        for (int i = 0; i < contactsArrayList.size(); i++) {
            Contacts c = contactsArrayList.get(i);
            if (c.getFirst_name().equalsIgnoreCase(n)) {
                System.out.print("New Address: ");
                c.setAddress(sc.nextLine());

                System.out.print("New Pincode: ");
                c.setPincode(sc.nextLine());

                System.out.print("New State: ");
                c.setState(sc.nextLine());

                System.out.print("New Phone: ");
                c.setPhn_number(sc.nextLine());

                System.out.print("New Email: ");
                c.setEmail(sc.nextLine());

                System.out.println("Contact Updated Successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No Contact found");
        }

    }

    @Override
    public void deletecontact() {
        System.out.println("Enter first name to delete");
        String name=sc.nextLine();
        boolean found=false;
        for(int i=0;i<contactsArrayList.size();i++){

            Contacts c=contactsArrayList.get(i);
            if(c.getFirst_name().equalsIgnoreCase(name)){
                contactsArrayList.remove(i);
                System.out.println("Contact Delete Succesfully");
                 found=true;
                 break;
            }

            }
        if(!found){
            System.out.println("Contact not found");
        }
    }




}
