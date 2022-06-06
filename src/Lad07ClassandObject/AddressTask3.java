package Lad07ClassandObject;

public class AddressTask3 {

    public String buildingnumber;
    public String street;
    public String city;
    public String state;
    public int ZIP;

    public void setinfo(String buildingnumber, String street, String city, String state, int ZIP) {
        this.buildingnumber = buildingnumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.ZIP = ZIP;
    }

    public String toString(){
        return buildingnumber+" "+street+"\n"
                +city+", "+state+" "+ZIP;
    }








}
//1. Create a custom class for Address objects.
//1. In each object, user should be able to store the building number,
//street, city, state, and zip code information of the address
//2. Add a function named setInfo that allows the user to be able to
//set all the fields of the address object
//3. Add a function that allows the user to be able to display each
//objects’ shipping address when it’s passed in the print statement