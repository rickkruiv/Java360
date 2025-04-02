package innerClassesMain.staticnested;

public class ExMemory {

    public static void main(String[] args) {
        
        Memory memory = new Memory();
        Memory.Stats stats = memory.stats(); 

        System.out.println( stats );
    }
}
