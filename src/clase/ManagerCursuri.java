package clase;

import java.sql.Connection;

public class ManagerCursuri {
    Curs[] cursuri;
    public ManagerCursuri()
    {
        Connection conn = null;
        cursuri = new Curs[0];
    }


    public void AdaugaCurs(Curs deAdaugat){

        int lungimenoua= cursuri.length+1;
        Curs[] aux=new Curs[lungimenoua];
        int index=0;
        for(Curs c : cursuri)
        {
            aux[index++] = c;
        }
        aux[index]=deAdaugat;
        this.cursuri=aux;
    }
    public void StergeCurs(String deSters){

        int lungimenoua= cursuri.length-1;
        Curs[] aux=new Curs[lungimenoua];
        int index=0;
        for(int i=0;i<=lungimenoua;i++){
            if(cursuri[i].nume!=deSters){
                aux[index]=cursuri[i];
                index++;
            }
        }
        this.cursuri=aux;
    }
    public void AfiseazaCursuriLaConsola()
    {
        for(Curs c : cursuri)
            System.out.println(c);
    }
    public void ArataNoteCursuri(){
        for(int i=0;i< cursuri.length;i++){
            System.out.println(cursuri[i].nume);
            for(int j=0;j<cursuri[i].studenti.length;j++){
                System.out.print(cursuri[i].studenti[j].nume+" "+cursuri[i].studenti[j].prenume);
            }
            System.out.println();
            for(int j=0;j<cursuri[i].studenti.length;j++){
                System.out.print(cursuri[i].note[j]);
            }

            System.out.println();
        }
    }

    public void ModificaCurs(Curs deModificat,String titluN,String descN,Profesor[] profiN,Student[] stuN){
        deModificat.nume=titluN;
        deModificat.descriere=descN;
        deModificat.profesori=profiN;
        deModificat.studenti=stuN;
    }

}