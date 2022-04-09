package Homework2;

public class Form {
    private static Form form = new Form();
    public synchronized static Form getInstance(){
        if (form == null){
            form = new Form();
        }
        return form;
    }
    private Form(){}
    public String name;
    public void show(){
        System.out.println(name);
    }

}
