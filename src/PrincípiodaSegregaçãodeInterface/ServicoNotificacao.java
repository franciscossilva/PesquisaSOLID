public class ServicoNotificacao implements EnviadorEmail, EnviadorSMS {
    public void enviarEmail(String remetente, String destinatario, String assunto, String corpo) {
        // Lógica para enviar e-mail
    }

    public void enviarSMS(String numero, String mensagem) {
        // Lógica para enviar SMS
    }
}