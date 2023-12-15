package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.Note;
import model.Notebook;

public class NoteController {

    @FXML
    private TextField titleField;

    @FXML
    private TextArea contentArea;

    @FXML
    private VBox notesContainer;

    private final Notebook notebook = new Notebook();

    @FXML
    private void addNote() {
        String title = titleField.getText();
        String content = contentArea.getText();

        if (!title.isEmpty() && !content.isEmpty()) {
            Note note = new Note(title, content);
            notebook.addNote(note);
            displayNotes();
        }
    }

    private void displayNotes() {
        notesContainer.getChildren().clear();

        for (Note note : notebook.getNotes()) {
            Button noteButton = new Button(note.getTitle());
            noteButton.setOnAction(event -> displayNoteContent(note));
            notesContainer.getChildren().add(noteButton);
        }
    }

    private void displayNoteContent(Note note) {
        System.out.println("Title: " + note.getTitle());
        System.out.println("Content: " + note.getContent());
    }
}
