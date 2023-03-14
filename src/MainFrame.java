import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener{

    JButton redBtn;
    JButton greenBtn;
    JButton blueBtn;
    JButton exitBtn;
    JPanel centerPanel;

    MainFrame() {
        super("Színek");
        initComponents();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == exitBtn) {
            System.exit(0);
        } else if(event.getSource()==redBtn) {
            centerPanel.setBackground(Color.RED);
        } else if( event.getSource()==greenBtn){
            centerPanel.setBackground(Color.GREEN);
        } else if(event.getSource()== blueBtn){
            centerPanel.setBackground(Color.BLUE);
        }
        
    }

    private void initComponents() {
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        this.setLayout(new GridLayout(1,1));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        //mainPanel.setBackground(Color.CYAN);
        this.add(mainPanel);

        JPanel westPanel = new JPanel();
        westPanel.setSize(30,340);
        westPanel.setBackground(Color.YELLOW);
        mainPanel.add(westPanel , BorderLayout.WEST);

        JPanel northPanel = new JPanel();
        northPanel.setSize(500,30);
        northPanel.setBackground(Color.YELLOW);
        mainPanel.add(northPanel , BorderLayout.NORTH);

        JPanel eastPanel = new JPanel();
        eastPanel.setSize(30,340);
        eastPanel.setBackground(Color.YELLOW);
        mainPanel.add(eastPanel , BorderLayout.EAST);

        JPanel southPanel = new JPanel();
        southPanel.setSize(500,30);
        southPanel.setBackground(Color.YELLOW);
        southPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        mainPanel.add(southPanel , BorderLayout.SOUTH);

        redBtn = new JButton("Piros");
        blueBtn = new JButton("Kék");
        greenBtn = new JButton("Zöld");
        exitBtn = new JButton("Kilép");
        southPanel.add(redBtn);
        southPanel.add(greenBtn);
        southPanel.add(blueBtn);
        southPanel.add(exitBtn);
        redBtn.addActionListener(this);
        greenBtn.addActionListener(this);
        blueBtn.addActionListener(this);
        exitBtn.addActionListener(this);


        centerPanel = new JPanel();
        centerPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(centerPanel,BorderLayout.CENTER);



    }
}
