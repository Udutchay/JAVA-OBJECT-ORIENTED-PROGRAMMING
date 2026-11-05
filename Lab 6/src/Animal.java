public class Animal {
    public String sound(){
        return "";
    }
    public String name(){
        return "";
    }

    public static void main(String[] args){
       Animal[] animals = {
               new Dog(),
               new Cat(),
               new Cow()
       };

    }
    public void describe(){
        System.out.println("This animal is a " + name());
    }
    public void describe (String prefix){
        System.out.println(prefix + "this animal is named " + name());
    }
    public static void Speak(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].sound());
        };

    }

}
