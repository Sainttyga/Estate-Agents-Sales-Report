package com.mycompany.LindokuhleAtWork;

/**
 * 
 * @author Lindokuhle Zwane
 */
public class PropertySales {

    public static void estateAgent() {
        // 2D array storing three property sales for two estate agents (in double)
        double[][] arrSales = {
            {800000.0, 1500000.0, 2000000.0},
            {700000.0, 1200000.0, 1600000.0}
        };

        // Array storing the names of the estate agents
        String[] arrAgentNames = {"Joe Bloggs", "Jane Doe"};

        System.out.println("ESTATE AGENTS SALES REPORT");
        System.out.println(String.format("%-20s%-15s%-15s%-15s", "", "JAN", "FEB", "MAR"));
        System.out.println("------------------------------------------------------------");

        // Displaying the sales report for each agent
        for (int k = 0; k < arrAgentNames.length; k++) {
            String agentName = arrAgentNames[k];
            double januarySales = arrSales[k][0];
            double februarySales = arrSales[k][1];
            double marchSales = arrSales[k][2];

            System.out.println(String.format("%-10s %,15.2f %,15.2f %,15.2f", agentName, januarySales, februarySales, marchSales));

        }

        EstateAgent estateAgent = new EstateAgent();
        System.out.println();
        // Calculating and displaying total sales and commission for each agent
        for (int k = 0; k < arrSales.length; k++) {
            double totalSales = estateAgent.estateAgentSales(arrSales[k]);
            System.out.println("Total property sales for " + arrAgentNames[k] + ": R " + String.format("%.2f", totalSales));

        }
        System.out.println();
        for (int k = 0; k < arrSales.length; k++) {
            double totalSales = estateAgent.estateAgentSales(arrSales[k]);
            double commission = estateAgent.estateAgentCommission(totalSales);
            System.out.println("Sales Commission for " + arrAgentNames[k] + ": R " + String.format("%.2f", commission));
        }
        
        // Array to store total sales for each agent
        double[] totalSalesArray = new double[arrSales.length];
        for (int k = 0; k < arrSales.length; k++) {
            totalSalesArray[k] = estateAgent.estateAgentSales(arrSales[k]);
        }

        System.out.println();
        // Finding the top-selling estate agent
        int topAgentIndex = estateAgent.topEstateAgent(totalSalesArray);
        String topAgentName = arrAgentNames[topAgentIndex];
        System.out.println("Top performing estate agent: " + topAgentName);
    }

    public static void main(String[] args) {
        estateAgent();
    }
}
