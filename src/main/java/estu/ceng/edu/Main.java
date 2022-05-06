package estu.ceng.edu;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

import java.util.Random;

class Main {
    public static void main(String[] args) throws CmdLineException, InterruptedException {
        Options options=new Options();
        CmdLineParser parser = new CmdLineParser(options);
        parser.parseArgument(args);

        int sum=0;
        data d=new data();
        NumOfBins numOfBins=new NumOfBins(options.numBins);
        d.array = new int[numOfBins.numOfBins];

        for(int i=0;i<d.array.length;i++){
            d.array[i]=0;
        }

        Balls ball=new Balls(options.numThread);
        for(int i=0;i<ball.numberOfBall;i++){
            Balls balls= new Balls(d);
            Thread thread= new Thread(balls);
            thread.start();
            thread.join();
        }

        for(int i=0;i< d.array.length;i++){
            System.out.println(i + "      " + d.array[i]);

        }

        System.out.println("Number of requested thread: " + ball.numberOfBall );
        for(int x=0;x<d.array.length;x++){
            sum+=d.array[x];
        }

        System.out.println("Sum of bin values: " +sum );
        if(ball.numberOfBall==sum){
            System.out.println("Nice work! Both of them are equal");
        }

    }
}
//rectangular slots
class NumOfBins{
    int numOfBins;
    public NumOfBins(int numOfBins) {
        this.numOfBins = numOfBins;
    }
}

class Balls implements Runnable {
    data d;
    int numberOfBall;

    public Balls(int numberOfBall) {
        this.numberOfBall = numberOfBall;
    }

    public Balls(data d) {
        this.d = d;
    }

    @Override
    public void run() {
        Random random = new Random();
        synchronized (d) {
            int bin = 0, choice;
            for (int i=0; i<d.array.length; i++) {
                choice = random.nextInt(2);
                if (choice==1 && bin < d.array.length-1)
                    bin+= 1;
            }
            d.array[bin] += 1;
        }
    }
}
class data {
   int[] array;
}
