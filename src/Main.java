import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ArrayList<CartItem> cart= new ArrayList<>();

        ImageIcon image = new ImageIcon(Main.class.getResource("img.png"));//title image

        frame.setTitle("Pharmacy Management Sytem");
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        // frame.getContentPane().setBackground(new Color(0x123456));
        frame.setIconImage(image.getImage());

        frame.setLayout(new BorderLayout());// main layout

        //creating panels
        JPanel topPanel = new JPanel();
        JPanel categoryPanel = new JPanel();
        JPanel medicinePanel = new JPanel();

        //medicines
        MedicineData data = new MedicineData();

        MedicineCard paracetamolCard = new MedicineCard(data.paracetamol);
        MedicineCard aspirinCard = new MedicineCard(data.aspirin);
        MedicineCard atorvastatinCard = new MedicineCard(data.atorvastatin);
        MedicineCard amlodipineCard = new MedicineCard(data.amlodipine);

        MedicineCard salbutamolCard = new MedicineCard(data.salbutamol);
        MedicineCard montelukastCard = new MedicineCard(data.montelukast);
        MedicineCard budesonideCard = new MedicineCard(data.budesonide);

        MedicineCard metforminCard = new MedicineCard(data.metformin);
        MedicineCard glimepirideCard = new MedicineCard(data.glimepiride);
        MedicineCard insulinCard = new MedicineCard(data.insulin);

        MedicineCard omeprazoleCard = new MedicineCard(data.omeprazole);
        MedicineCard pantoprazoleCard = new MedicineCard(data.pantoprazole);
        MedicineCard famotidineCard = new MedicineCard(data.famotidine);

        MedicineCard diclofenacCard = new MedicineCard(data.diclofenac);
        MedicineCard naproxenCard = new MedicineCard(data.naproxen);
        MedicineCard calciumCard = new MedicineCard(data.calcium);


        JPanel cartPanel = new JPanel();

        //panels borders
        //topPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        // categoryPanel.setBorder(BorderFactory.createLineBorder(new Color(0x3B1F47)));
        //medicinePanel.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        cartPanel.setBorder(BorderFactory.createLineBorder(new Color(0x3B1F47)));

        //top panel
        topPanel.setPreferredSize(new Dimension(900, 80));
        topPanel.setLayout(new BorderLayout());
        topPanel.setBackground(new Color(0x3B1F47));

        JLabel titleLabel1 = new JLabel("<html> <div style='text-align: center;'>" +
                "PHARMACY MANAGEMENT SYSTEM" + "<br> <div style='font-size: 13px'> Your Health, Our Priority!</div>" +
                "</div></html>");
        titleLabel1.setFont(new Font("Arial", Font.BOLD, 28));
        titleLabel1.setForeground(Color.WHITE);
        titleLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        topPanel.add(titleLabel1, BorderLayout.CENTER);

        //category panel
        categoryPanel.setPreferredSize(new Dimension(180, 400));
        categoryPanel.setBackground(new Color(0xF3EDF6));
        categoryPanel.setLayout(new BorderLayout());

        JLabel categoryLabel = new JLabel("CATEGORIES");
        categoryLabel.setBackground(new Color(0xF3EDF6));
        categoryLabel.setFont(new Font("Arial", Font.BOLD, 18));
        categoryLabel.setHorizontalAlignment(SwingConstants.CENTER);
        categoryLabel.setVerticalAlignment(SwingConstants.TOP);
        categoryPanel.add(categoryLabel, BorderLayout.NORTH);

        //buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 1, 3, 3));
        buttonPanel.setBackground(new Color(0xF3EDF6));




        JButton heartButton = new JButton("Heart");
        JButton lungButton = new JButton("Lung");
        JButton diabetesButton = new JButton("Diabetes");
        JButton gastricButton = new JButton("Gastric");
        JButton  orthopedicButton = new JButton("Orthopedic");
        JButton homeButton= new JButton("Home");

        heartButton.setFocusable(false);

        heartButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
        heartButton.setBackground(new Color(0xF8F1FA));
        heartButton.setForeground(Color.BLACK);

        heartButton.addActionListener(e -> {

            heartButton.setBackground(new Color(0x542064));
            heartButton.setForeground(Color.WHITE);

            lungButton.setForeground(Color.BLACK);
            lungButton.setBackground(new Color(0xF8F1FA));

            gastricButton.setForeground(Color.BLACK);
            gastricButton.setBackground(new Color(0xF8F1FA));

            diabetesButton.setForeground(Color.BLACK);
            diabetesButton.setBackground(new Color(0xF8F1FA));

            orthopedicButton.setForeground(Color.BLACK);
            orthopedicButton.setBackground(new Color(0xF8F1FA));

            homeButton.setForeground(Color.BLACK);
            homeButton.setBackground(new Color(0xF8F1FA));


            medicinePanel.removeAll();
            medicinePanel.add(aspirinCard);
            medicinePanel.add(amlodipineCard);
            medicinePanel.add(atorvastatinCard);
            medicinePanel.revalidate();
            medicinePanel.repaint();
        });


        lungButton.setFocusable(false);
        lungButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
        lungButton.setBackground(new Color(0xF8F1FA));
        lungButton.setForeground(Color.BLACK);

        lungButton.addActionListener(e -> {

            heartButton.setBackground(new Color(0xF8F1FA));
            heartButton.setForeground(Color.BLACK);

            lungButton.setForeground(Color.WHITE);
            lungButton.setBackground(new Color(0x542064));

            gastricButton.setForeground(Color.BLACK);
            gastricButton.setBackground(new Color(0xF8F1FA));

            diabetesButton.setForeground(Color.BLACK);
            diabetesButton.setBackground(new Color(0xF8F1FA));

            orthopedicButton.setForeground(Color.BLACK);
            orthopedicButton.setBackground(new Color(0xF8F1FA));

            homeButton.setForeground(Color.BLACK);
            homeButton.setBackground(new Color(0xF8F1FA));

            medicinePanel.removeAll();
            medicinePanel.add(budesonideCard);
            medicinePanel.add(montelukastCard);
            medicinePanel.add(salbutamolCard);
            medicinePanel.revalidate();
            medicinePanel.repaint();
        });


        diabetesButton.setFocusable(false);
        diabetesButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
        diabetesButton.setBackground(new Color(0xF8F1FA));
        diabetesButton.setForeground(Color.BLACK);

        diabetesButton.addActionListener(e -> {

            heartButton.setBackground(new Color(0xF8F1FA));
            heartButton.setForeground(Color.BLACK);

            lungButton.setForeground(Color.BLACK);
            lungButton.setBackground(new Color(0XF8F1FA));

            gastricButton.setForeground(Color.BLACK);
            gastricButton.setBackground(new Color(0xF8F1FA));

            diabetesButton.setForeground(Color.WHITE);
            diabetesButton.setBackground(new Color(0x542064));

            orthopedicButton.setForeground(Color.BLACK);
            orthopedicButton.setBackground(new Color(0xF8F1FA));

            homeButton.setForeground(Color.BLACK);
            homeButton.setBackground(new Color(0xF8F1FA));

            medicinePanel.removeAll();
            medicinePanel.add(metforminCard);
            medicinePanel.add(glimepirideCard);
            medicinePanel.add(insulinCard);
            medicinePanel.revalidate();
            medicinePanel.repaint();
        });


        gastricButton.setFocusable(false);
        gastricButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
        gastricButton.setBackground(new Color(0xF8F1FA));
        gastricButton.setForeground(Color.BLACK);

        gastricButton.addActionListener(e -> {

            heartButton.setBackground(new Color(0xF8F1FA));
            heartButton.setForeground(Color.BLACK);

            lungButton.setForeground(Color.BLACK);
            lungButton.setBackground(new Color(0xF8F1FA));

            gastricButton.setForeground(Color.WHITE);
            gastricButton.setBackground(new Color(0x542064));

            diabetesButton.setForeground(Color.BLACK);
            diabetesButton.setBackground(new Color(0xF8F1FA));

            orthopedicButton.setForeground(Color.BLACK);
            orthopedicButton.setBackground(new Color(0xF8F1FA));

            homeButton.setForeground(Color.BLACK);
            homeButton.setBackground(new Color(0xF8F1FA));

            medicinePanel.removeAll();
            medicinePanel.add(omeprazoleCard);
            medicinePanel.add(famotidineCard);
            medicinePanel.add(pantoprazoleCard);
            medicinePanel.revalidate();
            medicinePanel.repaint();
        });


        orthopedicButton.setFocusable(false);
        orthopedicButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
        orthopedicButton.setBackground(new Color(0xF8F1FA));
        orthopedicButton.setForeground(Color.BLACK);

        orthopedicButton.addActionListener(e -> {

            heartButton.setBackground(new Color(0xF8F1FA));
            heartButton.setForeground(Color.BLACK);

            lungButton.setForeground(Color.BLACK);
            lungButton.setBackground(new Color(0xF8F1FA));

            gastricButton.setForeground(Color.BLACK);
            gastricButton.setBackground(new Color(0xF8F1FA));

            diabetesButton.setForeground(Color.BLACK);
            diabetesButton.setBackground(new Color(0xF8F1FA));

            orthopedicButton.setForeground(Color.WHITE);
            orthopedicButton.setBackground(new Color(0x542064));

            homeButton.setForeground(Color.BLACK);
            homeButton.setBackground(new Color(0xF8F1FA));

            medicinePanel.removeAll();
            medicinePanel.add(diclofenacCard);
            medicinePanel.add(naproxenCard);
            medicinePanel.add(calciumCard);
            medicinePanel.revalidate();
            medicinePanel.repaint();
        });


        homeButton.setFocusable(false);
        homeButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
        homeButton.setBackground(new Color(0xF8F1FA));
        homeButton.setForeground(Color.BLACK);

        homeButton.addActionListener(e -> {

            heartButton.setBackground(new Color(0xF8F1FA));
            heartButton.setForeground(Color.BLACK);

            lungButton.setForeground(Color.BLACK);
            lungButton.setBackground(new Color(0xF8F1FA));

            gastricButton.setForeground(Color.BLACK);
            gastricButton.setBackground(new Color(0xF8F1FA));

            diabetesButton.setForeground(Color.BLACK);
            diabetesButton.setBackground(new Color(0xF8F1FA));

            orthopedicButton.setForeground(Color.BLACK);
            orthopedicButton.setBackground(new Color(0xF8F1FA));

            homeButton.setForeground(Color.WHITE);
            homeButton.setBackground(new Color(0x542064));

            medicinePanel.removeAll();
            medicinePanel.add(paracetamolCard);
            medicinePanel.add(aspirinCard);
            medicinePanel.add(omeprazoleCard);
            medicinePanel.revalidate();
            medicinePanel.repaint();
        });


        buttonPanel.add(heartButton);
        buttonPanel.add(lungButton);
        buttonPanel.add(diabetesButton);
        buttonPanel.add(gastricButton);
        buttonPanel.add(orthopedicButton);
        buttonPanel.add(homeButton);

        categoryPanel.add(buttonPanel, BorderLayout.CENTER);

        //medicine cart
        medicinePanel.setLayout(new GridLayout(1, 3, 15, 15));
        medicinePanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));


        medicinePanel.add(paracetamolCard);
        medicinePanel.add(aspirinCard);
        medicinePanel.add(omeprazoleCard);

        //cart panel
        cartPanel.setPreferredSize(new Dimension(900, 100));
        cartPanel.setLayout(new BorderLayout());
        cartPanel.setBackground(new Color(0xF5EFF7));

        //cart title
        JLabel cartLabel = new JLabel("CART");
        cartLabel.setFont(new Font("Arial", Font.BOLD, 18));
        cartLabel.setForeground(new Color(1, 16, 60));
        cartLabel.setHorizontalAlignment(JLabel.LEFT);
        cartLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        cartPanel.add(cartLabel, BorderLayout.NORTH);

        //checkout button
        JButton checkButton= new JButton("Checkout");
        checkButton.setFocusable(false);
        checkButton.setMaximumSize(new Dimension(120, 30));
        checkButton.setForeground(Color.WHITE);
        checkButton.setBackground(new Color(0xE11D48));

        cartPanel.add(checkButton, BorderLayout.EAST);

        //opening new window
        checkButton.addActionListener(e->{
            ReceiptFrame receipt= new ReceiptFrame(cart);
            receipt.setLocationRelativeTo(frame);
            receipt.setVisible(true);
        });

        //cart content
        JPanel cartContent = new JPanel();
        cartContent.setLayout(new BoxLayout(cartContent, BoxLayout.Y_AXIS));
        cartContent.setBackground(new Color(0xF5EFF7));

        JLabel emptyCart = new JLabel("No medicines have been added yet!");
        emptyCart.setFont(new Font("Times new Roman", Font.BOLD, 14));
        emptyCart.setAlignmentX(Component.CENTER_ALIGNMENT);
        cartContent.add(emptyCart, BorderLayout.CENTER);

        JScrollPane scrollPane= new JScrollPane(cartContent);
        scrollPane.setBorder(null);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        cartPanel.add(scrollPane, BorderLayout.CENTER);

        //total elements in cart

        JLabel totalLabel = new JLabel("Total: 0 taka");
        totalLabel.setFont(new Font("Arial", Font.BOLD, 15));
        totalLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        totalLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 15));

        cartPanel.add(totalLabel, BorderLayout.SOUTH);


        addToCart(paracetamolCard, data.paracetamol, cart, cartContent, totalLabel, emptyCart);

        addToCart(aspirinCard, data.aspirin, cart, cartContent, totalLabel, emptyCart);
        addToCart(atorvastatinCard, data.atorvastatin, cart, cartContent, totalLabel, emptyCart);
        addToCart(amlodipineCard, data.amlodipine, cart, cartContent, totalLabel, emptyCart);

        addToCart(salbutamolCard, data.salbutamol, cart, cartContent, totalLabel, emptyCart);
        addToCart(montelukastCard, data.montelukast, cart, cartContent, totalLabel, emptyCart);
        addToCart(budesonideCard, data.budesonide, cart, cartContent, totalLabel, emptyCart);

        addToCart(metforminCard, data.metformin, cart, cartContent, totalLabel, emptyCart);
        addToCart(glimepirideCard, data.glimepiride, cart, cartContent, totalLabel, emptyCart);
        addToCart(insulinCard, data.insulin, cart, cartContent, totalLabel, emptyCart);

        addToCart(omeprazoleCard, data.omeprazole, cart, cartContent, totalLabel, emptyCart);
        addToCart(pantoprazoleCard, data.pantoprazole, cart, cartContent, totalLabel, emptyCart);
        addToCart(famotidineCard, data.famotidine, cart, cartContent, totalLabel, emptyCart);

        addToCart(diclofenacCard, data.diclofenac, cart, cartContent, totalLabel, emptyCart);
        addToCart(naproxenCard, data.naproxen, cart, cartContent, totalLabel, emptyCart);
        addToCart(calciumCard, data.calcium, cart, cartContent, totalLabel, emptyCart);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(categoryPanel, BorderLayout.WEST);
        frame.add(medicinePanel, BorderLayout.CENTER);
        frame.add(cartPanel, BorderLayout.SOUTH);
        frame.setVisible(true);

    }
    static void addToCart(
            MedicineCard card,
            Medicine medicine,
            ArrayList<CartItem> cart,
            JPanel cartContent,
            JLabel totalLabel,
            JLabel emptyCart) {

        card.button.addActionListener(e -> {

            String strength =
                    card.strengthBox.getSelectedItem().toString();

            int quantity =
                    (int) card.quantitySpinner.getValue();

            CartItem item =
                    new CartItem(medicine, strength, quantity);

            cart.add(item);

            if (cart.size() == 1) {
                cartContent.remove(emptyCart);
            }
            double total = 0;

            for (CartItem cartItem : cart) {
                total += cartItem.medicine.price * cartItem.quantity;
            }

            totalLabel.setText("Total: " + (int) total+" taka");

           // cartContent.removeAll();

            JLabel itemLabel = new JLabel(
                    item.medicine.name +
                            " | " +
                            item.strength +
                            " | Qty: " +
                            item.quantity
            );

            itemLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            cartContent.add(itemLabel);

            cartContent.revalidate();
            cartContent.repaint();
        });
    }
    static void selectCategory(JButton selectedButton, JButton[] categoryButtons) {

        for (JButton button : categoryButtons) {
            button.setBackground(new Color(0xF8F1FA));
            button.setForeground(Color.BLACK);
        }

        selectedButton.setBackground(new Color(0x542064));
        selectedButton.setForeground(Color.WHITE);
    }
}