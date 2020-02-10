

package sample;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;

public class Controller {

    /**
     * Exercices 1-2-3
     * @param mouseEvent
     */


    public void txfSourceDragDetected(MouseEvent mouseEvent) {

        TextField ref = (TextField) mouseEvent.getSource();
        Dragboard db = ref.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        content.putString(ref.getText());
        db.setContent(content);
    }

    public void txfTargetDragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void txfTargetDragDropped(DragEvent dragEvent) {
        TextField refSource = (TextField) dragEvent.getGestureSource();

        if (!refSource.getText().equals("")){
            refSource.clear();
        }
    }

    public void txfDragOver2(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }


    public void txfTargetDragDropped2(DragEvent dragEvent) {
        TextField refSource = (TextField) dragEvent.getGestureSource();
        ComboBox refTarget = (ComboBox) dragEvent.getGestureTarget();

        if (!refSource.getText().equals("")){
            refTarget.getItems().add(refSource.getText());
            refTarget.getSelectionModel().selectLast();
            refSource.clear();
        }

    }

    /**
     * Exercice 4
     * @param mouseEvent
     */

    public void txfSourceDragDetected3(MouseEvent mouseEvent) {
        TextField ref = (TextField) mouseEvent.getSource();
        Dragboard db = ref.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        content.putString(ref.getText());
        db.setContent(content);
    }

    public void txfTargetDragOver3(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void txfTargetDragDropped3(DragEvent dragEvent) {
        TextField refSource = (TextField) dragEvent.getGestureSource();
        TextField refTarget = (TextField) dragEvent.getGestureTarget();

        if(!refSource.getText().equals("")) {
            if (refTarget.getText().equals("")) {
                refTarget.setText(refSource.getText());
                refSource.clear();
            }
        }
    }
}
