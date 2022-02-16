public class Codificador {
    
    public Codificador (){}

    public String transformar (String cadena){

        char [] letras = cadena.toCharArray(); // el String se transforma en un vector de caracteres
        String mensajeCodificado = "";
        String caracterActual = "";
        String caracterSiguiente = "";

        for (int i = 0; i < letras.length ; i ++){      //recorro el vector de caracteres

            mensajeCodificado += this.devolverCodigo(letras[i]);    //codifico el caracter y agrego al mensaje

            if ((i + 1) < letras.length){               //pregunta si todavia existen letras en el vector

                boolean aux = this.controlarIgualdadCaracter(letras[i], letras[i+1]);  //controlo si el caracter actual es igual al siguiente

                if(aux == true){
                    mensajeCodificado += " ";       //si la funcion devuelve true, agrego un espacio en blanco al mensaje
                }
               
                caracterActual = this.devolverCodigo(letras[i]);        //obtengo los numeros actuales. Ejemplo: 6  
                caracterSiguiente = this.devolverCodigo(letras[i+1]);   //obtengo los numeros siguientes. Ejemplo: 666

                char letraActual = caracterActual.charAt(0);            //Tomo el primer numero actual
                char letraSiguiente = caracterSiguiente.charAt(0);      //Tomo el primer numero siguientes

                aux = this.controlarIgualdadCaracter(letraActual, letraSiguiente); //invoco nuevamente a la funcion para comparar caracteres

                if(aux == true){
                    mensajeCodificado += " ";       //si la funcion devuelve true, agrego un espacio en blanco al mensaje. Significa que el usuario presiono el mismo boton de manera consecutiva
                }

            }
                    
        }

       return mensajeCodificado;    

    }

    public boolean controlarIgualdadCaracter(char a, char b){
        
        boolean aux = false;        

        if(a == b){                  //pregunta si el siguiente caracter es igual al ultimo caracter codificado

            aux = true;           //si es igual agrega un espacio

        }

        return aux;
    }


    public String devolverCodigo (char letra){

        char cast = Character.toUpperCase(letra); //transformo el caracter en mayuscula
        String codigo="";

        switch(cast){

            case 'A': codigo = "2";
            break;

            case 'B': codigo = "22";
            break;

            case 'C': codigo = "222";
            break;

            case 'D': codigo = "3";
            break;

            case 'E': codigo = "33";
            break;

            case 'F': codigo = "333";
            break;

            case 'G': codigo = "4";
            break;

            case 'H': codigo = "44";
            break;

            case 'I': codigo = "444";
            break;

            case 'J': codigo = "5";
            break;

            case 'K': codigo = "55";
            break;

            case 'L': codigo = "555";
            break;

            case 'M': codigo = "6";
            break;

            case 'N': codigo = "66";
            break;

            case 'O': codigo = "666";
            break;

            case 'P': codigo = "7";
            break;

            case 'Q': codigo = "77";
            break;

            case 'R': codigo = "777";
            break;

            case 'S': codigo = "7777";
            break;

            case 'T': codigo = "8";
            break;

            case 'U': codigo = "88";
            break;

            case 'V': codigo = "888";
            break;

            case 'W': codigo = "9";
            break;

            case 'X': codigo = "99";
            break;

            case 'Y': codigo = "999";
            break;

            case 'Z': codigo = "9999";
            break;

            case ' ': codigo = "0"; // El espacio lo codifica como '0' para no confundirse con el espacio de letras o numeros repetidos
            break;

            default: codigo.toString();
            break;

        }
        

        return codigo;
    }



}
