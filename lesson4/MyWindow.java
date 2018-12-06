package lesson4;
import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    private JTextField jtf;
    private JTextArea jta;
    public MyWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Сетевой Чат");
        setBounds(1500, 500, 400, 400);
        setLayout((new FlowLayout()));

        JButton jb2 = new JButton("Enter");

        jtf = new JTextField(13);
        jta = new JTextArea(10,20);
        jta.setLineWrap(true);
        JScrollPane jsp = new JScrollPane(jta);
        add(jsp);
//        add(jtf);

        jb2.addActionListener(e -> sendMsg());
        jtf.addActionListener(e -> sendMsg());
        JPanel upperPanel = new JPanel(new BorderLayout());

        upperPanel.add(jb2, BorderLayout.EAST);
        upperPanel.add(jtf, BorderLayout.CENTER);
        add(upperPanel, BorderLayout.NORTH);
        setVisible(true);
    }
    public void sendMsg(){
        jta.append(jtf.getText()+"\n");
        jtf.setText("");
        jtf.grabFocus();
    }
}

