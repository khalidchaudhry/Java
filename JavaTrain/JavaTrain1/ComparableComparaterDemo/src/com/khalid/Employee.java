package com.khalid;

public class Employee implements Comparable {

    int eid;

    public Employee(int eid) {
        this.eid = eid;
    }

    @Override
    public int compareTo(Object o) {
        int eid1=this.eid;
        int eid2=((Employee)o).eid; //! existing objects
        if(eid1<eid2){
            return -1;
        }
        else if(eid1>eid2){
            return 1;
        }
        else {
            return 0;
        }
    }
}
