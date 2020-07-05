import myQueue.Queue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Task 3.1");
        JTextField textFieldX = new JTextField(16);
        JTextField textFieldY = new JTextField(16);
        textFieldX.setText("1 2 3 4 5");
        textFieldY.setText("1 2 3 4 5");
        JPanel p = new JPanel();
        JLabel label = new JLabel("");
        // create a new button
        JButton button = new JButton("submit");
        p.add(textFieldX);
        p.add(textFieldY);
        p.add(button);
        p.add(label);
        frame.add(p);



        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(textFieldX.getText().isEmpty() || textFieldY.getText().isEmpty() )
                    return;
                Queue X = new Queue();
                Queue Y = new Queue();

                for (String val : textFieldX.getText().split(" ")) {
                    X.add(Double.valueOf(val));
                }
                for (String val : textFieldY.getText().split(" ")) {
                    Y.add(Double.valueOf(val));
                }
                label.setText("Count of steps = " + String.valueOf(Solution.countSteps(X, Y)));
            }
        });
        frame.setSize(300, 300);

        frame.show();
    }
}
