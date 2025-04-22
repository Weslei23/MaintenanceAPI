package br.com.wsdev.maintenance.Dto;

public class OrdemManutencaoResponseDTO
{
    private Long id;
    private String tecnico;
    private String usuario;
    private String descricao;
    private String status;
    private String prioridade;
    private String tipo;

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus( String status )
    {
        this.status = status;
    }

    public String getTecnico()
    {
        return tecnico;
    }

    public void setTecnico( String tecnico )
    {
        this.tecnico = tecnico;
    }

    public String getUsuario()
    {
        return usuario;
    }

    public void setUsuario( String usuario )
    {
        this.usuario = usuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao( String descricao )
    {
        this.descricao = descricao;
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
}
