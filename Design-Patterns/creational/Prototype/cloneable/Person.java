package creational.Prototype.cloneable;

public class Person implements Cloneable{
    private String name;
    private Integer age;

    public Person(){}
    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        return new Person(this.name, this.age);
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    /* - concept behind super.clone()
        -  it invokes the clone() method from the superclass, which is Object.
        - The Object class in Java provides a protected clone() method that creates and returns a shallow copy of the object.
        - super.clone() -  clone() method is defined in the Object class as a protected method
        protected Object clone() throws CloneNotSupportedException {
             return super.clone();
            }
         - Basically , Object class creates a new instance and copy whatever inside the current object (Shallow copy) and return.
    */


}
