package Assignment;

public class ProjectQueue {
	String projectName;
	static Task front;
	static Task rear;
	static int NumTask;

	public ProjectQueue(String projectName) {
		front = null;
		rear = null;
		this.projectName = projectName;
		NumTask = 0;
		
	}
	public static boolean isEmpty() {
		return front == null;
	}
	public void enqueue (Task task) {
		
		if (!isEmpty()) {
	        if (task.getPriority()) {
	            task.next = front;
	            front = task;
	            System.out.println("Task: " + task.getTaskName() + " has been added successfully with top priority with " + task.getCurrentProgress() + "% progression.");
	        } else {
	            rear.next = task;
	            rear = task;
	            System.out.println("Task: " + task.getTaskName() + " has been added successfully with " + task.getCurrentProgress() + "% progression.");
	        }
	    } else {
	        front = rear = task;
	        System.out.println("Task: " + task.getTaskName() + " has been added successfully with " + task.getCurrentProgress() + "% progression.");}
		NumTask++;
		}
	public static  Task dequeue() {
		if (isEmpty()) {
			System.out.println("This queue is empty");
			return null;
		}
		else { 
			Task temp = front;
			front = front.next;
			if (front==null) {
				rear=null;
			}
			if (isEmpty()) {
				System.out.println("This queue is now empty");
			}
			NumTask--;
			return temp;
			
		}
			
	}
	public Task front() {
		if (!isEmpty()) {
			return front;
		}
		else { return null;}
	}
	 public void updateProgress(int progress) {
	        int newProgress = front.getCurrentProgress() + progress;
	        front.setCurrentProgress(newProgress);
	        if (front.getCurrentProgress() == front.getMaxProgress()) {
	        	System.out.println("Task: " + front.getTaskName() + " has been completed and dequeued.");
	        	ProjectQueue.dequeue();
	            
	        }
	    }
	 public void DisplayQueue() {
		    if (isEmpty()) {
		        System.out.println("The queue is empty.");
		    } else {
		        System.out.println("Tasks in the queue for project " + projectName + ":");
		        Task currentTask = front;
		        while (currentTask != null) {
		            System.out.println("Task: " + currentTask.getTaskName() +
		                               ", Progress: " + currentTask.getCurrentProgress() +
		                               "/" + currentTask.getMaxProgress());
		            currentTask = currentTask.next;
		        }
		    }
		}
	 public void NumberOfTasks() {
		 if (NumTask == 1) {
			 System.out.println("There is exactly 1 task in the queue to complete.");
		 }
		 else {
		 System.out.println("There are "+ NumTask+ " tasks in the queue to complete.");}
	 }

}
