package br.com.wsdev.maintenance.Models;

import jakarta.persistence.*;

@Entity
@Table( name = "usuario" )
public class Usuario
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column( nullable = false )
    private String nome;

    @Column( nullable = false )
    private String sobrenome;

    @Column( nullable = false )
    private String contato;

    @Column( nullable = false )
    private String endereco;

    public Usuario( String endereco, String contato, String sobrenome, String nome )
    {
        this.endereco = endereco;
        this.contato = contato;
        this.sobrenome = sobrenome;
        this.nome = nome;
    }

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
}
