import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escribe el limite de la tarjeta :");
        double limite = lectura.nextDouble();
        TarjetaDeCredito tarjeta= new TarjetaDeCredito(limite);

        int salir = 1 ;
        while (salir != 0){
            System.out.println("escribe la descripcion de la compra");
            String descripcion =lectura.next();

            System.out.println("escriba el valor de la compra");
            double valor = Double.valueOf(lectura.next());

            Compra compra = new Compra(descripcion, valor);
            boolean compraRealizada = tarjeta.lanzarCompra(compra);
             if (compraRealizada){
                 System.out.println("compra realizada!");
                 System.out.println("escriba 0 para salir o 1 para continuar");
                 salir= lectura.nextInt();
             }else{
                 System.out.println("saldo insuficiente");
                 salir = 0;
             }
        }
        System.out.println("****************");
        System.out.println("COMPRA REALIZADA:\n");
        for (Compra compra : tarjeta.getListaDeCompras()){
            System.out.println(compra.getDescripcion()+"-"+compra.getValor());
        }
        System.out.println("\n**************");
        System.out.println("\nsaldo de la tarjeta" + tarjeta.getSaldo());
    }
}
