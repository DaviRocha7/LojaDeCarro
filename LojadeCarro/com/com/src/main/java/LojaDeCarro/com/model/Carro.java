package LojaDeCarro.com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Modelo precisa ser preenchido")
    private String modelo;

    @NotBlank(message = "Nome precisa ser preenchido")
    private String nome;

    @NotBlank(message = "Mostrar se o carro está disponivel")
    private String dispovinel;

    @NotNull(message = "Preço é obrigatorio")
    @Positive(message = "Preço deve ser positivo")
    private Double preco;

    @NotNull(message = "Lucro é obrigatorio")
    @Positive(message = "Lucro deve ser positivo")
    private Double lucro;

    @NotNull(message = "Ano é obrigatorio")
    private Double ano;

    public Carro(){}
}