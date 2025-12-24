class ExceptionDemo{
    public static void main(String[] args) {
        
        int i=0;
        int j=0;

        try {
            j=15/i;
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("bye");
    }
}