package Java_Basic.OperadoresYVariables;

public class OperadoresDeIgualdad
{

    public static void main(String[] args)
    {
        var a = 5;
        var b = 4;

        var c = (a==b);
        System.out.println("c = " + c);

        var cadena = "hola";
        var cadenaDos = "hola";
        var validacion = cadena == cadenaDos;
        System.out.println("El resultado es: " + validacion); //compara referenmcias de objetos

        var validacionDos = cadena.equals(cadenaDos); //Equals es igual a igual
        System.out.println("El sesultado es :" + validacionDos);

    }
}
