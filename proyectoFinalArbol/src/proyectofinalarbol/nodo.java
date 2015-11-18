
package proyectofinalarbol;
/**
 *
 * @author Victor
 */
public class nodo {
    
     int dato;
            public nodo hijoIzq;
            public nodo hijoDer;
            public nodo raiz;
            
     public nodo(int dato){
            this.dato = dato;
            this.hijoIzq=null;
            this.hijoDer=null;
            this.raiz = null;
    }
     
     public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
     public nodo getHijoIzq() {
        return hijoIzq;
    }

     public void setHijoIzq(nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

     public nodo getHijoDer() {
        return hijoDer;
    }

     public void setHijoDer(nodo hijoDer) {
        this.hijoDer = hijoDer;
}
      public nodo getraiz() {
        return raiz;
    }

    public void setraiz(nodo raiz) {
        this.raiz = raiz;
    }
}

