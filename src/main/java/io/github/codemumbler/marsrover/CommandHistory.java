package io.github.codemumbler.marsrover;

class CommandHistory {

  final StringBuilder history;

  CommandHistory() {
    this.history = new StringBuilder();
  }

  void addCompletedCommand(char command) {
    this.history.append(command);
  }
}
