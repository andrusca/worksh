package _67.org;

import java.util.Date;

/**
 * Interface for task management
 *
 *
 * @author Vitalie
 * <p>
 * on 21.11.2025
 */
public interface TodoManager {


    void create(String title, boolean isCompleted,Date date);


    ToDoItem delete(int i);
}
