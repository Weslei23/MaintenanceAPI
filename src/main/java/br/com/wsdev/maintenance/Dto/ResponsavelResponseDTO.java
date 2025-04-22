package br.com.wsdev.maintenance.Dto;

public class ResponsavelResponseDTO
{
    private Long id;
    private String nome;
    private String sobrenome;
    private String contato;

    public String getContato()
    {
        return contato;
    }

    public void setContato( String contato )
    {
        this.contato = contato;
    }

    public String getSobrenome()
    {
        return sobrenome;
    }

    public void setSobrenome( String sobrenome )
    {
        this.sobrenome = sobrenome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome( String nome )
    {
        this.nome = nome;
    }

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }
}
