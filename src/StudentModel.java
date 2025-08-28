package src;

public class StudentModel {
    private String name;
    private int id;
    
    public StudentModel(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    // Método agregado en sprint-1
    public void displayInfo() {
        System.out.println("Student: " + name + ", ID: " + id);
    }
    
    public String getName() { return name; }
    public int getId() { return id; }
}