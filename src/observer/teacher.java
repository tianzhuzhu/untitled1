package observer;


import java.util.Observable;

public class teacher extends Observable {
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public void measurementschanged(){
        setChanged();
        notifyObservers();
    }

    private   String content;
    public teacher(){

    }



}
