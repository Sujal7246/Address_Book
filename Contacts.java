package AddressBookPackage;

import java.util.ArrayList;

class Contacts {
    private String first_name;
    private String last_name;
    private String address;
    private String pincode;
    private String state;
    private String phn_number;
    private String email;

    public Contacts(String first_name, String last_name, String address, String pincode, String state, String phn_number, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.pincode = pincode;
        this.state = state;
        this.phn_number = phn_number;
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPhn_number(String phn_number) {
        this.phn_number = phn_number;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public  void DisplayDetails(){
        System.out.println("First Name: "+first_name);
        System.out.println("Last Name: "+last_name);
        System.out.println("Address: "+address);
        System.out.println("Pin Code: "+pincode);
        System.out.println("State: "+state);
        System.out.println("Phone Number: "+phn_number);
        System.out.println("Email: "+email);
    }

}