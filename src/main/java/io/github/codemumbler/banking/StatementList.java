package io.github.codemumbler.banking;

import java.util.ArrayList;
import java.util.List;

public class StatementList {

  public static final String DATE_AMOUNT_BALANCE = "Date\tAmount\tBalance";
  private final List<Statement> statements = new ArrayList<>();

  public void addTransaction(Statement statement) {
    statements.add(statement);
  }

  @Override
  public String toString() {
    StringBuilder statementDocument = new StringBuilder(DATE_AMOUNT_BALANCE);
    statementDocument.append(System.lineSeparator());
    for (Statement statement : statements) {
      statementDocument.append(statement.toString()).append(System.lineSeparator());
    }
    return statementDocument.toString();
  }
}
