package Java_Basic.ClasesYObjetos;

public class PruebaPersona
{

    public static void main(String[] args)
    {
        Persona objPersona = new Persona();

        objPersona.nombre = "Victor";
        objPersona.apellido = "Saucedo";
        objPersona.edad = 15;
        objPersona.genero = "Masculino";
        objPersona.nacionalidad = "Mexicana";

        objPersona.MostrarInformacion();

    }



}
