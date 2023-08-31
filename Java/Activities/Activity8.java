package activities;

class CustomException extends Exception{
    private String message;

    public CustomException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }


}

public class Activity8 {
    public static void main(String args[]){
        try {
            Activity8.exceptionTest("Will print to console");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("Won't execute");
        } catch(CustomException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static void exceptionTest(String message) throws CustomException {
        if(message == null) {
            throw new CustomException("Given string value is null");
        } else {
            System.out.println(message);
        }
    }
}
