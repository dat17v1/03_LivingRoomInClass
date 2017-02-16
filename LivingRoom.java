public class LivingRoom {
  private String name;
  private int numberOfPeople = 0;
  private String personsNameInChair = "";
  private String personsNameInCouchPosition1 = "";
  private String personsNameInCouchPosition2 = "";

  public LivingRoom(String name){
    this.name = name;
  }
  
  public void setPersonsNameInCouchPosition1(String name) {
    
    // Hvis vi ingen mælk har => køb mælk
    // Drik mælk

    // if (*vi ingen mælk har*) {
      //køb mælk
    //}
    // Drik mælk

    if (this.personsNameInCouchPosition1.isEmpty()) {
      numberOfPeople++;
    }
    this.personsNameInCouchPosition1 = name;


  }
  public void setPersonsNameInCouchPosition2(String name) {
    if (this.personsNameInCouchPosition2.isEmpty()) {
      numberOfPeople++;
    }
    this.personsNameInCouchPosition2 = name;
  }
  public void printNumberOfPeople() {
    System.out.println(numberOfPeople);
  }
  
  
  // public void setName(String name) {
  //   this.name = name;
  // }




  public void setName(String name) {
    this.name = name;
  }
  public void setPersonsNameInChair(String name) {
    if (this.personsNameInChair.isEmpty()) {
      numberOfPeople = numberOfPeople +1;
    }
    this.personsNameInChair = name;
  }
  
}
