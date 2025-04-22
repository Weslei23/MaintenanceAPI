package br.com.wsdev.maintenance.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table( name = "ordens_manutencao" )
public class OrdemManutencao
{

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @ManyToOne
    @JoinColumn( name = "equipamento_id", nullable = false )
    private Responsavel tecnico; // Relacionamento com Equipamento

    @ManyToOne
    @JoinColumn( name = "usuario_id", nullable = false )
    private Usuario usuario; // Relacionamento com Usuario

    @Column( nullable = false )
    private String descricao; // Descrição da ordem de manutenção

    @Column( nullable = false )
    private String status; // Status da ordem (Aberta, Concluída)

    @Column( nullable = false )
    private String prioridade; // Prioridade (Alta, Média, Baixa)

    @Column( nullable = false )
    private String tipo; // tipo de esquadria (pvc madeira ou aluminio)

    @Temporal( TemporalType.TIMESTAMP )
    @Column( nullable = false, updatable = false )
    private Date dataCriacao = new Date(); // Data de criação (padrão)

    @Temporal( TemporalType.TIMESTAMP )
    private Date dataConclusao;

    public OrdemManutencao( Responsavel tecnico, Usuario usuario, String descricao, String status, String prioridade, Date dataCriacao, String tipo, Date dataConclusao )
    {
        this.tecnico = tecnico;
        this.usuario = usuario;
        this.descricao = descricao;
        this.status = status;
        this.prioridade = prioridade;
        this.dataCriacao = dataCriacao;
        this.tipo = tipo;
        this.dataConclusao = dataConclusao;
    }

    public Responsavel getTecnico()
    {
        return tecnico;
    }

    public void setTecnico( Responsavel tecnico )
    {
        this.tecnico = tecnico;
    }

    public Usuario getUsuario()
    {
        return usuario;
    }

    public void setUsuario( Usuario usuario )
    {
        this.usuario = usuario;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao( String descricao )
    {
        this.descricao = descricao;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus( String status )
    {
        this.status = status;
    }

    public String getPrioridade()
    {
        return prioridade;
    }

    public void setPrioridade( String prioridade )
    {
        this.prioridade = prioridade;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo( String tipo )
    {
        this.tipo = tipo;
    }

    public Date getDataCriacao()
    {
        return dataCriacao;
    }

    public void setDataCriacao( Date dataCriacao )
    {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataConclusao()
    {
        return dataConclusao;
    }

    public void setDataConclusao( Date dataConclusao )
    {
        this.dataConclusao = dataConclusao;
    }
}
