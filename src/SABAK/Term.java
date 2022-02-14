package SABAK;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Term {


    public Term() {
    }

    public void SHOW() throws ClassNotFoundException, SQLException {
        JDBS_CON CON = new JDBS_CON();
        CON.getConnection();
        Connection connection = CON.getConnection();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Search :");
            System.out.println("2 - Get medicine :");
            System.out.println("3 - Add medicine :");
            System.out.println("4 - remove medicine :");
            Option option1 = new Option();
            System.out.print("Enter option (1-3): ");
            int option = scanner.nextInt();
            if (option == 1) {
                option1.Search();
            } else if (option == 2) {
                System.out.println(" id ");
                int id = scanner.nextInt();
                PreparedStatement preparedStatement1 = connection.prepareStatement("Select * from task2 where id = ' " + id + " '");
                ResultSet resultSet1 = preparedStatement1.executeQuery();
                if(resultSet1.next()){
                    System.out.println(resultSet1.getString(1) + " " + resultSet1.getString(2) + " " + resultSet1.getString(3) + " " + resultSet1.getString(4) + " " + resultSet1.getString(5));
                }
                else if(!resultSet1.next()){
                    System.out.println("the drug was not found");
                }
            } else if (option == 3) {
                System.out.println(" please write next :   ");
                PreparedStatement preparedStatement = connection.prepareStatement("insert into task2(id,name,price,LocalDate,manufacturer) values (? , ? , ? , ? , ? )");
                System.out.println(" Write id ");
                int id_task = scanner.nextInt();
                scanner.nextLine();
                System.out.println(" Write name ");

                String name_task = scanner.nextLine();
                System.out.println(" Write price ");
                int price_task = scanner.nextInt();
                System.out.println(" Write localdate ");
                String localdate_task = scanner.next();
                System.out.println(" Write manufacturer ");
                String manufacturer = scanner.next();
                preparedStatement.setInt(1 , id_task);
                preparedStatement.setString(2 , name_task);
                preparedStatement.setInt(3 , price_task);
                preparedStatement.setString(4 , localdate_task);
                preparedStatement.setString(5 , manufacturer);
                preparedStatement.executeUpdate();


            } else if(option == 4) {
                System.out.println("Enter ID by medicine for delete");
                int id_for_delete = scanner.nextInt();
                PreparedStatement preparedStatement1 = connection.prepareStatement("delete from task2 where id = ' "+ id_for_delete +" ' ; ");
                preparedStatement1.executeUpdate();
                System.out.println("deleted" );
            }


        }

    }
}
