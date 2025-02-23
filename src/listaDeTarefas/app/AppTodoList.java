package listaDeTarefas.app;

import listaDeTarefas.TodoList.MenuTodoList;

public class AppTodoList {

    public static void main(String[] args) {
        
        MenuTodoList menu = new MenuTodoList();
        menu.opcoesMenu();
        System.out.println( menu.getTarefas() );
    }
}