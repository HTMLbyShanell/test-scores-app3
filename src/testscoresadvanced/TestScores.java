/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testscoresadvanced;

/**
 *
 * @author Shanell Spann
 */
public class TestScores {
    private double score1;
    private double score2;
    private double score3;
    
    public double getScore1(){
        return score1;
    }
    
    public double getScore2(){
        return score2;
    }
    
    public double getScore3(){
        return score3;
    }
    
    public void setScore1(double score1Given){
        score1 = score1Given;
    }
    
    public void setScore2(double score2Given){
        score2 = score2Given;
    }
    
    public void setScore3(double score3Given){
        score3 = score3Given;
    }
    
    public double calculateAverage(){
        return (score1 + score2 + score3) / 3;
    }
    
    public TestScores(){
        score1 = 0.0;
        score2 = 0.0;
        score3 = 0.0;
    }
    
}
