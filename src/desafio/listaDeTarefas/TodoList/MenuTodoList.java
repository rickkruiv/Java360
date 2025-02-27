package desafio.listaDeTarefas.TodoList;

import java.util.Scanner;
public class MenuTodoList {

    private TodoList todoList;
    private Scanner scan;

    public MenuTodoList( Scanner scan ) {
        todoList  = new TodoList( scan );
        this.scan = scan ;
    }
    /******************************************************************************/
    public void criarMenuTodoList() {

        do {
            
            System.out.println( """
                -------------------------------
                | [01] - Adicionar tarefa.... |
                | [02] - Listar tarefas...... |
                | [03] - Remover tarefa...... |
                | [04] - Sair................ |
                -------------------------------""" );
        } while ( opcoesMenu() );
    }
    /******************************************************************************/
    public boolean opcoesMenu() {

        switch ( selecionarOpcao() ) {
            case 1:  todoList.criarTarefa();   break;
            case 2:  todoList.listarTarefas(); break;
            case 3:  todoList.removerTarefa(); break;
            case 4:  return false;
            default: break;
        }
        return true;
    }
    /******************************************************************************/
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
            } catch ( NumberFormatException e ) {
                System.out.println( "Entrada inválida. Digite um número entre 1 e 4." );
            }
        }
    }
    /******************************************************************************/
}
