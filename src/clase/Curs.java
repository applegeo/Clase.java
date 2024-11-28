package clase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Curs<note> {
    public Profesor[] profesori;
    String nume;
    String descriere;
    Set<Student> studenti;
    HashMap<Student, Integer > note;

    public Curs(String nume, String descriere,
                Profesor profesori, Student[] studenti) {
        this.nume = nume;
        this.descriere = descriere;
        this.profesori = new Profesor[]{profesori};
        this.studenti = new HashSet<>();
        for(Student student : studenti) {
            this.studenti.add(student);
        }
        this.note = new HashMap<>();
    }

    public void UpdateProfesor(Profesor profesori) {
        this.profesori = new Profesor[]{profesori};
    }


    public void AdaugaStudent(Student deAdaugat) {
        studenti.add(deAdaugat);
    }

    public void StergeStudent(Student deSters) {
        studenti.remove(deSters);
    }

    public void ModificaStudent(Student stu, String nums, String prenums) {
        studenti.remove(stu);
        stu.nume = nums;
        stu.prenume = prenums;
        studenti.add(stu);
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
        for (Student s : studenti) {
            System.out.println(s);
        }
    }

    public void AdNota(int nota, Student student) {
        note.put(student, nota);
    }

    public void CalculeazaMedia() {
        int med=0;
        for(HashMap.Entry<Student, Integer> entry : note.entrySet()) {
            med=med+entry.getValue();
        }
        med=med/note.size();
        System.out.println("Media studentilor este :"+ med);
    }
    public void ArataNota() {
       for(HashMap.Entry<Student, Integer> entry : note.entrySet()) {
           System.out.println(entry.getKey() + " " + entry.getValue());
       }
    }
}




