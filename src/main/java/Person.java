public class Person {
    String vorname;
    String nachname;
    char geschlecht;
    String anrede;
    public Person(String vorname, String nachname, char geschlecht ){
        setVorname(vorname);
        setNachname(nachname);
        setGeschlecht(geschlecht);

    }
    public void setVorname (String vorname){
        this.vorname = vorname;
    }
    public void  setNachname(String nachname){
        this.nachname = nachname;
    }
    public void setGeschlecht(char geschlecht){
        this.geschlecht=geschlecht;
    }
    public String getAnrede(){
        if(geschlecht== 'm'){

            anrede="Sehr geehrter Herr " + nachname;
        }else if (geschlecht=='w'){
            anrede="Sehr geehrte Frau " + nachname;
        }
        return anrede;
    }
    }


