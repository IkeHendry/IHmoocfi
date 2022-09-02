import java.util.ArrayList;
public class TodoList {
    private ArrayList<String> tdList;
    public TodoList(){
        tdList = new ArrayList<String>();
    }
    public void add(String task){
        this.tdList.add(task);
}
    public void print(){
        int index = 0;
        for (String task : tdList) { 		      
           System.out.println((index + 1) + ": " + task);
           index++;           
      }
    }
    public void remove(int number){
        number--;
        tdList.remove(number);
    }
}