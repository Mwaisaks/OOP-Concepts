public class Fruit extends Item{

    private String type;

    public Fruit( String name, int quantity, String type) {
        super(name, quantity);
        this.type = type;
    }
}

/*
With inheritance you do not have to redefine the already existing attributes
you just add specific details

in the constructor, we use super instead of this because the attributes are from super class
 */
