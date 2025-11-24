package _67.org;

import java.util.Date;

/**
 * Class for task
 *
 * @{author} Vitalie
 *
 * on 21.11.2025
 */

public class ToDoItem {
    private Integer id;
    private String title;

    private boolean isCompleted;
    private Date creationDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public ToDoItem(Integer id, String title, boolean isCompleted, Date creationDate) {
        this.id = id;
        this.title = title;
        this.isCompleted = isCompleted;
        this.creationDate = creationDate;
    }
}
