interface Document{
    void create();
}

class WordDocument implements Document{
    public void create(){
        System.out.println("Word Document Created");
    }
}

class PdfDocument implements Document{
    public void create(){
        System.out.println("Pdf Document Created");
    }
}

class WordFactory{
    Document createDocument(){
        return new WordDocument();
    }
}

class PdfFactory{
    Document createDocument(){
        return new PdfDocument();
    }
}

public class FactoryTest {
    public static void main(String[] args) {
        WordFactory wf = new WordFactory();
        Document d1 = wf.createDocument();
        d1.create();
        PdfFactory pf = new PdfFactory();
        Document d2 = pf.createDocument();
        d2.create();
    }
}



