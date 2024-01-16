package MementoPattern;

public class TextArea {
    String text;

    void settext(String text) {
        this.text = text;
    }

    void getText() {
        System.out.println(text);
    }

    public Momento TakeSnapShot() {
        return new Momento(this.text);
    }

    public void restore(Momento momento) {
        this.text = momento.getSaveText();
    }

    public static class Momento {
        private final String text;

        private Momento(String texttosave) {
            text = texttosave;
        }

        private String getSaveText() {
            return text;
        }
    }

}
