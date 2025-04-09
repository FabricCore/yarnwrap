package yarnwrap.world.gen;
public class StructureWeightSampler { public net.minecraft.world.gen.StructureWeightSampler wrapperContained; public StructureWeightSampler(net.minecraft.world.gen.StructureWeightSampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public float[] STRUCTURE_WEIGHT_TABLE() { return wrapperContained.STRUCTURE_WEIGHT_TABLE; }
// public it.unimi.dsi.fastutil.objects.ObjectListIterator pieceIterator() { return wrapperContained.pieceIterator; }
// public it.unimi.dsi.fastutil.objects.ObjectListIterator junctionIterator() { return wrapperContained.junctionIterator; }
public int INDEX_OFFSET() { return wrapperContained.INDEX_OFFSET; }
// public int EDGE_LENGTH() { return wrapperContained.EDGE_LENGTH; }
// public double getStructureWeight(int x,int y,int z,int yy) { return wrapperContained.getStructureWeight(x,y,z,yy); }
// public double calculateStructureWeight(int x,int y,int z) { return wrapperContained.calculateStructureWeight(x,y,z); }
// public double getMagnitudeWeight(double x,double y,double z) { return wrapperContained.getMagnitudeWeight(x,y,z); }
// public boolean indexInBounds(int i) { return wrapperContained.indexInBounds(i); }
// public double structureWeight(int x,double y,int z) { return wrapperContained.structureWeight(x,y,z); }
public yarnwrap.world.gen.StructureWeightSampler createStructureWeightSampler(yarnwrap.world.gen.StructureAccessor world,yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.world.gen.StructureWeightSampler(wrapperContained.createStructureWeightSampler(world.wrapperContained,pos.wrapperContained)); }

}