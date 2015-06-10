/**
 * Created by RockStar on 6/10/2015.
 */
public class Brand {
    private String nama;
    private String asal;
    private String owner;

    public Brand(String nama, String asal, String owner) {
        this.nama = nama;
        this.asal = asal;
        this.owner = owner;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "nama='" + nama + '\'' +
                ", asal='" + asal + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}


