package com.cupacm.oj.api.bo.solvemap;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SolvedEdges implements Serializable {
    private Long from;
    private Long to;
    private Long value;
}
