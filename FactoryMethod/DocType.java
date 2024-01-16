package FactoryMethod;

class PDFDocument implements Document {

    @Override
    public void print() {
        System.out.println("this is pdf docs ");
    }

}

class WordDocument implements Document {

    @Override
    public void print() {
        System.out.println("this is WordDocument ");
    }

}

public class DocType {

    public static void main(String[] args) {
        PDFDocument p = new PDFDocument();
        WordDocument w = new WordDocument();

        p.print();
        w.print();
    }

}
