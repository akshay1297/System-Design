package creational.Prototype.deepCopy;

public class DeepCopyDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPerson deepPersonOriginal = new DeepPerson("Akshay" , new Address("Patna" , "India"));
        DeepPerson deepPersonCopy = (DeepPerson) deepPersonOriginal.clone(); // creates a shallow copy of object
        // now Address is a reference object NOT being shared among both shallowPersonOriginal & shallowPersonCopy
        deepPersonCopy.getAddress().setCity("Darbhanga");
        // now above line - city will be not change from Patna to Darbhanga for deepPersonCopy only
        System.out.println(deepPersonOriginal.getAddress().getCity());
        System.out.println(deepPersonCopy.getAddress().getCity());

    }
}
