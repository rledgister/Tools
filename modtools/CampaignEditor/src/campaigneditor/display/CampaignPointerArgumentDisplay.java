/*
 * CampaignPointerArgumentDisplay.java
 *
 * Created on September 22, 2005, 5:41 PM
 */

package campaigneditor.display;

import campaigneditor.arguments.Argument;
import javax.swing.GroupLayout;

/**
 *
 * @author  daniel
 */
public class CampaignPointerArgumentDisplay extends ArgumentDisplay {
    private Argument argument;
    /** Creates new form CampaignPointerArgumentDisplay */
    public CampaignPointerArgumentDisplay() {
        initComponents();
    }
    public void setArgument(Argument arg)
    {
        this.argument = arg;
    }
    public Argument getArgument()
    {
        return this.argument;
    }
    public void updateDisplay()
    {
        return;
    }
    
    public void updateArgument()
    {
        return;
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        pointerArgLabel = new javax.swing.JLabel();

        pointerArgLabel.setText("CampaignPointer");
        pointerArgLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(pointerArgLabel)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(pointerArgLabel)
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel pointerArgLabel;
    // End of variables declaration//GEN-END:variables
    
}