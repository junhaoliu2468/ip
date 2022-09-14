package duke;

public class ToDo extends Task {

    protected String by;

    public ToDo(String description) {
        super(description);

    }

    public static ToDo addToDo(String name){
        ToDo newToDo = new ToDo(name);
        System.out.println(""+newToDo.toString());
        return newToDo;
    }



    @Override
    public String toString() {
        return "  [T]" + "["+this.getStatusIcon()+"] " + this.name;
    }
}
