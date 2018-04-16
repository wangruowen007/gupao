package com.gupaoedu.homework.strategy;

import java.text.DateFormat;

/**
 * 旅游
 */
public class Travel {
    private String tid;
    private String df;

    public Travel(String tid, String df) {
        this.tid = tid;
        this.df = df;
    }

    public void arrive(TrivalType trivaltype) {
        trivaltype.take().trivalment();
        //System.out.println()
    }

}
