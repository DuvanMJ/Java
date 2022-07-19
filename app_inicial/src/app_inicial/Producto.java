package app_inicial;


public class Producto {
    private int codigo;
    private float precio;
    private int cBodega;
    private int cMinima;

    public Producto() {
        this.codigo = 0;
        this.precio = 0;
        this.cBodega = 0;
        this.cMinima = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getcBodega() {
        return cBodega;
    }

    public void setcBodega(int cBodega) {
        this.cBodega = cBodega;
    }

    public int getcMinima() {
        return cMinima;
    }

    public void setcMinima(int cMinima) {
        this.cMinima = cMinima;
    }
    
    public void solictarPedido (){
        if (this.cMinima > this.cBodega){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    
    
}
