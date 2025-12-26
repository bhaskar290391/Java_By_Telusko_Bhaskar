enum JIRA_STATUS{
    RUNNING,FAILED,PENDING, SUCCESS
}

public class EnumSwitch {
    public static void main(String[] args) {
        
        JIRA_STATUS status=JIRA_STATUS.PENDING;

        switch (status) {
            case PENDING:
                System.out.println("Work status is pending");
                break;
            case RUNNING:
                System.out.println("Work status is Running");
                break;

            case FAILED:
                System.out.println("Work status is Failed");
                break;    
            default:
                System.out.println("Work status is Success");
                break;
        }
    }
}
