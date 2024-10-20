package com.example.hstuism;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HstuAllianceController implements Initializable {


   ObservableList<Profile>observlist=FXCollections.observableArrayList(
            new Profile("Abu Shihab","01778551083","Bogra","CSE","21"),
            new Profile("Abu Shihab","01778551083","Bogra","CSE","21"),
            new Profile("Abu Shihab","01778551083","Bogra","CSE","21")

    );






    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        if (myDistrictNameInput != null) {
            // List of all districts in Bangladesh in ascending order
            String[] districts = {
                    "Bagerhat", "Bandarban", "Barguna", "Barishal", "Bhola",
                    "Bogura", "Brahmanbaria", "Chandpur", "Chattogram", "Chuadanga",
                    "Comilla", "Cox's Bazar", "Dhaka", "Dinajpur", "Faridpur",
                    "Feni", "Gaibandha", "Gazipur", "Gopalganj", "Habiganj",
                    "Jamalpur", "Jashore", "Jhalokathi", "Jhenaidah", "Joypurhat",
                    "Khagrachari", "Khulna", "Kishoreganj", "Kurigram", "Kushtia",
                    "Lakshmipur", "Lalmonirhat", "Madaripur", "Magura", "Manikganj",
                    "Meherpur", "Moulvibazar", "Munshiganj", "Mymensingh", "Naogaon",
                    "Narail", "Narayanganj", "Narsingdi", "Natore", "Netrokona",
                    "Nilphamari", "Noakhali", "Pabna", "Panchagarh", "Patuakhali",
                    "Pirojpur", "Rajbari", "Rajshahi", "Rangamati", "Rangpur",
                    "Satkhira", "Shariatpur", "Sherpur", "Sirajganj", "Sunamganj",
                    "Sylhet", "Tangail", "Thakurgaon"
            };

            // Add all districts to the ChoiceBox
            myDistrictNameInput.getItems().addAll(districts);
        } else {
            System.out.println("myDistrictNameInput is null");
        }
        if (myHallNameInput != null) {
            // List of all districts in Bangladesh in ascending order
            String[] halls = {
                    "Zia Hall", "Bangabandhu Hall", "Tazuddin Ahmed Hall", "Sheikh Rasel Hall", "Extension Hall",
                    "Fazilatunnesa Mujib Hall", "Ivy Rahman Hall", "Kobi Sufia Kamal Hall", "New Hall"
            };

            // Add all districts to the ChoiceBox
            myHallNameInput.getItems().addAll(halls);
        } else {
            System.out.println("myHallNameInput is null");
        }
    }


    //uniq alade






