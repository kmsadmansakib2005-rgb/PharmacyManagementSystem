import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ReceiptFrame extends JFrame {

    public ReceiptFrame(ArrayList<CartItem> cart)
    {
        this.setSize(420, 420);
        this.setTitle("Money reciept");
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0xF8F1FA));

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JLabel header = new JLabel(
                "<html><div style='text-align: center;'>" +
                        "<b>PHARMACY MANAGEMENT SYSTEM</b><br>" +
                        "<span style='font-size: 11px;'>Your Health, Our Priority!</span><br>" +
                        "<span style='font-size: 12px;'>Money Receipt</span>" +
                        "</div></html>"
        );

        header.setFont(new Font("Segoe UI", Font.BOLD, 16));
        header.setHorizontalAlignment(SwingConstants.CENTER);
        header.setForeground(new Color(0x542064));
        header.setBorder(BorderFactory.createEmptyBorder(12, 5, 12, 5));

        this.add(header, BorderLayout.NORTH);

        //receipt body
        JPanel receiptPanel= new JPanel();
        receiptPanel.setLayout(new BoxLayout(receiptPanel, BoxLayout.Y_AXIS));
        receiptPanel.setBackground(new Color(0xF8F1FA));
        receiptPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 10, 15));

        double total=0;

        for(CartItem cartItem: cart)
        {
            double iteamTotal=cartItem.medicine.price* cartItem.quantity;
            total+=iteamTotal;

            JLabel itemLabel= new JLabel(cartItem.medicine.name+" | "+
                    cartItem.strength+" | Qty: "+ cartItem.quantity+ "| Unit Price: "+
                    cartItem.medicine.price+ "| price: "+ iteamTotal+ " taka");

            itemLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
            receiptPanel.add(itemLabel);
            receiptPanel.add(Box.createVerticalStrut(8));
        }

        //scrolling
        JScrollPane receiptScroll= new JScrollPane(receiptPanel);
        receiptScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        receiptScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        this.add(receiptScroll, BorderLayout.CENTER);

        JLabel totalLabel= new JLabel("Grand Total: "+total+" taka");
        totalLabel.setFont(new Font("Arial", Font.BOLD, 14));
        totalLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        totalLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10,15));

        this.add(totalLabel, BorderLayout.SOUTH);

    }
}