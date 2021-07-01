public class Fluxo {

    public static void main(String[] args)  {
        System.out.println("Ini do main");
        
    	/* ---------------------------------------------------------------------------------    
    		Exceções Java, trantando erro ArithmeticException
      		A instrução try permite definir um bloco de código a ser testado 
     		quanto a erros enquanto está sendo executado.
    	 */
       try {
    	   metodo1();
    	   
    	  /*----------------------------------------------------------------------------------   
         	 A instrução catch permite definir um bloco de código a ser executado, 
 			 se ocorrer um erro no bloco try.
 			 
 			 Exception passado como parametro para catch, Captura qualquer exceção 
 		   */
	   } catch(Exception ex) {
		   
		   /*--------------------------------------------------------------------------------
		     Acessando msg de erro dentro do objeto ArithmeticException
		     com metodo .getMessage()*/	
		    String msg = ex.getMessage();
		    
	    	System.out.println("Exception " + msg);
	    	
	    	/*-------------------------------------------------------------------------------
	    	  Acessando informação da pilha guradada dentro do objeto ArithmeticException
		      com metodo .printStackTrace()
		     */
	    	ex.printStackTrace();
	   }
        System.out.println("Fim do main");
    }
    
    /* ---------------------------------------------------------------------------------*/   
    private static void metodo1() throws MinhaExcecao{
    	System.out.println("Ini do metodo1");
    	metodo2();
        System.out.println("Fim do metodo1");
    }
    
    /* -------------------------------------------------------------------------------
     	Exceções Checked são aquelas no qual você é obrigado a tratá-la, 
     	seja com um bloco try-catch ou mesmo com um throws
     * --------------------------------------------------------------------------------*/   
    private static void metodo2() throws MinhaExcecao{
        System.out.println("Ini do metodo2");
        
        /*------------------------------------------------------------------------------------
          	trow = jogar na pilha, 
          	Instanciando um objeto apartir da classe MinhaExcecao
         */
        throw new NullPointerException("FATALErro");
        //System.out.println("Fim do metodo2");
     }    
 }	