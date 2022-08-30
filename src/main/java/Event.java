public class Event extends Task {

    protected String at;

    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    public static Event AddEvent(String name , String at){
        Event newEvent = new Event(name,at);
        System.out.println(""+newEvent.toString());
        return newEvent;
    }

    @Override
    public String toString() {
        return  "  [E]" + "["+this.getStatusIcon()+"] " + this.name + " (by: " + at + ")";
    }
}
