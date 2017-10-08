package main.java.sf.codingcomp.blocks.solution;

import java.util.Iterator;

import main.java.sf.codingcomp.blocks.solution.BuildingBlock;

public class BuildingBlockImpl implements BuildingBlock {

    private BuildingBlock top;
    private BuildingBlock bottom;
    @Override
    public Iterator<BuildingBlock> iterator() {
        // TODO Auto-generated method stub
        while(iterator().hasNext())
        {
            iterator().next();
        }
        return null;
    }

    @Override
    public void stackOver(BuildingBlock b) {
        // TODO Auto-generated method stub
        this.top=b;
        
    }

    @Override
    public void stackUnder(BuildingBlock b) {
        // TODO Auto-generated method stub
        this.bottom=b;
    }

    @Override
    public BuildingBlock findBlockUnder() {
        // TODO Auto-generated method stub
        return this.bottom;
    }

    @Override
    public BuildingBlock findBlockOver() {
        // TODO Auto-generated method stub
        return this.top;
    }

}
