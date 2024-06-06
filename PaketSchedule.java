public class PaketSchedule implements Comparable<PaketSchedule> {
    private int id;
    private String type;
    private String name;
    private int date;
    private String alamat;

    public PaketSchedule(int id, String type, String name, int date, String alamat) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.date = date;
        this.alamat = alamat;
    }

    public int duration() {
        switch (type) {
            case "biasa":
                return 4;
            case "express":
                return 3;
            case "kilat":
                return 2;
            case "same day":
                return 1;
            default:
                return 0;
        }
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public String getAlamat() {
        return alamat;
    }

    @Override
    public String toString() {
        return "ID paket: " + id + " " + "namaPelanggan: " + name + " " + "alamatPelanggan: " + alamat;
    }


    @Override
    public int compareTo(PaketSchedule other) {
        int result = this.duration() + this.date;
        int otherResult = other.duration() + other.date;

        if (result < otherResult) {
            return -1;
        } else if (result > otherResult) {
            return 1;
        } else {
            return 0;
        }
    }
    
    

}




