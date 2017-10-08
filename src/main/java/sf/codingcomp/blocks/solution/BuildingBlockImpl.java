package main.java.sf.codingcomp.blocks.solution;

import java.util.Iterator;

import main.java.sf.codingcomp.blocks.solution.BuildingBlock;

public class BuildingBlockImpl implements BuildingBlock {

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
        
    }

    @Override
    public void stackUnder(BuildingBlock b) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public BuildingBlock findBlockUnder() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BuildingBlock findBlockOver() {
        // TODO Auto-generated method stub
        return null;
    }

}
