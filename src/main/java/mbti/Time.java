package mbti;

public class Time implements Runnable{

    private String [] timeState = {"아침","점심","저녁","밤","새벽"};
    private String currentTime = "저녁";
    private final Object lock = new Object(); // 동기화를 위한 lock 객체
    public String getCurrentTime() {
        synchronized (lock) {
            return currentTime;
        }
    }

    private void setCurrentTime(String newTime) {
        synchronized (lock) {
            currentTime = newTime;
        }
    }
    @Override
    public void run(){
        int index = 0;
        while (true) {
            setCurrentTime(timeState[index]);
            index = (index + 1) % timeState.length;
            try {
                Thread.sleep(5000); // 5초마다 시간 변경
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
