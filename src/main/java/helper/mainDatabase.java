package helper;

import app.LGA;

public class mainDatabase {
    public static void main (String[] args) {
        Education_completion.process2016();
        Education_completion.process2021();
        Education_level.process2016();
        Education_level.process2021();
        Health.process();
        Population.process2016();
        Population.process2021();
        LGAconvert.process2016();
         LGAconvert.process2021();
}
}
