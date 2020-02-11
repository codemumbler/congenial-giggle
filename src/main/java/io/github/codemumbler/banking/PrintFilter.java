package io.github.codemumbler.banking;

import java.time.Instant;

public class PrintFilter {

  public static final PrintFilter DEFAULT_FILTER = PrintFilter.builder().includeDeposits().includeWithdrawls().build();
  private boolean deposits;
  private boolean withdrawls;
  private Instant beforeDate;
  private Instant afterDate;

  private PrintFilter() {
  }

  public boolean writeDeposits() {
    return this.deposits;
  }

  public boolean writeWithdrawls() {
    return this.withdrawls;
  }

  public Instant writeBeforeDate() {
    return this.beforeDate;
  }

  public Instant writeAfterDate() {
    return this.afterDate;
  }

  public static class Builder {

    private PrintFilter filter;

    private Builder() {
      filter = new PrintFilter();
    }

    public Builder includeDeposits() {
      filter.deposits = true;
      return this;
    }

    public PrintFilter build() {
      return filter;
    }

    public Builder includeWithdrawls() {
      filter.withdrawls = true;
      return this;
    }

    public Builder before(Instant beforeDate) {
      filter.beforeDate = beforeDate;
      return this;
    }

    public Builder after(Instant afterDate) {
      filter.afterDate = afterDate;
      return this;
    }
  }

  public static PrintFilter.Builder builder() {
    return new Builder();
  }
}
