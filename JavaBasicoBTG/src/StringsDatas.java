import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class StringsDatas {
    public static void main(String[] args) throws Exception {

        String nome = "Leila";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String nomeOutro = "leila";
        System.out.println(nome.equals(nomeOutro)); // verifica se a variável é igual a outra
        System.out.println(nome.equalsIgnoreCase(nomeOutro)); // ignora a sensibilidade de maiusculo e minusculo

        /*
         * ISO 8601
         * Define como representar uma data padrão para o mundo
         * o Java implementa esse padrão através do LocalDate
         */

        String usuario = "Leila";
        LocalDate hoje = LocalDate.now(); // recupera a data e hora local - momento da transição
        Locale brasil = new Locale("pt", "BR"); // define localização, idioma e país
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil)); // retorna o dia da semana
        String diaSemana = (hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();// obtem a informação de que horas são no momento atual

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        } else {
            saudacao = "Olá";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", usuario, diaSemana, saudacao.toUpperCase()); // Define o formato
                                                                                                    // exibidos
        // %s representa as Strings e %n representa quebra de linha
    }

}
