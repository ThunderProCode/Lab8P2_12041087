package MainPackage;


public class Main {

    public static Functions Functions = new Functions();
    public static MainScreen MainScreen = new MainScreen();
    public static MyThread MyThread = new MyThread();
    public static TableThread TableThread = new TableThread();
    
    public static void main(String[] args) {
        Functions.loadFile();
        Functions.updateComboBox();
        MainScreen.setVisible(true);
    }
    
}
