package main.day1;

public class EnvironmentDiagnostic {

    /*
     * ============================================
     * JAVA 90-DAY CODING CHALLENGE
     * DAY 01: ENVIRONMENT SETUP
     * ============================================
     *
     * Project: Environment Diagnostic
     * Author: Mercy
     *
     * Description:
     * This program checks the Java development
     * environment by displaying system information.
     *
     * Concepts Covered:
     * 1. Java main method
     * 2. System.out.println()
     * 3. System.getProperty()
     * 4. Basic Java syntax
     *
     * Goal:
     * To understand how Java interacts with
     * the computer's operating system.
     *
     * ============================================
     */
    public static void main(String[] args) {

            // Display the Java version installed on the computer
            System.out.println("Java Version: " +
                    System.getProperty("java.version"));

            // Display the Java vendor
            System.out.println("Java Vendor: " +
                    System.getProperty("java.vendor"));

            // Display the operating system name
            System.out.println("Operating System: " +
                    System.getProperty("os.name"));

            // Display the operating system architecture
            System.out.println("Architecture: " +
                    System.getProperty("os.arch"));

            // Display the current computer username
            System.out.println("User Name: " +
                    System.getProperty("user.name"));

        }
    }

