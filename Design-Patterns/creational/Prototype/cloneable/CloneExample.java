package creational.Prototype.cloneable;

public class CloneExample extends Person {
    public static void main(String[] args){

        try {
            Person p1 = new Person("Akshay", 26);
//            Person p1 = new Person();
//            p1.setName("Akshay");
//            p1.setAge(20);
            Person p2 = (Person)p1.clone();
            System.out.println(p2.getAge());
            p2.setAge(22);
            System.out.println(p2.getAge());

        }
        // Thrown to indicate that the clone method in class Object has been called to clone an object, but that the object's class does not implement the Cloneable interface.
        // That' why we have to override clone() method in Person class and make field as public which indicates that shallow copy of this class's object is allowed to be created.
        catch (CloneNotSupportedException e){
            e.printStackTrace();

        }

    }
}
