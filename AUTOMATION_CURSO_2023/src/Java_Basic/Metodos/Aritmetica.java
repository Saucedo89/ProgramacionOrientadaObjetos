package Java_Basic.Metodos;

public class Aritmetica
{
    //Atributos

    int a;
    int b;
    int resultado;


    //Metodo Sumar
    public void sumar ()
    {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);

    }

    public int SumarConRetorno()
    {
        int resultado = a + b ;
        return  resultado;
        //return a + b;   --->>>>  Esto es correcto pero se queda comentado
    }



    //Parametos y argumentos es lo mismo
    public int SumarConParametros(int param1, int param2)
    {
        a = param1;
        b = param2;
        return a + b;
    }


}
