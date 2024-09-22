package creational.Prototype.shallowCopy;

/*
- A shallow copy creates a new object, but it does not create copies of the objects referenced by the
original object's fields. Instead, it copies the references to these objects.
- Primitive type fields : copied by value

When to use :
 - When you need a copy of an object but are okay with the nested objects being shared between the original and the copied object.
 So, when we change fields of nested object it will show in both original and copied object.



 */
public class ShallowPerson implements Cloneable  {
    private  String name;
    private Address address;

    public ShallowPerson(String name, Address address){
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
        return super.clone();
    }


}
