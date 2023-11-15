package Assignment;
public class Task {
    private String taskName;
    private int currentProgress;
    private int maxProgress;
    Task next;
    boolean priority;

    // Constructor
    public Task(String taskName,int currentProgress, boolean priority) {
        this.taskName = taskName;
        this.currentProgress = currentProgress;
        this.maxProgress = 100;
        this.priority =priority;
        
    }

    // Getter methods
    public String getTaskName() {
        return taskName;
    }
    public boolean getPriority() {
    	return priority;
    }

    public int getCurrentProgress() {
        return currentProgress;
    }

    public int getMaxProgress() {
        return maxProgress;
    }

    // Setter methods
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setCurrentProgress(int currentProgress) {
        if (currentProgress >= 0 && currentProgress <= maxProgress) {
            this.currentProgress = currentProgress;
        } else {
            System.out.println("Invalid progress value");
        }
    }

    public void setMaxProgress(int maxProgress) {
        if (maxProgress >= 0) {
            this.maxProgress = maxProgress;
        } else {
            System.out.println("Invalid max progress value");
        }
    }
   

    // Method to display progress information
    public void displayProgress() {
        System.out.println("Task: " + taskName);
        System.out.println("Progress: " + currentProgress+ "/" + maxProgress);
    }
}