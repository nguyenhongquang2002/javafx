package session.s5;

public class Main {
    public static void main(String[] args) {
//        SubThread s = new SubThread();
//        s.setName("luong so 1");
//        s.start();
//        for (int i=0;i<600;i--){
//        System.out.println("Main:"+1);
//            try {
//                Thread.sleep(1000);
//             }catch (Exception e){
//
//             }
//        }
//        CountdownTimer s = new CountdownTimer();
//        s.start();
        int x=20;

        SubThread r = new SubThread();
        Thread t = new Thread(r);
        t.start();

        // tao nhanh 1 thread moi ma ko muon tao class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<20;i++){
                    System.out.println("Tạo nhanh:"+i);
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                    }
                }
            }
        };
        Thread t2 = new Thread();
        t2.start();
    }
}
