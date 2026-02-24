package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Rent_page {
    JFrame frame = new JFrame("RENT");
    JPanel main = new JPanel();
    private MovieStore store;

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
            Media m = store.getItems()[i];
            films[i] = m.getId() + " - " + m.getTitle() + " [" + m.getStatus() + "]";
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

                String id = selected.split(" - ")[0];

                JPanel dialogPanel = new JPanel();
                dialogPanel.setLayout(new BoxLayout(dialogPanel, BoxLayout.Y_AXIS));
                dialogPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                JLabel info = new JLabel("<html><b>" + selected + "</b><br>Do you want to rent or buy?</html>");
                info.setAlignmentX(Component.CENTER_ALIGNMENT);

                JButton rentBtn = new JButton("RENT");
                rentBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
                rentBtn.setFont(actionFont);

                rentBtn.addActionListener(ev -> {
                    store.processRent(id);
                    JOptionPane.showMessageDialog(
                            frame,
                            "Action processed for: \n" + selected,
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    SwingUtilities.getWindowAncestor(rentBtn).dispose();
                    frame.dispose();
                    new Rent_page(store);
                });

                JButton buyBtn = new JButton("BUY");
                buyBtn.setAlignmentX(Component.CENTER_ALIGNMENT);

                buyBtn.addActionListener(ev -> {
                    store.processBuy(id);
                    JOptionPane.showMessageDialog(
                            frame,
                            "Action processed for:\n" + selected,
                            "Purchase Complete",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    SwingUtilities.getWindowAncestor(buyBtn).dispose();
                    frame.dispose();
                    new Rent_page(store);
                });

                JButton backBtn = new JButton("BACK TO MENU");
                backBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
                backBtn.addActionListener(ev -> {
                    SwingUtilities.getWindowAncestor(backBtn).dispose();
                    frame.dispose();
                    new main_page(store);
                });

                dialogPanel.add(info);
                dialogPanel.add(Box.createVerticalStrut(10));
                dialogPanel.add(rentBtn);
                dialogPanel.add(Box.createVerticalStrut(8));
                dialogPanel.add(buyBtn);
                dialogPanel.add(Box.createVerticalStrut(8));
                dialogPanel.add(backBtn);

                JOptionPane.showOptionDialog(
                        frame,
                        dialogPanel,
                        "Film Detail",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        new Object[]{},
                        null
                );
            }
        });

        JScrollPane scroll = new JScrollPane(filmList);
        scroll.setAlignmentX(Component.LEFT_ALIGNMENT);
        scroll.setBorder(BorderFactory.createEmptyBorder());

        main.add(title);
        main.add(Box.createVerticalStrut(20));
        main.add(scroll);

        frame.setContentPane(main);
        frame.setVisible(true);
    }
}