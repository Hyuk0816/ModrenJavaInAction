package chapter2.behaviorParameteriazation.entity;

public class Apple {

    private int weight;
    private Color color;

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }
}
