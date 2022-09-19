
package javasort;
//import java.lang.Comparable;
public class Dados implements Comparable<Dados>{
   private int id;
   private String personagem;
   private double poder;
   private String saga;
   private String serie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    public String getSaga() {
        return saga;
    }

    public void setSaga(String saga) {
        this.saga = saga;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
  
    
    @Override    
    public int compareTo(Dados outroDado){
      return this.getPersonagem().
              compareTo(outroDado.getPersonagem());
    }
    
    
    // @Override
    // public String toString(){
    //     return getCidade()+ " : " + getCondicao() ;
    // }
    
}
