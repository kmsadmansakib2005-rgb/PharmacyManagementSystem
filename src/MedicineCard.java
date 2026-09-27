import javax.swing.*;
import java.awt.*;

public class MedicineCard extends JPanel {

    MedicineCard(Medicine medicine) {

       this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(new Color(180, 200, 220), 1),
                        BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        this.setBackground(Color.WHITE);


        // Medicine image
        ImageIcon originalImage = new ImageIcon(
                getClass().getResource(medicine.imagePath)
        );

        Image image = originalImage.getImage();

        Image resizedImage = image.getScaledInstance(
                160,
                120,
                Image.SCALE_SMOOTH
        );

        ImageIcon medicineImage = new ImageIcon(resizedImage);

        JLabel imageLabel = new JLabel(medicineImage);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);


        // Medicine name
        JLabel medicineName = new JLabel(
                "<html><span style='color:blue'>" +
                        "<big>" + medicine.name + "</big></span></html>"
        );

        JLabel category = new JLabel("Category: " + medicine.category);
        //JLabel strength = new JLabel("Strength: " + medicine.strength);

        String[] strengths= {medicine.strength};
        JComboBox<String> strengthBox= new JComboBox<>(strengths);
        strengthBox.setMaximumSize(new Dimension(80, 20));

        JLabel price = new JLabel("Price: $" + medicine.price);


        medicineName.setAlignmentX(Component.CENTER_ALIGNMENT);
        medicineName.setHorizontalAlignment(SwingConstants.CENTER);
        category.setAlignmentX(Component.CENTER_ALIGNMENT);
        strengthBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        price.setAlignmentX(Component.CENTER_ALIGNMENT);

        // adding to the frame
        this.add(imageLabel);
        add(Box.createVerticalStrut(8));

        this.add(medicineName);
        this.add(Box.createVerticalStrut(5));

        this.add(category);
        this.add(Box.createVerticalStrut(5));

        this.add(strengthBox);
        this.add(Box.createVerticalStrut(5));

        this.add(price);

        JButton button= new JButton("Add to cart");
        button.setFocusable(false);
        button.setBackground(new Color(13, 95, 210));
        button.setForeground(Color.WHITE);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);

        this.add(button);
    }
}