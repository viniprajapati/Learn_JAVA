public class VolatileKeyword {

    volatile public static int flag = 0;

    public static void main(String[] args) {

//        final int i = 1;
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                VolatileKeyword.flag = 2;
                System.out.println("Flag value updated "+VolatileKeyword.flag);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 1;
                while (true){
                    if (flag == 0) {
                        System.out.println("Running "+(i++));
                    }
                    else
                        break;
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                VolatileKeyword.flag = 1;
                System.out.println("Flag value updated");
            }
        }).start();
    }
}
