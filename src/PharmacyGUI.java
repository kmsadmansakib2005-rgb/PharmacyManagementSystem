import javax.swing.*;
import java.awt.*;

public class PharmacyGUI {
    public static void main(String[] args)
    {
        JFrame frame= new JFrame();

        ImageIcon image= new ImageIcon(Main.class.getResource("img.png"));//title image


        frame.setTitle("Pharmacy Management Sytem");
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        // frame.getContentPane().setBackground(new Color(0x123456));
        frame.setIconImage(image.getImage());

        frame.setLayout(new BorderLayout());// main layout

        //creating panels
        JPanel topPanel= new JPanel();
        JPanel categoryPanel= new JPanel();
        JPanel medicinePanel= new JPanel();

        Medicine paracetamol = new Medicine(
                "Paracetamol",
                "General",
                "500 mg",
                20,
                "paracetamol.png"
        );

        Medicine aspirin = new Medicine(
                "Aspirin",
                "Heart",
                "75 mg",
                15,
                "aspirin.png"
        );

        Medicine omeprazole = new Medicine(
                "Omeprazole",
                "Gastric",
                "20 mg",
                25,
                "omeprazol.png"
        );

        MedicineCard paracetamolCard= new MedicineCard(paracetamol);
        MedicineCard aspirinCard= new MedicineCard(aspirin);
        MedicineCard omeprazoleCard = new MedicineCard(omeprazole);


        JPanel cartPanel= new JPanel();

        //panels borders
        topPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        categoryPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        medicinePanel.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        cartPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        //top panel
        topPanel.setPreferredSize(new Dimension(900, 80));
        topPanel.setLayout(new BorderLayout());
        topPanel.setBackground(new Color(0x004680));

        JLabel titleLabel1= new JLabel("<html> <div style='text-align: center;'>" +
                "PHARMACY MANAGEMENT SYSTEM" + "<br> <div style='font-size: 13px'> Your Health, Our Priority!</div>" +
                "</div></html>");
        titleLabel1.setFont(new Font("Arial", Font.BOLD, 28));
        titleLabel1.setForeground(Color.WHITE);
        titleLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        //topPanel.add(logoLabel, BorderLayout.CENTER);
        topPanel.add(titleLabel1, BorderLayout.CENTER);

        //category panel
        categoryPanel.setPreferredSize(new Dimension(180, 400));
        categoryPanel.setLayout(new BorderLayout());

        JLabel categoryLabel= new JLabel("CATEGORIES");
        categoryLabel.setFont(new Font("Arial", Font.BOLD, 18));
        categoryLabel.setHorizontalAlignment(SwingConstants.CENTER);
        categoryLabel.setVerticalAlignment(SwingConstants.TOP);
        categoryPanel.add(categoryLabel, BorderLayout.NORTH);

        //buttons
        JPanel buttonPanel= new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 1, 3, 3));

        JButton heartButton= new JButton("Heart");
        heartButton.setFocusable(false);
        heartButton.addActionListener(e->{
            medicinePanel.removeAll();
            medicinePanel.add(aspirinCard);
            medicinePanel.revalidate();
            medicinePanel.repaint();
        });

        JButton lungButton= new JButton("Lung");
        lungButton.setFocusable(false);

        JButton diabetesButton= new JButton("Diabetes");
        diabetesButton.setFocusable(false);

        JButton gastricButton= new JButton("Gastric");
        gastricButton.setFocusable(false);
        gastricButton.addActionListener(e->{
            medicinePanel.removeAll();
            medicinePanel.add(omeprazoleCard);
            medicinePanel.revalidate();
            medicinePanel.repaint();
        });

        JButton orthopedicButton= new JButton("Orthopedic");
        orthopedicButton.setFocusable(false);

        buttonPanel.add(heartButton);
        buttonPanel.add(lungButton);
        buttonPanel.add(diabetesButton);
        buttonPanel.add(gastricButton);
        buttonPanel.add(orthopedicButton);

        categoryPanel.add(buttonPanel, BorderLayout.CENTER);

        //medicine cart
        medicinePanel.setLayout(new GridLayout(1, 3, 15, 15));
        medicinePanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        ImageIcon OriginalPara= new ImageIcon(Main.class.getResource("paracetamol.png"));
        Image paraImage= OriginalPara.getImage();
        Image resizedPara= paraImage.getScaledInstance(160, 120, Image.SCALE_SMOOTH);
        ImageIcon paracetamolImage= new ImageIcon(resizedPara);
        JLabel paracetamolIcon= new JLabel(paracetamolImage);
        paracetamolIcon.setAlignmentX(Component.CENTER_ALIGNMENT);

        ImageIcon OriginalAspirin= new ImageIcon(Main.class.getResource("aspirin.png"));
        Image aspImg= OriginalAspirin.getImage();
        Image resiszedAspirin= aspImg.getScaledInstance(160, 120, Image.SCALE_SMOOTH);
        ImageIcon aspirinImage= new ImageIcon(resiszedAspirin);
        JLabel aspirinIcon= new JLabel(aspirinImage);
        aspirinIcon.setAlignmentX(Component.CENTER_ALIGNMENT);

        ImageIcon OriginalOmeprazol= new ImageIcon(Main.class.getResource("omeprazol.png"));
        Image omeImg= OriginalOmeprazol.getImage();
        Image resizedOme= omeImg.getScaledInstance(160, 120, Image.SCALE_SMOOTH);
        ImageIcon omeImage= new ImageIcon(resizedOme);
        JLabel omeIcon= new JLabel(omeImage);
        omeIcon.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel medicineCard= new JPanel();
        medicineCard.setLayout(new BoxLayout(medicineCard, BoxLayout.Y_AXIS));
        medicineCard.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(new Color(180, 200, 220), 1),
                        BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );
        medicineCard.setBackground(Color.WHITE);

        //medicine-1
        JLabel medicineName= new JLabel("<html>" +"<span style='color:blue'>"+
                "<big>Paracetamol</big></span></html>");
        medicineName.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel category= new JLabel("Catagory: General");
        category.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel strength= new JLabel("Strength: 500 mg");
        strength.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel price= new JLabel("Price: $20");
        price.setHorizontalAlignment(SwingConstants.CENTER);

        JButton addButton= new JButton("Add to Cart");
        addButton.setFocusable(false);
        addButton.setBackground(new Color(13, 95, 210));
        addButton.setForeground(Color.WHITE);


        medicineCard.add(Box.createVerticalGlue());
        medicineCard.add(paracetamolIcon);
        medicineCard.add(Box.createVerticalStrut(5));
        medicineCard.add(medicineName);
        medicineCard.add(Box.createVerticalStrut(5));
        medicineCard.add(category);
        medicineCard.add(Box.createVerticalStrut(5));
        medicineCard.add(strength);
        medicineCard.add(Box.createVerticalStrut(5));
        medicineCard.add(price);
        medicineCard.add(Box.createVerticalStrut(8));
        medicineCard.add(addButton);
        medicineCard.add(Box.createVerticalGlue());

        medicineName.setAlignmentX(Component.CENTER_ALIGNMENT);
        category.setAlignmentX(Component.CENTER_ALIGNMENT);
        strength.setAlignmentX(Component.CENTER_ALIGNMENT);
        price.setAlignmentX(Component.CENTER_ALIGNMENT);
        addButton.setAlignmentX(Component.CENTER_ALIGNMENT);


        medicinePanel.add(medicineCard);

        //medicine-2
        JPanel medicineCard2 = new JPanel();
        medicineCard2.setLayout(new BoxLayout(medicineCard2, BoxLayout.Y_AXIS));
        medicineCard2.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(new Color(180, 200, 220), 1),
                        BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );
        medicineCard2.setBackground(Color.WHITE);

        JLabel medicineName2 = new JLabel("<html>" +"<span style='color:blue'>"+
                "<big>Aspirin</big></span></html>");
        medicineName2.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel category2 = new JLabel("Catagory: Heart");
        category2.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel strength2 = new JLabel("Strength: 75 mg");
        strength2.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel price2 = new JLabel("Price: $15");
        price2.setHorizontalAlignment(SwingConstants.CENTER);

        JButton addButton2 = new JButton("Add to Cart");
        addButton2.setFocusable(false);
        addButton2.setBackground(new Color(13, 95, 210));
        addButton2.setForeground(Color.WHITE);

        medicineCard2.add(Box.createVerticalGlue());
        medicineCard2.add(aspirinIcon);
        medicineCard2.add(Box.createVerticalStrut(5));
        medicineCard2.add(medicineName2);
        medicineCard2.add(Box.createVerticalStrut(5));
        medicineCard2.add(category2);
        medicineCard2.add(Box.createVerticalStrut(5));
        medicineCard2.add(strength2);
        medicineCard2.add(Box.createVerticalStrut(5));
        medicineCard2.add(price2);
        medicineCard2.add(Box.createVerticalStrut(8));
        medicineCard2.add(addButton2);
        medicineCard2.add(Box.createVerticalGlue());

        medicineName2.setAlignmentX(Component.CENTER_ALIGNMENT);
        category2.setAlignmentX(Component.CENTER_ALIGNMENT);
        strength2.setAlignmentX(Component.CENTER_ALIGNMENT);
        price2.setAlignmentX(Component.CENTER_ALIGNMENT);
        addButton2.setAlignmentX(Component.CENTER_ALIGNMENT);

        medicinePanel.add(medicineCard2);

        //medicine-3
        JPanel medicineCard3 = new JPanel();
        medicineCard3.setLayout(new BoxLayout(medicineCard3, BoxLayout.Y_AXIS));
        medicineCard3.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(new Color(180, 200, 220), 1),
                        BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );
        medicineCard3.setBackground(Color.WHITE);

        JLabel medicineName3 = new JLabel("<html>" +"<span style='color:blue'>"+
                "<big>Omeprazol</big></span></html>");
        medicineName3.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel category3 = new JLabel("Category: Gastric");
        category3.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel strength3 = new JLabel(" Strength: 20 mg");
        strength3.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel price3 = new JLabel("Price: $25");
        price3.setHorizontalAlignment(SwingConstants.CENTER);

        JButton addButton3 = new JButton("Add to Cart");
        addButton3.setFocusable(false);
        addButton3.setBackground(new Color(13, 95, 210));
        addButton3.setForeground(Color.WHITE);


        medicineCard3.add(Box.createVerticalGlue());
        medicineCard3.add(omeIcon);
        medicineCard3.add(Box.createVerticalStrut(5));
        medicineCard3.add(medicineName3);
        medicineCard3.add(Box.createVerticalStrut(5));
        medicineCard3.add(category3);
        medicineCard3.add(Box.createVerticalStrut(5));
        medicineCard3.add(strength3);
        medicineCard3.add(Box.createVerticalStrut(5));
        medicineCard3.add(price3);
        medicineCard3.add(Box.createVerticalStrut(8));
        medicineCard3.add(addButton3);
        medicineCard3.add(Box.createVerticalGlue());

        medicineName3.setAlignmentX(Component.CENTER_ALIGNMENT);
        category3.setAlignmentX(Component.CENTER_ALIGNMENT);
        strength3.setAlignmentX(Component.CENTER_ALIGNMENT);
        price3.setAlignmentX(Component.CENTER_ALIGNMENT);
        addButton3.setAlignmentX(Component.CENTER_ALIGNMENT);

        medicinePanel.add(medicineCard3);

        //cart panel
        cartPanel.setPreferredSize(new Dimension(900, 100));
        cartPanel.setLayout(new BorderLayout());
        cartPanel.setBackground(new Color(0xE1EAFE));

        //cart title
        JLabel cartLabel= new JLabel("CART");
        cartLabel.setFont(new Font("Arial", Font.BOLD, 18));
        cartLabel.setForeground(new Color(1, 16, 60));
        cartLabel.setHorizontalAlignment(JLabel.LEFT);
        cartLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5 ,10));

        cartPanel.add(cartLabel, BorderLayout.NORTH);


        //cart content
        JPanel cartContent= new JPanel();
        cartContent.setLayout(new BorderLayout());
        cartContent.setBackground(new Color(0xE1EAFE));

        JLabel emptyCart= new JLabel("No medicines have been added yet");
        emptyCart.setFont(new Font("Times new Roman", Font.BOLD, 14));
        emptyCart.setHorizontalAlignment(SwingConstants.CENTER);

        cartContent.add(emptyCart, BorderLayout.CENTER);
        cartPanel.add(cartContent, BorderLayout.CENTER);



        //total elements in cart

        JLabel totalLabel = new JLabel("Total: $0");
        totalLabel.setFont(new Font("Arial", Font.BOLD, 15));
        totalLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        totalLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 15));

        cartPanel.add(totalLabel, BorderLayout.SOUTH);



        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(categoryPanel, BorderLayout.WEST);
        frame.add(medicinePanel, BorderLayout.CENTER);
        frame.add(cartPanel, BorderLayout.SOUTH);
        frame.setVisible(true);



    }
}