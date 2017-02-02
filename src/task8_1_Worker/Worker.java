package task8_1_Worker;

/**
 * Created by lion on 01.02.17.
 */
public class Worker {
    private String name;
    private String pozition;
    private int year;
    Worker(String name, String pozition, int year){
        this.name = name;
        this.pozition = pozition;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getPozition() {
        return pozition;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", pozition='" + pozition + '\'' +
                ", year=" + year +
                '}';
    }
}