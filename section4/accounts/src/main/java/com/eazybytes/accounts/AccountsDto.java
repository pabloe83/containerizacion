package com.eazybytes.accounts;

import com.eazybytes.accounts.model.Accounts;
import lombok.Data;
import java.time.LocalDate;

@Data
public class AccountsDto {
  private int customerId;
  private long accountNumber;
  private String accountType;
  private String branchAddress;
  private LocalDate createDt;

  public void convertToDto(Accounts accounts) {
    this.setCustomerId(accounts.getCustomerId());
    this.setAccountNumber(accounts.getAccountNumber());
    this.setBranchAddress(accounts.getBranchAddress());
    this.setAccountType(accounts.getAccountType());
    this.setCreateDt(accounts.getCreateDt());
  }
}


