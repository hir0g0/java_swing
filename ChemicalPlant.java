import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


class ChemicalPlant extends JFrame {
  Container container = null;
  JPanel mainPanel, cardPanel;
  JPanel startPanel, selectPanel, machineAPanel, machineXPanel;
  JLabel label15,  label21;
  JButton button21, button22;
  CardLayout layout = new CardLayout();
  int i;
  //Font Setting
  Font f12 = new Font("Arial", Font.PLAIN, 12);
  Font f15 = new Font("Arial", Font.PLAIN, 15);
  Font f18 = new Font("Arial", Font.PLAIN, 18);
  Font f20 = new Font("Arial", Font.PLAIN, 20);
  Font f24 = new Font("Arial", Font.PLAIN, 24);
  Font f30 = new Font("Arial", Font.PLAIN, 30);
  //Border Setting
  EtchedBorder eborder = new EtchedBorder(EtchedBorder.RAISED, Color.white, Color.black);
  //Flowlayout Setting
  FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 5, 10);
  //Machine A***************************************************
  JPanel panelA33, panelA34, panelA35, panelA36, panelA37, panelA38;
  JLabel labelA3702, labelA3706;
  JLabel labelA3713, labelA3714, labelA3715, labelA3716, labelA3717, labelA3718, labelA3719;
  JLabel labelA3720, labelA3721, labelA3723, labelA3724;
  Date date = new Date();
  double fav1 = 2.5; //automatically provided 
  double fav2 = fav1; //automatically provided 
  //**********************************************************
  //MachineX***************************************************
  JPanel panelX43, panelX44, panelX45, panelX46, panelX47, panelX48, panelX49;
  JLabel labelX4802, labelX4806, labelX4813, labelX4814, labelX4815, labelX4816, labelX4817, labelX4818, labelX4819;
  JLabel labelX4820, labelX4821, labelX4822, labelX4823, labelX4825, labelX4826, labelX4827, labelX4828;
  double f1 = 5.0; //automatically provided 
  double f2 = 5.0; //automatically provided 
  double temp = 320; //automatically provided 
