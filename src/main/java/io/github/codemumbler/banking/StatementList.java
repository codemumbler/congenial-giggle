package io.github.codemumbler.banking;

import java.util.ArrayList;
import java.util.List;

public class StatementList {

  public static final String DATE_AMOUNT_BALANCE = "Date\tAmount\tBalance";
  private final List<Statement> statements = new ArrayList<>();

  public void addTransaction(Statement statement) {
    statements.add(statement);
  }

  public String printWith(PrintFilter filter) {
    StringBuilder statementDocument = new StringBuilder(DATE_AMOUNT_BALANCE);
    statementDocument.append(System.lineSeparator());
    for (Statement statement : statements) {
      statementDocument.append(matchFilter(statement, filter));
    }
    return statementDocument.toString();
  }

  private String matchFilter(Statement statement, PrintFilter filter) {
    String statementLine = "";
    if (isDepositToWrite(statement, filter) || isWithdrawlToWrite(statement, filter) || isBeforeFilter(statement, filter) || isAfterFilter(statement, filter)) {
      statementLine = statement.toString();
    }
    return statementLine;
  }

  private boolean isAfterFilter(Statement statement, PrintFilter filter) {
    return filter.writeAfterDate() != null && statement.after(filter.writeAfterDate());
  }

  private boolean isBeforeFilter(Statement statement, PrintFilter filter) {
    return filter.writeBeforeDate() != null && statement.before(filter.writeBeforeDate());
  }

  private boolean isWithdrawlToWrite(Statement statement, PrintFilter filter) {
    return filter.writeWithdrawls() && statement.isWithdrawl();
  }

  private boolean isDepositToWrite(Statement statement, PrintFilter filter) {
    return filter.writeDeposits() && statement.isDeposit();
  }
}
