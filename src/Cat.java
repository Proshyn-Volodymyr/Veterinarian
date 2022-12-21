public class Cat extends Animal{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setRation(String ration) {
        this.setRation(ration);
    }

    @Override
    public String getVoice() {
        return "Meow";
    }

    @Override
    public void eat() {
        System.out.println(this.name + "is going to eat something from " + getRation());
    }

    @Override
    public void sleep() {
        System.out.println(this.name + "is going to go to sleep");
    }
}
