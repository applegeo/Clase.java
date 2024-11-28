package clase;

public class Profesor {
    String nume;
    String prenume;

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Profesor(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                '}';
    }
}