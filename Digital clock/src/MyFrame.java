import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

    //Calendar calender;
    SimpleDateFormat timeFormate;
    SimpleDateFormat dayFormate;
    SimpleDateFormat dateFormate;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;


    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Digital clock");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);

        timeFormate = new SimpleDateFormat("hh:mm:ss a");
        dayFormate = new SimpleDateFormat("EEEE");
        dateFormate = new SimpleDateFormat("MMMMM dd, yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink free",Font.PLAIN,35));

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink free",Font.PLAIN,25));

        time = timeFormate.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);


        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();
    }
    public void setTime(){
        while(true){
        time = timeFormate.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);

        day = dayFormate.format(Calendar.getInstance().getTime());
        dayLabel.setText(day);

        date = dateFormate.format(Calendar.getInstance().getTime());
        dateLabel.setText(date);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }

    }
}
