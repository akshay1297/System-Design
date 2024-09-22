package creational.Prototype.animal;

public class Animal implements Prototype {
    public int height;
    public boolean sleep;
    public Animal(){}
    public Animal(int height, boolean sleep) {
        this.height = height;
        this.sleep = sleep;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isSleep() {
        return sleep;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }

    @Override
    public Animal clone() {
        return new Animal(this.height, this.sleep);
    }
}
