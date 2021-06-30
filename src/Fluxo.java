public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        
        /* ---------------------------------------------------------------------------------    
    		Exceções Java, trantando erro ArithmeticException 
      		A instrução try permite definir um bloco de código a ser testado 
     		quanto a erros enquanto está sendo executado.
        */
       try {
    	   metodo1();
    	   
    	 /* ---------------------------------------------------------------------------------   
         	A instrução catch permite definir um bloco de código a ser executado, 
 			se ocorrer um erro no bloco try.*/
	   } catch(ArithmeticException | NullPointerException  ex) {
		   
		   /*--------------------------------------------------------------------------------
		     Acessando msg de erro dentro do objeto ArithmeticException
		     com metodo .getMessage()*/	
		    String msg = ex.getMessage();
		    
	    	System.out.println("Exception " + msg);
	    	/*-------------------------------------------------------------------------------
	    	Acessando informação da pilha guradada dentro do objeto ArithmeticException
		     com metodo .printStackTrace(*/
	    	ex.printStackTrace();
	   }
        System.out.println("Fim do main");
    }
    
    /* ---------------------------------------------------------------------------------*/   
    private static void metodo1() {
    	System.out.println("Ini do metodo1");
    	metodo2();
        System.out.println("Fim do metodo1");
    }
    
    /* ---------------------------------------------------------------------------------*/   
    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        /*------------------------------------------------------------------------------------
          	trow = jogar na pilha, 
          	Instanciando um objeto apartir da classe ArithmeticException
         	passando mensagem de erro como parametro. 
         */
        throw new ArithmeticException("Erro ao executar ");
        //System.out.println("Fim do metodo2");
     }    
 }	