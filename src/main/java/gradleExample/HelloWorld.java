package gradleExample;


public class HelloWorld{

    public static void main(String[] args){
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        WorldTime worldTime = new WorldTime();
        System.out.println(worldTime.getTimeByCountry());
    }
}

