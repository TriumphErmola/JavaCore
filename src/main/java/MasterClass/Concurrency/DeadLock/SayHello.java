package MasterClass.Concurrency.DeadLock;

public class SayHello {
    public static void main(String[] args) {

        final Person person1 = new Person("Vi");
        final Person person2 = new Person("Samurai");

        new Thread(new Runnable() {
            @Override
            public void run() {
                person1.hisSayHello(person2);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                person2.hisSayHello(person1);
            }
        }).start();

    }

    static class Person {
        private final String personName;

        public Person(String personName) {
            this.personName = personName;
        }

        public String getPersonName() {
            return personName;
        }

        public synchronized void hisSayHello(Person person) {
            System.out.format("%s: %s" + " has said hello to me!%n", this.personName, person.getPersonName());
            person.hisSayHelloBackLol(this);
        }

        public synchronized void hisSayHelloBackLol(Person person) {
            System.out.format("%s: %s" + " has said hello back to me!%n", this.personName, person.getPersonName());
        }
    }


}
