package listaDeTarefas.TodoList;

import java.util.Scanner;

public class AdicionarTarefa {

    Scanner scan = new Scanner( System.in );

    public String criarTarefa() {

        System.out.print( "Nome da tarefa: " );
        return scan.nextLine();
    }
}
