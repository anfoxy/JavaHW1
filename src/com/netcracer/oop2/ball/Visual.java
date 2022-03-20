package com.netcracer.oop2.ball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Visual extends JFrame{
    private JButton play;
    private JPanel jcp;
    private JPanel panel;
    private JSpinner yPosition;
    private JSpinner xPosition;
    private JSpinner speedPosition;
    private JSpinner dPosition;

    public static ArrayList<Integer> x  = new ArrayList<Integer>();
    public static ArrayList<Integer> y  = new ArrayList<Integer>();
    public static Ball ball;
    public static Container container;

    public Visual() {
        super("График полета мяча");
        pack();
        setContentPane(panel);

        SpinnerNumberModel spinnerNumberModelToY = new SpinnerNumberModel(100,10,490,1);
        yPosition.setModel(spinnerNumberModelToY);
        SpinnerNumberModel spinnerNumberModelToX = new SpinnerNumberModel(100,10,580,1);
        xPosition.setModel(spinnerNumberModelToX);
        SpinnerNumberModel spinnerNumberModelToSpeed = new SpinnerNumberModel(10,1,100,1);
        speedPosition.setModel(spinnerNumberModelToSpeed);
        SpinnerNumberModel spinnerNumberModelToDirection = new SpinnerNumberModel(-10,-180,180,1);
        dPosition.setModel(spinnerNumberModelToDirection);

        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (jcp.getComponentCount()!= 0) {
                    jcp.remove(0);
                    x.clear();
                    y.clear();
                }
                int yPositionSpinner= (int)yPosition.getValue();
                int xPositionSpinner= (int)xPosition.getValue();
                int speedPositionSpinner= (int)speedPosition.getValue();
                int directionPositionSpinner= (int)dPosition.getValue();
                ball = new Ball(xPositionSpinner,yPositionSpinner,10,speedPositionSpinner,directionPositionSpinner);
                container = new Container(0,0,580,490);

                while (container.collides(ball)){
                    x.add((int)ball.getX());
                    y.add((int)ball.getY());
                    ball.move();
                }
                if (container.collidesVertical(ball)){
                    ball.reflectVertical();
                }else if(container.collidesHorizontal(ball)){
                    ball.reflectHorizontal();
                }
                x.add((int)ball.getX());
                y.add((int)ball.getY());
                ball.move();
                while (container.collides(ball)){
                    x.add((int)ball.getX());
                    y.add((int)ball.getY());
                    ball.move();
                }
                jcp.add(new DrawingComponent ());
                panel.updateUI();

            }
        });

        setSize(795, 530);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }



}
