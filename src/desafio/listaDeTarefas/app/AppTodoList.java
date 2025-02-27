package desafio.listaDeTarefas.app;

import java.util.Scanner;

import desafio.listaDeTarefas.TodoList.MenuTodoList;

public class AppTodoList {

    public static void main(String[] args) {
    
        Scanner      scanner = new Scanner( System.in );
        MenuTodoList menu    = new MenuTodoList( scanner );
        
        menu.criarMenuTodoList();
        scanner.close();
    }
}