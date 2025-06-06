package com.sarc.sarc.core.services.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// import javax.validation.constraints.NotBlank;
// import javax.validation.constraints.Size;

// /**
//  * DTO para criação e atualização de prédios
//  */
// @Data
// @AllArgsConstructor
// public interface BuildingDTO {
    
//     private Long id;
    
//     @NotBlank(message = "O nome do prédio é obrigatório")
//     @Size(max = 100, message = "O nome do prédio deve ter no máximo 100 caracteres")
//     private String name;
    
//     @NotBlank(message = "O endereço do prédio é obrigatório")
//     @Size(max = 255, message = "O endereço deve ter no máximo 255 caracteres")
//     private String address;
    
//     @NotBlank(message = "O número do prédio é obrigatório")
//     @Size(max = 20, message = "O número do prédio deve ter no máximo 20 caracteres")
//     private String buildingNumber;
    
//     @Size(max = 100, message = "O complemento deve ter no máximo 100 caracteres")
//     private String complement;
    
//     @Size(max = 100, message = "O bairro deve ter no máximo 100 caracteres")
//     private String district;
    
//     @Size(max = 100, message = "A cidade deve ter no máximo 100 caracteres")
//     private String city;
    
//     @Size(max = 2, message = "O estado deve ter no máximo 2 caracteres")
//     private String state;
    
//     @Size(max = 10, message = "O CEP deve ter no máximo 10 caracteres")
//     private String zipCode;
// }

// /**
//  * DTO com informações resumidas de um prédio
//  */
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
// public class BuildingSummaryDTO {
//     private Long id;
//     private String name;
//     private String address;
//     private String buildingNumber;
//     private int roomCount;
// }