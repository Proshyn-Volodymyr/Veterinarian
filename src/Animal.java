public class Animal {
    private String ration;
    private String color;
    private int weight;

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getVoice(){
        return "The animal is making sound";
    }
    public void eat(){
        System.out.println("The animal is eating");
    }
    public void sleep(){
        System.out.println("The animal is sleeping");
    }
}
