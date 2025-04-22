package br.com.wsdev.maintenance.Models;

import jakarta.persistence.*;


@Entity
@Table( name = "responsavel" )
public class Responsavel
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

    public Responsavel( String contato, String sobrenome, String nome )
    {
        this.contato = contato;
        this.sobrenome = sobrenome;
        this.nome = nome;
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

    public String getContato()
    {
        return contato;
    }

    public void setContato( String contato )
    {
        this.contato = contato;
    }
}
