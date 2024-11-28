package clase;

import java.util.Arrays;

public class Curs<note> {
    public Profesor[] profesori;
    String nume;
    String descriere;
    Student[] studenti;
    int[] note;

    public Curs(String nume, String descriere,
                Profesor profesori, Student[] studenti) {
        this.nume = nume;
        this.descriere = descriere;
        this.profesori = new Profesor[]{profesori};
        this.studenti = studenti;
        this.note = new int[studenti.length];
    }

    public void UpdateProfesor(Profesor profesori) {
        this.profesori = new Profesor[]{profesori};
    }


    public void AddStudent(Student student) {
//lucrand cu array trebuie inserat
        //  folosind un sir auxiliar
        int noualungime = studenti.length + 1;
        Student[] aux = new Student[noualungime];
        int index = 0;
        for (Student s : studenti) {
            aux[index++] = s;
        }
//la final adaugam noul student pe ultimul
        //index
        aux[index] = student;
//si realocam lista de studenti cu aux;
        this.studenti = new Student[noualungime];
        System.arraycopy(aux, 0, studenti, 0,
                noualungime);
    }

    @Override
    public String toString() {
        return "Curs{" +
                "profesori=" + Arrays.toString(profesori) +
                ", nume='" + nume + '\'' +
                ", descriere='" + descriere + '\'' +
                ", studenti=" + Arrays.toString(studenti) +
                ", note=" + Arrays.toString(note) +
                '}';
    }

    public void AdaugaStudent(Student deAdaugat) {

        int lungimenoua = studenti.length + 1;
        Student[] aux = new Student[lungimenoua];
        int index = 0;
        for (Student s : studenti) {
            aux[index++] = s;
        }
        aux[index] = deAdaugat;
        this.studenti = aux;

        int indexn = 0;
        int[] auxx = new int[lungimenoua];
        for (int n : note) {
            auxx[indexn++] = n;
        }
        auxx[indexn] = 0;
        this.note = auxx;
    }

    public void StergeStudent(String numeS, String prenS) {
        int lungimenoua = studenti.length - 1;
        Student[] aux = new Student[lungimenoua];
        int[] auxx = new int[lungimenoua];
        int index = 0;
        for (int i = 0; i < studenti.length; i++) {
            if (!studenti[i].nume.equals(numeS) && !studenti[i].prenume.equals(prenS)) {
                aux[index] = studenti[i];
                auxx[index] = note[i];
                index++;

            }
        }
        this.studenti = new Student[lungimenoua];
        System.arraycopy(aux, 0, studenti, 0, lungimenoua);
        this.note = new int[lungimenoua];
        System.arraycopy(auxx, 0, note, 0, lungimenoua);


    }

    public void ModificaStudent(Student stu, String nums, String prenums) {
        stu.nume = nums;
        stu.prenume = prenums;
    }

    public void AfiseazaStudenti() {
        for (int i = 0; i < studenti.length; i++) {
            System.out.println(studenti[i].nume + " " + studenti[i].prenume + " ");
        }
    }

    public void AdaugaProf(Profesor deAdaugat) {

        int lungimenoua = profesori.length + 1;
        Profesor[] aux = new Profesor[lungimenoua];
        int index = 0;
        for (Profesor s : profesori) {
            aux[index++] = s;
        }
        aux[index] = deAdaugat;
        this.profesori = aux;
    }

    public void StergeProf(String numeS, String prenS) {
        int lungimenoua = profesori.length - 1;
        Profesor[] aux = new Profesor[lungimenoua];
        for (int i = 0; i <= lungimenoua; i++) {
            if (profesori[i].nume != numeS && profesori[i].prenume != prenS) {
                aux[i] = profesori[i];
            }
        }
        this.profesori = aux;
    }

    public void ModificaProf(Profesor prof, String nums, String prenums) {
        prof.nume = nums;
        prof.prenume = prenums;
    }

    public void ArataStud() {
        for (int i = 0; i < studenti.length; i++) {
            System.out.println(studenti[i].nume + " " + studenti[i].prenume+" "+note[i]);
        }
    }

    public void AdNota(int nota,  Student student) {

        for (int i = 0; i < studenti.length; i++) {
            if (studenti[i].equals(student))
                note[i] = nota;
        }
    }

    public void CalculeazaMedia() {

        double medie = 0;
        int x = 0;
        for (int i = 0; i < note.length; i++) {

            if (note[i] != 0) {
                medie = medie + note[i];
                x++;
            }
        }
        medie = medie / x;
        System.out.println("Media notelor este: " + medie);

    }


}




