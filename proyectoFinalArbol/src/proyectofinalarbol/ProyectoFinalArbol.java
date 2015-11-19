package proyectofinalarbol;
/**
 *
 * @author Victor
 */
public class ProyectoFinalArbol {
    
public static void main(String[] args) {
         arbol arbolito = new arbol();
         String arg = args[0];
        
         
     //inserta el arbol binario, elimina un nodo insertado y busca Hijo el Derecho de un nodo insertado   
         
    if(args.length>0 && arg.contains("insertar(")&&(arg.contains("&elimina(")&&(arg.contains("&insertar(")&&(arg.contains("&buscaHijoDer("))))){
               int valor;
               String[] comparar = new String[100];
               int inicio = arg.indexOf("insertar");
               int fin = arg.lastIndexOf("&elimina");
               comparar[0] = arg.substring(inicio+9,fin-1);
               int sinComa;
               String[] almacenar = new String[100];
               almacenar[0] = comparar[0];
               String[] quitarComa =almacenar[0].split(",");
            