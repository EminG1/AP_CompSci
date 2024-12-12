

public class StepTracker{
    private int minStepsActive;
     private int totalSteps;
     private int days;
    private int activeDays;
    
public StepTracker(int minStepsActive){
    this.minStepsActive = minStepsActive;
    total TotalSteps = 0;
    total days=0;
    total activeDays = 0;
}

public void aadDailySteps(int steps){
    if(steps>=minStepsActive)
        active days = active days + 1;
        days = days + 1;
        totalSteps = totalSteps + steps;
}
public int activeDays(){
    return activeDays;
}
public double averageSteps(){
    if(days == 0)
        return 0;
    else    
        return totalSteps/days;
}
}
