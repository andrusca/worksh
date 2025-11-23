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

    private String title;
    private Integer id;
    private boolean isCompleted;
    private Date creationDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public ToDoItem( Integer id, String title,boolean isCompleted, Date creationDate) {
        this.title = title;
        this.id = id;
        this.isCompleted = isCompleted;
        this.creationDate = creationDate;
    }
}
