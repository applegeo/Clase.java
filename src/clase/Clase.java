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
        cursuri.AdaugaCurs(kiss);
        kiss.ArataStud();
        System.out.println();

        kiss.AdaugaStudent(stud);
        kiss.ArataStud();
        System.out.println();

        kiss.StergeStudent(stud);
        kiss.ArataStud();
        System.out.println();

        kiss.AdNota(6,studenti[0]);
        kiss.AdNota(8,studenti[1]);
        kiss.ArataNota();
        kiss.CalculeazaMedia();


    }
}