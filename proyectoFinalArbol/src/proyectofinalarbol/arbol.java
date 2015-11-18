
package proyectofinalarbol;
/**
 *
 * @author Victor
 */
public class arbol {
    public nodo Raiz;
    
    public arbol(){
        this.Raiz = null;
    }
    
     //METODO PARA INSERTAR NODOS
    
    public nodo getRaiz() {
        return Raiz;
    }

    public void setRaiz(nodo Raiz) {
        this.Raiz = Raiz;
    }

    public String insertar(int valor){
            nodo n = new nodo(valor);
            
        if (getRaiz() == null){
                setRaiz(n);
            }
            else{
             nodo temporal = getRaiz();
                
                while (temporal !=null){
                    n.setraiz(temporal);
                    if (n.getDato()>temporal.getDato()){
                        temporal = temporal.getHijoDer();
                    }
                    else{
                        temporal = temporal.getHijoIzq();
                    }
                }
                
         if (n.getDato()<n.getraiz().getDato()){
                    n.raiz.setHijoIzq(n); 
                }
                    else{
                    n.raiz.setHijoDer(n);
                }
            }  
            return "";
}
    
    //METODO PARA ELIMINAR UN NODO
    
    public void eliminar(int num){
        eliminar(this.Raiz,num);
    }
    
    public boolean eliminar(nodo nodo,int num){
        
        if (num==nodo.getDato()){
            
          boolean nodoIzquierda = nodo.getHijoIzq() !=null;
          boolean nodoDerecha = nodo.getHijoDer() !=null;
          
            if (!nodoDerecha && !nodoIzquierda) {
            return Caso1( nodo );
            }
 
            if ( nodoDerecha && !nodoIzquierda ) {
            return Caso2( nodo );
            }
 
            if ( !nodoDerecha && nodoIzquierda ) {
            return Caso2( nodo );
            }
 
            if ( nodoDerecha && nodoIzquierda ) {
            return Caso3( nodo,num );
            }
        }
          else 
            if (num>nodo.getDato()){
              eliminar(nodo.getHijoDer(),num);
            }
            
          else 
            if (num<nodo.getDato()){
              eliminar(nodo.getHijoIzq(),num);
             }
        return false;                 
    }
     
    public boolean Caso1( nodo nodo ) {
        
        nodo hijoDerecho = nodo.getraiz().getHijoDer();
        nodo hijoIzquierdo = nodo.getraiz().getHijoIzq();
        
        if ( hijoIzquierdo == nodo ) {
            nodo.getraiz().setHijoIzq( null );
            return true;
        }
 
        if ( hijoDerecho == nodo) {
            nodo.getraiz().setHijoDer( null );
            return true;
        }
 
        return false;
    }
     
    public boolean Caso2( nodo nodo ) {
        
        nodo hijoDerecho = nodo.getraiz().getHijoDer();
        nodo hijoIzquierdo = nodo.getraiz().getHijoIzq();
       
        nodo Hijo = nodo.getHijoIzq() != null ? 
        nodo.getHijoIzq() : nodo.getHijoDer();
 
        if ( hijoIzquierdo == nodo ) {
            nodo.getraiz().setHijoIzq(Hijo);
 
            Hijo.setraiz(nodo.getraiz());
            nodo.setHijoDer(null);
            nodo.setHijoIzq(null);
 
            return true;
        }
 
        if ( hijoDerecho == nodo) {
            nodo.getraiz().setHijoDer(Hijo );
            Hijo.setraiz(nodo.getraiz());
            nodo.setHijoDer(null);
            nodo.setHijoIzq(null);
 
            return true;
        } 
 
        return false;
    }
    
    public boolean Caso3( nodo nodo,int nro ) {
        
        nodo aLaIzquierda = RecorrerIzq( nodo.getHijoDer() );
        
        if ( aLaIzquierda != null ) {
            nodo.setDato(aLaIzquierda.getDato() );
            eliminar(aLaIzquierda,nro);
            return true;
        }
        return false;
    }
        nodo RecorrerIzq(nodo nodo) {
        if (nodo.getHijoIzq() != null) {
            return RecorrerIzq( nodo.getHijoIzq() );
        }
        return nodo;
    }

    public void BuscarDere(int num){
              BuscarDere(this.Raiz,num);              
        }
      
         public void BuscarDere(nodo n,int num){
              
             if (n.getHijoDer()==null){
                    System.out.println("na");
                }
             else
            
                 if (n.getDato()==num){
               System.out.println(n.getHijoDer().getDato());
            }
             else 
                 
                 if (num>n.getDato()){
                        n = n.getHijoDer();
                        BuscarDere(n,num);    
            }
             else 
                     
                 if (num<n.getDato()){
                    n = n.getHijoIzq();
                        BuscarDere(n,num);
             }
         }
        
    public void BuscarIzq(int num){
        BuscarIzq(this.Raiz,num);        
        }
      
     public void BuscarIzq(nodo n,int num){
          
              if (n.getHijoIzq()==null){
                    System.out.println("na");
                }
              else   
           
                if (n.getDato()==num){
               System.out.println(n.getHijoIzq().getDato());
                }
              else
                    
                if (num>n.getDato()){
                        n = n.getHijoDer();
                        BuscarIzq(n,num);
                    }
                else 
                  if (num<n.getDato()){
                    n = n.getHijoIzq();
                        BuscarIzq(n,num);
                }
           
          }   
           
     
     //METODO PARA IMPRIMIR EN PREORDEN, INORDEN Y POSTORDEN
     
     public void imprimePre(){
        imprimePre(this.Raiz);
    }
    
        public void imprimePre(nodo n){
         
        if (n!=null){
            System.out.print(+n.getDato()+" ");
            imprimePre(n.getHijoIzq());
            imprimePre(n.getHijoDer());
        }
    }
     
    public void imprimeIno(){
         imprimeIno(this.Raiz);
    }
    
        public void imprimeIno(nodo n){
     
        if (n!=null){
            imprimeIno(n.getHijoIzq());
            System.out.print(n.getDato()+" ");
            imprimeIno(n.getHijoDer());
        }
    }
    
    public void imprimePos(){
        imprimePos(this.Raiz);
    }
    
        public void imprimePos(nodo n){
        if (n!=null){
            imprimePos(n.getHijoIzq());
            imprimePos(n.getHijoDer());
            System.out.print(n.getDato()+" "); 
        }
    }
  }
         

