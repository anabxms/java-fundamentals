package school.cesar;
import java.util.*;

public class Cliente {

    private double renda;
    private String nome;
    private String cpf;

    public void setRenda(double renda) {
        this.renda = renda;

        if (renda < 0)
            throw new RuntimeException("Renda não pode ser negativa!");

    }

    public double getRenda() {
        return this.renda;
    }

    public void setNome(String nome) {
        this.nome = nome;
        char[] arrayNome = nome.toCharArray();


        int hasNumber = 0;
        for (char n : arrayNome){
            if(Character.isDigit(n)){
                hasNumber += 1;
            }
        }

        if (nome == null)
            throw new RuntimeException("Nome não pode ser vazio");
        else if (hasNumber > 0)
            throw new RuntimeException("O nome não deve ter números");


    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;

        if (cpf == null)
            throw new RuntimeException("CPF não pode ser vazio");
        else if (cpf.length() < 11)
            throw new RuntimeException("CPF deve ter 11 dígitos");

    }

    public String getCpf() {
        return this.cpf;
    }

/*    public void ClienteException() {

    }
*/

}