//************************************************************
  JPanel panel50;

  public ChemicalPlant (String title) {

    super(title);
    container = this.getContentPane();

    //declear of each panel
    //mainPanel
    JButton button00,button01;
    JLabel label01;
    //startPanel
    JPanel panel11, panel12, buttonPanel;
    JButton button[];
    JLabel label11, label12, label13, label14;
    String[] numIN = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    //selectPanel
    JPanel panel20, panel21;
    JLabel label20;
    
    //both machine setting
    String state1 = "Close";
    String state2 = "Open";
    String state3 = "NO working";
    String state4 = "Working";
    String check1 = "Confermed";
    String check2 = "Not Confermed";
    //MachineA*******************************************************
    //No-Working CheckPanel
    JPanel panelA31,panelA32;
    JPanel panelA320;
    JLabel labelAC[],labelAS[], labelA30,labelA31;
    JButton buttonA30;
    String[] mAChar = new String[]{"AP1", "AV1", "AV2", "AH1"};
    String[] mAState = new String[]{state3, state1, state1, state3};
    String[] mAState2 = new String[]{state4, state2, state2, state4};
    //Start-up AP1
    JPanel panelA330, panelA331;
    JLabel labelA320, labelA321, labelA322, labelA323;
    JButton buttonA310, buttonA311;
    //Start-up AV1
    JPanel panelA340, panelA341;
    JLabel labelA330, labelA331, labelA332, labelA333;
    JButton buttonA320, buttonA321;
    //Start-up AV2
    JPanel panelA350, panelA351;
    JLabel labelA340, labelA341, labelA342, labelA343;
    JButton buttonA330, buttonA331;
    //Start-up AH1
    JPanel panelA360, panelA361;
    JLabel labelA350, labelA351, labelA352, labelA353;
    JButton buttonA340, buttonA341;
    //Measure Panel
    JPanel panelA370, panelA371, panelA372;
    JLabel labelA360, labelA361, labelA362, labelA363;
    JButton buttonA350, buttonA351;
    //Complete panel
    JPanel panelA380, panelA381, panelA382, panelA383, panelA384, panelA385;
    JLabel labelA3701, labelA3703, labelA3704, labelA3705;
    JLabel labelA3711, labelA3712, labelA3722;
    /**************************************************************/
    /**************************************************************/
    //Machine X
    //No-Working CheckPanel
    JPanel panelX41,panelX42;
    JPanel panelX420;
    JLabel labelXC[],labelXS[], labelX40,labelX41;
    JButton buttonX40;
    String[] mXChar = new String[]{"XP1", "XP2", "XV1", "XV2", "XV3"};
    String[] mXState = new String[]{state3, state3, state1, state1, state1};
    String[] mXState2 = new String[]{state4, state4, state2, state2, state2};

    //Start-up XP1
    JPanel panelX430, panelX431;
    JLabel labelX420, labelX421, labelX422, labelX423;
    JButton buttonX410, buttonX411;
    //Start-up XP2
    JPanel panelX440, panelX441;
    JLabel labelX430, labelX431, labelX432, labelX433;
    JButton buttonX420, buttonX421;
    //Start-up XV1
    JPanel panelX450, panelX451, panelX452;
    JLabel labelX440, labelX441, labelX442, labelX443, labelX444, labelX445;
    JButton buttonX430, buttonX431, buttonX432;
    //Start-up XV2
    JPanel panelX460, panelX461, panelX462;
    JLabel labelX450, labelX451, labelX452, labelX453, labelX454, labelX455;
    JButton buttonX440, buttonX441, buttonX442;
    //XV3 panel
    JPanel panelX470, panelX471;
    JLabel labelX460, labelX461, labelX462, labelX463;
    JButton buttonX450, buttonX451;
    //Measure Panel
    JPanel panelX480, panelX481, panelX482;
    JLabel labelX470, labelX471, labelX472, labelX473;
    JButton buttonX460, buttonX461;
    //Complete panel
    JPanel panelX490, panelX491, panelX492, panelX493, panelX494, panelX495;
    JLabel labelX4801, labelX4803, labelX4804, labelX4805;
    JLabel labelX4811, labelX4812, labelX4824;

    /***************************************************************/
    //finish panel
    JLabel label50, label51;

    //MainPanel
    mainPanel = new JPanel();
    mainPanel.setLayout(new GridLayout(1, 3, 5, 10));
    mainPanel.setBorder(eborder);
    button00 = new JButton("MAIN");
    button00.setFont(f15);
    mainPanel.add(button00);
    button00.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ( (CardLayout) cardPanel.getLayout()).first(cardPanel);
        label15.setText("");
        button21.setEnabled(true);
        button22.setEnabled(true);
        label21.setText("");

        //reset cardPanel
        cardPanel.remove(machineAPanel);
        cardPanel.remove(panelA33);
        cardPanel.remove(panelA34);
        cardPanel.remove(panelA35);
        cardPanel.remove(panelA36);
        cardPanel.remove(panelA37);
        cardPanel.remove(panelA38);
        cardPanel.remove(machineXPanel);
        cardPanel.remove(panelX43);
        cardPanel.remove(panelX44);
        cardPanel.remove(panelX45);
        cardPanel.remove(panelX46);
        cardPanel.remove(panelX47);
        cardPanel.remove(panelX48);
        cardPanel.remove(panelX49);
        cardPanel.remove(panel50);
      }
    });
    label01 = new JLabel("");
    mainPanel.add(label01);
    button01 = new JButton("NEXT");
    button01.setFont(f15);
    mainPanel.add(button01);
    button01.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          ( (CardLayout) cardPanel.getLayout()).next(cardPanel);
      }
    });

    //StartPanel
    startPanel = new JPanel();
    startPanel.setLayout(new GridLayout(2, 1, 2, 5));
    label11 = new JLabel("Start-up Manual", JLabel.CENTER);
    label11.setFont(f30);
    label11.setBorder(eborder);
    startPanel.add(label11);
    panel11 = new JPanel();
    panel11.setLayout(new GridLayout(1, 2, 2, 5));
    panel11.setBorder(eborder);
    startPanel.add(panel11);
    panel12 = new JPanel();
    panel12.setLayout(new GridLayout(2, 2, 2, 5));
    panel11.add(panel12);
    buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(5, 2, 2, 2));
    buttonPanel.setBorder(eborder);
    panel11.add(buttonPanel);
    label12 = new JLabel("Date:", JLabel.RIGHT);
    label12.setFont(f15);
    panel12.add(label12);
    String strDate = new SimpleDateFormat("yyMMdd").format(date);
    label13 = new JLabel (strDate,JLabel.LEFT);
    label13.setFont(f15);
    panel12.add(label13);
    label14 = new JLabel("Your ID:", JLabel.RIGHT);
    label14.setFont(f15);
    panel12.add(label14);
    label15 = new JLabel("", JLabel.LEFT);
    label15.setFont(f15);
    panel12.add(label15);
    button = new JButton[10];
    for(i = 0; i < 10; i++) {
      button[i] = new JButton(numIN[i]);
      button[i].setFont(f15);
      buttonPanel.add(button[i]);
      button[i].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String aString = label15.getText();
          JButton btn = (JButton) e.getSource();
          if (aString.length() < 4) { //if user input more number, this isn't reflect ID
            aString = aString + btn.getText();
            label15.setText(aString);
            labelA3706.setText(aString); //machineA's complete panel
            labelX4806.setText(aString); //machineX's complete panel
          }
        }
      });
    }
    container.add(mainPanel);

    //SelectPanel
    selectPanel = new JPanel();
    selectPanel.setLayout(new GridLayout(2, 1, 10, 20));
    panel20 = new JPanel();
    panel20.setLayout(new GridLayout(1, 2, 10, 20));
    selectPanel.add(panel20);
    panel21 = new JPanel();
    panel21.setLayout(new GridLayout(1, 2, 10, 20));
    selectPanel.add(panel21);
    label20 = new JLabel("Select machine: ", JLabel.RIGHT);
    label20.setFont(f30);
    panel20.add(label20);
    label21 = new JLabel("", JLabel.LEFT);
    label21.setForeground(Color.red);
    label21.setFont(f30);
    panel20.add(label21);
    button21 = new JButton("Machine A");
    button21.setFont(f15);
    button21.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        button21.setEnabled(false);
        button22.setEnabled(false);
        label21.setText("A...click [NEXT]");
        labelA3702.setText("A");

        cardPanel.add("MA_first", machineAPanel);
        cardPanel.add("MA_AP1", panelA33);
        cardPanel.add("MA_AV1", panelA34);
        cardPanel.add("MA_AV2", panelA35);
        cardPanel.add("MA_AH1", panelA36);
        cardPanel.add("MA_Check", panelA37);
        cardPanel.add("MA_Complete", panelA38);
        cardPanel.add("finish", panel50); 
      }
    });
    panel21.add(button21);
    button22 = new JButton("Machine X");
    button22.setFont(f15);
    button22.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        button21.setEnabled(false);
        button22.setEnabled(false);
        label21.setText("X...click [NEXT]");
        labelX4802.setText("X");

        cardPanel.add("MX_first", machineXPanel);
        cardPanel.add("MX_XP1", panelX43);
        cardPanel.add("MX_XP2", panelX44);
        cardPanel.add("MX_XV1", panelX45);
        cardPanel.add("MX_XV2", panelX46);
        cardPanel.add("MX_XV3", panelX47);
        cardPanel.add("MX_Check", panelX48);
        cardPanel.add("MX_Complete", panelX49);
        cardPanel.add("finish", panel50); 
      }
    });
    panel21.add(button22);

    /**********************************************************************/
    //Machine A
    //No-working checkPanel
    machineAPanel = new JPanel();
    machineAPanel.setLayout(new GridLayout(2, 1, 5, 1));
    panelA31 = new JPanel();
    panelA31.setLayout(new GridLayout(2, 4, 2, 2)); //state panel
    machineAPanel.add(panelA31);
    panelA32 = new JPanel();
    panelA32.setLayout(new GridLayout(2, 1, 5, 5)); //check panel
    panelA32.setBorder(eborder);
    machineAPanel.add(panelA32);
    panelA320 = new JPanel();
    panelA320.setLayout(new GridLayout(1, 2, 5 ,5));
    panelA320.setBorder(eborder);
    panelA32.add(panelA320);
    labelAC = new JLabel[4]; //state of machine A
    for(i = 0; i < 4; i++) {
      labelAC[i] = new JLabel(mAChar[i], JLabel.CENTER);
      labelAC[i].setFont(f15);
      labelAC[i].setBorder(eborder);
      panelA31.add(labelAC[i]);
    }
    labelAS = new JLabel[4];
    for(i = 0; i < 4; i++) {
      labelAS[i] = new JLabel(mAState[i], JLabel.CENTER);
      labelAS[i].setFont(f15);
      labelAS[i].setBorder(eborder);
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
    labelA320.setBorder(eborder);
    labelA320.setFont(f24);
    panelA330.add(labelA320);
    labelA321 = new JLabel(state3, JLabel.CENTER);
    labelA321.setBorder(eborder);
    labelA321.setFont(f24);
    labelA321.setForeground(Color.blue);
    panelA330.add(labelA321);
    labelA322 =new JLabel(check2, JLabel.CENTER);
    labelA322.setBorder(eborder);
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
    labelA330.setBorder(eborder);
    labelA330.setFont(f24);
    panelA340.add(labelA330);
    labelA331 = new JLabel(state1, JLabel.CENTER);
    labelA331.setBorder(eborder);
    labelA331.setFont(f24);
    labelA331.setForeground(Color.blue);
    panelA340.add(labelA331);
    labelA332 =new JLabel(check2, JLabel.CENTER);
    labelA332.setBorder(eborder);
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
    labelA340.setBorder(eborder);
    labelA340.setFont(f24);
    panelA350.add(labelA340);
    labelA341 = new JLabel(state1, JLabel.CENTER);
    labelA341.setBorder(eborder);
    labelA341.setFont(f24);
    labelA341.setForeground(Color.blue);
    panelA350.add(labelA341);
    labelA342 = new JLabel(check2, JLabel.CENTER);
    labelA342.setBorder(eborder);
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
    labelA350.setBorder(eborder);
    labelA350.setFont(f24);
    panelA360.add(labelA350);
    labelA351 = new JLabel(state3, JLabel.CENTER);
    labelA351.setBorder(eborder);
    labelA351.setFont(f24);
    labelA351.setForeground(Color.blue);
    panelA360.add(labelA351);
    labelA352 = new JLabel(check2, JLabel.CENTER);
    labelA352.setBorder(eborder);
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
    panelA371.setBorder(eborder);
    panelA37.add(panelA371);
    panelA372 = new JPanel();
    panelA372.setLayout(new GridLayout(1, 3, 5, 5)); //fav2's record
    panelA372.setBorder(eborder);
    panelA37.add(panelA372);
    for(i = 0; i < 4; i++) {
      labelAC[i] = new JLabel(mAChar[i], JLabel.CENTER);
      labelAC[i].setFont(f15);
      labelAC[i].setBorder(eborder);
      panelA370.add(labelAC[i]);
    }
    for(i = 0; i < 4; i++) {
      labelAS[i] = new JLabel(mAState2[i], JLabel.CENTER);
      labelAS[i].setFont(f15);
      labelAS[i].setBorder(eborder);
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
    panelA380.setLayout(new GridLayout(3, 2, 2, 5)); //left-side
    panelA380.setBorder(eborder);
    panelA38.add(panelA380);
    panelA381 = new JPanel();
    panelA381.setLayout(new GridLayout(3, 1, 2, 5)); //right-side
    panelA381.setBorder(eborder);
    panelA38.add(panelA381);
    labelA3711 = new JLabel("Execused Operation", JLabel.CENTER);
    labelA3711.setFont(f24);
    panelA381.add(labelA3711);
    panelA382 = new JPanel();
    panelA382.setLayout(new GridLayout(2, 1, 2, 5)); //start and check
    panelA382.setBorder(eborder);
    panelA381.add(panelA382);
    panelA383 = new JPanel();
    panelA383.setLayout(new GridLayout(2, 1, 2, 5)); //fav1 and fav2
    panelA383.setBorder(eborder);
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
    panelA384 = new JPanel();
    panelA384.setLayout(fl);
    panelA382.add(panelA384);
    labelA3713 = new JLabel("", JLabel.CENTER); //first-check
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

    /*************************************************************************/

    /************************************************************************///Machine X
    //No-working checkPanel
    machineXPanel = new JPanel();
    machineXPanel.setLayout(new GridLayout(2, 1, 5, 1));
    panelX41 = new JPanel();
    panelX41.setLayout(new GridLayout(2, 5, 2, 2)); //state panel
    machineXPanel.add(panelX41);
    panelX42 = new JPanel();
    panelX42.setLayout(new GridLayout(2, 1, 5, 5)); //check panel
    panelX42.setBorder(eborder);
    machineXPanel.add(panelX42);
    panelX420 = new JPanel();
    panelX420.setLayout(new GridLayout(1, 2, 5, 5));
    panelX420.setBorder(eborder);
    panelX42.add(panelX420);
    labelXC = new JLabel[5];//state of machine X
    for(i = 0; i < 5; i++) {
      labelXC[i] = new JLabel(mXChar[i], JLabel.CENTER);
      labelXC[i].setFont(f15);
      labelXC[i].setBorder(eborder);
      panelX41.add(labelXC[i]);
    }
    labelXS = new JLabel[5];
    for(i = 0; i < 5; i++) {
      labelXS[i] = new JLabel(mXState[i], JLabel.CENTER);
      labelXS[i].setFont(f15);
      labelXS[i].setBorder(eborder);
      labelXS[i].setForeground(Color.blue);
      panelX41.add(labelXS[i]);
    }
    labelX40 = new JLabel("No working?", JLabel.CENTER);
    labelX40.setFont(f15);
    panelX420.add(labelX40);
    buttonX40 = new JButton("Confermed");
    buttonX40.setFont(f20);
    panelX420.add(buttonX40);
    buttonX40.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX40.setEnabled(false);
        labelX4813.setText("first-check, ");
      }
    });
    labelX41 = new JLabel("If you start Machine X, please push [NEXT] button", JLabel.CENTER);
    labelX41.setFont(f15);
    panelX42.add(labelX41);


    //XP1's Start-up Panel
    panelX43= new JPanel();
    panelX43.setLayout(new GridLayout(3, 1, 2, 5));
    panelX430 = new JPanel();
    panelX430.setLayout(new GridLayout(1, 3, 2, 5)); //state
    panelX43.add(panelX430);
    panelX431 = new JPanel();
    panelX431.setLayout(new GridLayout(1, 2, 10, 20)); //start and check
    panelX43.add(panelX431);
    labelX420 = new JLabel("XP1", JLabel.CENTER);
    labelX420.setBorder(eborder);
    labelX420.setFont(f24);
    panelX430.add(labelX420);
    labelX421 = new JLabel(state3, JLabel.CENTER);
    labelX421.setBorder(eborder);
    labelX421.setFont(f24);
    labelX421.setForeground(Color.blue);
    panelX430.add(labelX421);
    labelX422 =new JLabel(check2, JLabel.CENTER);
    labelX422.setBorder(eborder);
    labelX422.setFont(f24);
    labelX422.setForeground(Color.blue);
    panelX430.add(labelX422);
    buttonX410 = new JButton("Start");
    buttonX410.setFont(f20);
    panelX431.add(buttonX410);
    buttonX410.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX410.setEnabled(false);
        labelX421.setText(state4); //chenge to Working
        labelX421.setForeground(Color.red);
        labelX4814.setText("XP1");
      }
    });
    buttonX411 = new JButton("Check");
    buttonX411.setFont(f20);
    panelX431.add(buttonX411);
    buttonX411.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX411.setEnabled(false);
        labelX422.setText(check1);  //confermed working
        labelX422.setForeground(Color.green);
        labelX4815.setText("(OK),");
      }
    });
    labelX423 = new JLabel("If XP1 started, you click [NEXT] button", JLabel.CENTER);
    labelX423.setFont(f20);
    panelX43.add(labelX423);

    
    //XP2's Start-up Panel
    panelX44= new JPanel();
    panelX44.setLayout(new GridLayout(3, 1, 2, 5));
    panelX440 = new JPanel();
    panelX440.setLayout(new GridLayout(1, 3, 2, 5)); //state
    panelX44.add(panelX440);
    panelX441 = new JPanel();
    panelX441.setLayout(new GridLayout(1, 2, 10, 20)); //start and check
    panelX44.add(panelX441);
    labelX430 = new JLabel("XP2", JLabel.CENTER);
    labelX430.setBorder(eborder);
    labelX430.setFont(f24);
    panelX440.add(labelX430);
    labelX431 = new JLabel(state3, JLabel.CENTER);
    labelX431.setBorder(eborder);
    labelX431.setFont(f24);
    labelX431.setForeground(Color.blue);
    panelX440.add(labelX431);
    labelX432 =new JLabel(check2, JLabel.CENTER);
    labelX432.setBorder(eborder);
    labelX432.setFont(f24);
    labelX432.setForeground(Color.blue);
    panelX440.add(labelX432);
    buttonX420 = new JButton("Start");
    buttonX420.setFont(f20);
    panelX441.add(buttonX420);
    buttonX420.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX420.setEnabled(false);
        labelX431.setText(state4); //chenge to open
        labelX431.setForeground(Color.red);
        labelX4816.setText("XP2");
      }
    });
    buttonX421 = new JButton("Check");
    buttonX421.setFont(f20);
    panelX441.add(buttonX421);
    buttonX421.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX421.setEnabled(false);
        labelX432.setText(check1); //confermed working
        labelX432.setForeground(Color.green);
        labelX4817.setText("(OK),");
      }
    });
    labelX433 = new JLabel("If XP2 started, you click [NEXT] button", JLabel.CENTER);
    labelX433.setFont(f20);
    panelX44.add(labelX433);


    //XV1's Start-up Panel
    panelX45= new JPanel();
    panelX45.setLayout(new GridLayout(4, 1, 2, 5));
    panelX450 = new JPanel();
    panelX450.setLayout(new GridLayout(1, 3, 2, 5)); //state
    panelX45.add(panelX450);
    panelX451 = new JPanel();
    panelX451.setLayout(new GridLayout(1, 2, 10, 20)); //start and check
    panelX45.add(panelX451);
    panelX452 = new JPanel();
    panelX452.setLayout(new GridLayout(1, 3, 2, 5)); //record
    panelX45.add(panelX452);
    labelX440 = new JLabel("XV1", JLabel.CENTER);
    labelX440.setBorder(eborder);
    labelX440.setFont(f24);
    panelX450.add(labelX440);
    labelX441 = new JLabel(state1, JLabel.CENTER);
    labelX441.setBorder(eborder);
    labelX441.setFont(f24);
    labelX441.setForeground(Color.blue);
    panelX450.add(labelX441);
    labelX442 = new JLabel(check2, JLabel.CENTER);
    labelX442.setBorder(eborder);
    labelX442.setFont(f24);
    labelX442.setForeground(Color.blue);
    panelX450.add(labelX442);
    labelX443 = new JLabel("Mass of Flow of XV1: ", JLabel.RIGHT);
    labelX443.setFont(f20);
    panelX452.add(labelX443);
    labelX444 = new JLabel("", JLabel.LEFT);
    labelX444.setForeground(Color.blue);
    labelX444.setFont(f20);
    panelX452.add(labelX444);
    buttonX432 = new JButton("Record");
    buttonX432.setFont(f20);
    buttonX432.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX432.setEnabled(false);
        labelX4825.setText("F1: " + f1 + " (kg/s)");
      }
    });
    panelX452.add(buttonX432);
    buttonX430 = new JButton("Start");
    buttonX430.setFont(f20);
    panelX451.add(buttonX430);
    buttonX430.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX430.setEnabled(false);
        labelX441.setText(state2); //chenge to open
        labelX441.setForeground(Color.red);
        labelX444.setText( f1 + " (kg/s)");
        labelX4818.setText("XV1");
      }
    });
    buttonX431 = new JButton("Check");
    buttonX431.setFont(f20);
    panelX451.add(buttonX431);
    buttonX431.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX431.setEnabled(false);
        labelX442.setText(check1); //confermed open
        labelX442.setForeground(Color.green);
        labelX4819.setText("(OK),");
      }
    });
    labelX445 = new JLabel("If XV1 started, you click [NEXT] button", JLabel.CENTER);
    labelX445.setFont(f20);
    panelX45.add(labelX445);


    //XV2's Start-up Panel
    panelX46= new JPanel();
    panelX46.setLayout(new GridLayout(4, 1, 2, 5));
    panelX460 = new JPanel();
    panelX460.setLayout(new GridLayout(1, 3, 2, 5)); //state
    panelX46.add(panelX460);
    panelX461 = new JPanel();
    panelX461.setLayout(new GridLayout(1, 2, 10, 20)); //start and check
    panelX46.add(panelX461);
    panelX462 = new JPanel();
    panelX462.setLayout(new GridLayout(1, 3, 2, 5)); //record
    panelX46.add(panelX462);
    
    labelX450 = new JLabel("XV2", JLabel.CENTER);
    labelX450.setBorder(eborder);
    labelX450.setFont(f24);
    panelX460.add(labelX450);
    labelX451 = new JLabel(state3, JLabel.CENTER);
    labelX451.setBorder(eborder);
    labelX451.setFont(f24);
    labelX451.setForeground(Color.blue);
    panelX460.add(labelX451);
    labelX452 = new JLabel(check2, JLabel.CENTER);
    labelX452.setBorder(eborder);
    labelX452.setFont(f24);
    labelX452.setForeground(Color.blue);
    panelX460.add(labelX452);
    labelX453 = new JLabel("Mass of Flow of XV2: ", JLabel.RIGHT);
    labelX453.setFont(f20);
    panelX462.add(labelX453);
    labelX454 = new JLabel("", JLabel.LEFT);
    labelX454.setForeground(Color.blue);
    labelX454.setFont(f20);
    panelX462.add(labelX454);
    buttonX442 = new JButton("Record");
    buttonX442.setFont(f20);
    buttonX442.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX442.setEnabled(false);
        labelX4826.setText("F2: " + f2 + " (kg/s)");
      }
    });
    panelX462.add(buttonX442);
    buttonX440 = new JButton("Start");
    buttonX440.setFont(f20);
    panelX461.add(buttonX440);
    buttonX440.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX440.setEnabled(false);
        labelX451.setText(state4); //chenge to open
        labelX451.setForeground(Color.red);
        labelX454.setText( f2 + " (kg/s)");
        labelX4820.setText("XV2");
      }
    });
    buttonX441 = new JButton("Check");
    buttonX441.setFont(f20);
    panelX461.add(buttonX441);
    buttonX441.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX441.setEnabled(false);
        labelX452.setText(check1); //confermed open
        labelX452.setForeground(Color.green);
        labelX4821.setText("(OK),");
      }
    });
    labelX455 = new JLabel("If XV2 started, you click [NEXT] button", JLabel.CENTER);
    labelX455.setFont(f20);
    panelX46.add(labelX455);

    
    //Start-up XV3
    panelX47 = new JPanel();
    panelX47.setLayout(new GridLayout(3, 1, 2, 5));
    panelX470 = new JPanel();
    panelX470.setLayout(new GridLayout(1, 3, 2, 5)); //state
    panelX47.add(panelX470);
    panelX471 = new JPanel();
    panelX471.setLayout(new GridLayout(1, 2, 10, 20)); //start and check
    panelX47.add(panelX471);
    labelX460 = new JLabel("XV3", JLabel.CENTER);
    labelX460.setBorder(eborder);
    labelX460.setFont(f24);
    panelX470.add(labelX460);
    labelX461 = new JLabel(state1, JLabel.CENTER);
    labelX461.setBorder(eborder);
    labelX461.setFont(f24);
    labelX461.setForeground(Color.blue);
    panelX470.add(labelX461);
    labelX462 = new JLabel(check2, JLabel.CENTER);
    labelX462.setBorder(eborder);
    labelX462.setFont(f24);
    labelX462.setForeground(Color.blue);
    panelX470.add(labelX462);
    buttonX450 = new JButton("Start");
    buttonX450.setFont(f20);
    panelX471.add(buttonX450);
    buttonX450.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX450.setEnabled(false);
        labelX461.setText(state2); //chenge to open
        labelX461.setForeground(Color.red);
        labelX4822.setText("XV3");
      }
    });
    buttonX451 = new JButton("Check");
    buttonX451.setFont(f20);
    panelX471.add(buttonX451);
    buttonX451.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX451.setEnabled(false);
        labelX462.setText(check1); //confermed open
        labelX462.setForeground(Color.green);
        labelX4823.setText("(OK)");
      }
    });
    labelX463 = new JLabel("If XV3 started, you click [NEXT] button", JLabel.CENTER);
    labelX463.setFont(f20);
    panelX47.add(labelX463);

    //measure Product and Temperature Panel
    panelX48 = new JPanel();
    panelX48.setLayout(new GridLayout(3, 1, 5, 5));
    panelX480 = new JPanel();
    panelX480.setLayout(new GridLayout(2, 4, 2, 2)); //new state
    panelX48.add(panelX480);
    panelX481 = new JPanel();
    panelX481.setLayout(new GridLayout(1, 3, 2, 5)); //measure product
    panelX481.setBorder(eborder);
    panelX48.add(panelX481);
    panelX482 = new JPanel();
    panelX482.setLayout(new GridLayout(1, 3, 2, 5)); //measure temperature
    panelX482.setBorder(eborder);
    panelX48.add(panelX482);
    for(i = 0; i < 5; i++) {
      labelXC[i] = new JLabel(mXChar[i], JLabel.CENTER);
      labelXC[i].setFont(f15);
      labelXC[i].setBorder(eborder);
      panelX480.add(labelXC[i]);
    }
    for(i = 0; i < 5; i++) {
      labelXS[i] = new JLabel(mXState2[i], JLabel.CENTER);
      labelXS[i].setFont(f15);
      labelXS[i].setBorder(eborder);
      labelXS[i].setForeground(Color.red);
      panelX480.add(labelXS[i]);
    }
    labelX470 = new JLabel("Mass flow rate: ", JLabel.RIGHT);
    labelX470.setFont(f20);
    panelX481.add(labelX470);
    labelX471 = new JLabel((f1 + f2) + " (kg/s)", JLabel.LEFT);
    labelX471.setFont(f20);
    labelX471.setForeground(Color.blue);
    panelX481.add(labelX471);
    buttonX460 = new JButton("Record");
    buttonX460.setFont(f20);
    panelX481.add(buttonX460);
    buttonX460.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX460.setEnabled(false);
        labelX4827.setText("Product: " + (f1 + f2) + " (kg/s)");
      }
    });
    labelX472 = new JLabel("Check under 350(K): ", JLabel.RIGHT);
    labelX472.setFont(f20);
    panelX482.add(labelX472);
    labelX473 = new JLabel(temp + " (K)", JLabel.LEFT);
    labelX473.setFont(f20);
    labelX473.setForeground(Color.blue);
    panelX482.add(labelX473);
    buttonX461 = new JButton("Record");
    buttonX461.setFont(f20);
    panelX482.add(buttonX461);
    buttonX461.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX461.setEnabled(false);
        labelX4828.setText("Temp: " + temp + " (K)");
      }
    });

    //Complete Panel
    panelX49 = new JPanel();
    panelX49.setLayout(new GridLayout(1, 2, 2, 5));
    panelX490 = new JPanel();
    panelX490.setLayout(new GridLayout(3, 2, 2, 5)); //left-side
    panelX490.setBorder(eborder);
    panelX49.add(panelX490);
    panelX491 = new JPanel();
    panelX491.setLayout(new GridLayout(3, 1, 2, 5)); //right-side
    panelX491.setBorder(eborder);
    panelX49.add(panelX491);
    labelX4811 = new JLabel("Execused Operation", JLabel.CENTER);
    labelX4811.setFont(f24);
    panelX491.add(labelX4811);
    panelX492 = new JPanel();
    panelX492.setLayout(new GridLayout(2, 1, 5, 5)); //start and  check
    panelX492.setBorder(eborder);
    panelX491.add(panelX492);
    panelX493 = new JPanel();
    panelX493.setLayout(new GridLayout(2, 1, 5, 10)); //record
    panelX493.setBorder(eborder);
    panelX491.add(panelX493);
    labelX4801 = new JLabel("Machine: ", JLabel.RIGHT);
    labelX4801.setFont(f24);
    panelX490.add(labelX4801);
    labelX4802 = new JLabel("", JLabel.LEFT);
    labelX4802.setFont(f24);
    panelX490.add(labelX4802);
    labelX4803 = new JLabel("Date: ", JLabel.RIGHT);
    labelX4803.setFont(f18);
    panelX490.add(labelX4803);
    labelX4804 = new JLabel(strDate, JLabel.LEFT);
    labelX4804.setFont(f18);
    panelX490.add(labelX4804);
    labelX4805 = new JLabel("ID: ", JLabel.RIGHT);
    labelX4805.setFont(f18);
    panelX490.add(labelX4805);
    labelX4806 = new JLabel("", JLabel.LEFT);
    labelX4806.setFont(f18);
    panelX490.add(labelX4806);
    labelX4812 = new JLabel("Start-up(confermed): ", JLabel.LEFT);
    labelX4812.setFont(f18);
    panelX492.add(labelX4812);
    panelX494 = new JPanel();
    panelX494.setLayout(fl);
    panelX492.add(panelX494);
    labelX4813 = new JLabel("", JLabel.CENTER); //first-check
    labelX4813.setFont(f15);
    labelX4814 = new JLabel("", JLabel.CENTER); //XP1's working
    labelX4814.setFont(f15);
    labelX4815 = new JLabel("", JLabel.CENTER); //XP1's confermed
    labelX4815.setFont(f15);
    labelX4816 = new JLabel("", JLabel.CENTER); //XP2's working
    labelX4816.setFont(f15);
    labelX4817 = new JLabel("", JLabel.CENTER); //XP2's confermed
    labelX4817.setFont(f15);
    labelX4818 = new JLabel("", JLabel.CENTER); //XV1's open
    labelX4818.setFont(f15);
    labelX4819 = new JLabel("", JLabel.CENTER); //XV1's confermed
    labelX4819.setFont(f15);
    labelX4820 = new JLabel("", JLabel.CENTER); //XV2's open
    labelX4820.setFont(f15);
    labelX4821 = new JLabel("", JLabel.CENTER); //XV2's confermed
    labelX4821.setFont(f15);
    labelX4822 = new JLabel("", JLabel.CENTER); //XV3's open
    labelX4822.setFont(f15);
    labelX4823 = new JLabel("", JLabel.CENTER); //XV3's confermed
    labelX4823.setFont(f15);
    labelX4828 = new JLabel("", JLabel.CENTER); //temperature
    labelX4828.setFont(f15);
    panelX494.add(labelX4813);
    panelX494.add(labelX4814);
    panelX494.add(labelX4815);
    panelX494.add(labelX4816);
    panelX494.add(labelX4817);
    panelX494.add(labelX4818);
    panelX494.add(labelX4819);
    panelX494.add(labelX4820);
    panelX494.add(labelX4821);
    panelX494.add(labelX4822);
    panelX494.add(labelX4823);
    panelX494.add(labelX4828);
    labelX4824 = new JLabel("Record: ", JLabel.LEFT);
    labelX4824.setFont(f18);
    panelX493.add(labelX4824);
    panelX495 = new JPanel();
    panelX495.setLayout(fl);
    panelX493.add(panelX495);
    labelX4825 = new JLabel("", JLabel.CENTER);
    labelX4825.setFont(f15);
    labelX4826 = new JLabel("", JLabel.CENTER);
    labelX4826.setFont(f15);
    labelX4827 = new JLabel("", JLabel.CENTER);
    labelX4827.setFont(f15);
    panelX495.add(labelX4825);
    panelX495.add(labelX4826);
    panelX495.add(labelX4827);

    /************************************************************************/

    //Finish Panel
    panel50 = new JPanel();
    panel50.setLayout(new GridLayout(2, 1, 5, 10));
    label50 = new JLabel("Finish Machine Set-up", JLabel.CENTER);
    label50.setFont(f30);
    panel50.add(label50);
    label51 = new JLabel("Please click [MAIN] button", JLabel.CENTER);
    label51.setFont(f24);
    panel50.add(label51);

    //CardPanel setting
    cardPanel = new JPanel();
    cardPanel.setLayout(layout);
    cardPanel.add("Main", startPanel);
    cardPanel.add("Select", selectPanel);

    //container layout setting
    container.add("South", mainPanel);
    container.add("Center", cardPanel);


    this.setLocation(200,100);
    this.setSize(640, 480);
    this.setVisible(true);

  }

  public static void main(String[] args){
    ChemicalPlant frame = new ChemicalPlant("Manual for chemical plant in 2019");
  }
}

