package lab12_oop_exceptions.RestraurantTask;

public class Server extends Employee{

    public Server(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is serving at the restaurant");
    }

    public void takeOrder(){
        System.out.println(getName()+" is taking the order");
    }

    public void cleanTable(){
        System.out.println(getName()+" is cleaning table");
    }

}
