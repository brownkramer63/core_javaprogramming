package Lad07ClassandObject;

public class Task1Car {

  public String Brand;

  public String Model;

  public int Year;

  public String color;

  public double Price;

  public void setInfo(String Brand, int Year, String Model, String color, int Price){
      this.Brand = Brand;
      this.Year = Year;
      this.Model= Model;
      this.color=color;
      this.Price=Price;
  }

public String toString(){
    return Year+ " "+Brand+ " "+Model+ " "+color+" $"+Price;
}

public void drive(){
    System.out.println("Driving "+ Brand+ " "+ Model);
}



  }







//    1. Create a custom class for car objects.
//1. In each car objects, user should be able to store the brand,
//model, year, color, price information of car
//2. Add a function named setInfo that allows the user to be able
//to set all the fields of the car
//3. Add a function named drive that can print the brand, and
//model of the car that’s bring driven
//4. Add a function that allows the user to be able to display each
//objects’ brand, model, color, year and price of the car object
//when the it’s passed in the print statement

