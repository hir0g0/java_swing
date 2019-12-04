import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.border.*;

class MachineA extends JFrame {
  Container container = null;
  JPanel mainPanel, cardPanel;
  JLabel labelA3713, labelA3714, labelA3715, labelA3716, labelA3717, labelA3718, labelA3719, labelA3720, labelA3721, labelA3723, labelA3724;
  Date date = new Date();
  String strDate;
  double fav1 = 2.5; //assume that meter automatically provide this number 
  double fav2 = fav1;
  Font f12 = new Font("Arial", Font.PLAIN, 12);
  Font f15 = new Font("Arial", Font.PLAIN, 15);
  Font f18 = new Font("Arial", Font.PLAIN, 18);
  Font f20 = new Font("Arial", Font.PLAIN, 20);
  Font f24 = new Font("Arial", Font.PLAIN, 24);

  public MachineA (String title) {
    super(title);
    container = this.getContentPane();

    //Setting:Panel,label,button,etc...
    //mainPanel
    JButton button00,button01;
    //No-Working CheckPanel
    JPanel machineAPanel,panelA31,panelA32;
    JPanel panelA320;
    JLabel labelAC[],labelAS[], labelA30,labelA31;
    JButton buttonA30;
    int i;
    String state1 = "Close";
    String state2 = "Open";
    String state3 = "NO working";
    String state4 = "Working";
    String[] mAChar = new String[]{"AP1", "AV1", "AV2", "AH1"};
    String[] mAState = new String[]{state3, state1, state1, state3};
    String[] mAState2 = new String[]{state4, state2, state2, state4};
    String check1 = "Confermed";
    String check2 = "Not Confermed";

    //Start-up AP1
    JPanel panelA33, panelA330, panelA331;
    JLabel labelA320, labelA321, labelA322, labelA323;
    JButton buttonA310, buttonA311;
    //Start-up AV1
    JPanel panelA34, panelA340, panelA341;
    JLabel labelA330, labelA331, labelA332, labelA333;
    JButton buttonA320, buttonA321;
    //Start-up AV2
    JPanel panelA35, panelA350, panelA351;
    JLabel labelA340, labelA341, labelA342, labelA343;
    JButton buttonA330, buttonA331;
    //Start-up AH1
    JPanel panelA36, panelA360, panelA361;
    JLabel labelA350, labelA351, labelA352, labelA353;
    JButton buttonA340, buttonA341;
    //Measure Panel
    JPanel panelA37, panelA370, panelA371, panelA372;
    JLabel labelA360, labelA361, labelA362, labelA363;
    JButton buttonA350, buttonA351;
    //Complete panel
    JPanel panelA38;
    JPanel panelA380, panelA381, panelA382, panelA383, panelA384, panelA385;
    JLabel labelA3701, labelA3702, labelA3703, labelA3704, labelA3705, labelA3706;
    JLabel labelA3711, labelA3712, labelA3722;



    //MainPanel
    mainPanel = new JPanel();
    mainPanel.setLayout(new GridLayout(1, 2, 5, 10));
    button00 = new JButton("Main");
    mainPanel.add(button00);
    button00.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ( (CardLayout) cardPanel.getLayout()).first(cardPanel);
      }
    });
    button01 = new JButton("Next");
    mainPanel.add(button01);
    button01.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ( (CardLayout) cardPanel.getLayout()).next(cardPanel);
      }
    });
    container.add(mainPanel);


    //No-working checkPanel
    machineAPanel = new JPanel();
    machineAPanel.setLayout(new GridLayout(2, 1, 5, 1));
    panelA31 = new JPanel();
    panelA31.setLayout(new GridLayout(2, 4, 2, 2)); //state panel
    machineAPanel.add(panelA31);
    panelA32 = new JPanel();
    panelA32.setLayout(new GridLayout(2, 1, 5, 5)); //check panel
    panelA32.setBorder(new EtchedBorder());
    machineAPanel.add(panelA32);
    panelA320 = new JPanel();
    panelA320.setLayout(new GridLayout(1, 2, 5 ,5));
    panelA320.setBorder(new EtchedBorder());
    panelA32.add(panelA320);
    labelAC = new JLabel[4]; //state of machine A
    for(i = 0; i < 4; i++) {
      labelAC[i] = new JLabel(mAChar[i], JLabel.CENTER);
      labelAC[i].setFont(f15);
      labelAC[i].setBorder(new EtchedBorder());
      panelA31.add(labelAC[i]);
    }
    labelAS = new JLabel[4];
    for(i = 0; i < 4; i++) {
      labelAS[i] = new JLabel(mAState[i], JLabel.CENTER);
      labelAS[i].setFont(f15);
      labelAS[i].setBorder(new EtchedBorder());
      labelAS[i].setForeground(Color.blue);
      panelA31.add(labelAS[i]);
    }
    labelA30 = new JLabel("No working?", JLabel.CENTER);
    labelA30.setFont(f15);
    panelA320.add(labelA30);
    buttonA30 = new JButton("Confermed");
    buttonA30.setFont(f20);
    panelA320.add(buttonA30);
    buttonA30.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonA30.setEnabled(false);
        labelA3713.setText("first check,");

      }
    });
    labelA31 = new JLabel("If you start Machine A, please push [NEXT] button", JLabel.CENTER);
    labelA31.setFont(f15);
    panelA32.add(labelA31);


    //AP1's Start-up Panel
    panelA33= new JPanel();
    panelA33.setLayout(new GridLayout(3, 1, 2, 5));
    panelA330 = new JPanel();
    panelA330.setLayout(new GridLayout(1, 3, 2, 5)); //state
    panelA33.add(panelA330);
    panelA331 = new JPanel();
    panelA331.setLayout(new GridLayout(1, 2, 10, 20)); //start and check
    panelA33.add(panelA331);
    labelA320 = new JLabel("AP1", JLabel.CENTER);
    labelA320.setBorder(new EtchedBorder());
    labelA320.setFont(f24);
    panelA330.add(labelA320);
    labelA321 = new JLabel(state3, JLabel.CENTER);
    labelA321.setBorder(new EtchedBorder());
    labelA321.setFont(f24);
    labelA321.setForeground(Color.blue);
    panelA330.add(labelA321);
    labelA322 =new JLabel(check2, JLabel.CENTER);
    labelA322.setBorder(new EtchedBorder());
    labelA322.setFont(f24);
    labelA322.setForeground(Color.blue);
    panelA330.add(labelA322);
    buttonA310 = new JButton("Start");
    buttonA310.setFont(f20);
    panelA331.add(buttonA310);
    buttonA310.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonA310.setEnabled(false);
        labelA321.setText(state4); //chenge to Working
        labelA321.setForeground(Color.red);
        labelA3714.setText("AP1");
      }
    });
    buttonA311 = new JButton("Check");
    buttonA311.setFont(f20);
    panelA331.add(buttonA311);
    buttonA311.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonA311.setEnabled(false);
        labelA322.setText(check1); //confermed working
        labelA322.setForeground(Color.green);
        labelA3715.setText("(OK),");
      }
    });
    labelA323 = new JLabel("If AP1 started, you click [NEXT] button", JLabel.CENTER);
    labelA323.setFont(f20);
    panelA33.add(labelA323);

    //AV1's Start-up Panel
    panelA34= new JPanel();
    panelA34.setLayout(new GridLayout(3, 1, 2, 5));
    panelA340 = new JPanel();
    panelA340.setLayout(new GridLayout(1, 3, 2, 5)); //state
    panelA34.add(panelA340);
    panelA341 = new JPanel();
    panelA341.setLayout(new GridLayout(1, 2, 10, 20)); //start and check
    panelA34.add(panelA341);
    labelA330 = new JLabel("AV1", JLabel.CENTER);
    labelA330.setBorder(new EtchedBorder());
    labelA330.setFont(f24);
    panelA340.add(labelA330);
    labelA331 = new JLabel(state1, JLabel.CENTER);
    labelA331.setBorder(new EtchedBorder());
    labelA331.setFont(f24);
    labelA331.setForeground(Color.blue);
    panelA340.add(labelA331);
    labelA332 =new JLabel(check2, JLabel.CENTER);
    labelA332.setBorder(new EtchedBorder());
    labelA332.setFont(f24);
    labelA332.setForeground(Color.blue);
    panelA340.add(labelA332);
    buttonA320 = new JButton("Start");
    buttonA320.setFont(f20);
    panelA341.add(buttonA320);
    buttonA320.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonA320.setEnabled(false);
        labelA331.setText(state2); //chenge to open
        labelA331.setForeground(Color.red);
        labelA3716.setText("AV1");
      }
    });
    buttonA321 = new JButton("Check");
    buttonA321.setFont(f20);
    panelA341.add(buttonA321);
    buttonA321.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonA321.setEnabled(false);
        labelA332.setText(check1); //confermed open
        labelA332.setForeground(Color.green);
        labelA3717.setText("(OK),");
      }
    });
    labelA333 = new JLabel("If AV1 started, you click [NEXT] button", JLabel.CENTER);
    labelA333.setFont(f20);
    panelA34.add(labelA333);

    //AV2's Start-up Panel
    panelA35= new JPanel();
    panelA35.setLayout(new GridLayout(3, 1, 2, 5));
    panelA350 = new JPanel();
    panelA350.setLayout(new GridLayout(1, 3, 2, 5)); //state
    panelA35.add(panelA350);
    panelA351 = new JPanel();
    panelA351.setLayout(new GridLayout(1, 2, 10,20)); //start and check
    panelA35.add(panelA351);
    labelA340 = new JLabel("AV2", JLabel.CENTER);
    labelA340.setBorder(new EtchedBorder());
    labelA340.setFont(f24);
    panelA350.add(labelA340);
    labelA341 = new JLabel(state1, JLabel.CENTER);
    labelA341.setBorder(new EtchedBorder());
    labelA341.setFont(f24);
    labelA341.setForeground(Color.blue);
    panelA350.add(labelA341);
    labelA342 = new JLabel(check2, JLabel.CENTER);
    labelA342.setBorder(new EtchedBorder());
    labelA342.setFont(f24);
    labelA342.setForeground(Color.blue);
    panelA350.add(labelA342);
    buttonA330 = new JButton("Start");
    buttonA330.setFont(f20);
    panelA351.add(buttonA330);
    buttonA330.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonA330.setEnabled(false);
        labelA341.setText(state2); //chenge to open
        labelA341.setForeground(Color.red);
        labelA3718.setText("AV2");
      }
    });
    buttonA331 = new JButton("Check");
    buttonA331.setFont(f20);
    panelA351.add(buttonA331);
    buttonA331.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonA331.setEnabled(false);
        labelA342.setText(check1); //conferm open
        labelA342.setForeground(Color.green);
        labelA3719.setText("(OK),");
      }
    });
    labelA343 = new JLabel("If AV2 started, you click [NEXT] button", JLabel.CENTER);
    labelA343.setFont(f20);
    panelA35.add(labelA343);

    //AH1's Start-up Panel
    panelA36= new JPanel();
    panelA36.setLayout(new GridLayout(3, 1, 2, 5));
    panelA360 = new JPanel();
    panelA360.setLayout(new GridLayout(1, 3, 2, 5)); //state
    panelA36.add(panelA360);
    panelA361 = new JPanel();
    panelA361.setLayout(new GridLayout(1, 2, 10, 20)); //start and check
    panelA36.add(panelA361);
    labelA350 = new JLabel("AH1", JLabel.CENTER);
    labelA350.setBorder(new EtchedBorder());
    labelA350.setFont(f24);
    panelA360.add(labelA350);
    labelA351 = new JLabel(state3, JLabel.CENTER);
    labelA351.setBorder(new EtchedBorder());
    labelA351.setFont(f24);
    labelA351.setForeground(Color.blue);
    panelA360.add(labelA351);
    labelA352 = new JLabel(check2, JLabel.CENTER);
    labelA352.setBorder(new EtchedBorder());
    labelA352.setFont(f24);
    labelA352.setForeground(Color.blue);
    panelA360.add(labelA352);
    buttonA340 = new JButton("Start");
    buttonA340.setFont(f20);
    panelA361.add(buttonA340);
    buttonA340.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonA340.setEnabled(false);
        labelA351.setText(state4); //chenge to working
        labelA351.setForeground(Color.red);
        labelA3720.setText("AH1");
      }
    });
    buttonA341 = new JButton("Check");
    buttonA341.setFont(f20);
    panelA361.add(buttonA341);
    buttonA341.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonA341.setEnabled(false);
        labelA352.setText(check1); //conferm working
        labelA352.setForeground(Color.green);
        labelA3721.setText("(OK)");
      }
    });
    labelA353 = new JLabel("If AH1 start, you click [NEXT] button", JLabel.CENTER);
    labelA353.setFont(f20);
    panelA36.add(labelA353);

    //measure FAV1 and FAV2 Panel
    panelA37 = new JPanel();
    panelA37.setLayout(new GridLayout(3, 1, 5, 5));
    panelA370 = new JPanel();
    panelA370.setLayout(new GridLayout(2, 4, 2, 2)); //new state
    panelA37.add(panelA370);
    panelA371 = new JPanel();
    panelA371.setLayout(new GridLayout(1, 3, 5, 5)); //fav1's record
    panelA371.setBorder(new EtchedBorder());
    panelA37.add(panelA371);
    panelA372 = new JPanel();
    panelA372.setLayout(new GridLayout(1, 3, 5, 5)); //fav2's record
    panelA372.setBorder(new EtchedBorder());
    panelA37.add(panelA372);
    for(i = 0; i < 4; i++) {
      labelAC[i] = new JLabel(mAChar[i], JLabel.CENTER);
      labelAC[i].setFont(f15);
      labelAC[i].setBorder(new EtchedBorder());
      panelA370.add(labelAC[i]);
    }
    for(i = 0; i < 4; i++) {
      labelAS[i] = new JLabel(mAState2[i], JLabel.CENTER);
      labelAS[i].setFont(f15);
      labelAS[i].setBorder(new EtchedBorder());
      labelAS[i].setForeground(Color.red);
      panelA370.add(labelAS[i]);
    }
    labelA360 = new JLabel("AV1's mass flow rate: ", JLabel.RIGHT);
    labelA360.setFont(f20);
    panelA371.add(labelA360);
    labelA361 = new JLabel(fav1 + " (kg/s)", JLabel.LEFT);
    labelA361.setFont(f20);
    labelA361.setForeground(Color.blue);
    panelA371.add(labelA361);
    buttonA350 = new JButton("Record");
    buttonA350.setFont(f20);
    panelA371.add(buttonA350);
    buttonA350.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonA350.setEnabled(false);
        labelA3723.setText("FAV1: " + fav1 + " (kg/s)");
      }
    });
    labelA362 = new JLabel("AV2's mass flow rate: ", JLabel.RIGHT);
    labelA362.setFont(f20);
    panelA372.add(labelA362);
    labelA363 = new JLabel(fav2 + " (kg/s)", JLabel.LEFT);
    labelA363.setFont(f20);
    labelA363.setForeground(Color.blue);
    panelA372.add(labelA363);
    buttonA351 = new JButton("Record");
    buttonA351.setFont(f20);
    panelA372.add(buttonA351);
    buttonA351.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonA351.setEnabled(false);
        labelA3724.setText("FAV2: " + fav2 + " (kg/s)");
      }
    });

    //Complete Panel
    panelA38 = new JPanel();
    panelA38.setLayout(new GridLayout(1, 2, 2, 5));
    panelA380 = new JPanel();
    panelA380.setLayout(new GridLayout(3, 2, 2, 5)); //left side
    panelA380.setBorder(new EtchedBorder());
    panelA38.add(panelA380);
    panelA381 = new JPanel();
    panelA381.setLayout(new GridLayout(3, 1, 2, 5)); //right side
    panelA381.setBorder(new EtchedBorder());
    panelA38.add(panelA381);
    panelA382 = new JPanel();
    labelA3711 = new JLabel("Execused Operation", JLabel.CENTER);
    labelA3711.setFont(f24);
    panelA381.add(labelA3711);
    panelA382.setLayout(new GridLayout(2, 1, 2, 5)); //start and check
    panelA382.setBorder(new EtchedBorder());
    panelA381.add(panelA382);
    panelA383 = new JPanel();
    panelA383.setLayout(new GridLayout(2, 1, 2, 5)); //fav1 and fav2
    panelA383.setBorder(new EtchedBorder());
    panelA381.add(panelA383);
    labelA3701 = new JLabel("Machine: ", JLabel.RIGHT);
    labelA3701.setFont(f24);
    panelA380.add(labelA3701);
    labelA3702 = new JLabel("", JLabel.LEFT);
    labelA3702.setFont(f24);
    panelA380.add(labelA3702);
    labelA3703 = new JLabel("Date: ", JLabel.RIGHT);
    labelA3703.setFont(f18);
    panelA380.add(labelA3703);
    String strDate = new SimpleDateFormat("yyMMdd").format(date);
    labelA3704 = new JLabel(strDate, JLabel.LEFT);
    labelA3704.setFont(f18);
    panelA380.add(labelA3704);
    labelA3705 = new JLabel("ID: ", JLabel.RIGHT);
    labelA3705.setFont(f18);
    panelA380.add(labelA3705);
    labelA3706 = new JLabel("", JLabel.LEFT);
    labelA3706.setFont(f18);
    panelA380.add(labelA3706);
    labelA3712 = new JLabel("Start-up(confermed):", JLabel.LEFT);
    labelA3712.setFont(f18);
    panelA382.add(labelA3712);
    FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 5, 10);
    panelA384 = new JPanel();
    panelA384.setLayout(fl);
    panelA382.add(panelA384);
    labelA3713 = new JLabel("", JLabel.CENTER);
    labelA3713.setFont(f15);
    labelA3714 = new JLabel("", JLabel.CENTER); //AP1's working
    labelA3714.setFont(f15);
    labelA3715 = new JLabel("", JLabel.CENTER); //AP1's confermed
    labelA3715.setFont(f15);
    labelA3716 = new JLabel("", JLabel.CENTER); //AV1's open
    labelA3716.setFont(f15);
    labelA3717 = new JLabel("", JLabel.CENTER); //AV1's confermed
    labelA3717.setFont(f15);
    labelA3718 = new JLabel("", JLabel.CENTER); //AV2's open
    labelA3718.setFont(f15);
    labelA3719 = new JLabel("", JLabel.CENTER); //AV2's confermed
    labelA3719.setFont(f15);
    labelA3720 = new JLabel("", JLabel.CENTER); //AH1's working
    labelA3720.setFont(f15);
    labelA3721 = new JLabel("", JLabel.CENTER); //AH1's confermed
    labelA3721.setFont(f15);
    panelA384.add(labelA3713);
    panelA384.add(labelA3714);
    panelA384.add(labelA3715);
    panelA384.add(labelA3716);
    panelA384.add(labelA3717);
    panelA384.add(labelA3718);
    panelA384.add(labelA3719);
    panelA384.add(labelA3720);
    panelA384.add(labelA3721);
    labelA3722 = new JLabel("Record:", JLabel.LEFT);
    labelA3722.setFont(f18);
    panelA383.add(labelA3722);
    panelA385 = new JPanel();
    panelA385.setLayout(new GridLayout(1, 2, 2, 5));
    panelA383.add(panelA385);
    labelA3723 = new JLabel("", JLabel.CENTER);
    labelA3723.setFont(f15);
    panelA385.add(labelA3723);
    labelA3724 = new JLabel("", JLabel.CENTER);
    labelA3724.setFont(f15);
    panelA385.add(labelA3724);


    //CardPanel setting
    cardPanel = new JPanel();
    cardPanel.setLayout(new CardLayout());
    cardPanel.add("MA_first", machineAPanel);
    cardPanel.add("MA_AP1", panelA33);
    cardPanel.add("MA_AV1", panelA34);
    cardPanel.add("MA_AV2", panelA35);
    cardPanel.add("MA_AH1", panelA36);
    cardPanel.add("MA_FAV", panelA37);
    cardPanel.add("MA_Complete", panelA38);

    container.add("South", mainPanel);
    container.add("Center", cardPanel);


    this.setLocation(200,100);
    this.setSize(640, 480);
    this.setVisible(true);

  }

  public static void main(String[] args){
    MachineA frame = new MachineA("Manual for machine A in 2019");
  }
}
