package DPPrototype;

public abstract class Bird implements  Cloneable<Bird>{
    private String name;
    private String color;
    private String weight;

    public Bird(){
        super();
    }

    public Bird(Bird old){
        this.name = old.name;
        this.color = old.name;
        this.weight = old.weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
