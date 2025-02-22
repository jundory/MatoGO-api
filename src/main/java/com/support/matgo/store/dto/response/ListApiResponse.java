package com.support.matgo.store.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class ListApiResponse {
  private int status;
  private String message;
  private List<StoreInfoResponse> result;
}
