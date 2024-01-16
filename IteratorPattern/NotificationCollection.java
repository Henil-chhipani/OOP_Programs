package IteratorPattern;

public class NotificationCollection implements Collection {

    int Max_item = 6;
    int num_items = 0;
    Notifcation[] notificationList;

    public NotificationCollection() {
        notificationList = new Notifcation[Max_item];

        // Let us add some dummy notifications
        addItems("Notification 1");
        addItems("Notification 2");
        addItems("Notification 3");
    }

    public void addItems(String str) {
        Notifcation notifcation = new Notifcation(str);
        if (num_items >= Max_item) {
            System.out.println("Full");
        } else {
            notificationList[num_items] = notifcation;
            num_items++;
        }
    }

    @Override
    public Iterator createIterator() {

        return new NotificationIterator(notificationList);
    }

}
