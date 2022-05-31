public class Cat {
    public String name;
    public boolean hungry;

    Cat(){
        this("No name");
    }
    Cat(String name){
        this(name, false);
    }
    Cat(String name, boolean hungry){
        this.name = name;
        this.hungry = hungry;
    }

    public void play() {
        if (hungry){
            Out.println(name + " is not playing because they're hungry.");
        } else {
            Out.println(name + " is playing.");
            hungry = true;
        }
    }

    public void eat(){
        Out.println(name + " is eating.");
        hungry = false;
    }
}