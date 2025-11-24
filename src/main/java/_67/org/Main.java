package _67.org;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     TodoManager manager = new TodoManagerImpl();
     manager.create("First task", false,new Date());
     //manager.delete(2);
        manager.update(0, "new first task", true,new Date());



    }
}