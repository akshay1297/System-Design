package creational.Prototype.deepCopy;

/*
- A deep copy creates a new object and also recursively creates copies of all objects referenced by the original object's fields.
    This results in a complete copy of the original object and all objects it references.
- All nested objects are copied, so the original and the copied objects do not share references to any nested objects.

When to use :
 - Deep copies are necessary when you want to ensure that the copied object is
    fully independent of the original object and that changes to the copy do not impact the original object.



 */
public class DeepPerson implements Cloneable  {
    private  String name;
    private Address address;

    public DeepPerson(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        DeepPerson deepPersonCloned = (DeepPerson)super.clone();
        deepPersonCloned.address = (Address) address.clone(); // it make sure that you can only clone nested class when it allows or it implements cloneable.
        return deepPersonCloned;
    }


}
