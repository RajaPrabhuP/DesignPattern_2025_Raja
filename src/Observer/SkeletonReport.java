package Observer;

import org.omg.Messaging.SyncScopeHelper;

public class SkeletonReport implements Observer, Display{

    Subject weatherDataObj;
    int pressure;
    int humlity;
    int heat;

    SkeletonReport(Subject weatherDataObj){
        this.weatherDataObj = weatherDataObj;
        weatherDataObj.addObserver(this);
    }
    public static void main(String[] args){
        WeatherData dataObj = new WeatherData();

        SkeletonReport skelObj = new SkeletonReport(dataObj);
        dataObj.setMeasurement(10, 20, 30);

    }

    @Override
    public void display() {
        System.out.println(pressure);
        System.out.println(humlity);
        System.out.println(heat);
    }

    @Override
    public void update(int pressure, int humlity, int heat) {
           this.pressure = pressure;
           this.humlity = humlity;
           this.heat = heat;
            display();
    }
}
