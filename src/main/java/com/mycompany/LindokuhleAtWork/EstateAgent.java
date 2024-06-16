
package com.mycompany.LindokuhleAtWork;

/**
 *
 * @author Lindkouhle Zwane
 */
public class EstateAgent implements iEstateAgent {

    @Override
    public double estateAgentSales(double[] sales) {
        double totalSales = 0;
        for (double sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    @Override
    public double estateAgentCommission(double sales) {
        return 0.02 * sales;
    }

    @Override
    public int topEstateAgent(double[] totalSales) {
        int topAgent = 0;
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > totalSales[topAgent]) {
                topAgent = i;
            }
        }
        return topAgent;
    }
}
