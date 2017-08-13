package mill.management;

public class MillManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainShape().setVisible(true);
                
            }
        });
    }
    
}
