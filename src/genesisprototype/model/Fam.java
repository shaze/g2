/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genesisprototype.model;

/**
 *
 * @author Scott Hazelhurst
 */

public class Fam {
    int pat;
    int mat;
    int sex;
    String phe;
    
    /**
     * 
     * @param pat: ID of father
     * @param mat: ID of mother
     * @param sex: sex of individual
     * @param phe: phenotype
     */
    public Fam(int pat, int mat, int sex, String phe) {
        
       this.pat = pat;
       this.mat = mat;
       this.sex = sex;
       this.phe = phe;
    }
}

