package br.com.wsdev.maintenance.Dto;

import jakarta.validation.constraints.NotNull;

public class ResponsavelDTO
{
    @NotNull( message = "É preciso adicionar o nome de um responsável!" )
    private String nome;

    @NotNull( message = "É preciso adicionar o sobrenome de um responsável!" )
    private String sobrenome;

    @NotNull( message = "É preciso adicionar o contato de um responsável!" )
    private String contato;

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

    public void setSobrenome ( String sobrenome )
    {
        this.sobrenome = sobrenome;
    }

    public String getContato()
    {
        return contato;
    }

    public void setContato( String contato )
    {
        this.contato = contato;
    }
}
