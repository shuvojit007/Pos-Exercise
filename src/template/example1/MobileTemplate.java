package template.example1;

public abstract class MobileTemplate {

    public abstract void doNetworkOperation();

    private void startWifi() {
        System.out.println("Starting wifi connection............");
    }

    private void checkInternet() {
            System.out.println("Internet Connection is OK.......");
    }

    public void startUsing() {
        startWifi();
        checkInternet();
        doNetworkOperation();

    }

}

