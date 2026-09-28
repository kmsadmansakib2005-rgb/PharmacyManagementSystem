public class CartItem {
    Medicine medicine;
    String strength;
    int quantity;

    CartItem(Medicine medicine, String strength, int quantity)
    {
        this.medicine= medicine;
        this.strength= strength;
        this.quantity= quantity;
    }
}