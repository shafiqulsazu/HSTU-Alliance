package com.example.hstuism;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HstuIsmController {

    @FXML
    private AnchorPane myAnchorPane;

    @FXML
    private ImageView myHstuLogo;

    @FXML
    private PasswordField myPassword;

    @FXML
    private TextField myStudentId;

    @FXML
    void createAccountAction(ActionEvent event) throws IOException {
        Parent helloView = FXMLLoader.load(getClass().getResource("create-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();
    }

    @FXML
    void logInAction(ActionEvent event) throws IOException {
        Parent helloView = FXMLLoader.load(getClass().getResource("logfirst-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();
    }
    @FXML
    private TextField myId;

    @FXML
    private TextField myName;

    @FXML
    private TextField myPhoneNumber;

    @FXML
    void submitAction(ActionEvent event) throws IOException {
        Parent helloView = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();

    }


    @FXML
    void onActionBatch(ActionEvent event) throws IOException {
        Parent helloView = FXMLLoader.load(getClass().getResource("batch-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();
    }

    @FXML
    void onActionExit(ActionEvent event) throws IOException {
        Parent helloView = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();
    }

    @FXML
    void onActionFaculty(ActionEvent event) throws IOException {
        Parent helloView = FXMLLoader.load(getClass().getResource("faculty-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();
    }

    @FXML
    void onActionHall(ActionEvent event) throws IOException {
        Parent helloView = FXMLLoader.load(getClass().getResource("hall-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();
    }

    @FXML
    void onActionZone(ActionEvent event) throws IOException {
        Parent helloView = FXMLLoader.load(getClass().getResource("zone-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();
    }
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
        Parent helloView = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();
    }
    @FXML
    void onActionPreviewHall(ActionEvent event) throws IOException {
        Parent helloView = FXMLLoader.load(getClass().getResource("logfirst-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();
    }

    @FXML
    void agAction(ActionEvent event) {

    }

    @FXML
    void bbaAction(ActionEvent event) {

    }

    @FXML
    void cseAction(ActionEvent event) {

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
        Parent helloView = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();
    }
    @FXML
    void onActionPreviewFaculty(ActionEvent event) throws IOException {
        Parent helloView = FXMLLoader.load(getClass().getResource("logfirst-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();
    }
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
        Parent helloView = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();
    }
    @FXML
    void onActionPreviewBatch(ActionEvent event) throws IOException {
        Parent helloView = FXMLLoader.load(getClass().getResource("logfirst-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();
    }
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
    void dhakaDivAction(ActionEvent event) {

    }

    @FXML
    void indiaAction(ActionEvent event) {

    }

    @FXML
    void khulnaDivAction(ActionEvent event) {

    }

    @FXML
    void moiDivAction(ActionEvent event) {

    }

    @FXML
    void naijeriaAction(ActionEvent event) {

    }

    @FXML
    void nepalAction(ActionEvent event) {

    }



    @FXML
    void rajDivAction(ActionEvent event) {

    }

    @FXML
    void rangpurDivAction(ActionEvent event) {

    }

    @FXML
    void somaliaAction(ActionEvent event) {

    }

    @FXML
    void sylhetDivAction(ActionEvent event) {

    }

    @FXML
    void vutanAction(ActionEvent event) {

    }
    @FXML
    void onActionExitZone(ActionEvent event) throws IOException {
        Parent helloView = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();
    }
    @FXML
    void onActionPreviewZone(ActionEvent event) throws IOException {
        Parent helloView = FXMLLoader.load(getClass().getResource("logfirst-view.fxml"));

        // Get the current stage (window)
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene (hello-view.fxml)
        stage.setScene(new Scene(helloView));
        stage.show();
    }



}
