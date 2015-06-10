/**
 * Created by RockStar on 6/9/2015.
 */
public class GitarBass {
    //attribut
    private  String warna;
    private int jumlahSenar;
    private Brand owner;

    public GitarBass(String warna, int jumlahSenar, Brand owner) {
        this.warna = warna;
        this.jumlahSenar = jumlahSenar;
        this.owner = owner;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }

    public void setJumlahSenar(int jumlahSenar) {
        this.jumlahSenar = jumlahSenar;
    }

    public Brand getOwner() {
        return owner;
    }

    public void setOwner(Brand owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "GitarBass{" +
                "warna='" + warna + '\'' +
                ", jumlahSenar=" + jumlahSenar +
                ", owner=" + owner +
                '}';
    }
}

