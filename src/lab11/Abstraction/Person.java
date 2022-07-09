package lab11.Abstraction;

public  class Person {

    private String name;
     private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if (gender!='M' && gender!='F'){
            System.err.println("invalid gender");
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals(null)){
            System.err.println("invalid name cannot be empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.err.println("invalid age please retry");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }
    public void eat(){

    };
    public void drink(){};
    public void sleep(){};

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    //	1. Create a class named Person:
//			Variables:
//				name, age, gender(final)
//
//			Encapsulate all the fields
//				Conditions:
//					1. age can not be zero or negative
//					2. gender can only be set to 'M' or 'F'
//					3. name can not be null
//
//			methods:
//				eat(), drink(), sleep(), toString()
}
