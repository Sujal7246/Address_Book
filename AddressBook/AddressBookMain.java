class Contacts {
   private String first_name;
    private String last_name;
    private String address;
    private int pincode;
    private String state;
    private int phn_number;
    private String email;

    public Contacts(String first_name,String last_name,String address,int pincode,String state,int phn_number,String email){
        this.first_name=first_name;
        this.last_name=last_name;
        this.address=address;
        this.pincode=pincode;
        this.state=state;
        this.phn_number=phn_number;
        this.email=email;
    }

    public String getFirst_name(){
        return first_name;
    }

    public String getLast_name(){
        return  last_name;
    }
    public String getAddress(){
        return address;
    }
    public int getPincode(){
        return  pincode;
    }
    public String getState(){
        return state;
    }
    public int getPhn_number(){
        return  phn_number;
    }
    public String getEmail(){
        return email;
    }
    public  void DisplayDetails(){
        System.out.println("First Name: "+first_name);
        System.out.println("Last Name: "+last_name);
        System.out.println("Address: "+address);
        System.out.println("Pin Code: "+pincode);
        System.out.println("State: "+state);
        System.out.println("Phone Number: "+phn_number);
        System.out.println("E:mail"+email);
    }
}
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESS BOOK PROGRAM ");
        Contacts c=new Contacts("Sujal","Sachdeva","Sangrur",148001,"Punjab",70093,"sujal@gmail.com");
        c.DisplayDetails();
    }
}
