package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_page {
    private JFrame frame = new JFrame("MAIN PAGE");
    private JPanel mainpage = new JPanel();
    private MovieStore store;

    public main_page(MovieStore store) {
        this.store = store;

        frame.setContentPane(mainpage);
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        Color bg = new Color(250, 250, 250);
        Color text = new Color(20, 20, 20);
        Color gray = new Color(130, 130, 130);
        Color line = new Color(200, 200, 200);
        Color hover = new Color(80, 80, 80);

        mainpage.setBackground(bg);
        mainpage.setLayout(new BoxLayout(mainpage, BoxLayout.Y_AXIS));
        mainpage.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        JLabel title = new JLabel("FILM LIBRARY");
        title.setFont(new Font("Serif", Font.BOLD, 30));
        title.setForeground(text);
        title.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel subtitle = new JLabel("A curated film library");
        subtitle.setFont(new Font("sansSerif", Font.PLAIN, 12));
        subtitle.setForeground(gray);
        subtitle.setAlignmentX(Component.LEFT_ALIGNMENT);

        JSeparator lines = new JSeparator();
        lines.setForeground(line);
        lines.setMaximumSize(new Dimension(180, 1));

        JButton rentBtn = new JButton("RENT / BUY");
        JButton returnBtn = new JButton("RETURN");

        Font btnFont = new Font("SansSerif", Font.PLAIN, 16);

        for (JButton btn : new JButton[]{rentBtn, returnBtn}) {
            btn.setFont(btnFont);
            btn.setForeground(text);
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            btn.setBorder(BorderFactory.createEmptyBorder(6, 0, 6, 0));
            btn.setContentAreaFilled(false);
            btn.setFocusPainted(false);
            btn.setAlignmentX(Component.LEFT_ALIGNMENT);
        }

        rentBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                rentBtn.setForeground(hover);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                rentBtn.setForeground(text);
            }
        });

        rentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Rent_page(store);
                frame.dispose();
            }
        });

        returnBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                returnBtn.setForeground(hover);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                returnBtn.setForeground(text);
            }
        });

        returnBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = JOptionPane.showInputDialog(frame, "Enter Movie ID to Return:");
                if (id != null && !id.trim().isEmpty()) {
                    store.processReturn(id);
                    JOptionPane.showMessageDialog(frame, "Processed Return for ID: " + id);
                }
            }
        });

        mainpage.add(title);
        mainpage.add(Box.createVerticalStrut(4));
        mainpage.add(subtitle);
        mainpage.add(Box.createVerticalStrut(20));
        mainpage.add(lines);
        mainpage.add(Box.createVerticalStrut(30));
        mainpage.add(rentBtn);
        mainpage.add(Box.createVerticalStrut(16));
        mainpage.add(returnBtn);

        frame.setVisible(true);
    }
}