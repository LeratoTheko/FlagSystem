package com.example.flagsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class HelloController {

    @FXML
    private Button CamBttn;

    @FXML
    private ImageView CamImage;

    @FXML
    private Button CotBttn;

    @FXML
    private ImageView CotImage;

    @FXML
    private Button GuiBttn;

    @FXML
    private Rectangle LHRectangle;

    @FXML
    private Rectangle MRectangle;

    @FXML
    private Button MalBttn;

    @FXML
    private Button NigBttn;

    @FXML
    private ImageView NigImage;

    @FXML
    private Rectangle RHRectangle;

    @FXML
    private Button backBttn;

    @FXML
    private ImageView guiImage;

    @FXML
    private ImageView malimage;

    @FXML
    private Label welcomeText;
    @FXML
    void CamOnAction(ActionEvent event) {
        RHRectangle.setFill(Paint.valueOf("#faf81e"));
        MRectangle.setFill(Paint.valueOf("#e11c0e"));
        LHRectangle.setFill(Paint.valueOf("#4ac360"));



        RHRectangle.setOpacity(1);
        MRectangle.setOpacity(1);
        LHRectangle.setOpacity(1);

        NigBttn.setOpacity(0);
        MalBttn.setOpacity(0);
        CamBttn.setOpacity(0);
        GuiBttn.setOpacity(0);
        CotBttn.setOpacity(0);

    }

    @FXML
    void CotOnAction(ActionEvent event) {
        RHRectangle.setFill(Paint.valueOf("#1ca410"));
        MRectangle.setFill(Paint.valueOf("#ffffff"));
        LHRectangle.setFill(Paint.valueOf("#fcc605"));

        RHRectangle.setOpacity(1);
        MRectangle.setOpacity(1);
        LHRectangle.setOpacity(1);

        NigBttn.setOpacity(0);
        MalBttn.setOpacity(0);
        CamBttn.setOpacity(0);
        GuiBttn.setOpacity(0);
        CotBttn.setOpacity(0);

    }

    @FXML
    void GuiOnAction(ActionEvent event) {
        RHRectangle.setFill(Paint.valueOf("#4ac360"));
        MRectangle.setFill(Paint.valueOf("#faf81e"));
        LHRectangle.setFill(Paint.valueOf("#e11c0e"));

        RHRectangle.setOpacity(1);
        MRectangle.setOpacity(1);
        LHRectangle.setOpacity(1);

        NigBttn.setOpacity(0);
        MalBttn.setOpacity(0);
        CamBttn.setOpacity(0);
        GuiBttn.setOpacity(0);
        CotBttn.setOpacity(0);



    }

    @FXML
    void MalOnAction(ActionEvent event) {
        RHRectangle.setFill(Paint.valueOf("#e11c0e"));
        MRectangle.setFill(Paint.valueOf("#faf81e"));
        LHRectangle.setFill(Paint.valueOf("#4ac360"));

        RHRectangle.setOpacity(1);
        MRectangle.setOpacity(1);
        LHRectangle.setOpacity(1);

        NigBttn.setOpacity(0);
        MalBttn.setOpacity(0);
        CamBttn.setOpacity(0);
        GuiBttn.setOpacity(0);
        CotBttn.setOpacity(0);

    }

    @FXML
    void NigOnAction(ActionEvent event) {
        RHRectangle.setFill(Paint.valueOf("#1ca410"));
        MRectangle.setFill(Paint.valueOf("#fcfffb"));
        LHRectangle.setFill(Paint.valueOf("#1ca410"));

        RHRectangle.setOpacity(1);
        MRectangle.setOpacity(1);
        LHRectangle.setOpacity(1);

        NigBttn.setOpacity(0);
        MalBttn.setOpacity(0);
        CamBttn.setOpacity(0);
        GuiBttn.setOpacity(0);
        CotBttn.setOpacity(0);

    }

    @FXML
    void backOnAction(ActionEvent event) {
        RHRectangle.setOpacity(0);
        MRectangle.setOpacity(0);
        LHRectangle.setOpacity(0);
        NigBttn.setOpacity(1);
        MalBttn.setOpacity(1);
        CamBttn.setOpacity(1);
        GuiBttn.setOpacity(1);
        CotBttn.setOpacity(1);

    }

}