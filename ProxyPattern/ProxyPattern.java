package ProxyPattern;

// Subject interface
interface RealSubject {
    void request();
}

// RealSubject implementation
class RealSubjectImpl implements RealSubject {
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }
}

// Proxy implementation
class Proxy implements RealSubject {
    private RealSubject realSubject;

    @Override
    public void request() {
        // Lazy initialization
        if (realSubject == null) {
            realSubject = new RealSubjectImpl();
        }

        // Access control, logging, or other tasks can be added here

        // Forward the request to the real subject
        realSubject.request();
    }
}

// Client code
public class ProxyPattern {
    public static void main(String[] args) {
        // Using the real subject directly
        RealSubject realSubject = new RealSubjectImpl();
        realSubject.request();

        System.out.println();

        // Using the proxy
        RealSubject proxy = new Proxy();
        proxy.request();
    }
}
