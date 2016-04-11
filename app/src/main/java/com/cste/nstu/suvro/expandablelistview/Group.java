package com.cste.nstu.suvro.expandablelistview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SUVRO on 11-04-16.
 */
public class Group {
    public String string;
    public final List<String> children = new ArrayList<String>();

    public Group(String string) {
        this.string = string;
    }

}