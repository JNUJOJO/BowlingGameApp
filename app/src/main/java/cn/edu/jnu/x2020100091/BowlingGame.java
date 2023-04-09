package cn.edu.jnu.x2020100091;

public class BowlingGame {
    private int pins[]=new int[21];
    private int epochs[]=new int[10];
    private int pins_iter=0;
    private int epoch_iter=0;
    private  int allScore=0;

    public void roll(int pin) {
        if(pins_iter<21)
        {
            if(pin==10&&pins_iter<pins.length-3)
            {
                pins[pins_iter]=pin;
                pins[pins_iter+1]=-1;
                pins_iter+=2;
            }
            else
            {
                pins[pins_iter]=pin;
                pins_iter++;
            }
        }


    }

    public int score() {
        for(int i=0;i<epochs.length;i++)
        {
            if(2*i<18)
            {
                if(pins[2*i]==10)
                {
                    if(pins[2*i+2]==10)
                    {
                        epochs[i]=pins[2*i]+pins[2*i+2]+pins[2*i+4];
                    }
                    else {
                        epochs[i]=pins[2*i]+pins[2*i+2]+pins[2*i+3];
                    }
                }
                else{
                    if(pins[2*i]+pins[2*i+1]==10)
                    {
                        epochs[i]=pins[2*i]+pins[2*i+1]+pins[2*i+2];
                    }
                    else{
                        epochs[i]=pins[2*i]+pins[2*i+1];
                    }
                }
            }
            else
            {
                if(pins[2*i]+pins[2*i+1]<10)
                {
                    epochs[i]=pins[2*i]+pins[2*i+1];
                }
                else{
                    epochs[i]=pins[2*i]+pins[2*i+1]+pins[2*i+2];
                }
            }

        }
        for(int i=0;i<epochs.length;i++)
        {
            allScore+=epochs[i];
        }
        return allScore;
    }
}
