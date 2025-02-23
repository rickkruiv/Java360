package listaDeTarefas.TodoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuTodoList {

    private List<String> tarefas = new ArrayList<>();

    Scanner scan = new Scanner( System.in );

    public MenuTodoList() {

        System.out.println( "-------------------------------" );
        System.out.println( "| [01] - Adicionar tarefa.... |" );
        System.out.println( "| [02] - Listar tarefas...... |" );
        System.out.println( "| [03] - Remover tarefa...... |" );
        System.out.println( "| [04] - Sair................ |" );
        System.out.println( "-------------------------------" );
    }

    public List<String> getTarefas() {
        return tarefas;
    }

    public void opcoesMenu() {

        switch ( selecionarOpcao() ) {
            case 1: System.out.println( "criar"   ); tarefas.add( new AdicionarTarefa().criarTarefa() ); break;
            case 2: System.out.println( "listar"  ); break;
            case 3: System.out.println( "excluir" ); break;
            case 4: System.out.println( "sair"    ); break;
            default: break;
        }
    }

    public int selecionarOpcao() {

        while ( true ) {
                
            try {

                System.out.print( "Escolha opção: " );
                int opcao = Integer.parseInt( scan.nextLine() );
                if ( opcao >= 1 && opcao <= 4 ) { 
                    return opcao; 
                } else {
                    System.out.println( "Opção inválida" );
                }
            } catch ( NumberFormatException e ) { }
        }
    }
}
