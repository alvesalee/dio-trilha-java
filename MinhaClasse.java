public class MinhaClasse {
    
    public static void main (String [] args) {
        
        System.out.println("Salve salve java carai! ");

        //Outras partes das aulas de classes JAVA :D 

        String primeiroNome = "Alexandre";
        String segundoNome = "Alves";
 
        String  nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método é :" + primeiroNome.concat(" ").concat(segundoNome);
    }

}
