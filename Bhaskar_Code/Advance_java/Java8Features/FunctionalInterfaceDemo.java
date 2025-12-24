@FunctionalInterface
interface A{
    public void show(int n);
}

class FunctionalInterfaceDemo{
    public static void main(String[] args) {
        
        A obj= n-> System.out.println(n);

        obj.show(10);
        
    }
}