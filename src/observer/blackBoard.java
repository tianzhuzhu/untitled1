package observer;

import java.util.Observable;
import java.util.Observer;

public class blackBoard implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof teacher){
            teacher teacher= (teacher) o;
            System.out.printf(teacher.getContent());
        }
    }
}
