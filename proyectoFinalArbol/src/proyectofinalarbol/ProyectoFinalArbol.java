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
    //inserta el arbol binario, elimina un nodo insertado y busca Hijo el Izquierdo de uno nodo insertado
    
    else if(args.length>0 && arg.contains("insertar(")&&(arg.contains("&elimina(")&&(arg.contains("&insertar(")&&(arg.contains("&buscaHijoIzq("))))){
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
               int fin2 = arg.lastIndexOf("&buscaHijoIzq");
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
               int inicio3 = arg.indexOf("&buscaHijoIzq(");
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
               arbolito.BuscarHijoIzq(valor3);
               System.out.println();
         }
    
    //inserta el arbol binario, elimina un nodo cualquiera insertado e imprime en Preorden
    
    else if(args.length>0 &&(arg.contains("insertar(")&&(arg.contains("&elimina(")&&(arg.contains("&imprimePre()"))))){
                int valor;
                String comparar;
                 int inicio = arg.indexOf("insertar(");
                int fin = arg.lastIndexOf("&elimina");
                comparar = arg.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar;
                String[] quitarComa = almacenar[0].split(",");
                
            for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbolito.insertar(sinComa);
                } 
                int inicio1 = arg.indexOf("elimina(");
                int fin1 = arg.lastIndexOf("&imprimePre");
                String comparar1;
                comparar1 = arg.substring(inicio1+8,fin1-1);
                String[] almacenar2 = new String[100];
                almacenar2[1] = comparar1;
                String[] quitarComa1 = almacenar2[1].split(",");
                
            for(int i=0;i<quitarComa1.length;i++){
                sinComa = Integer.parseInt(quitarComa1[i]);
                valor = sinComa;
                arbolito.elimina(valor);
                }
                System.out.println();
                System.out.println("El Arbol en Preorden es:");
                System.out.print("==>> ");
                arbolito.imprimePre();
                System.out.println();
            }    
    
    //inserta el arbol binario e imprime en Preorden
    
    else if(args.length>0 &&(arg.contains("insertar(")&&(arg.contains("&imprimePre()")))){
                String comparar;
                 int inicio = arg.indexOf("insertar(");
                int fin = arg.lastIndexOf("&imprimePre");
                comparar = arg.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar;
                String[] quitarComa = almacenar[0].split(",");
            
            for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbolito.insertar(sinComa);
                } 
                System.out.println();
                System.out.println("El Arbol en Preorden es:");
                System.out.print("==>> ");
                arbolito.imprimePre();
                System.out.println();
            }    
    
    //Inserta el arbol binario, elimina un nodo cualquiera ingreso e Imprime en Inorden
    
    else if(args.length>0 &&(arg.contains("insertar(")&&(arg.contains("&elimina(")&&(arg.contains("&imprimeIno()"))))){
                int valor;
                String[] comparar = new String[100];
                int inicio = arg.indexOf("insertar");
                int fin = arg.lastIndexOf("&elimina");
                comparar[0] = arg.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar[0];
                String[] quitarComa = almacenar[0].split(",");
             
            for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbolito.insertar(sinComa);
                }
                int inicio1 = arg.indexOf("elimina");
                int fin1 = arg.lastIndexOf("&imprimeIno");
                int sinComa1;
                String comparar1;
                comparar1 = arg.substring(inicio1+8,fin1-1);
                String[] almacenar2 = new String[100];
                almacenar2[1] = comparar1;
                String[] quitarComa1 = almacenar2[1].split(",");
                
            for(int i=0;i<quitarComa1.length;i++){
                sinComa1 = Integer.parseInt(quitarComa1[i]);
                String[] prueba = new String[100];
                valor = sinComa1;  
                arbolito.elimina(valor);
                }
                System.out.println();
                System.out.println("El Arbol en Inorden es:");
                System.out.print("==>> ");
                arbolito.imprimeIno();
                System.out.println();
            } 
    
    //inserta el arbol binario e imprime en Inorden
    
    else if(args.length>0 &&(arg.contains("insertar(")&&(arg.contains("&imprimeIno()")))){
                String comparar;
                int inicio = arg.indexOf("insertar(");
                int fin = arg.lastIndexOf("&imprimeIno");
                comparar = arg.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar;
                String[] quitarComa = almacenar[0].split(",");
        
            for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbolito.insertar(sinComa);
                } 
                System.out.println();
                System.out.println("El Arbol en Inorden es:");
                System.out.print("==>> ");
                arbolito.imprimeIno();
                System.out.println();
            } 
         
    //inserta el arbol binario, elimina un nodo cualquiera e imprime en Postorden
    
    else  if(args.length>0 &&(arg.contains("insertar(")&&(arg.contains("&elimina(")&&(arg.contains("&imprimePos()"))))){
                int valor;
                String comparar;
                int inicio = arg.indexOf("insertar(");
                int fin = arg.lastIndexOf("&elimina");
                comparar = arg.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar;
                String[] quitarComa = almacenar[0].split(",");
                
            for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbolito.insertar(sinComa);
                } 
                int inicio1 = arg.indexOf("elimina(");
                int fin1 = arg.lastIndexOf("&imprimePos");
                String comparar1;
                comparar1 = arg.substring(inicio1+8,fin1-1);
                String[] almacenar2 = new String[100];
                almacenar2[1] = comparar1;
                String[] quitarComa1 = almacenar2[1].split(",");
                
            for(int i=0;i<quitarComa1.length;i++){
                sinComa = Integer.parseInt(quitarComa1[i]);
                valor = sinComa;
                arbolito.elimina(valor);
                }
                System.out.println("El Arbol En Postorden es:");
               System.out.print("==>> ");
                arbolito.imprimePos();
                System.out.println();
            }    
    
    //inserta el arbol binario e imprime en Postorden
    
    else if(args.length>0 &&(arg.contains("insertar(")&&(arg.contains("&imprimePos()")))){
                String comparar;
                int inicio = arg.indexOf("insertar(");
                int fin = arg.lastIndexOf("&imprimePos");
                comparar = arg.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar;
                String[] quitarComa = almacenar[0].split(",");
                
            for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbolito.insertar(sinComa);
                } 
                System.out.println();
                System.out.println("El Arbol En Postorden es:");
                System.out.print("==>> ");
                arbolito.imprimePos();
                System.out.println();
            } 
         
    //inserta el arbol binario y busca el hijo derecho de un nodo cualquiera insertado
    
    else if (args.length >0 && arg.contains("insertar(")&&(arg.contains("&buscaHijoDer("))){
               {
               int valor;
                String comparar;
                int inicio = arg.indexOf("insertar(");
                int fin = arg.lastIndexOf("&buscaHijoDer");
                comparar = arg.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar;
                String[] quitarComa = almacenar[0].split(",");
              
            for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbolito.insertar(sinComa);
                } 
                int inicio1 = arg.indexOf("buscaHijoDer(");
                int fin1 = arg.lastIndexOf(")");
                String comparar1;
                comparar1 = arg.substring(inicio1+13,fin1);
                String[] almacenar2 = new String[100];
                almacenar2[1] = comparar1;
                valor = Integer.parseInt(comparar1);
                System.out.println();
                System.out.println("El Hijo Derecho es:");
                System.out.print("==>> ");
                arbolito.BuscarHijoDer(valor);
                System.out.println();
            } 
           }
    
    //inserta el arbol binario y busca el hijo izquierdo de un nodo cualquiera insertado
    
    else if(args.length >0 && arg.contains("insertar(")&&(arg.contains("&buscaHijoIzq(")))
                   {
                int valor;
                String comparar;
                int inicio = arg.indexOf("insertar(");
                int fin = arg.lastIndexOf("&buscaHijoIzq");
                comparar = arg.substring(inicio+9,fin-1);
                int sinComa;
                String[] almacenar = new String[100];
                almacenar[0] = comparar;
                String[] quitarComa = almacenar[0].split(",");
                
            for(int i=0;i<quitarComa.length;i++){
                sinComa = Integer.parseInt(quitarComa[i]);
                arbolito.insertar(sinComa);
                } 
                int inicio1 = arg.indexOf("buscaHijoIzq(");
                int fin1 = arg.lastIndexOf(")");
                String comparar1;
                comparar1 = arg.substring(inicio1+13,fin1);
                String[] almacenar2 = new String[100];
                almacenar2[1] = comparar1;
                valor = Integer.parseInt(comparar1);
                System.out.println();
                System.out.println("El Hijo Izquierdo es:");
               System.out.print("==>> ");
                arbolito.BuscarHijoIzq(valor);
                System.out.println();
            }        
           
    }
}
    