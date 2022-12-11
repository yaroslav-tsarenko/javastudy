package org.example.examClouds.Lesson9.inheritance;

public class HighLevelHierarchy {
}

class E {
    public E() {
        System.out.println("In constructor E");
    }
}

class F extends E {
    public F() {
        System.out.println("In constructor F");
    }
}

class G extends F {
    public G() {
        System.out.println("In constructor G");
    }
}

class CallingConstructors {
    public static void main(String[] args) {
        G g = new G();
    }
}


class Mammal {
    String name = "furry ";

    String makeNoise() {
        return "generic noise";
    }
}

class Zebra extends Mammal {
    String name = "stripes ";

    String makeNoise() {
        return "bray";
    }
}


 class ZooKeeper {
    public static void main(String[] args) {
        new ZooKeeper().go();
    }

    void go() {
         Mammal m = new Zebra();
         System.out.println(m.name + m.makeNoise());

    }
}

class Toy {
}

class Doll extends Toy {
}

 class TestToys {
    public void doJob(Toy toy) {
        System.out.println("Toy version");
    }

    public void doJob(Doll doll) {
        System.out.println("Doll version");
    }

    public static void main(String[] args) {
        TestToys testToys = new TestToys();

        Doll doll = new Doll();
        Toy toy1 = new Toy();
        Toy toy2 = new Doll();

        testToys.doJob(doll);
        testToys.doJob(toy1);
        testToys.doJob(toy2);
    }
}