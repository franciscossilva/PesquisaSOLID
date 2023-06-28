public interface EnviadorEmail {
    void enviarEmail(String remetente, String destinatario, String assunto, String corpo);
}