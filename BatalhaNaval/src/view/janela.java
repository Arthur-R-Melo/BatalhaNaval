package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Valtin
 */
public class Janela extends javax.swing.JFrame {

    private JPanel[][] jPecasPlayer;
    private JPanel[][] JPecasIA;
    private ArrayList<JLabel> jLabelsCoordPlayer;
    private ArrayList<JLabel> jLabelsCoordIA;

    private int[] coordAtk;

    public Janela() {
        initComponents();
        config();
    }

    private void config() {
        this.setLocationRelativeTo(null);

        this.jPecasPlayer = this.criaPanelsPecas(this.jTabuleiroPlayer);
        this.JPecasIA = this.criaPanelsPecas(this.jTabuleiroIA);

        //Setar todas as posicoes como clicaveis
        this.jLabelsCoordPlayer = this.escrevaCoord(this.jTabuleiroPlayer);
        this.jLabelsCoordIA = this.escrevaCoord(this.jTabuleiroIA);

        this.setVisibleJogada(false);
    }

    private void setLabelsVisible(ArrayList<JLabel> vet, boolean op) {
        for (JLabel temp : vet) {
            temp.setVisible(op);
        }
    }

    private ArrayList<JLabel> escrevaCoord(JPanel referencia) {
        ArrayList vetorLabel = new ArrayList();

        int tamChar = 20;
        char letra;
        for (int i = 1; i <= 10; i++) {
            //numeros
            JLabel posicaoTxt = new JLabel();
            posicaoTxt.setText(i + "");
            posicaoTxt.setSize(tamChar, tamChar);
            posicaoTxt.setForeground(new java.awt.Color(230, 230, 230));
            this.jPanelFundo.add(posicaoTxt);

            posicaoTxt.setLocation(((i - 1) * 50) + referencia.getX() + 10,
                    referencia.getY() - tamChar - 5);
            //define a localizacao do numero paralalelamente ao Panel Tabuleiro de referencia, e calcula para manter um alinhamento

            vetorLabel.add(posicaoTxt);
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
            this.jPanelFundo.add(posicaoTxt);

            posicaoTxt.setLocation(referencia.getX() + referencia.getSize().width + 5, referencia.getY() + i * 50);
            vetorLabel.add(posicaoTxt);
        }
        return vetorLabel;
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

                tabuleiro.add(pecas[x][y]);
                pecas[x][y].setLocation((x * 51), (y * 51));
            }

        }
        return pecas;

    }

    public int[] getCoordAtk() {
        return coordAtk;
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
                panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            }
        });
    }

    private void jIniciaPartida() {
        this.setVisibleJogada(true);
        //define os panels do tabuleiro inimigo para poderem serem setados
        for (JPanel[] vet : this.JPecasIA) {
            for (JPanel panel : vet) {
                this.setPanelClicavel(panel);
            }
        }
    }

    private void setVisibleJogada(boolean op) {
        this.jLabelPlacarIA.setVisible(op);
        this.jLabelPlacarPlayer.setVisible(op);
        this.jLabelIA.setVisible(op);
        this.jLabelP.setVisible(op);
        this.jTabuleiroIA.setVisible(op);
        this.setLabelsVisible(jLabelsCoordIA, op);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jTabuleiroPlayer = new javax.swing.JPanel();
        jTabuleiroIA = new javax.swing.JPanel();
        jPanelPosInicial = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextPortAviaoCoord = new javax.swing.JTextField();
        jRadioPortAviaoPosH = new javax.swing.JRadioButton();
        jRadioPortAviaoPosV = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFragataCoord = new javax.swing.JTextField();
        jRadioFragataPosH = new javax.swing.JRadioButton();
        jRadioFragataPosV = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jTextCruzadorCoord = new javax.swing.JTextField();
        jRadioCruazdorPosH = new javax.swing.JRadioButton();
        jRadioCruazdorPosV = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabelP = new javax.swing.JLabel();
        jLabelIA = new javax.swing.JLabel();
        jLabelPlacarIA = new javax.swing.JLabel();
        jLabelPlacarPlayer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFundo.setBackground(new java.awt.Color(75, 75, 75));

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

        jTabuleiroIA.setBackground(new java.awt.Color(0, 0, 204));
        jTabuleiroIA.setPreferredSize(new java.awt.Dimension(510, 255));

        javax.swing.GroupLayout jTabuleiroIALayout = new javax.swing.GroupLayout(jTabuleiroIA);
        jTabuleiroIA.setLayout(jTabuleiroIALayout);
        jTabuleiroIALayout.setHorizontalGroup(
            jTabuleiroIALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jTabuleiroIALayout.setVerticalGroup(
            jTabuleiroIALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        jPanelPosInicial.setBackground(new java.awt.Color(75, 75, 75));
        jPanelPosInicial.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 230, 230));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Posiconamento Inicial:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(230, 230, 230));
        jLabel2.setText("Porta-aviões (4x):");

        jTextPortAviaoCoord.setBackground(new java.awt.Color(75, 75, 75));
        jTextPortAviaoCoord.setForeground(new java.awt.Color(230, 230, 230));
        jTextPortAviaoCoord.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jRadioPortAviaoPosH.setForeground(new java.awt.Color(230, 230, 230));
        jRadioPortAviaoPosH.setText("H");
        jRadioPortAviaoPosH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPortAviaoPosHActionPerformed(evt);
            }
        });

        jRadioPortAviaoPosV.setForeground(new java.awt.Color(230, 230, 230));
        jRadioPortAviaoPosV.setText("V");
        jRadioPortAviaoPosV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPortAviaoPosVActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(230, 230, 230));
        jLabel3.setText("Cruzador (2x):");

        jTextFragataCoord.setBackground(new java.awt.Color(75, 75, 75));
        jTextFragataCoord.setForeground(new java.awt.Color(230, 230, 230));
        jTextFragataCoord.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jRadioFragataPosH.setForeground(new java.awt.Color(230, 230, 230));
        jRadioFragataPosH.setText("H");
        jRadioFragataPosH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioFragataPosHActionPerformed(evt);
            }
        });

        jRadioFragataPosV.setForeground(new java.awt.Color(230, 230, 230));
        jRadioFragataPosV.setText("V");
        jRadioFragataPosV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioFragataPosVActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(230, 230, 230));
        jLabel4.setText("Fragata (3x):");

        jTextCruzadorCoord.setBackground(new java.awt.Color(75, 75, 75));
        jTextCruzadorCoord.setForeground(new java.awt.Color(230, 230, 230));
        jTextCruzadorCoord.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jRadioCruazdorPosH.setForeground(new java.awt.Color(230, 230, 230));
        jRadioCruazdorPosH.setText("H");
        jRadioCruazdorPosH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCruazdorPosHActionPerformed(evt);
            }
        });

        jRadioCruazdorPosV.setForeground(new java.awt.Color(230, 230, 230));
        jRadioCruazdorPosV.setText("V");
        jRadioCruazdorPosV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCruazdorPosVActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPosInicialLayout = new javax.swing.GroupLayout(jPanelPosInicial);
        jPanelPosInicial.setLayout(jPanelPosInicialLayout);
        jPanelPosInicialLayout.setHorizontalGroup(
            jPanelPosInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPosInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPosInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPosInicialLayout.createSequentialGroup()
                        .addGroup(jPanelPosInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPosInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPosInicialLayout.createSequentialGroup()
                                .addComponent(jTextPortAviaoCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioPortAviaoPosH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioPortAviaoPosV))
                            .addGroup(jPanelPosInicialLayout.createSequentialGroup()
                                .addGroup(jPanelPosInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelPosInicialLayout.createSequentialGroup()
                                        .addComponent(jTextFragataCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioFragataPosH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioFragataPosV))
                                    .addGroup(jPanelPosInicialLayout.createSequentialGroup()
                                        .addComponent(jTextCruzadorCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioCruazdorPosH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioCruazdorPosV)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanelPosInicialLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPosInicialLayout.setVerticalGroup(
            jPanelPosInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPosInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPosInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextPortAviaoCoord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioPortAviaoPosH)
                    .addComponent(jRadioPortAviaoPosV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPosInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFragataCoord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioFragataPosH)
                    .addComponent(jRadioFragataPosV)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPosInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextCruzadorCoord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioCruazdorPosH)
                    .addComponent(jRadioCruazdorPosV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelP.setForeground(new java.awt.Color(230, 230, 230));
        jLabelP.setText("Acertos Player:");

        jLabelIA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelIA.setForeground(new java.awt.Color(230, 230, 230));
        jLabelIA.setText("Acertos IA:");

        jLabelPlacarIA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPlacarIA.setForeground(new java.awt.Color(230, 230, 230));
        jLabelPlacarIA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlacarIA.setText("0");

        jLabelPlacarPlayer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPlacarPlayer.setForeground(new java.awt.Color(230, 230, 230));
        jLabelPlacarPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlacarPlayer.setText("0");

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addComponent(jTabuleiroPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jPanelPosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addComponent(jTabuleiroIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPlacarIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPlacarPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54))))
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelPosInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabuleiroPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabuleiroIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelP)
                            .addComponent(jLabelPlacarPlayer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIA)
                            .addComponent(jLabelPlacarIA))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioPortAviaoPosHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPortAviaoPosHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioPortAviaoPosHActionPerformed

    private void jRadioPortAviaoPosVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPortAviaoPosVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioPortAviaoPosVActionPerformed

    private void jRadioFragataPosHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioFragataPosHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioFragataPosHActionPerformed

    private void jRadioFragataPosVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioFragataPosVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioFragataPosVActionPerformed

    private void jRadioCruazdorPosHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCruazdorPosHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioCruazdorPosHActionPerformed

    private void jRadioCruazdorPosVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCruazdorPosVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioCruazdorPosVActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //this.jButton2.setEnabled(false);
        this.jIniciaPartida();

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelIA;
    private javax.swing.JLabel jLabelP;
    private javax.swing.JLabel jLabelPlacarIA;
    private javax.swing.JLabel jLabelPlacarPlayer;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPanel jPanelPosInicial;
    private javax.swing.JRadioButton jRadioCruazdorPosH;
    private javax.swing.JRadioButton jRadioCruazdorPosV;
    private javax.swing.JRadioButton jRadioFragataPosH;
    private javax.swing.JRadioButton jRadioFragataPosV;
    private javax.swing.JRadioButton jRadioPortAviaoPosH;
    private javax.swing.JRadioButton jRadioPortAviaoPosV;
    private javax.swing.JPanel jTabuleiroIA;
    private javax.swing.JPanel jTabuleiroPlayer;
    private javax.swing.JTextField jTextCruzadorCoord;
    private javax.swing.JTextField jTextFragataCoord;
    private javax.swing.JTextField jTextPortAviaoCoord;
    // End of variables declaration//GEN-END:variables
}
