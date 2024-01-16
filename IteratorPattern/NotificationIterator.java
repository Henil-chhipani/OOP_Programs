package IteratorPattern;

public class NotificationIterator implements Iterator {

    Notifcation[] notifcationList;
    int pos = 0;

    public NotificationIterator(Notifcation[] notifcationList) {
        this.notifcationList = notifcationList;
    }

    @Override
    public boolean hasNext() {
        if (pos >= notifcationList.length || notifcationList[pos] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {

        Notifcation notifcation = notifcationList[pos];
        pos += 1;
        return notifcation;
    }

}
