public class Land {

    int height;
    int width;
    int area;



    //default constructor
    public Land() {
        this.height = 10;
        this.width = 10;
        this.area = height * width;
    }

    public Land(int height, int width, int area) {
        this.height = height;
        this.width = width;
        this.area = height * width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
