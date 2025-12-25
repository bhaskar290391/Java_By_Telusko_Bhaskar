package Utils;


class Laptop{
    public String model;
    public double price;

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        return true;
    }
    
    

}
public class ObjectDemo {
    public static void main(String[] args) {
     
        
        Laptop obj=new Laptop();
        obj.model="Lenova Yoga";
        obj.price=1000;
        
        Laptop obj1=new Laptop();
        obj.model="Lenova Yoga";
        obj.price=1000;

        System.out.println(obj);

        System.out.println(obj.equals(obj1));
    }
}
