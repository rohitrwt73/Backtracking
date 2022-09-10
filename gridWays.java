public class gridWays {
    //no. of ways to reach from(0,0) to (n-1,M-1) in nXm ...allowed moves right and down
public static int gridWay(int i, int j, int m , int n){
    if(i==n-1 && j==m-1){
        return 1;
    }
    else if(i==n || j==m){
        return 0;
    }
    return gridWay(i+1,j,n,m)+ gridWay(i,j+1,n,m);
    

}
public static void main(String[] args) {
    System.out.println(gridWay(0,0,3,3));
}
}
