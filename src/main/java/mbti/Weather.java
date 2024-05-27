package mbti;

public class Weather implements Runnable{
    private String info;
    public Weather(String info) {
        this.info = info;
    }

    private String[] weatherStates = {"맑음", "흐림", "비", "눈", "바람"};
    private String currentWeather = "맑음";
    private final Object lock = new Object(); // 동기화를 위한 lock 객체
    public String getCurrentWeather() {
        synchronized (lock) {
            return currentWeather;
        }
    }

    private void setCurrentWeather(String newWeather) {
        synchronized (lock) {
            currentWeather = newWeather;
        }
    }
    @Override
    public void run(){
        int index = 0;
        while (true) {
            setCurrentWeather(weatherStates[index]);
            index = (index + 1) % weatherStates.length;
            try {
                Thread.sleep(5000); // 5초마다 날씨 변경
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
