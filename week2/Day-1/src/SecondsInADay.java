public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    int totalSeconds = 24 * 60 * 60;

    System.out.println("Remaining seconds of the day:" + (totalSeconds - (currentHours * 60 * 60 + currentMinutes * 60 + currentSeconds)));

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented bt the variables
  }
}