//Hellow view

    @FXML
    private AnchorPane myAnchorPane;

    @FXML
    private Button myCreateAccount;

    @FXML
    private ImageView myHstuLogo;

    @FXML
    private Button myLogIn;

    @FXML
    private PasswordField myPassword;

    @FXML
    private TextField myStudentId;
    @FXML
    private Label logLabel;
    @FXML
    void createAccountAction(ActionEvent event) throws IOException {
        Parent helloView = FXMLLoader.load(getClass().getResource("create-view.fxml"));
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(helloView));
        stage.show();
    }

    @FXML
    void logInAction(ActionEvent event) throws IOException {
       try{ // Get the entered student ID and password from the form
        String enteredId = myStudentId.getText();
        String enteredPassword = myPassword.getText();

        // Flag to track if login is successful
        boolean loginSuccessful = false;

        // Open the file and read line by line
        File file = new File("data.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            // Read each line and split by comma to get the data
            String line = scanner.nextLine();
            String[] data = line.split(",");

            // Extract student ID and password from the data
            String storedId = data[0];  // Assuming ID is the first item
            String storedPassword = data[5];  // Assuming password is the 6th item

            // Check if entered ID and password match the stored ones
            if (enteredId.equals(storedId) && enteredPassword.equals(storedPassword)) {
                loginSuccessful = true;
                break;
            }
        }

        // Close the file
        scanner.close();

        // If login was successful, proceed to the main page
        if (loginSuccessful) {
            logLabel.setText("Login successful!");

            // Load the main page (e.g., main-view.fxml)
            Parent mainPage = FXMLLoader.load(getClass().getResource("logfirst-view.fxml"));

            // Get the current stage and set the new scene (main-view.fxml)
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(mainPage));
            stage.show();
        } else {
            // If login failed, show an error message
            logLabel.setText("Invalid ID or password.");
        }} catch (Exception e) {
           System.out.println(e);
       }
    }








    //create id section


    @FXML
    private ChoiceBox<String> myDistrictNameInput;

    @FXML
    private ChoiceBox<String> myHallNameInput;

    @FXML
    private TextField myId;

    @FXML
    private TextField myName;

    @FXML
    private PasswordField myPasswordCreat;

    @FXML
    private TextField myPhoneNumber;

    @FXML
    private Button mySubmit;

    @FXML
    private AnchorPane mySubmitted;
    @FXML
    private Label createLabel;


    @FXML
    void submitAction(ActionEvent event) throws IOException {

       try { String sid = myId.getText();
           String sbatch = sid.substring(0, 2);
           String sfaculty = sid.substring(2, 4);
           String sname = myName.getText();
           String sphone = myPhoneNumber.getText();
           String spass = myPasswordCreat.getText();
           String shall = myHallNameInput.getValue();
           String sdist = myDistrictNameInput.getValue();

           if (sid.equals("") || sname.equals("") || sphone.equals("") || spass.equals("") || shall.equals("") || sdist.equals("")||sfaculty.equals("")||sbatch.equals("")) {
               createLabel.setText("Please input data correctly............");
               return;
           } else {

               File file = new File("data.txt");
               FileWriter fileWriter = new FileWriter(file, true);
               fileWriter.write(sid + "," + sname + "," + sfaculty + "," + sbatch + "," + sphone + "," + spass + "," + shall + "," + sdist + "\n");
               fileWriter.close();
               System.out.println("You create account Success fully now log in here to visit my app");


               Parent helloView = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
               Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
               stage.setScene(new Scene(helloView));
               stage.show();



           }
       } catch (Exception e) {

           createLabel.setText("Please input data correctly....");

       }

    }










    //4 main content page



    @FXML
    private Button myBatch;

    @FXML
    void onActionBatch(ActionEvent event) throws IOException {
        Parent mainPage = FXMLLoader.load(getClass().getResource("batch-view.fxml"));
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainPage));
        stage.show();
    }

    @FXML
    void onActionExit(ActionEvent event) throws IOException {
        Parent mainPage = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainPage));
        stage.show();
    }

    @FXML
    void onActionFaculty(ActionEvent event) throws IOException {
        Parent mainPage = FXMLLoader.load(getClass().getResource("faculty-view.fxml"));
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainPage));
        stage.show();
    }

    @FXML
    void onActionHall(ActionEvent event) throws IOException {
        Parent mainPage = FXMLLoader.load(getClass().getResource("hall-view.fxml"));
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainPage));
        stage.show();
    }

    @FXML
    void onActionZone(ActionEvent event) throws IOException {
        Parent mainPage = FXMLLoader.load(getClass().getResource("zone-view.fxml"));
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainPage));
        stage.show();
    }



//hall








    @FXML
    void bangabandhuAction(ActionEvent event) {

    }

    @FXML
    void extensionAction(ActionEvent event) {

    }

    @FXML
    void fazilaAction(ActionEvent event) {

    }

    @FXML
    void ivyAction(ActionEvent event) {

    }

    @FXML
    void newhallAction(ActionEvent event) {

    }


    @FXML
    void raselAction(ActionEvent event) {

    }

    @FXML
    void sufiaAction(ActionEvent event) {

    }

    @FXML
    void tazAction(ActionEvent event) {

    }

    @FXML
    void ziaAction(ActionEvent event) {

    }
    @FXML
    void onActionExitHall(ActionEvent event) throws IOException {
        Parent mainPage = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        // Get the current stage and set the new scene (main-view.fxml)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainPage));
        stage.show();
    }

    @FXML
    void onActionPreviewHall(ActionEvent event) throws IOException {
        Parent mainPage = FXMLLoader.load(getClass().getResource("logfirst-view.fxml"));

        // Get the current stage and set the new scene (main-view.fxml)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainPage));
        stage.show();
    }



