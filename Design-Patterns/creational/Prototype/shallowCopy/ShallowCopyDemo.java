package creational.Prototype.shallowCopy;

public class ShallowCopyDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowPerson shallowPersonOriginal = new ShallowPerson("Akshay" , new Address("Patna" , "India"));
        ShallowPerson shallowPersonCopy = (ShallowPerson) shallowPersonOriginal.clone(); // creates a shallow copy of object
        // now Address is a reference object being shared among both shallowPersonOriginal & shallowPersonCopy
        shallowPersonCopy.getAddress().setCity("Darbhanga");
        // now above line - city will be changed from Patna to Darbhanga for both shallowPersonOriginal & shallowPersonCopy
        System.out.println(shallowPersonOriginal.getAddress().getCity());
        System.out.println(shallowPersonCopy.getAddress().getCity());

    }
}
