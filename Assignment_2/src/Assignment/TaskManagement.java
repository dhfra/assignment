package Assignment;

public class TaskManagement {

	public static void main(String[] args) {
		ProjectQueue taskQueue1 = new ProjectQueue("project1");
		Task task1 = new Task("debugging",10,false);
		Task task2 = new Task("Review",20,false);
		Task task3 = new Task("Priority",0,true);
		
		taskQueue1.enqueue(task1);
		taskQueue1.enqueue(task2);
		taskQueue1.enqueue(task3);
		taskQueue1.DisplayQueue();
		taskQueue1.updateProgress(50);
		taskQueue1.updateProgress(50);
		taskQueue1.updateProgress(90);
		taskQueue1.updateProgress(80);
		
		
	

	}

}
