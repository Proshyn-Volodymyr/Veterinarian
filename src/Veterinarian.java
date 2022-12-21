public class Veterinarian {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void treatment(Animal animal){
        System.out.println(this.name + " is treating some animals" );
    }
}
