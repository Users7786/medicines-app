package Sabak_one.repositories;

import Sabak_one.Controllers.Action;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    public void Show_mnu() throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        boolean turn_of = true;
        int choice = - 1 ;

        while (choice !=0){

            System.out.println(" ADD medicine to DB - 1");
            System.out.println(" Get medicine by id - 2");
            System.out.println(" Remove medicine by id - 3");
            System.out.println(" Search medicine by id - 2");
            Action action = new Action();
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    action.Action_add();
                    break;
                case 2:
                    action.Action_get();
                    break;
                case 3:
                    action.Action_remove();
                    break;
                case 4 :
                    action.Search();
                    break;
            }


            int com = scanner.nextInt();
            if(com == 0){
                turn_of = false;
            }
        }
    }
}
