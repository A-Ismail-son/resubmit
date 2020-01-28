package edu.test;




import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import edu.impl.WeightHelper;

@RunWith(JUnit4.class)
public class TestWeightHelper {

    private WeightHelper weightHelper = new WeightHelper();

    @Test
    public void testShouldCalculateBMI(){
        // Arrange
        double height = 1.81;
        double weight = 80.7;

        // Act
        double bmi = weightHelper.calculateBMI(weight,height);

        // Assert
        Assert.assertNotNull(bmi);
        //Assetions.assertNotNull(bmi);
        Assert.assertTrue(bmi == (weight/(height*height)));
    }

    @Test
    public void testShouldGiveBackBMICategory(){
        // Arrange
        double bmi = 22;

        // Act
       String category =  weightHelper.getBMICategory(bmi);

        // Assert
        Assert.assertNotNull(category);
        Assert.assertTrue(category.equals("Normal"));
    }

    @Test
    public void testShouldCheckMultipleNormalBMIBoudaryValues(){
        // Arrange
        double normalbmiset[]  = {18.5,18.6,24,25};

        for (double bmi : normalbmiset
             ) {

            String category =  weightHelper.getBMICategory(bmi);

            // Assert
            Assert.assertNotNull(category);
            Assert.assertTrue(category.equals("Normal"));


        }
    }

    @Test
    public void testShouldCheckMultipleUnderweightBMIBoudaryValues(){
        // Arrange
        double underweightBmiSet[]  = {18.4,17.4};

        for (double bmi : underweightBmiSet
        ) {

            String category =  weightHelper.getBMICategory(bmi);

            // Assert
            Assert.assertNotNull(category);
            Assert.assertTrue(category.equals("Underweight"));


        }
    }

    @Test
    public void testShouldCheckMultipleOverweightBMIBoudaryValues(){
        // Arrange
        double overweightBmiSet[]  = {25.1,26.1,28.9,29.9};

        for (double bmi : overweightBmiSet
        ) {

            String category =  weightHelper.getBMICategory(bmi);

            // Assert
            Assert.assertNotNull(category);
            Assert.assertTrue(category.equals("Overweight"));


        }
    }

    @Test
    public void testShouldCheckMultipleObeseBMIBoudaryValues(){
        // Arrange
        double obeseBmiSet[]  = {30,31};

        for (double bmi : obeseBmiSet
        ) {

            String category =  weightHelper.getBMICategory(bmi);

            // Assert
            Assert.assertNotNull(category);
            Assert.assertTrue(category.equals("Obese"));


        }
    }




}

