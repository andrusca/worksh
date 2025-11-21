package _67.org;

import java.util.HashMap;
import java.util.Map;

/**
 * Class implementation
 *
 *
 * @author Vitalie
 * <p>
 * on 21.11.2025
 */

public class TodoManagerImpl implements TodoManager {

    private Map<Integer, ToDoItem> map = new HashMap<>();
    private int idCounter = 0;

    @Override
    public void create(String title, boolean isCompleted) {
        ToDoItem toDoItem = new ToDoItem(idCounter, title, isCompleted);
        map.put(idCounter++, toDoItem);
        System.out.printf("S-a facut todulu %s %n",title );



    }

    @Override
    public ToDoItem delete(int i) {
        if (!map.containsKey(i)) {
            throw new RuntimeException("Such task doesnt exists");
        }
        ToDoItem removed = map.remove(i);
        System.out.printf("Task with this  id %d is deleted", i);
        return removed;


    }


}
