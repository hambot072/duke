public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (this.isDone ? "[X]" : "[ ]"); // mark done task with X
    }

    public void setStatus(boolean isDone){
        this.isDone = isDone;
    }
    public String getDescription(){
        return description;
    }
    @Override
    public String toString() {
        return description;
    }
}