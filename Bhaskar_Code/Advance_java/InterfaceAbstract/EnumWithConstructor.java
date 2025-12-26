enum Laptops{
    Macbook(1200), DellXPS(1500), Surface(560),HP;

    int price;
    

    private Laptops() {
        this.price=500;
    }

    private Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    

}

public class EnumWithConstructor {
    public static void main(String[] args) {
        
        for (Laptops data : Laptops.values()) {
            System.out.println("In the laptop ==> "+ data +" :"+ data.getPrice());
        }
    }
}
