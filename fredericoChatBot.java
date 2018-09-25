/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author familia
 */
/*
Ignorar Case
Ignorar _
Ignorar Acentuação
Considerar subStrings(Contains)
Considerar Distância entre strings
*/
import java.util.Scanner;

class RemoverAcentos {
    static String acentuado = "çÇáéíóúýÁÉÍÓÚÝàèìòùÀÈÌÒÙãõñäëïöüÿÄËÏÖÜÃÕÑâêîôûÂÊÎÔÛ";
    static String semAcento = "cCaeiouyAEIOUYaeiouAEIOUaonaeiouyAEIOUAONaeiouAEIOU";
    static char[] tabela;
    static {
        tabela = new char[256];
        for (int i = 0; i < tabela.length; ++i) {
            tabela [i] = (char) i;
        }
        for (int i = 0; i < acentuado.length(); ++i) {
            tabela [acentuado.charAt(i)] = semAcento.charAt(i);
        }
    }
    public static String remover (final String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt (i);
            if (ch < 256) {
                sb.append (tabela [ch]);
            } else {
                sb.append (ch);
            }
        }
        return sb.toString();
    }

}

class fredericoChatBot {
    public String lut[][];
    public fredericoChatBot()            
    {
      
    lut = new String[100][2];
        
        lut[0][0] = "Quem e voce";
        lut[0][1] = "Eu sou o bot Frederico e sei algumas coisas sobre informática. Me pergunte algo sobre.";
    
        lut[1][0] = "Oi";
        lut[1][1] = "Oi, como vai você?";
        
        lut[2][0] = "Bem";
        lut[2][1] = "Que ótimo. Eu sou o bot Frederico e sei algumas coisas sobre informática. Me pergunte algo sobre.";
        
        lut[3][0] = "Como formatar um computador";
        lut[3][1] = "A única forma que conheço é através de uma mídia. Você vai no setup do seu PC clicando (DEL) e escolhe o boot"
                + " pelo CD ou por um dispositivo USB. Após isso salve as configurações e insira em seu leitor de CD/DVD ou em sua entrada"
                + " USB a sua memória secundária que possui a ISO de instalação do Sistema Operacional."
                + " O que está achando de nossa conversa?";
        
        lut[4][0] = "legal";
        lut[4][1] = "Que bom, quer continuar?";
        
        lut[5][0] = "Sim";
        lut[5][1] = "Então me faça mais perguntas pois quero tirar suas dúvidas.";
        
        lut[6][0] = "O que significa CPU";
        lut[6][1] = "Unidade Central de Processamento";
        
        lut[7][0] = "Qual a diferença de memoria rom e ram";
        lut[7][1] = "Memória Rom é uma memória não volátil (Uma vez gravada as informações, não podem ser alteradas) e memória Ram,"
                + " é uma memória volátil (As informações gravadas em sua memória podem ser alteradas).";
        
        lut[8][0] = "O que e ISO";
        lut[8][1] = "O popular ISO é um formato de gravação para CDs e DVDs muito utilizado para softwares e sistemas operacionais, como o Windows.";
        
        lut[9][0] = "o que e setup do computador";
        lut[9][1] = "É onde contém as informações do seu computador. Tais informações podem ser: Temperatura, os dispositivos"
                + " de entrada e saída, informações sobre o sistema operacional, entre ourtas coisas.";
        
        lut[10][0] = "Pergunta B";
        lut[10][1] = "Pergunta B";
        
        lut[11][0] = "Pergunta B";
        lut[11][1] = "Pergunta B";
        
        lut[12][0] = "Pergunta B";
        lut[12][1] = "Pergunta B";
        
        lut[13][0] = "Pergunta B";
        lut[13][1] = "Pergunta B";
        
        lut[14][0] = "Pergunta B";
        lut[14][1] = "Pergunta B";
        
        lut[15][0] = "Pergunta B";
        lut[15][1] = "Pergunta B";
        
        lut[16][0] = "Pergunta B";
        lut[16][1] = "Pergunta B";
        
        lut[17][0] = "Pergunta B";
        lut[17][1] = "Pergunta B";
        
        lut[18][0] = "Pergunta B";
        lut[18][1] = "Pergunta B";
        
        lut[19][0] = "Pergunta B";
        lut[19][1] = "Pergunta B";
        
        lut[20][0] = "Pergunta B";
        lut[20][1] = "Pergunta B";
        
        lut[21][0] = "Pergunta B";
        lut[21][1] = "Pergunta B";
        
        lut[22][0] = "Pergunta B";
        lut[22][1] = "Pergunta B";
        
        lut[23][0] = "Pergunta B";
        lut[23][1] = "Pergunta B";
        
        lut[24][0] = "Pergunta B";
        lut[24][1] = "Pergunta B";
        
        lut[25][0] = "Pergunta B";
        lut[25][1] = "Pergunta B";
        
        lut[26][0] = "Pergunta B";
        lut[26][1] = "Pergunta B";
        
        lut[27][0] = "Pergunta B";
        lut[27][1] = "Pergunta B";
        
        lut[28][0] = "Pergunta B";
        lut[28][1] = "Pergunta B";
        
        lut[29][0] = "Pergunta B";
        lut[29][1] = "Pergunta B";
        
        lut[30][0] = "Pergunta B";
        lut[30][1] = "Pergunta B";
        
        lut[31][0] = "Pergunta B";
        lut[31][1] = "Pergunta B";
        
        lut[32][0] = "Pergunta B";
        lut[32][1] = "Pergunta B";
        
        lut[33][0] = "Pergunta B";
        lut[33][1] = "Pergunta B";
        
        lut[34][0] = "Pergunta B";
        lut[34][1] = "Pergunta B";
        
        lut[35][0] = "Pergunta B";
        lut[35][1] = "Pergunta B";
        
        lut[36][0] = "Pergunta B";
        lut[36][1] = "Pergunta B";
        
        lut[37][0] = "Pergunta B";
        lut[37][1] = "Pergunta B";
        
        lut[38][0] = "Pergunta B";
        lut[38][1] = "Pergunta B";
        
        lut[39][0] = "Pergunta B";
        lut[39][1] = "Pergunta B";
        
        lut[40][0] = "Pergunta B";
        lut[40][1] = "Pergunta B";
        
        lut[41][0] = "Pergunta B";
        lut[41][1] = "Pergunta B";
        
        lut[42][0] = "Pergunta B";
        lut[42][1] = "Pergunta B";
        
        lut[43][0] = "Pergunta B";
        lut[43][1] = "Pergunta B";
        
        lut[44][0] = "Pergunta B";
        lut[44][1] = "Pergunta B";
        
        lut[45][0] = "Pergunta B";
        lut[45][1] = "Pergunta B";
        
        lut[46][0] = "Pergunta B";
        lut[46][1] = "Pergunta B";
        
        lut[47][0] = "Pergunta B";
        lut[47][1] = "Pergunta B";
        
        lut[48][0] = "Pergunta B";
        lut[48][1] = "Pergunta B";
        
        lut[49][0] = "Pergunta B";
        lut[49][1] = "Pergunta B";
        

        
    }
    
