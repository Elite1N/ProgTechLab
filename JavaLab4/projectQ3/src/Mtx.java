import java.util.Arrays;

public class Mtx {
    // instance variables
    private int rowSize,columnSize;
    private int[][] matrix;

    public Mtx(int[][] array) {  // main constructor
        int currentRow = 0 , currentIndex = 0;
        rowSize = array.length;

        if (rowSize > 0) {
            columnSize = array[0].length;
        }else{
            columnSize = 0;
        }
        matrix = new int[rowSize][columnSize];

        for (int[] rows : array) {
            for (int value : rows) {
                matrix[currentRow][currentIndex] = value;
                currentIndex++;
            }
            currentIndex = 0;
            currentRow++;
        }

    }

    public boolean equalSize(Mtx otherMtx) {  // check if 2 matrices are compatible for addition (dimension เท่ากัน)
        return (this.rowSize == otherMtx.rowSize) && (this.columnSize == otherMtx.columnSize);
    }

    public boolean compatible(Mtx otherMtx) { // check if 2 matrices are compatible for multiplication (จำนวนแนวตั้ง1 == แนวนอน2)
        return this.columnSize == otherMtx.rowSize;
    }

    public Mtx add(Mtx otherMtx) { // addition between matrices (return as object)
        Mtx result = new Mtx(0, this.rowSize, this.columnSize);  // create the result matrix
        for (int rows = 0; rows < this.rowSize; rows++) {
            for (int i = 0; i < this.columnSize; i++) {
                result.matrix[rows][i] = this.matrix[rows][i] + otherMtx.matrix[rows][i];
            }
        }
        return result;  // return the result matrix
    }

    public Mtx mul(Mtx otherMtx){   // multiply a matrix by another matrix (return as object)
        Mtx result = new Mtx(0,this.rowSize,otherMtx.columnSize);  // create the result matrix
        for(int i=0;i<this.rowSize;i++){
            for(int j = 0; j<otherMtx.columnSize; j++){
                for(int k = 0; k< otherMtx.columnSize; k++){
                    result.matrix[i][j] += this.matrix[i][k] * otherMtx.matrix[k][j];
                }
            }
        }
        return result; // return the result matrix
    }

    public Mtx mul(int c) {  // multiply a matrix by a number (return as object)
        Mtx result = new Mtx(0, this.rowSize, this.columnSize);
        for (int rows = 0; rows < this.rowSize; rows++) {
            for (int i = 0; i < this.columnSize; i++) {
                result.matrix[rows][i] = this.matrix[rows][i] * c;
            }
        }
        return result;
    }

    // optional useful methods
    public void printMtx() {   // print ทุกค่าของ matrix
        for (int i = 0; i < rowSize; i++)
            System.out.println(Arrays.toString(matrix[i]));

    }

    private Mtx(int value, int rowSize, int columnSize) {  // alternative constructor used inside the class
        this.rowSize = rowSize;
        this.columnSize = columnSize;
        matrix = new int[rowSize][columnSize];
        for (int[] rows : matrix) {
            Arrays.fill(rows, value);
        }
    }

}
