public class FactoryMethodTest {

    static void main() {
        DocumentFactory factory = new WordFactory();

        Document dc =  factory.createDocument();
        dc.open();
    }
}
