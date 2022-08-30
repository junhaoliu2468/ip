import java.util.*;

public class Duke {
    public static ArrayList<Task> ListOfTasks = new ArrayList<>();
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        proceed();

    }
    public static void proceed(){

        Communication.greet();
        Scanner sc = new Scanner(System.in);
        boolean isDone = false;
        String[] inputs;
        int TaskIndex;
        Task currTask;





        while (!isDone){
            String inputString = sc.nextLine();
            inputs = inputString.split(" ",2); // split
            if (inputs[0].equals("mark")){
                inputString = "mark";
            }
            else if (inputs[0].equals("unmark")){
                inputString = "unmark";
            }



            if (inputString.equals("bye")){
                isDone = true;
                Communication.bye();
                break;
            }
            else if (inputString.equals("list")){
                Communication.list(ListOfTasks);

            }
            else if (inputString.equals("read book")){
                ListOfTasks.add(new Task("read book"));
                System.out.println("added: read book");

            }
            else if (inputString.equals("return book")){
                ListOfTasks.add(new Task("return book"));
                System.out.println("added: return book");

            }
            else if (inputString.equals("mark")){
                TaskIndex = Integer.parseInt(inputs[1]);// task no + task
                currTask = ListOfTasks.get(TaskIndex-1);
                Communication.mark(currTask);


            }
            else if (inputString.equals("unmark")){
                TaskIndex = Integer.parseInt(inputs[1]);
                currTask = ListOfTasks.get(TaskIndex-1);
                Communication.unmark(currTask);
            }
            else if (inputs[0].equals("todo")){
                ListOfTasks.add(Communication.addToDo(inputs[1]));
            }
            else if (inputs[0].equals("deadline")){
                ListOfTasks.add(Communication.addDeadline(inputs[1]));

            }
            else if (inputs[0].equals("event")){
                ListOfTasks.add(Communication.addEvent(inputs[1]));

            }
            else{
                Communication.copy(inputString);
            }
        }
    }
}
