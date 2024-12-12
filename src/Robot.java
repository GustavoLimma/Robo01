public class Robot {
    public int line;
    public int column;
    public int step;

    String[][] map = new String[20][40];

    public Robot() {
        this.line =0;
        this.column = 0;
        this.step = 5;
        for (int i=0; i<map.length; i++) { // filling the matrix
            for (int u=0; u<map[i].length; u++) { 
                map[i][u] = " ";
            }
        }
        this.map[line][column] = "1";

    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public void ShowCurrentPosition(){ // Showing the current position of map with each interaction
       for(int i=0; i<map.length; i++){
        for(int u=0; u<map[i].length; u++){
            System.out.print(map[i][u]);
        }
        System.out.println("");
       }
       System.out.println("position: (" + line + "," + column + ")");
    }

    public void WalkBackward() {
        if (line + step < map.length - 1) { 
            map[line][column] = " " ; // Deletes the position of the last element
            line = line + step; // Update position
            map[line][column] = "1"; // add the element in the new position
        } 
    }

    // The same applies to the other methods
    
    public void WalkForward() {
        if (line -step > 0) { 
            map[line][column] = " ";
            line = line - step;
            map[line][column] = "1";
        } 
    }
    
    public void WalkRight() {
        if (column + step< map[0].length - 1) { 
            map[line][column] = " ";
            column = column + step;
            map[line][column] = "1";
        } 
    }
    
    public void WalkLeft() {
        if (column -step > 0) { 
            map[line][column] = " ";
            column = column - step;
            map[line][column] = "1";
        } 
    }
}
    
    