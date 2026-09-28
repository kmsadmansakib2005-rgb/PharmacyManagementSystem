public class Medicine {

    String name;
    String category;
    String[] strengths;
    double price;
    String imagePath;
    int stock;

    Medicine(String name, String category, String[] strengths, double price,
             String imagePath, int stock) {
        this.name = name;
        this.category = category;
        this.strengths = strengths;
        this.price = price;
        this.imagePath = imagePath;
        this.stock= stock;
    }
}