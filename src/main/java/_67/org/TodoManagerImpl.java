package _67.org;

import java.util.Date;
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

    private Map<Integer, ToDoItem> idToTask = new HashMap<>();
    private int idCounter = 0;




    @Override
    public void create(String title, boolean isCompleted,Date creationDate) {
        ToDoItem toDoItem = new ToDoItem(idCounter, title, isCompleted,creationDate);
        idToTask.put(idCounter++, toDoItem);
        System.out.printf("S-a facut todulu %s %n",title );
    }

    @Override
    public ToDoItem delete(int i) {
        validateTask(i);
        ToDoItem removed = idToTask.remove(i);
        System.out.printf("Task with this  id %d is deleted", i);
        return removed;
    }

    @Override
    public void update(int id, String title, boolean isCompleted, Date dateCreation) {
        validateTask(id);
        ToDoItem toDoItem = idToTask.get(id);
        toDoItem.setTitle(title);
        toDoItem.setCompleted(isCompleted);
        toDoItem.setCreationDate(dateCreation);
        System.out.printf("task with id  = %d updated",id);
    }

    private void validateTask(int id) {
        if (!idToTask.containsKey(id)) {
            throw new RuntimeException("This exists");
        }
    }


}
