package operaciones;

public class OperacionesBasicas 
{
    public int sumar( int n1, int n2 ){
        return n1+n2;
    }
    
    public int restar( int n1, int n2 ){
        return n1-n2;
    }
    
    public int multiplicar( int n1, int n2 ){
        return n1*n2;
    }
    
    public int dividir( int n1, int n2 ){
        if( n2 != 0 ){
            return n1/n2;
        }else{
            return 0;
        }
    }
}
