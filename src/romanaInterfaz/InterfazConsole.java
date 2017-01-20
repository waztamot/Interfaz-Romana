/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanaInterfaz;

/**
 *
 * @author git0047 (Javier Alarcon)
 */
public class InterfazConsole {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI pant = new GUI();

        if (args.length != 0){
            if (args[0].equalsIgnoreCase("0") || 
                    args[0].equalsIgnoreCase("console")){
                //pant.setVisible(true);
                //pant.setVisible(false);
                pant.btnConnect.doClick();
                pant.jBtnTomarPeso.doClick();
                System.out.println(pant.jTxtPeso.getText().trim());
                
                pant.btnDisconnect.doClick();
                System.exit(0);
            } else {
                if (args[0].equalsIgnoreCase("1") || 
                        args[0].equalsIgnoreCase("panel")){
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new GUI().setVisible(true);
                        }
                    });
                } else {
                    System.out.println("Debe indicar algun argumento.");
                    System.out.println("    1) Opcion '0' para ejecucion "
                            + "consola.");
                    System.out.println("    2) Opcion '1' para ejecucion "
                            + "de panel de control.");
                    System.exit(0);
                }
            }
        } else {
            System.out.println("Debe indicar algun argumento.");      
            System.out.println("    1) Opcion '0' para ejecucion consola.");
            System.out.println("    2) Opcion '1' para ejecucion de panel "
                    + "de control.");
            System.exit(0);
        }
    }
    
}
