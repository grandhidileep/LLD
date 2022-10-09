package pen;

public abstract class Pen {

    private String name;
    private String company;
    private Integer price;
    private PenType type;

    public Pen(PenType type){
        this.type = type;
    }

    public abstract void write();
    public abstract Color getColor();

}
