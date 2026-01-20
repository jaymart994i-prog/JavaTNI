import javax.swing.JOptionPane;

public class BorrowBookTest {
    public static void main(String[] args) {
        Book book = new Book("C# Programming", 5);

        while (true) {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to borrow books?","Borrow Book",JOptionPane.YES_NO_OPTION);
            if (choice != JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "END PROGRAM");
                break;
            }

            if (book.getAvailableBook() != 0) {
                book.borrowBook();
                System.out.println("Borrowed 1 book, available " + book.getAvailableBook() + " books.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "No books available to borrow ...",
                        "",
                        JOptionPane.WARNING_MESSAGE);
                break;
            }
        }
    }
}