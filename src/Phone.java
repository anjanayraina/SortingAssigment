public class Phone {
    private int nextPhoneId;
    private int id;
    private String brand;
    private double price;
    private boolean touchScreen;

    public int getNextPhoneId() {
        return nextPhoneId;
    }

    public void setNextPhoneId(int nextPhoneId) {
        this.nextPhoneId = nextPhoneId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }
}
