package _67.org;

/**
 * Class for task
 *
 * @{author} Vitalie
 *
 * on 21.11.2025
 */

public class ToDoItem {

    private String title;
    private Integer id;
    private boolean isCompleted;


    public ToDoItem(Integer id, String title, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.isCompleted = isCompleted;
    }
}
