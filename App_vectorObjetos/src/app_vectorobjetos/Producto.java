package app_vectorobjetos;

public class Producto {
    private int codigo;
    private float precioCompra;
    private int cantBodega;
    private int cantMinima;

    public Producto(int codigo, float precioCompra, int cantBodega, int cantMinima) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.cantBodega = cantBodega;
        this.cantMinima = cantMinima;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantBodega() {
        return cantBodega;
    }

    public void setCantBodega(int cantBodega) {
        this.cantBodega = cantBodega;
    }

    public int getCantMinima() {
        return cantMinima;
    }

    public void setCantMinima(int cantMinima) {
        this.cantMinima = cantMinima;
    }
    
    public void solicitarPedido(){
        if (this.cantMinima > this.cantBodega){
            System.out.println("Se debe realizar pedido de este producto");
        }else{
            System.out.println("No es necesario realizar pedido de este producto");
        }
    }
    
    
    
}
