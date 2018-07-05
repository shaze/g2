/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genesisprototype.model;

import java.util.HashMap;


/**
 *
 * @author scott
 */
public class PCGraph extends Graph {
    
    protected int pcs [] ; // which PCs used
    protected int pc_labels [];
    protected Object icons [];

    /**
     * For every phenotype column (key), we have a list of  phenotypes/pops
     * in order -- initially in the order of the file
     */
    protected HashMap<String,String[]> pop_order [];

    public PCGraph() {
    }

   
    
    public static Graph makeGraph(Project p, String label, String pc_file, String phe_file) {
       PCGraph g;
       g = new PCGraph();
       g.project = p;
       g.label = label;
       return g;      
    }
    

}
