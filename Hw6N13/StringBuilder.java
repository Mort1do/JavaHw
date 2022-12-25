package Hw6N13;

public class StringBuilder {
    private Observer observer;
    private StringBuilder stringBuilder = new StringBuilder();

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    private void notifyObserver(){
        this.observer.HadleEvent(this);
    }

    public void append(Object obj){
        this.stringBuilder.append(obj);
        notifyObserver();

    }

    public void reverse(){
        this.stringBuilder.reverse();
        notifyObserver();
    }

    @Override
    public String toString() {
        return this.stringBuilder.toString();
    }
}
