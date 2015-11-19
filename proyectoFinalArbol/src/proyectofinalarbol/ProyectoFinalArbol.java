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
                   
        for(int i=0;i<quitarComa.length;i++){
                   sinComa = Integer.parseInt(quitarComa[i]);
                   arbolito.insertar(sinComa);
               }
               int inicio1 = arg.indexOf("elimina");
               int fin1 = arg.lastIndexOf("&insertar");
               int sinComa1;
               String comparar1;
               comparar1 = arg.substring(inicio1+8,fin1-1);
               String[] almacenar2 = new String[100];
               almacenar2[1] = comparar1;
               String[] quitarComa1 = almacenar2[1].split(",");
               for(int i=0;i<quitarComa1.length;i++){
                   sinComa1 = Integer.parseInt(quitarComa1[i]);
                   valor = sinComa1;
                   arbolito.elimina(valor);
               }
               int inicio2 = arg.indexOf("&insertar");
               int fin2 = arg.lastIndexOf("&buscaHijoDer");
               int sinComa2;
               String comparar2;
               comparar2 = arg.substring(inicio2+10,fin2-1);
               String[] almacenar3 = new String[100];
               almacenar3[1] = comparar2;
               String[] quitarComa2 = almacenar3[1].split(",");
               
            for(int i=0;i<quitarComa2.length;i++){
                   sinComa2 = Integer.parseInt(quitarComa2[i]);
                   int valor2 = sinComa2;
                   arbolito.insertar(valor2);
               }
               int inicio3 = arg.indexOf("&buscaHijoDer(");
               int fin3 = arg.lastIndexOf(")");
               int sinComa3;
               String comparar3;
               comparar3 = arg.substring(inicio3+14,fin3);
               String[] almacenar4 = new String[100];
               almacenar4[1] = comparar3;
               int valor3 = Integer.parseInt(comparar3);
               System.out.println();
               System.out.println("El Arbol es:");
               System.out.print("==>> ");
               arbolito.BuscarHijoDer(valor3);
               System.out.println();
         }