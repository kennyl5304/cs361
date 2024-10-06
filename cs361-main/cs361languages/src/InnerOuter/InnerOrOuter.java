package InnerOuter;

public class InnerOrOuter {

    public static int InnermostOutermost(int x, int y) throws StackOverflowError{
        if(x == 0){
            return 0;
        }
        else{
            return(InnermostOutermost(x-1,InnermostOutermost(x,y)));
        }
    }
    public static void main(String[] args){
        try{
            System.out.println(InnermostOutermost(1,1)); 
        }
        catch(StackOverflowError e){
            System.out.println(e.toString());
        }
    }
}
