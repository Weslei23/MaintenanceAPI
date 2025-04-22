package br.com.wsdev.maintenance.Controllers;

import br.com.wsdev.maintenance.Dto.UsuarioDTO;
import br.com.wsdev.maintenance.Dto.UsuarioResponseDTO;
import br.com.wsdev.maintenance.Models.Usuario;
import br.com.wsdev.maintenance.Services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/usuarios" )
public class UsuarioController
{
    private final UsuarioService service;

    public UsuarioController( UsuarioService service )
    {
        this.service = service;
    }

    @PostMapping
    public UsuarioResponseDTO criarUsuario( @Valid @RequestBody UsuarioDTO usuarioDTO )
    {
        Usuario usuario = service.converterParaEntidade( usuarioDTO );
        return service.converterParaResponseDTO( service.criarUsuario( usuario ) );
    }

    @GetMapping
    public List<UsuarioResponseDTO> listarUsuarios()
    {
        return service.listarUsuarios();
    }

    @GetMapping( "/{id}" )
    public UsuarioResponseDTO buscarPorId( @PathVariable Long id )
    {
        Usuario usuario = service.buscarPorId( id );
        return service.converterParaResponseDTO( usuario );
    }

    @PutMapping( "/{id}" )
    public UsuarioResponseDTO atualizarUsuario( @PathVariable Long id, @Valid @RequestBody UsuarioDTO usuarioDTO )
    {
        Usuario usuarioAtualizado = service.converterParaEntidade( usuarioDTO );
        return service.converterParaResponseDTO( service.atualizarUsuario( id, usuarioAtualizado ) );
    }

    @DeleteMapping( "/{id}" )
    public void excluirUsuario( @PathVariable Long id )
    {
        service.excluirUsuario( id );
    }
}
