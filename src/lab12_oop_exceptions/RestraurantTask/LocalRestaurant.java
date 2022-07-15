package lab12_oop_exceptions.RestraurantTask;

public class LocalRestaurant {
    public static void main(String[] args) {

        Employee employee1 = new Server("emily",19,'F',"d5679","Server",30000);

        System.out.println(employee1);

        employee1.work();
        ((Server) employee1).takeOrder();
        ((Server) employee1).cleanTable();

        Employee employee2 = new Chef("Mike",34,'M',"45321","Chef",45000);

        System.out.println(employee2);
        ((Chef) employee2).makeOrder();
        ((Chef) employee2).washDishes();

        System.out.println("----------------------------------");

      //  Restaurant restaurant = new Chef("Mike",34,'M',"45321","Chef",45000);
//this cannot exist because there is no inheritance relationship between chef and restaurant

        try {
            ((Server) employee2).takeOrder();

//this will not work as they do not have an is a relationship
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("----------------");

        Restaurant restaurant = new Restaurant("Josh","Pittsburgh",2);

        System.out.println(restaurant);

        restaurant.hireServer((Server) employee1);
//        restaurant.hireChef((Chef) employee2);

        System.out.println(restaurant);











    }
}