   /* public float percentageCommomWords(String stringA, String stringB) {
        String[] stringASplit = stringA.split(" ");
        String[] stringBSplit = stringB.split(" ");

        int count = 0;

        for (int i = 0; i < stringASplit.length ; i++) {
            for (int j = 0; j < stringBSplit.length ; j++) {
                if(stringASplit[i].equalsIgnoreCase(stringBSplit[j])) {
                    count++;
                }
            }
        }

        int min = Math.min(stringASplit.length, stringBSplit.length);

        return (float)count/(float)min;
    }*/
    
    public String ask(String question)
    {
        String answer = "Desculpe, ainda estou aprendendo. Pode reorganizar sua pergunta?";               
        boolean found = false;
        boolean end = false;
        int i = 0;
        while (!found && !end)
        {
 //Vamos comparar duas strings ignorando os acentos.
 //Quanto mais complicar o if, ganha mais ponto
            
            RemoverAcentos.remover(question);
        
            //System.out.println(""+question);
            if(question.equalsIgnoreCase(lut[i][0]))
            {
                found = true;
                answer = lut[i][1];
            }
        ++i;
        if(i >= lut.length)
            //fim, recebe true e o while acaba.
        {
            end = true;
        }
    }
        return answer;//retorna a resposta(Desculpe, ainda estou aprendendo....) caso as condições não sejam aceitas
    }
}

class Main {
     
    public static void main(String[] args) {
    
        fredericoChatBot bot = new fredericoChatBot();
        
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Dale, i'm a Chatbox! What you wanna know?");
        String question = scanner.nextLine();

        while(!question.equals("sair"))
        {   
            System.out.println(bot.ask(question));
            question = scanner.nextLine();
         
        }
            
    }
    
}





