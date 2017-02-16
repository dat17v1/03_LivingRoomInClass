public class RunLivingRoom {
  public static void main(String[] nejJegVilIkke) {

    // Her skaber vi objekter
    Person person1 = new Person("Andreas", 30);
    Person person2 = new Person("Mathias", 22);
    Person person3 = new Person("Magnus", 23);

    // Klassenavn navn = new Klassenavn(*parametre*);
    LivingRoom room = new LivingRoom("Dark Room");
    
    // LivingRoom room2 = new LivingRoom();
    
    room.printNumberOfPeople();
    room.setPersonsNameInChair("Mohammed");
    room.setPersonsNameInCouchPosition1("Highone");
    room.setPersonsNameInCouchPosition2("Hightwo");

    // 17:
    room.setPersonsNameInCouchPosition1("Highone");

    // 18:
    room.printNumberOfPeople();

    // Prints 3 => We are happy :-)
  }
}