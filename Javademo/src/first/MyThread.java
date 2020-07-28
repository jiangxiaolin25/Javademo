package first;



public class MyThread extends Thread {

    private final Object lock = new Object();

    private boolean pause = false;

    /**
     * ���ø÷���ʵ���̵߳���ͣ
     */
    void pauseThread(){
        pause = true;
    }


    /*
    ���ø÷���ʵ�ָֻ��̵߳�����
     */
    void resumeThread(){
        pause =false;
        synchronized (lock){
            lock.notify();
        }
    }

    /**
     * �������ֻ����run ������ʵ�֣���Ȼ���������̣߳�����ҳ������Ӧ
     */
    void onPause() {
        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        super.run();
        int index = 0;
        while(index<5000){
            while (pause){
                onPause();
            }
            try {
                System.out.println(index);
                Thread.sleep(50);
                ++index;
            }catch (Exception e){
                e.printStackTrace();
                break;
            }
        }
    }
}