//faculty








    @FXML
    private TableColumn<Profile, String> batchField;

    @FXML
    private TableColumn<Profile, String> contactField;

    @FXML
    private TableColumn<Profile, String> districtField;

    @FXML
    private TableColumn<Profile, String> facultyField;

    @FXML
    private TableColumn<Profile, String> nameField;

    @FXML
    private TableView<Profile> tableView;


    @FXML
    void agAction(ActionEvent event) {
        { nameField.setCellValueFactory(new PropertyValueFactory<Profile,String>("studentName"));
            facultyField.setCellValueFactory(new PropertyValueFactory<Profile,String>("faculty"));
            batchField.setCellValueFactory(new PropertyValueFactory<Profile,String>("batch"));
            districtField.setCellValueFactory(new PropertyValueFactory<Profile,String>("dist"));
            contactField.setCellValueFactory(new PropertyValueFactory<Profile,String>("phone"));

            tableView.setItems(observlist);}

    }

    @FXML
    void bbaAction(ActionEvent event) {
        { nameField.setCellValueFactory(new PropertyValueFactory<Profile, String>("studentName"));
            facultyField.setCellValueFactory(new PropertyValueFactory<Profile, String>("faculty"));
            batchField.setCellValueFactory(new PropertyValueFactory<Profile, String>("batch"));
            districtField.setCellValueFactory(new PropertyValueFactory<Profile, String>("dist"));
            contactField.setCellValueFactory(new PropertyValueFactory<Profile, String>("phone"));


            tableView.setItems(observlist);}
    }

    @FXML
    void cseAction(ActionEvent event) {
        { nameField.setCellValueFactory(new PropertyValueFactory<Profile, String>("studentName"));
            facultyField.setCellValueFactory(new PropertyValueFactory<Profile, String>("faculty"));
            batchField.setCellValueFactory(new PropertyValueFactory<Profile, String>("batch"));
            districtField.setCellValueFactory(new PropertyValueFactory<Profile, String>("dist"));
            contactField.setCellValueFactory(new PropertyValueFactory<Profile, String>("phone"));

            tableView.setItems(observlist);}
    }

    @FXML
    void dvmAction(ActionEvent event) {

    }

    @FXML
    void engineeringAction(ActionEvent event) {

    }

    @FXML
    void fishAction(ActionEvent event) {

    }


    @FXML
    void scienceAction(ActionEvent event) {

    }

    @FXML
    void socAction(ActionEvent event) {

    }

    @FXML
    void onActionExitFaculty(ActionEvent event) throws IOException {
        Parent mainPage = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        // Get the current stage and set the new scene (main-view.fxml)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainPage));
        stage.show();
    }

    @FXML
    void onActionPreviewFaculty(ActionEvent event) throws IOException {
        Parent mainPage = FXMLLoader.load(getClass().getResource("logfirst-view.fxml"));

        // Get the current stage and set the new scene (main-view.fxml)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainPage));
        stage.show();
    }


//




    @FXML
    void barishalDivAction(ActionEvent event) {

    }

    @FXML
    void bdAction(ActionEvent event) {

    }

    @FXML
    void chitDivAction(ActionEvent event) {

    }

    @FXML
    void dhakaAc(ActionEvent event) {

    }

    @FXML
    void dhakaDivAction(ActionEvent event) {

    }

    @FXML
    void faridpurAc(ActionEvent event) {

    }

    @FXML
    void gaziAction(ActionEvent event) {

    }

    @FXML
    void khulnaDivAction(ActionEvent event) {

    }

    @FXML
    void moiDivAction(ActionEvent event) {

    }



    @FXML
    void rajDivAction(ActionEvent event) {

    }

    @FXML
    void rangpurDivAction(ActionEvent event) {

    }

    @FXML
    void sylhetDivAction(ActionEvent event) {

    }
    @FXML
    void onActionExitZone(ActionEvent event) throws IOException {
        Parent mainPage = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        // Get the current stage and set the new scene (main-view.fxml)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainPage));
        stage.show();
    }

    @FXML
    void onActionPreviewZone(ActionEvent event) throws IOException {
        Parent mainPage = FXMLLoader.load(getClass().getResource("logfirst-view.fxml"));

        // Get the current stage and set the new scene (main-view.fxml)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainPage));
        stage.show();
    }








    //batch ism start
    @FXML
    void on10Action(ActionEvent event) {

    }

    @FXML
    void on11Action(ActionEvent event) {

    }

    @FXML
    void on12Action(ActionEvent event) {

    }

    @FXML
    void on13Action(ActionEvent event) {

    }

    @FXML
    void on14Action(ActionEvent event) {

    }

    @FXML
    void on15Action(ActionEvent event) {

    }

    @FXML
    void on16Action(ActionEvent event) {

    }

    @FXML
    void on17Action(ActionEvent event) {

    }

    @FXML
    void on18Action(ActionEvent event) {

    }

    @FXML
    void on19Action(ActionEvent event) {

    }

    @FXML
    void on20Action(ActionEvent event) {

    }

    @FXML
    void on21Action(ActionEvent event) {

    }

    @FXML
    void on22Action(ActionEvent event) {

    }

    @FXML
    void on23Action(ActionEvent event) {

    }

    @FXML
    void on24Action(ActionEvent event) {

    }

    @FXML
    void onActionExitBatch(ActionEvent event) throws IOException {
        Parent mainPage = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        // Get the current stage and set the new scene (main-view.fxml)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainPage));
        stage.show();

    }

    @FXML
    void onActionPreviewBatch(ActionEvent event) throws IOException {
        Parent mainPage = FXMLLoader.load(getClass().getResource("logfirst-view.fxml"));

        // Get the current stage and set the new scene (main-view.fxml)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainPage));
        stage.show();

    }








}
