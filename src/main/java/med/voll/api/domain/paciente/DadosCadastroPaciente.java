package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(
    @NotBlank(message = "Nome é obrigatório")
    String nome,

    @NotBlank
    @Email
    String email,

    @NotBlank
    @Pattern (regexp="\\d{11}")
    String cpf,

    @NotBlank(message = "Telefone é obrigatório")
    String telefone,
    
    @NotNull(message = "Dados do endereço são obrigatórios") @Valid 
    DadosEndereco endereco) {

    

}
