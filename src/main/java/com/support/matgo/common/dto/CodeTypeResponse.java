package com.support.matgo.common.dto;

import lombok.Data;

@Data
public class CodeTypeResponse {
  private String commCdType;
  private String commLabel;
  private String commValue;
  private String additionalData;
}