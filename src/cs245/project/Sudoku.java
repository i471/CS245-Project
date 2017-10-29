
package cs245.project;
import java.awt.*;        // Uses AWT's Layout Managers
import java.awt.event.*;  // Uses AWT's Event Handlers
import java.util.Arrays;
import javax.swing.*;     // Uses Swing's Container/Components
import javax.swing.border.Border;

public class Sudoku extends javax.swing.JFrame 
{
    
    private Button submit;
    private Button quit;
   // Name-constants for the game properties
   public static final int GRID_SIZE = 9;    // Size of the board
   public static final int SUBGRID_SIZE = 3; // Size of the sub-grid
 
   // Name-constants for UI control (sizes, colors and fonts)
   public static final int CELL_SIZE = 60;   // Cell width/height in pixels
   public static final int CANVAS_WIDTH  = 100;
   public static final int CANVAS_HEIGHT = 100;
                                             // Board width/height in pixels
   public static final Color OPEN_CELL_BGCOLOR = Color.YELLOW;
   public static final Color OPEN_CELL_TEXT_YES = new Color(0, 255, 0);  // RGB
   public static final Color OPEN_CELL_TEXT_NO = Color.RED;
   public static final Color CLOSED_CELL_BGCOLOR = new Color(240, 240, 240); // RGB
   public static final Color CLOSED_CELL_TEXT = Color.BLACK;
   public static final Font FONT_NUMBERS = new Font("Monospaced", Font.BOLD, 20);
 
   // The game board composes of 9x9 JTextFields,
   // each containing String "1" to "9", or empty String
   private JTextField[][] tfCells = new JTextField[GRID_SIZE][GRID_SIZE];

   private int[][] puzzle =
      {{8, 3, 5, 4, 1, 6, 9, 2, 7},
       {2, 9, 6, 8, 5, 7, 4, 3, 1},
       {4, 1, 7, 2, 9, 3, 6, 5, 8},
       {5, 6, 9, 1, 3, 4, 7, 8, 2},
       {1, 2, 3, 6, 7, 8, 5, 4, 9},
       {7, 4, 8, 5, 2, 9, 1, 6, 3},
       {6, 5, 2, 7, 8, 1, 3, 9, 4},
       {9, 8, 1, 3, 4, 5, 2, 7, 6},
       {3, 7, 4, 9, 6, 2, 8, 1, 5}};
   int[][] tempArray = new int[GRID_SIZE][GRID_SIZE];
   // For testing, open only 2 cells.
   private boolean[][] masks =
      {{false, true, true, false, true, false, true, true, false},
       {true, true, true, true, true, true, false, true, true},
       {true, false, true, true, true, true, false, false, true},
       {false, true, false, true, false, true, false, false, true},
       {true, true, true, true, false, true, true, true, true},
       {true, false, false, true, false, true, false, true, false},
       {true, false, false, true, true, true, true, false, true},
       {true, true, false, true, true, true, true, true, true},
       {false, true, true, false, true, false, true, true, false}};
 
   /**
    * Constructor to setup the game and the UI Components
    */
   public Sudoku() 
   {
       submit = new Button("submit");
       quit = new Button("quit");
       
       submit.addActionListener(new ActionListener() 
       {
           @Override
           public void actionPerformed(ActionEvent e) 
           {
               checkAnswer();
               //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
       
       JPanel panel1 = new JPanel();
       JPanel panel2 = new JPanel();
       JPanel panel3 = new JPanel();
       
       
       panel1.setLayout(new GridLayout(GRID_SIZE, GRID_SIZE )); // 9x9 GridLayout
       panel2.setLayout(new BorderLayout());
       panel3.setLayout(new GridBagLayout());
       panel3.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
       
       
       panel2.add(submit, BorderLayout.WEST);
       panel2.add(quit, BorderLayout.EAST);
       panel2.setPreferredSize(new Dimension(10,10));
       
       GridBagConstraints gbc = new GridBagConstraints();
       gbc.fill = GridBagConstraints.VERTICAL;
       gbc.fill = GridBagConstraints.BOTH;
       
       panel1.setPreferredSize( new Dimension(CANVAS_WIDTH, CANVAS_WIDTH) );
       gbc.gridy = 1;
       gbc.weighty = 0.9;
       gbc.weightx = 1.0;
       panel3.add(panel1, gbc);
       
       gbc.gridy = 2;
       gbc.weighty = 0.1;
       gbc.weightx = 1.0;
       panel3.add(panel2,gbc);
 
      // Construct 9x9 JTextFields and add to the content-pane
      for (int row = 0; row < GRID_SIZE; ++row) 
      {
         for (int col = 0; col < GRID_SIZE; ++col) 
         {
            tfCells[row][col] = new JTextField();        // Allocate element of array
            panel1.add(tfCells[row][col]);            // ContentPane adds JTextField
            if (masks[row][col]) {
               tfCells[row][col].setText("");            // set to empty string
               tfCells[row][col].setEditable(true);
               tfCells[row][col].setBackground(OPEN_CELL_BGCOLOR);
 
               // Add ActionEvent listener to process the input
               // ... [TODO 4] (Later) ...
            } 
            else 
            {
               tfCells[row][col].setText(puzzle[row][col] + "");
               tfCells[row][col].setEditable(false);
               tfCells[row][col].setBackground(CLOSED_CELL_BGCOLOR);
               tfCells[row][col].setForeground(CLOSED_CELL_TEXT);
            }
            // Beautify all the cells
            tfCells[row][col].setHorizontalAlignment(JTextField.CENTER);
            tfCells[row][col].setFont(FONT_NUMBERS);
         }
      }
 
      // Set the size of the content-pane and pack all the components
      //  under this container.
      panel1.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
      pack();
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Handle window closing
      setTitle("Sudoku");
      this.add(panel3);
   }
   //private JTextField[][] tfCells = new JTextField[GRID_SIZE][GRID_SIZE];
   void initArray()
   {
      
      
      for (int row = 0; row < GRID_SIZE; row ++) 
      {
         for(int col = 0; col < GRID_SIZE; col ++)
         {
             if(masks[row][col] == false)
             {
                 tempArray[row][col] = puzzle[row][col];
                
             }
             else
             {
                if(tfCells[row][col].getText().equals(""))
                {
                   tempArray[row][col] = -1;
                }
                else
                {
                   tempArray[row][col] = Integer.valueOf(tfCells[row][col].getText().toString()); 
                }
             }
         }
      }
   }
   
   private void checkAnswer()
   {
       initArray();
       boolean same = true;
       for(int row = 0; row < GRID_SIZE; row ++)
       {
           for(int col = 0; col < GRID_SIZE; col ++)
           {
               if(tempArray[row][col] != puzzle[row][col])
               {
                   same = false;
               }
           }
       }
       
       if(!same)
       {
           System.out.print("NO!");
       }
       else
       {
           System.out.print("YES!");
       }
   }
   
   private void selectionButtonPressed()
   {
       checkAnswer();
   }
 
  
}