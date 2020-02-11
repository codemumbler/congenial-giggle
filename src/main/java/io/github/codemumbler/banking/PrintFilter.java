package io.github.codemumbler.banking;

public class PrintFilter {

  public static final PrintFilter DEFAULT_FILTER = PrintFilter.builder().includeDeposits().includeWithdrawls().build();
  private final boolean deposits;
  private final boolean withdrawls;

  private PrintFilter(boolean despoits, boolean withdrawls) {
    this.deposits = despoits;
    this.withdrawls = withdrawls;
  }

  public boolean writeDeposits() {
    return this.deposits;
  }

  public boolean writeWithdrawls() {
    return this.withdrawls;
  }

  public static class Builder {

    private boolean deposits = false;
    private boolean withdrawls = false;

    private Builder() {
    }

    public Builder includeDeposits() {
      this.deposits = true;
      return this;
    }

    public PrintFilter build() {
      return new PrintFilter(deposits, withdrawls);
    }

    public Builder includeWithdrawls() {
      this.withdrawls = true;
      return this;
    }
  }

  public static PrintFilter.Builder builder() {
    return new Builder();
  }
}
