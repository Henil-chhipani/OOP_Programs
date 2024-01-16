package MementoPattern;

import java.util.Deque;
import java.util.LinkedList;

import MementoPattern.TextArea.Momento;

public class Editor {
    private Deque<Momento> stateHistory;
    private TextArea TextArea;

    public Editor() {
        stateHistory = new LinkedList<>();
        TextArea = new TextArea();

    }

    void write(String Text) {
        TextArea.settext(Text);
        stateHistory.add(TextArea.TakeSnapShot());
    }

    public void undo() {
        TextArea.restore(stateHistory.pop());
        System.out.println("resored :" + TextArea.text);
    }

    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.write("Hello");
        editor.write("i am henil");
        editor.write("hhiiiiii");
        editor.write("hhiiiiii");
        editor.undo();
    }
}
