package ua.edu.cbs.lms.hometask_oop_8.task2_4;

public class Main {
    public static void main(String[] args) {
        Device monitor = new Monitor("Samsung", "AB1234567CD",
                1024, 768, 200);

        Device ethernetAdapter = new EthernetAdapter("Intel",
                "AE32A3FFC2", 1000, "AE-32-A3-FF-C2", (float)124.90);


        System.out.println(monitor.toString());
        System.out.println(ethernetAdapter.toString());

        System.out.println(monitor.hashCode());
        System.out.println(ethernetAdapter.hashCode());

        Device newMonitor = monitor;

        if(monitor.equals(newMonitor)){
            System.out.println("Is equals.");
        }
        else {
            System.out.println("Is not equals.");
        }

        Device newEthernetAdapter = new EthernetAdapter("Intel",
                "AE32A3FFC3", 1000, "AE-32-A3-FF-C2", (float)124.90);

        if(ethernetAdapter.equals(newEthernetAdapter)){
            System.out.println("Is equals.");
        }
        else {
            System.out.println("Is not equals.");
        }
    }
}
