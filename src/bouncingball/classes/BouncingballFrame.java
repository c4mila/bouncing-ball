
package bouncingball.classes;

import javax.swing.JFrame;


public class BouncingballFrame extends JFrame implements Runnable { 

    @Override
    public void run() {
    
        configuraJanela();
        inicializaComponentes();
    }

    private void configuraJanela() {
      setTitle("Exemplo Bouncing Ball");
      setResizable(false);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      
    }

    private void inicializaComponentes() {
        BouncingBallPanel painel = new BouncingBallPanel();
        add(painel);
                
    }
    
}
