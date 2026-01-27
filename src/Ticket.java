public class Ticket {

    private String ticket_id;
    private Movie movie;
    private String show_time;
    private String seat_number;
    private double price;
    private boolean is_booked;
    private boolean is_used;

    public Ticket(String ticket_id,Movie movie,String show_time,String seat_number,double price) {
        this.ticket_id = ticket_id;
        this.movie = movie;
        this.show_time = show_time;
        this.seat_number = seat_number;
        this.price = price;
        this.is_booked = false;
        this.is_used = false;
    }

    public Ticket() {
        this("",null,"","",0.0);
    }

    public String getTicket_id() {
        return this.ticket_id;
    }

    public Movie getMovie() {
        return this.movie;
    }
    public String bookTicket() {
        if (this.is_booked == false ) { this.is_booked = true;
            return "Ticket booked successfully";
        }else{
            return "This ticket is already booked";
        }
    }
    public String useTicket() {
        if (this.is_booked == false) {
            return "Please book the ticket first";
        } else if (this.is_used == true) {
            return "Ticket already used";
        }else{ this.is_used = true;
            return "Enjoy the movie";
        }
    }
    public String toString() {
        return "Ticket Id: " + ticket_id +
                "\nMovie: " + movie +
                "\nShow Time: " + show_time +
                "\nSeat number: " + seat_number +
                "\nTicket price: " + price +
                "\nBooked: " + (this.is_booked ? "Yes" : "No") +
                "\nUsed: " + (this.is_used ? "Yes" : "No");

    }
}
