
package com.mycompany.LindokuhleAtWork;

/**
 *
 * @author Lindokuhle Zwane
 */
public interface iEstateAgent {
    
    double estateAgentSales(double[] propertySales);

    double estateAgentCommission(double propertySales);

    int topEstateAgent(double[] totalSales);
}
