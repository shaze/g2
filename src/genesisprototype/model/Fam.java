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
    String fid, iid;
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
    

    public Fam(String s) {
       String fields [] = s.split("\\s");
       fid = fields[0];
       iid = fields[1];
       pat = Integer.parseInt(fields[2]);
       mat = Integer.parseInt(fields[3]);
       sex = Integer.parseInt(fields[4]);
       phe = fields[5];
    }
}

