public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long start(){
        return startTime = System.nanoTime();
    }
    public long end(){
        return endTime = System.nanoTime();
    }
    public double getElapsedTime(){
        return endTime - startTime;
    }
}
