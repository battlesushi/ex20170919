import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button btnExit=new Button("exit");
    private Button btnAdd=new Button("Add");
    private Label lab=new Label("0");
    private int n=0;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(300,300,350,300);
        this.setLayout(null);
        this.add(btnExit);
        this.add(btnAdd);
        this.add(lab);
        btnExit.setBounds(75,100,75,50);
        btnAdd.setBounds(75,50,75,50);
        lab.setBounds(75,175,75,50);
        btnExit.setBackground(new Color(70, 184, 255));
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                lab.setText(String.valueOf(n));
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
