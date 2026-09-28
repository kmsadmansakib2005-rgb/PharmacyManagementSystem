public class Medicine {

    String name;
    String category;
    String[] strengths;
    double price;
    String imagePath;

    Medicine(String name, String category, String[] strengths, double price,
             String imagePath) {
        this.name = name;
        this.category = category;
        this.strengths = strengths;
        this.price = price;
        this.imagePath = imagePath;
    }
}