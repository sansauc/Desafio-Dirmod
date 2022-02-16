import junit.framework.TestCase;

public class TestCodificador extends TestCase {
    

    private Codificador codificador;

    public void escenario(){
        codificador = new Codificador ();
    }

    public void testTransformar (){
        escenario();
        assertTrue(codificador.transformar("hola").equalsIgnoreCase("446665552")); // compara 2 string
    }

    public void testControlarIgualdadCaracter (){
        escenario();
        assertTrue(codificador.controlarIgualdadCaracter('a','a')); //le paso 2 char y devuelve un true
    }

    public void testDevolverCodigo (){
        escenario();
        assertTrue(codificador.devolverCodigo('a') == "2"); //le paso un char y me devuelve un string
    }





}
