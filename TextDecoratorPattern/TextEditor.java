package TextDecoratorPattern;

// Component: Text interface
interface Text {
    String getContent();
}

// Concrete Component: SimpleText
class SimpleText implements Text {
    private String content;

    public SimpleText(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}

// Decorator: TextDecorator
abstract class TextDecorator implements Text {
    protected Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return text.getContent();
    }
}

// Concrete Decorator 1: BoldTextDecorator
class BoldTextDecorator extends TextDecorator {
    public BoldTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<b>" + super.getContent() + "</b>";
    }
}

// Concrete Decorator 2: ItalicTextDecorator
class ItalicTextDecorator extends TextDecorator {
    public ItalicTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<i>" + super.getContent() + "</i>";
    }
}

// Client: TextEditor
public class TextEditor {
    public static void main(String[] args) {
        // Create a simple text
        Text simpleText = new SimpleText("Hello, this is a simple text.");

        // Decorate the text with bold and italic
        Text italicText = new ItalicTextDecorator(simpleText);
        Text boldText = new BoldTextDecorator(simpleText);
        Text boldItalicText = new ItalicTextDecorator(new BoldTextDecorator(simpleText));

        // Display the decorated texts
        System.out.println("Simple Text: " + simpleText.getContent());
        System.out.println("Italic Text: " + italicText.getContent());
        System.out.println("Bold Text: " + boldText.getContent());
        System.out.println("Bold Italic Text: " + boldItalicText.getContent());
    }
}
