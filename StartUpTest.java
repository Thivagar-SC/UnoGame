package Summative;

import javax.swing.*;

public class StartUpTest 
{
    //private static QuizModel model;  //Quiz Model
    private static GuiTest view;    //Quiz View
    public static void main(String[] args)
    {
      //Create model and view
   //   model = new QuizModel();
      view = new GuiTest();
      
      //Display Frame
      JFrame main = new JFrame("Quiz Game");
      main.setContentPane(view);
      main.setSize(400,550);
      main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      main.setVisible(true);
    }
}
