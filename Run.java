

abstract class MobileUser {
    abstract void sendmessage();
    
}

class Wasi extends MobileUser{
    @Override
    void sendmessage(){
        System.out.println("I am a BILLIONIARE");
    }
}

 class Rafy extends MobileUser{
    @Override
    void sendmessage(){
        System.out.println("I am his Manager");
    }
}

public class Run{
    public static void main(String[] args) {
        MobileUser m1;
        m1 = new Wasi();
        m1.sendmessage();

        m1 = new Rafy();
        m1.sendmessage();
    }
    
}
