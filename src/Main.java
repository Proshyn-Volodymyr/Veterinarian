public class Main {
    public static void main(String[] args) {

        Veterinarian vet = new Veterinarian();
        vet.setName("Sam");
        Animal cat = new Cat();
        Animal dog = new Dog();
        vet.treatment(cat);
    }
}
