public class Square extends Rectangle{
    private int side;

    Square(int side) {
        this.setSide(side);
    }

    @Override
    public void setWidth(int width) {
        this.setSide(width);
    }

    @Override
    public void setHeight(int height) {
        this.setSide(height);
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getWidth(){
        return side;
    }

    @Override
    public int getHeight(){
        return side;
    }

    @Override
    public int getArea(){
        return side * side;
    }

}
