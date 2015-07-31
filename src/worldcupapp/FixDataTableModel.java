/*
 *
 * @reference http://www.reddit.com/r/javahelp/comments/21y86u/how_can_i_check_if_a_method_is_being_executed/cghms2h
 * 
 */


/*
 * The DataTableModel class handles the interaction between
 * Table data and the visual jTable component
 */
package worldcupapp;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FixDataTableModel extends AbstractTableModel {

    ArrayList<String> theTableModel;

    public FixDataTableModel(ArrayList<String> theTableModel) {
        this.theTableModel = theTableModel;
    }

    @Override
    public int getRowCount() { //Returns the size of the tableModel.
        return theTableModel.size();
    }

    @Override
    public int getColumnCount() { //Return the amount of columns.
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { //Returns the contents of the theTableModel ArrayList at each rowIndex.
        return theTableModel.get(rowIndex);
    }

}
