public class Alumno
{
    private String nombre;
    private int nota;

    public String GetNombre()
    {
        return nombre;
    }
    public void SetNombre(String nuevoNombre)
    {
        nombre = nuevoNombre;
    }

    public int GetNota()
    {
        return nota;
    }

    public void SetNota(int nuevaNota)
    {
        if (nuevaNota >= 0 && nuevaNota <= 10)
            nota = nuevaNota;
    }

    public Boolean Aprobado()
    {
        if (nota >= 5)
            return true;
        return false;
    }
}

