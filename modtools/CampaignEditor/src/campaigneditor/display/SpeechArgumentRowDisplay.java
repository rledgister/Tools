/*
 * SpeechArgumentRowDisplay.java
 *
 * Created on February 15, 2007, 10:08 PM
 */

package campaigneditor.display;

import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

/**
 *
 * @author  daniel
 */
public class SpeechArgumentRowDisplay extends javax.swing.JPanel {
    
    /**
     * Creates new form SpeechArgumentRowDisplay
     */
    public SpeechArgumentRowDisplay(String[] row) {
        initComponents();
        this.updateDisplay(row);
    }
    public SpeechArgumentRowDisplay() {
        initComponents();
    }
    public Boolean isSelected()
    {
        return this.speakerTextBox.isFocusOwner() || this.conversationTextArea.isFocusOwner();
    }
    public void setSelected(Boolean selected)
    {
        this.speakerTextBox.setEnabled(selected);
        this.conversationTextArea.setEnabled(selected);
    }
    public void updateDisplay(String[] strings)
    {
        this.speakerTextBox.setText(strings[0]);
        this.conversationTextArea.setText(strings[1]);
    }
    public String[] getDisplay()
    {
        String[] output = new String[2];
        output[0] = this.speakerTextBox.getText();
        output[1] = this.conversationTextArea.getText();
        return output;
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        speakerTextBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        conversationTextArea = new javax.swing.JTextArea();

        speakerTextBox.setEnabled(false);
        speakerTextBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                speakerTextBoxFocusLost(evt);
            }
        });
        speakerTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                speakerTextBoxMouseClicked(evt);
            }
        });

        conversationTextArea.setColumns(20);
        conversationTextArea.setLineWrap(true);
        conversationTextArea.setRows(3);
        conversationTextArea.setWrapStyleWord(true);
        conversationTextArea.setAutoscrolls(false);
        conversationTextArea.setEnabled(false);
        conversationTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                conversationTextAreaFocusLost(evt);
            }
        });
        conversationTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conversationTextAreaMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(conversationTextArea);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(speakerTextBox, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(speakerTextBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void conversationTextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conversationTextAreaMouseClicked
        this.conversationTextArea.requestFocusInWindow();
        this.setSelected(true);
    }//GEN-LAST:event_conversationTextAreaMouseClicked

    private void speakerTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speakerTextBoxMouseClicked
        this.speakerTextBox.requestFocusInWindow();
        this.setSelected(true);
    }//GEN-LAST:event_speakerTextBoxMouseClicked

    private void speakerTextBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_speakerTextBoxFocusLost
        this.setSelected(false);
    }//GEN-LAST:event_speakerTextBoxFocusLost

    private void conversationTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_conversationTextAreaFocusLost
        this.setSelected(false);
    }//GEN-LAST:event_conversationTextAreaFocusLost
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea conversationTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField speakerTextBox;
    // End of variables declaration//GEN-END:variables
    
}