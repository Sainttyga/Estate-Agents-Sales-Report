package com.mycompany.LindokuhleAtWork;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Lindokuhle Zwane
 */
public class PropertySalesTest  {

    @Test
    public void calculateTotalSales_ReturnsTotalSales() {
        double[][] arrSales = {
            {800000.0, 1500000.0, 2000000.0},
            {700000.0, 1200000.0, 1600000.0}
        };
        EstateAgent estateAgent = new EstateAgent();

        double totalSalesAgent1 = estateAgent.estateAgentSales(arrSales[0]);
        double totalSalesAgent2 = estateAgent.estateAgentSales(arrSales[1]);

        assertEquals(4300000.0, totalSalesAgent1, 0.0);
        assertEquals(3500000.0, totalSalesAgent2, 0.0);
    }

    @Test
    public void calculateTotalCommission_ReturnsCommission() {
        EstateAgent estateAgent = new EstateAgent();

        double totalSalesAgent1 = 4300000.0; // Use the calculated values
        double totalSalesAgent2 = 3500000.0; // Use the calculated values

        double commissionAgent1 = estateAgent.estateAgentCommission(totalSalesAgent1);
        double commissionAgent2 = estateAgent.estateAgentCommission(totalSalesAgent2);

        assertEquals(86000.0, commissionAgent1, 0.0); // Adjust expected commission values
        assertEquals(70000.0, commissionAgent2, 0.0); // Adjust expected commission values
    }

    @Test
    public void topAgent_ReturnsTopPosition() {
        EstateAgent estateAgent = new EstateAgent();
        double[] totalSalesArray = {4300000.0, 3500000.0}; // Use the calculated total sales

        int topAgentIndex = estateAgent.topEstateAgent(totalSalesArray);
        assertEquals(0, topAgentIndex); // Adjust the expected top agent index
    }
}
