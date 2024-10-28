import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    public double limite;
    private  double saldo;
    private List<Compra> listaDeCompras;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo=limite;
        this.listaDeCompras= new ArrayList<>();
    }

    public boolean lanzarCompra(Compra compra){
        if (this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return  true;

        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

    public double getSaldo() {
        return saldo;
    }
}
