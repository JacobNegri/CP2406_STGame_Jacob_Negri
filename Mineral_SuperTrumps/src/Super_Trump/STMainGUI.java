package Super_Trump;

//import cp2406_2016.ch14_swing.MyActivateButtno;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jnegr3 on 22/10/2016.
 */
public class STMainGUI extends JFrame {

    public static STMainGUI mainUI;
    JLabel question = new JLabel("Number of players:");
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    JTextField answer = new JTextField(10);
    JButton pressMe = new JButton("NEW GAME");
    JLabel greeting = new JLabel("");
    final int WIDTH = 275;
    final int HEIGHT = 225;

    private STGame game;
    PlayerView playerView;

    public static void main(String[] args) {
        STMainGUI frame = new STMainGUI();
        frame.setVisible(true);
    }


    public STMainGUI() {

        super("ST Game");
        mainUI = this;

        setSize(WIDTH, HEIGHT);
        //setLayout(new FlowLayout());
        question.setFont(bigFont);
        greeting.setFont(bigFont);

        JPanel panel1 = new JPanel();
        panel1.add(question);
        panel1.add(answer);
        add(panel1, BorderLayout.NORTH);
//        add(question, BorderLayout.NORTH);
//        add(answer, BorderLayout.WEST);

        add(pressMe, BorderLayout.SOUTH);

        pressMe.setToolTipText("I do not have any info, sorry");
        add(greeting, BorderLayout.EAST);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pressMe.addActionListener(e -> {

            // todo get number of players from text field
            game = new STGame(5);
            game.selectDealer();
            game.dealRandomCards();

            game.selectYouAsPlayer();

            reload();

//            STPlayer humanPlayer = game.getHumPlayer();
//
//            if(playerView != null) {
//                remove(playerView);
//            }
//
//            playerView = new PlayerView(humanPlayer);
//
//            add(playerView, BorderLayout.CENTER);
            // how to trigger repaint

            System.out.println("helloooo");
        });

        //pressMe.addActionListener(new MyActivateButtno());
        }
//       //pressMe.addActionListener((e));
//    }
//////        pressMe.addActionListener - {
//////
//////        }
////        pressMe.addActionListener(new MyActivateButtno());
//    public void actionPerformed(ActionEvent e)
//    {
//        String name = answer.getText();
//        String greet = "Hello, " + name;
//        greeting.setText(greet);
//    }

    public void reload() {

        if(playerView != null) {
            remove(playerView);
        }

        // todo add panel currentCardView

        STPlayer humanPlayer = game.getHumPlayer();

        playerView = new PlayerView(humanPlayer);

        add(playerView, BorderLayout.CENTER);

        }

}