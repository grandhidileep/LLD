package pen;

public class MarkerPen extends Pen{
    public MarkerPen(PenType type) {
        super(type);
    }

    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
