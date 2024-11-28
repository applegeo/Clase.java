package clase;
public class Clase {
    public static void main(String[] args) {


        Student stud = new Student("Gunoiu", "George", 51235);
        Student[] studenti = new Student[]{new Student("Andrei","Negoita",2231),new Student("Ion","Mateescu",4221)};


        Profesor prof = new Profesor("Anton","Panaitescu");
        Profesor kys = new Profesor ("Beton", "Alexandru");


        Curs curs = new Curs("Rezistenta Materialelor", "calculul reacţiunilor,\n" +
                "diagramele de eforturi, calculul caracteristicilor geometrice ale\n" +
                "suprafeţelor plane şi calculul elementelor de rezistenţă la solicitări simple\n"
                , prof, studenti);
        Curs kiss = new Curs("The REssixtance", "calculul reacţiunilor,\n" +
                "diagramele de eforturi, calculul caracteristicilor geometrice ale\n" +
                "suprafeţelor plane şi calculul elementelor de rezistenţă la solicitări simple\n"
                , prof, studenti);



        ManagerCursuri cursuri = new ManagerCursuri();
        cursuri.AdaugaCurs(curs);
        cursuri.AfiseazaCursuriLaConsola();
        curs.AdaugaStudent(stud);

        System.out.println();
        cursuri.AfiseazaCursuriLaConsola();
        System.out.println();
        curs.AdaugaProf(kys);
        cursuri.AfiseazaCursuriLaConsola();
        System.out.println();
        curs.ArataStud();
        curs.StergeStudent("Gunoiu", "George");
        System.out.println();
        curs.ArataStud();
        cursuri.AdaugaCurs(kiss);
        System.out.println();
        cursuri.AfiseazaCursuriLaConsola();

        curs.AdNota(5, studenti[0]);
        curs.AdNota(8, studenti[1]);
        System.out.println();
        curs.ArataStud();
        curs.CalculeazaMedia();

        curs.ModificaStudent(studenti[0], "George", "Geass");
        System.out.println();
        curs.ArataStud();

        curs.StergeStudent("George", "Geass");
        System.out.println();
        curs.ArataStud();


        curs.ModificaProf(prof , "Busbis", "Jabba");
        cursuri.StergeCurs("The REssixtance");
        cursuri.ArataNoteCursuri();
        cursuri.AfiseazaCursuriLaConsola();



    }
}