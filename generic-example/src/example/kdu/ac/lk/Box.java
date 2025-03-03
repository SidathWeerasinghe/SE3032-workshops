package example.kdu.ac.lk;

public class Box <T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
    /**
     * Generic method that uses both the generic type of the class
     * it belongs to, as well as an additional generic type that is
     * bound to the Number type.
     */
    public void inspect(){
        System.out.println("T: " + t.getClass().getName());
    }

    public <U> void inspectWithAdditionalType(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();

        integerBox.set(10);
        integerBox.inspect();
        integerBox.inspectWithAdditionalType("Hello world");
        Integer i = integerBox.get();
    }
}
