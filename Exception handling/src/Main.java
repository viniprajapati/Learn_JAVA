public class Main {

    public static void main(String[] args) {
        int x = 11;
        try {
            System.out.println("divide number by 0 to check exception "+x/0);
        }catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurred");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Inside exception block");
        }
    }
}
