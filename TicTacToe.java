public class TicTacToe {
    int[] rows;
    int[] cols;
    int diagleft;
    int diagright;
    int n;
    public TicTacToe(int n) {
       rows = new int[n];
       cols = new int[n];
       diagleft = 0;
       diagright = 0;
       this.n = n;
    }
    //X->>1  0->>-1
    // return 0 if no player wins
    //return 1 if player 1 i.e X wins
    //return 2 if player 2 i.e 0 wins
    public int move(int row,int col,int player){
        int val = player==1 ? 1 : -1;
        rows[row]+=val;
        cols[col]+=val;
        if(row==col) diagleft+=val;
        if(row+col==n) diagright+=val;
        if(rows[row]==n || cols[col]==n || diagleft==n || diagright==n)
            return 1;
        else if(rows[row]==-n || cols[col]==-n || diagleft==-n || diagright==-n)
            return -1;
        return 0;
    }
    public static void main(String[] args){
        TicTacToe obj = new TicTacToe(3);
        int a = obj.move(0,0,1);
        int b = obj.move(0,1,1);
        int c = obj.move(1,1,1);
        int d = obj.move(0,2,1);
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}
