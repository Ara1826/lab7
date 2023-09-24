package client;

import client.consoleClient.ConsoleClient;

/**
 * The Main class is responsible for running the application by creating a ConsoleClient object
 * and calling its run method.
 */
public class Main {
    /**
     * The run method creates a ConsoleClient object and calls its run method.
     * @param args an array of command-line arguments
     */
    public static void main(String[] args) {
        ConsoleClient consoleClient = new ConsoleClient();
        consoleClient.run();
    }
}
