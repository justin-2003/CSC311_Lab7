package com.mycompany.javafx_db_example;

import com.mycompany.javafx_db_example.db.ConnDbOps;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Scanner;
import javafx.scene.paint.Color;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static ConnDbOps cdbop;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));

        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        cdbop = new ConnDbOps();
        Scanner scan = new Scanner(System.in);

        char input;
        do {
            System.out.println(" ");
            System.out.println("============== Menu ==============");
            System.out.println("| To start GUI,           press 'g' |");
            System.out.println("| To connect to DB,       press 'c' |");
            System.out.println("| To display all users,   press 'a' |");
            System.out.println("| To insert to the DB,    press 'i' |");
            System.out.println("| To query by name,       press 'q' |");
            System.out.println("| To delete an user,      press 'd' |");
            System.out.println("| To Update an user,      press 'u' |");
            System.out.println("| To exit,                press 'e' |");
            System.out.println("====================================");
            System.out.print("Enter your choice: ");
            input = scan.next().charAt(0);
            scan.useDelimiter("\n");

            switch (input) {
                case 'g':
                     launch(args); //GUI
                    break;

                case 'c':
                    cdbop.connectToDatabase(); //Your existing method
                    break;
                case 'a':
                    cdbop.listAllUsers(); //all users in DB
                    break;

                case 'i':
                    //Person p;
                    System.out.print("Enter Name: ");
                    String name = scan.next();
                    System.out.print("Enter Email: ");
                    String email = scan.next();
                    System.out.print("Enter Phone: ");
                    String phone = scan.next();
                    System.out.print("Enter Address: ");
                    String address = scan.next();
                    System.out.print("Enter Salary: ");
                    int salary = scan.nextInt();
                    System.out.print("Enter Password: ");
                    String password = scan.next();
                     Person p = new Person(name,email,phone,address,salary,password);
                    cdbop.insertUser(p); //Your insertUser method
                    break;
                case 'q':
                    System.out.print("Enter the name to query: ");
                    String queryName = scan.next();
                    cdbop.queryUserByName(queryName); //Your queryUserByName method
                    break;
                case 'e':
                    System.out.println("Exiting...");
                    break;
                    //deletes the user
                case  'd':
                    System.out.println("Enter the user email you want to delete: ");
                    String delete = scan.next();
                    cdbop.deleteUser(delete);
                    break;
                    //update the user info
                case 'u':
                    System.out.print("Enter the email of the user you want to update: ");
                    String userEmail = scan.next();
                    System.out.print("Enter Name: ");
                    String updatedName = scan.next();
                    System.out.print("Enter Phone: ");
                    String updatedPhone = scan.next();
                    System.out.print("Enter Address: ");
                    String updatedAddress = scan.next();
                    System.out.print("Enter Salary: ");
                    int updatedSalary = scan.nextInt();
                    System.out.print("Enter Password: ");
                    String updatedPassword = scan.next();

                    Person updatedPerson = new Person(updatedName, userEmail, updatedPhone, updatedAddress, updatedSalary, updatedPassword);
                    cdbop.updateUser(userEmail, updatedPerson);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            System.out.println(" ");
        } while (input != 'e');

        scan.close();

       
    }




}
