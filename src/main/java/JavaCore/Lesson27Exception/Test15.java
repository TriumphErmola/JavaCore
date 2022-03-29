package JavaCore.Lesson27Exception;

public class Test15 {
    void marafon(int temperaturaVozduha, int tempBega) throws PodvernutNoguException {
        if (tempBega > 12) {
            throw new PodvernutNoguException("temp bega slichkom visokiy " + tempBega);
        }
        if (temperaturaVozduha > 32) {
            throw new SveloMishcuException();
        }
        System.out.println("Вы пробежали марафон )))))000)))");
    }

    public static void main(String[] args) {
        Test15 test15 = new Test15();
        try {
            test15.marafon(25, 12);
        } catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("В любом случае ты заслужил грамоту за свои старания!");
        }
    }
}

class PodvernutNoguException extends Exception {
    public PodvernutNoguException(String message) {
        super(message);
    }

    public PodvernutNoguException() {
    }
}

class SveloMishcuException extends RuntimeException {
    public SveloMishcuException() {
    }

    public SveloMishcuException(String message) {
        super(message);
    }
}
