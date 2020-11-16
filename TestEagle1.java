 
package javaconcepts;

class Bird1 {
    public String reproduction = "egg";
    public String outerCovering = "feather";

    public void flyUp() {
        System.out.println("Flying up...");
    }
    public void flyDown() {
        System.out.println("Flying down...");
    }
}

class Eagle1 extends Bird1 {
    public String name = "eagle";
    public int lifespan = 15;
}

class TestEagle1 {
    public static void main(String[] args) {        
        Eagle1 myEagle = new Eagle1();

        System.out.println("Name: " + myEagle.name);             System.out.println("Reproduction: " + myEagle.reproduction);
        System.out.println("Outer covering: " + myEagle.outerCovering);
        System.out.println("Lifespan: " + myEagle.lifespan);         
        myEagle.flyUp();
        myEagle.flyDown();         
    }
}
