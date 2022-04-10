package com.netcracer.oop2.ball;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class DrawingComponent extends JPanel {
    ArrayList<Integer> x  = new ArrayList<Integer>();
    ArrayList<Integer> y  = new ArrayList<Integer>();

    public void move(Ball ball,Container container){
        x.clear();
        y.clear();

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
        repaint();

    }
    @Override
    public void paintComponent(Graphics gh) {

        int [] x1 = new int[Visual.x.size()];
        int [] y1 = new int[Visual.y.size()];
        for (int i = 0; i< Visual.x.size(); i++) x1[i] = Visual.x.get(i);
        for (int i = 0; i< Visual.y.size(); i++) y1[i] = Visual.y.get(i);
        int n = Visual.x.size();
        Graphics2D drp = (Graphics2D)gh;
        drp.drawLine(0, Visual.container.getHeight(), 0, 0);
        drp.drawLine(0, 0, Visual.container.getWidth(), 0);
        drp.drawLine(0, Visual.container.getHeight(), Visual.container.getWidth(), Visual.container.getHeight());
        drp.drawLine(Visual.container.getWidth(), 0, Visual.container.getWidth(), Visual.container.getHeight());
        drp.drawOval(x1[0]-5,y1[0]-5,10,10);
        drp.drawPolyline(x1, y1, n);


    }
}
