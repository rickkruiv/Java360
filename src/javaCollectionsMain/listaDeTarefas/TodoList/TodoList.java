package javaCollectionsMain.listaDeTarefas.TodoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoList {

    private List<String> tarefas = new ArrayList<>();
    private Scanner scan;

    public TodoList( Scanner scan ) {
        this.scan = scan;
    }

    public void criarTarefa() {

        System.out.print( "Nome da tarefa: " );
        tarefas.add( scan.nextLine() );
    }
    /******************************************************************************/
    public void listarTarefas() {

        int indice = 0;
        if ( tarefas.isEmpty() ) {
            System.out.println( "Nenhuma tarefa para ser feita! Parabéns!" );
        } else {
            for (String tarefa : tarefas) {
                System.out.printf( "%3d - %-20s\n", ++indice, tarefa );
            }
        }
    }
    /******************************************************************************/
    public void removerTarefa() {
        
        if ( tarefas.isEmpty() ) {
            System.out.println( "Sem tarefas para serem removidas" );
            return;
        } 

        try {

            System.out.print("Digite a posição da tarefa para remover: ");
            int posicao = Integer.parseInt(scan.nextLine());

            if ( posicao >= 0 && posicao <= tarefas.size() ) {
                int indice = posicao - 1;
                System.out.println("Tarefa removida/concluída: " + tarefas.get( indice ) );
                tarefas.remove( indice );
                return;
            } else {
                System.out.println("Erro: índice fora do intervalo válido.");
            }

        } catch( NumberFormatException e ) {

        }
    }
    /******************************************************************************/
}
