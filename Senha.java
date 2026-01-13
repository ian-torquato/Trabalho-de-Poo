package servico;

public class SenhaAdm {

    private static final String SENHA_ADMIN = "admin30";

    public boolean autenticarAdministrador(String senhaDigitada) {
        return SENHA_ADMIN.equals(senhaDigitada);
    }
}
