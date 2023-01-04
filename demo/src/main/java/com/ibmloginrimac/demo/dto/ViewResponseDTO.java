package com.ibmloginrimac.demo.dto;

import java.util.List;

import com.ibmloginrimac.demo.model.View1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor @AllArgsConstructor
public class ViewResponseDTO {
    private List<View1> listadoRespuesta;
}
