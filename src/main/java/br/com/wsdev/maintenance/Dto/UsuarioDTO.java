package br.com.wsdev.maintenance.Dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UsuarioDTO
{
    @NotNull( message = "O nome é obrigatório" )
    @Size( min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres" )
    private String nome;
    @NotNull( message = "O sobrenome é obrigatório" )
    @Size( min = 3, max = 100, message = "O sobrenome deve ter entre 3 e 100 caracteres" )
    private String sobrenome;

    @NotNull( message = "O contato é obrigatório" )
    @Size( max = 11, message = "O sobrenome deve conter 11 caracteres" )
    private String contato;

    @Column@NotNull( message = "O contato é obrigatório" )
    @Size( min = 3, max = 255, message = "O sobrenome deve conter 3 a 255 caracteres" )
    private String endereco;

    public String getEndereco()
    {
        return endereco;
    }

    public void setEndereco( String endereco )
    {
        this.endereco = endereco;
    }

    public String getContato()
    {
        return contato;
    }

    public void setContato( String contato )
    {
        this.contato = contato;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome( String nome )
    {
        this.nome = nome;
    }

    public String getSobrenome()
    {
        return sobrenome;
    }

    public void setSobrenome( String sobrenome )
    {
        this.sobrenome = sobrenome;
    }
}
