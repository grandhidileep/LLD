package DPPrototype;

public class Crow extends Bird{
    private String sound = "kaw";
    public Crow(){}
    public Crow(Crow old){
        super(old);
        this.sound = old.sound;
    }
    @Override
    public Crow clone() {
        Crow crow = new Crow(this);
        return crow;
    }
}
