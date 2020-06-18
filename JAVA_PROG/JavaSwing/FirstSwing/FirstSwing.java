import javax.swing.*;



class FirstSwing{
  public static void main(String[] args){
    JFrame f = new JFrame();
    JButton b = new JButton("click");
    JComboBox c = new JComboBox();
    b.setBounds(130,100,100,40);
    c.setBounds(160,200,50,25);

    f.add(b);
    f.add(c);

    f.setSize(400,500);
    f.setLayout(null);
    f.setVisible(true);


  }


}