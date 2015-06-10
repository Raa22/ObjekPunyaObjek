/**
 * Created by RockStar on 6/10/2015.
 */
public class TestGitarBass {
    public static void main(String[] args) {
        Brand nama = new Brand("Rick Hanes","Sidoarjo","Donny");
        System.out.println(nama.toString());
        GitarBass RickHanes = new GitarBass("coklat",4,nama);
        System.out.printf(RickHanes.toString());
    }
}
