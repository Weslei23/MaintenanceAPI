package br.com.wsdev.maintenance.Dto;

import jakarta.validation.constraints.NotNull;

public class OrdemManutencaoDTO
{
    @NotNull( message = "A descrição é obrigatória" )
    private String descricao;

    @NotNull( message = "A prioridade é obrigatória" )
    private String prioridade;

    @NotNull( message = "O status é obrigatório" )
    private String status;

    @NotNull( message = "O tipo é obrigatório" )
    private String tipo;

    @NotNull( message = "O ID do responsável é obrigatório" )
    private Long tecnicoid;

    @NotNull( message = "O ID do usuário é obrigatório" )
    private Long usuarioId;

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao( String descricao )
    {
        this.descricao = descricao;
    }

    public Long getUsuarioId()
    {
        return usuarioId;
    }

    public void setUsuarioId( Long usuarioId )
    {
        this.usuarioId = usuarioId;
    }

    public Long getTecnicoid()
    {
        return tecnicoid;
    }

    public void setTecnicoid( Long tecnicoid )
    {
        this.tecnicoid = tecnicoid;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo( String tipo )
    {
        this.tipo = tipo;
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
}
