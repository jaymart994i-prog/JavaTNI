import javax.swing.JOptionPane;

public class TicketUsed {
    public static String show_movie_list(Ticket... tickets) {
        String list = "";
        for (Ticket t : tickets) {
            list += t.getTicket_id() + ": " + t.getMovie().toString() + "\n";
        }
        return list;
    }

    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[] {
                new Ticket("T001", new Movie("Titanic", 120, "PG-13"), "12:00", "B7", 280),
                new Ticket("T002", new Movie("A Walk to Remember", 102, "PG"), "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"), "14:30", "H2", 240)
        };

        int startChoice = JOptionPane.showConfirmDialog(null,
                "Do you want to book or use a ticket?",
                "Ticket", JOptionPane.YES_NO_OPTION);

        if (startChoice == JOptionPane.NO_OPTION) {
            return;
        }

        while (true) {
            String ticketId = JOptionPane.showInputDialog(null,
                    show_movie_list(tickets) + "\n" +
                            "Enter a ticket id for booking:");

            if (ticketId == null) break;

            Ticket selectedTicket = null;
            for (Ticket t : tickets) {
                if (t.getTicket_id().equalsIgnoreCase(ticketId)) {
                    selectedTicket = t;
                    break;
                }
            }

            if (selectedTicket != null) {
                String menu = JOptionPane.showInputDialog(null,
                        selectedTicket.getMovie().toString() + "\n\n" +
                                "Press 1 to book a ticket\n" +
                                "Press 2 to use a ticket\n" +
                                "Press 3 to see a ticket status\n" +
                                "\nEnter a menu:");

                if (menu != null) {
                    if (menu.equals("1")) {
                        String msg = selectedTicket.bookTicket();
                        JOptionPane.showMessageDialog(null, msg + "\n--------------------\n" + selectedTicket.toString());
                    } else if (menu.equals("2")) {
                        String msg = selectedTicket.useTicket();
                        JOptionPane.showMessageDialog(null, msg + "\n--------------------\n" + selectedTicket.toString());
                    } else if (menu.equals("3")) {
                        JOptionPane.showMessageDialog(null, selectedTicket.toString());
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ticket ID not found!");
            }

            int continueChoice = JOptionPane.showConfirmDialog(null,
                    "Do you want to book or use other tickets?",
                    "Ticket", JOptionPane.YES_NO_OPTION);

            if (continueChoice == JOptionPane.NO_OPTION) {
                break;
            }
        }
    }
}