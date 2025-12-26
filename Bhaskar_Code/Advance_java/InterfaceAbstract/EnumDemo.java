enum Status{
    RUNNING,FAILED,PENDING, SUCCESS
}

class EnumDemo{
    public static void main(String[] args) {
        
        System.out.println("The value of status "+ Status.SUCCESS);

        Status[] status=Status.values();

        for (Status status2 : status) {
            System.out.println(status2 +" ==> "+status2.ordinal());
        }
    }
}