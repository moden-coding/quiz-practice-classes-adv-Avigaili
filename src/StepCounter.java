public class StepCounter {
    private int minActiveSteps;   
    private int totalSteps;      
    private int totalDays;       
    private int activeDayCount;  
    
     public StepCounter(int minActiveSteps) {
        this.minActiveSteps = minActiveSteps;
        totalSteps = 0;
        totalDays = 0;
        activeDayCount = 0;
    }


    public StepCounter() {
        this.minActiveSteps = 7000;
        totalSteps = 0;
        totalDays = 0;
        activeDayCount = 0;
    }


    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays++;

        if (steps >= minActiveSteps) {
            activeDayCount++;
        }
    }

    public int activeDays() {
        return activeDayCount;
    }

 
    public double averageSteps() {
        if (totalDays == 0) {
            return 0;
        }
        return (double) totalSteps / totalDays;
    }

}
