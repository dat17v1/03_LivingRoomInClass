public class LivingRoom {
  private String name;
  private int numberOfPeople = 0;
  private String personsNameInChair;
  private String personsNameInCouchPosition1;
  private String personsNameInCouchPosition2;

  public LivingRoom(String name){
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setPersonsNameInChair(String name) {
    this.personsNameInChair = name;
  }
  
}
