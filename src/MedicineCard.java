import javax.swing.*;
import java.awt.*;

public class MedicineCard extends JPanel {

    JButton button;
    JComboBox<String> strengthBox;
    JSpinner quantitySpinner;

    MedicineCard(Medicine medicine) {

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(new Color(180, 200, 220), 1),
                        BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        this.setBackground(new Color(0xF5EFF7));

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

        //strengtth selection
        this.strengthBox = new JComboBox<>(medicine.strengths);
        strengthBox.setMaximumSize(new Dimension(80, 20));

        //quantity selection
        JLabel quantitySelector = new JLabel("Quantity: ");
        this.quantitySpinner = new JSpinner(
                new SpinnerNumberModel(1, 1, 50, 1));
        quantitySpinner.setBackground(new Color(0xF5EFF7));
        quantitySpinner.setMaximumSize(new Dimension(60, 25));

        //price
        JLabel price = new JLabel("Price: ৳" + medicine.price);

        medicineName.setAlignmentX(Component.CENTER_ALIGNMENT);
        medicineName.setHorizontalAlignment(SwingConstants.CENTER);
        category.setAlignmentX(Component.CENTER_ALIGNMENT);
        strengthBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        price.setAlignmentX(Component.CENTER_ALIGNMENT);


        this.button = new JButton("Add to cart");
        button.setFocusable(false);
        button.setBackground(new Color(0xE11D48));
        button.setForeground(Color.WHITE);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setMaximumSize(new Dimension(120, 30));

        // adding to the frame

        this.add(Box.createVerticalGlue());

        this.add(imageLabel);
        this.add(Box.createVerticalStrut(8));

        this.add(medicineName);
        this.add(Box.createVerticalStrut(5));

        this.add(category);
        this.add(Box.createVerticalStrut(5));

        this.add(strengthBox);
        this.add(Box.createVerticalStrut(5));

        this.add(price);
        this.add(Box.createVerticalStrut(5));

        this.add(button);
        this.add(Box.createVerticalStrut(5));

        JPanel quantityPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        quantityPanel.setBackground(Color.WHITE);

        quantityPanel.add(quantitySelector);
        quantityPanel.add(quantitySpinner);

        this.add(quantityPanel);

        this.add(Box.createVerticalGlue());

    }
}