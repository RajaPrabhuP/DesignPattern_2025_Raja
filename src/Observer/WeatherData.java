package Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{

    ArrayList<Observer> listObserver;
    int pressure;
    int humlity;
    int heat;
    public WeatherData(){
         listObserver = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer o) {
        listObserver.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = listObserver.indexOf(o);
        for(int j = 0;  j < listObserver.size(); j++ ){
                listObserver.remove(listObserver.get(j));
        }
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < listObserver.size(); i++ ){
            listObserver.get(i).update(pressure, humlity, heat);
        }
    }

    void setMeasurement(int pressure, int humlity, int heat){
            this.pressure = pressure;
            this.humlity = humlity;
            this.heat = heat;
            notifyObserver();
    }

}
