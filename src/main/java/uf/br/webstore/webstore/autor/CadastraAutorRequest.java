package uf.br.webstore.webstore.autor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CadastraAutorRequest {
    @NotBlank(message = "Nome em formato inválido") //Permite que nao seja vazias
    private String nome;
    
    @NotBlank
    @Email //Permite só string no layout de e-mail
    private String email;
    
    @NotBlank
    @Size(max = 400) // o tamanho máximo de caracteres
    private String descricao;

    public CadastraAutorRequest(@NotBlank String nome, @NotBlank @Email String email,
            @NotBlank @Size(max = 400) String descricao) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDescricao() {
        return descricao;
    }

    public Autor toModel(){
        return new Autor(this.nome, this.email, this.descricao);
    }
}
