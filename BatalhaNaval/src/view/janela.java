package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Valtin
 */
public class janela extends javax.swing.JFrame {

    private JPanel[][] pecasPlayer;
    private JPanel[][] pecasInimigo;

    public janela() {
        initComponents();
        config();
    }

    private void config() {
        this.setLocationRelativeTo(null);
        this.pecasPlayer = this.criaPanelsPecas(this.jTabuleiroPlayer);
        this.pecasInimigo = this.criaPanelsPecas(this.jTabuleiroInimigo);

        //Setar todas as posicoes como clicaveis
        for (JPanel[] vet : this.pecasPlayer) {
            for (JPanel panel : vet) {
                this.setPanelClicavel(panel);
            }
        }
        for (JPanel[] vet : this.pecasInimigo) {
            for (JPanel panel : vet) {
                this.setPanelClicavel(panel);
            }
        }

        escrevaCoord(this.jTabuleiroInimigo);
        escrevaCoord(this.jTabuleiroPlayer);

    }

    private void escrevaCoord(JPanel referencia) {
        int tamChar = 20;
        char letra;
        for (int i = 1; i <= 10; i++) {
            //numeros
            JLabel posicaoTxt = new JLabel();
            posicaoTxt.setText(i + "");
            posicaoTxt.setSize(tamChar, tamChar);
            posicaoTxt.setForeground(new java.awt.Color(230, 230, 230));
            this.jPanel1.add(posicaoTxt);

            posicaoTxt.setLocation(((i - 1) * 50) + referencia.getX() + (25 - tamChar / 2), referencia.getY() - tamChar - 5);
            //define a localizacao do numero paralalelamente ao Panel Tabuleiro de referencia, e calcula para manter um alinhamento
        }
        for (int i = 0; i < 5; i++) {
            JLabel posicaoTxt = new JLabel();

            switch (i) {
                case 0:
                    letra = 'A';
                    break;
                case 1:
                    letra = 'B';
                    break;
                case 2:
                    letra = 'C';
                    break;
                case 3:
                    letra = 'D';
                    break;
                default:
                    letra = 'E';

            }
            posicaoTxt.setText(letra + "");

            posicaoTxt.setSize(tamChar, tamChar);
            posicaoTxt.setForeground(new java.awt.Color(230, 230, 230));
            this.jPanel1.add(posicaoTxt);

            posicaoTxt.setLocation(referencia.getX() + referencia.getSize().width + 5, referencia.getY() + i * 50);
        }
    }

    private JPanel[][] criaPanelsPecas(JPanel tabuleiro) {
        JPanel[][] pecas = new JPanel[10][5];
        for (int x = 0; x < pecas.length; x++) {

            for (int y = 0; y < pecas[0].length; y++) {
                //cria todos os panels de cada tabuleiro e inicia suas configurações iniciais
                pecas[x][y] = new JPanel();
                pecas[x][y].setBackground(new java.awt.Color(230, 230, 230));
                pecas[x][y].setSize(50, 50);
                pecas[x][y].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                /*JLabel coord = new JLabel();
                coord.setText((x + 1) + "");
                pecas[x][y].add(coord);
                pecas[x][y].setLayout(null);
                coord.setSize(16, 16);
                coord.setLocation(1, 0);*/
                tabuleiro.add(pecas[x][y]);
                pecas[x][y].setLocation((x * 51), (y * 51));
            }

        }
        return pecas;

    }

    private void setPanelClicavel(JPanel panel) {
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabuleiroPlayer = new javax.swing.JPanel();
        jTabuleiroInimigo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(75, 75, 75));

        jTabuleiroPlayer.setBackground(new java.awt.Color(0, 0, 204));
        jTabuleiroPlayer.setPreferredSize(new java.awt.Dimension(510, 255));

        javax.swing.GroupLayout jTabuleiroPlayerLayout = new javax.swing.GroupLayout(jTabuleiroPlayer);
        jTabuleiroPlayer.setLayout(jTabuleiroPlayerLayout);
        jTabuleiroPlayerLayout.setHorizontalGroup(
            jTabuleiroPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jTabuleiroPlayerLayout.setVerticalGroup(
            jTabuleiroPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        jTabuleiroInimigo.setBackground(new java.awt.Color(0, 0, 204));
        jTabuleiroInimigo.setPreferredSize(new java.awt.Dimension(510, 255));

        javax.swing.GroupLayout jTabuleiroInimigoLayout = new javax.swing.GroupLayout(jTabuleiroInimigo);
        jTabuleiroInimigo.setLayout(jTabuleiroInimigoLayout);
        jTabuleiroInimigoLayout.setHorizontalGroup(
            jTabuleiroInimigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jTabuleiroInimigoLayout.setVerticalGroup(
            jTabuleiroInimigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabuleiroInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabuleiroPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 284, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jTabuleiroPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jTabuleiroInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jTabuleiroInimigo;
    private javax.swing.JPanel jTabuleiroPlayer;
    // End of variables declaration//GEN-END:variables
}
