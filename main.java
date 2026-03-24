public class main {
    public static String classificarMedia(double media) {
        if (media < 0 || media > 10) {
            return "Média inválida";
        } else if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }


        public static void main(String[] args) {
            double mediaAluno = 6.5;

            String resultado = classificarMedia(mediaAluno);

            System.out.println("Média final: " + mediaAluno);
            System.out.println("Classificação: " + resultado);
        }
    }