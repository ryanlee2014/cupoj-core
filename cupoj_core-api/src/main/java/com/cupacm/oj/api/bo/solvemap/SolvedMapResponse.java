package com.cupacm.oj.api.bo.solvemap;

import com.cupacm.oj.api.bo.base.AbstractBaseResponse;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SolvedMapResponse extends AbstractBaseResponse {
    private List<SolvedEdges> solvedEdgesList;
}
