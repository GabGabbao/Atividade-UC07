public class Main{
    
    public static double calcular_media(double[] notas){
        
        
        double mediaAluno = 0;
        double soma = 0;

        for (int i = 0; i < notas.length; i++){

            soma += notas[i];

        }//fim for que soma as notas recebidas

        mediaAluno = soma/notas.length;
        //calculo da media
    
        return mediaAluno;


}//fim função de calculo



public static void main(String[] args) {
    
    double[] n = {7,8,9,4,1,5,8}; 

    double mediaAluno = calcular_media(n);

    System.out.println("A media é: " + mediaAluno); //teste, logo sera removido


}//fim main






}//fim class