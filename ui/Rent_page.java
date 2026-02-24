package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Rent_page {
    JFrame frame = new JFrame("RENT & BUY");
    JPanel main = new JPanel();
    MovieStore store;

    public Rent_page(MovieStore store) {
        this.store = store;
        frame.setSize(640, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        main.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        main.setBackground(new Color(250, 250, 250));

        JLabel title = new JLabel("OUR FILM");
        title.setFont(new Font("Serif", Font.BOLD, 26));
        title.setAlignmentX(Component.LEFT_ALIGNMENT);

        Font actionFont = new Font("SansSerif", Font.PLAIN, 13);

        String[] films = new String[store.getItemCount()];
        for (int i = 0; i < store.getItemCount(); i++) {
            films[i] = store.getItems()[i].getId() + " - " + store.getItems()[i].getTitle() +
                    " [" + store.getItems()[i].getStatus() + "]";
        }

        JList<String> filmList = new JList<>(films);
        filmList.setFont(new Font("SansSerif", Font.PLAIN, 14));
        filmList.setBackground(new Color(250, 250, 250));
        filmList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        filmList.setFixedCellHeight(36);

        filmList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String selected = filmList.getSelectedValue();
                if (selected == null) return;

                String[] parts = selected.split(" - ");
                String selectedId = parts[0];

                JPanel dialogPanel = new JPanel();
                dialogPanel.setLayout(new BoxLayout(dialogPanel, BoxLayout.Y_AXIS));
                dialogPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                JLabel info = new JLabel("<html><b>" + selected + "</b><br>Do you want to Rent or Buy?</html>");
                info.setAlignmentX(Component.CENTER_ALIGNMENT);

                JButton rentBtn = new JButton("RENT");
                rentBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
                rentBtn.setFont(actionFont);

                rentBtn.addActionListener(ev -> {
                    boolean success = store.processRent(selectedId);
                    if (success) {
                        JOptionPane.showMessageDialog(frame, "You rented :\n" + selectedId, "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Failed! Movie is already Rented or Sold.", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                    SwingUtilities.getWindowAncestor(rentBtn).dispose();
                    frame.dispose();
                    new Rent_page(store);
                });

                JButton buyBtn = new JButton("BUY");
                buyBtn.setAlignmentX(Component.CENTER_ALIGNMENT);

                buyBtn.addActionListener(ev -> {
                    boolean success = store.processBuy(selectedId);
                    if (success) {
                        JOptionPane.showMessageDialog(frame, "You purchased:\n" + selectedId, "Purchase Complete", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Failed! Movie is already Rented or Sold.", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                    SwingUtilities.getWindowAncestor(buyBtn).dispose();
                    frame.dispose();
                    new Rent_page(store);
                });

                dialogPanel.add(info);
                dialogPanel.add(Box.createVerticalStrut(10));
                dialogPanel.add(rentBtn);
                dialogPanel.add(Box.createVerticalStrut(8));
                dialogPanel.add(buyBtn);

                JOptionPane.showMessageDialog(frame, dialogPanel, "Film Detail", JOptionPane.PLAIN_MESSAGE);
            }
        });

        JScrollPane scroll = new JScrollPane(filmList);
        scroll.setAlignmentX(Component.LEFT_ALIGNMENT);
        scroll.setBorder(BorderFactory.createEmptyBorder());

        JButton backBtn = new JButton("BACK TO MAIN PAGE");
        backBtn.setAlignmentX(Component.LEFT_ALIGNMENT);
        backBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
        backBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backBtn.addActionListener(e -> {
            frame.dispose();
            new main_page(store);
        });

        main.add(title);
        main.add(Box.createVerticalStrut(20));
        main.add(scroll);
        main.add(Box.createVerticalStrut(20));
        main.add(backBtn);

        frame.setContentPane(main);
        frame.setVisible(true);
    }
}