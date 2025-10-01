package com.example.task6;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ToDoApp extends Application {

    private ObservableList<String> tasks;

    @Override
    public void start(Stage stage) {
        stage.setTitle("JavaFX To-Do List");

        tasks = FXCollections.observableArrayList();
        ListView<String> listView = new ListView<>(tasks);

        TextField taskInput = new TextField();
        taskInput.setPromptText("Enter a task...");

        Button addButton = new Button("Add Task");
        Button deleteButton = new Button("Delete Selected");

        addButton.setOnAction(e -> {
            String task = taskInput.getText().trim();
            if (!task.isEmpty()) {
                tasks.add(task);
                taskInput.clear();
            }
        });

        // Delete task
        deleteButton.setOnAction(e -> {
            String selected = listView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                tasks.remove(selected);
            }
        });

        HBox inputBox = new HBox(10, taskInput, addButton, deleteButton);
        VBox root = new VBox(10, listView, inputBox);
        root.setStyle("-fx-padding: 10;");

        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
