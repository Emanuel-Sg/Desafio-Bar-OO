package entities;

public class Bill {
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double cover () {
        double cover = 0.0;
        if (this.feeding() < 30) {
            cover =  4.0;
        }
        return cover;
    }
    public double feeding() {
        int beer = this.beer * 5;
        int softDrink = this.softDrink * 3;
        int barbecue = this.barbecue *  7;
        return beer + barbecue + softDrink;
    }

    public double ticket() {
        double ticket = 0.0;
        if (this.gender == 'M') {
            ticket += 10;
        } else {
            ticket += 8;
        }
        return ticket;
    }

    public double total() {
        return this.ticket() + this.feeding() + this.cover();
    }

}
