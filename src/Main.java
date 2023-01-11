public class Main extends Object{
    public static  void main(String[] args){
//        Car car = new Car();
//        car.setMake("Tesla");
//        car.setColor("Blue");
//        car.setConvertible(true);
//        car.setModel("ninja");
//        car.setDoors(4);
//        car.describeCar();
//
//        Car targa = new Car();
//        targa.setMake("Porsche");
//        targa.setColor("Blue");
//        targa.setConvertible(true);
//        targa.setModel("ninja");
//        targa.setDoors(4);
//        targa.describeCar();

//        BankAccount account1 = new BankAccount(123,"Muto","email",1234);
//        BankAccount account1 = new BankAccount();


//        account1.setAccountBalance(100);
//        account1.setAccountNumber(123456789);
//        account1.setEmail("muto@gmail.com");
//        account1.setCustomerName("Muto");
//        account1.setPhoneNumber(12121245);

//        account1.withdrawFund(10);
//        account1.depositFund(200);
//        account1.withdrawFund(299);
//        System.out.println("Balance "+
//                account1.getAccountBalance() + " account number "+
//                account1.getAccountNumber() + " email "
//                + account1.getEmail() + " name " + account1.getCustomerName()
//                + " phone " + account1.getPhoneNumber()
//        );

//        Calculator calculator = new Calculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

//        Person person = new Person();
//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());

//        Customer customer = new Customer("Mutotot", 12.2, "@@@@");
//        Customer customer = new Customer("mmmm", "@@@ema");
//        Customer customer = new Customer();

//        System.out.println( customer.getEmail());
//        System.out.println( customer.getCreditLimit());
//        System.out.println( customer.getName());

//        for(int i = 0; i < 5; i ++){
//            LPAStudent s = new LPAStudent("S123" + i,
//                    switch (i){
//                case 1 -> "Mary";
//                case 2 -> "Carol";
//                case 3 -> "Tim";
//                case 4 -> "Harry";
//                case 5 -> "Lisa";
//                case 6 -> "A";
//                default -> "Anonymous";
//                    },
//                    "01/01/1992",
//                    "Java");
//            System.out.println(s);
//        }
//        Student pojoStudent = new Student("S123","Ann",
//                "1/2/1222", "Jacva");
//        LPAStudent recordStudent = new LPAStudent("S12333", "LOL",
//                "2/3/3333", "JAJA");
//        pojoStudent.setClassList((pojoStudent.getClassList() +
//                ", Javavava"));
////        recordStudent.setClassList((pojoStudent.getClassList() +
////                ", Javavava")); // record doestn have set
//        System.out.println(pojoStudent);
//        System.out.println(recordStudent);
//        System.out.println(pojoStudent.getName() + " is taking" +
//                pojoStudent.getClassList());
//        System.out.println(recordStudent.name() + " is taking" +
//                recordStudent.classList());

//         Wall wall = new Wall(5,4);
//         System.out.println("area= " + wall.getArea());
//
//         wall.setHeight(-1.5);
//         System.out.println("width= " + wall.getWidth());
//         System.out.println("height= " + wall.getHeight());
//         System.out.println("area= " + wall.getArea());

//        Point first = new Point(6, 5);
//        Point second = new Point(3, 1);
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());
//
//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculate calculator = new Calculate(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculate(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());

//        ComplexNumber one = new ComplexNumber(1.0, 1.0);
//        ComplexNumber number = new ComplexNumber(2.5, -1.5);
//        one.add(1,1);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        one.subtract(number);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real= " + number.getReal());
//        System.out.println("number.imaginary= " + number.getImaginary());
        ////////////

//    Animal animal = new Animal("Generic Animal", "huge", 400);
//    doAnimalStuff(animal,"slow");
//    Dog dog = new Dog();
//    doAnimalStuff(dog, "fast");
//    Dog wally = new Dog("Wally", 20);
//    doAnimalStuff(wally, "fast");
//
//    Dog retriver = new Dog("Labrodar", 65, "Floppy", "Swimmer");
//    doAnimalStuff(retriver, "slow");
//    Dog wolf = new Dog("wolf", 40);
//    doAnimalStuff(wolf, "slow");
//
//    Fish goldie = new Fish("Goldfish", 0.24, 2, 3) ;
//    doAnimalStuff(goldie, "fast");

        Studenting max = new Studenting("Max", 21);
        System.out.println(max);
        PrimarySchoolStudent  jimmy = new PrimarySchoolStudent("Jimmy", 9, "LOL");
        System.out.println(jimmy);


    }
//    public static  void doAnimalStuff(Animal animal, String speed){
//        animal.makeNoise();
//        animal.move(speed);
//        System.out.println(animal);
//        System.out.println("_____");
//    }

}

class Studenting{
    private String name;
    private int age;
    Studenting(String name, int age){
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name + " is " + age;
//        return "Studenting{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}




class PrimarySchoolStudent extends Studenting{
    private String parentName;
    PrimarySchoolStudent(String  name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}


















