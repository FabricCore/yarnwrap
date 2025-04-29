package yarnwrap.world.gen;
public class StructureWeightSampler { public net.minecraft.world.gen.StructureWeightSampler wrapperContained; public StructureWeightSampler(net.minecraft.world.gen.StructureWeightSampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public float[] STRUCTURE_WEIGHT_TABLE() { return wrapperContained.STRUCTURE_WEIGHT_TABLE; }
// public void STRUCTURE_WEIGHT_TABLE(float[] value) { wrapperContained.STRUCTURE_WEIGHT_TABLE = value; }
// public static float[] STRUCTURE_WEIGHT_TABLE() { return net.minecraft.world.gen.StructureWeightSampler.STRUCTURE_WEIGHT_TABLE; }
// public static void STRUCTURE_WEIGHT_TABLE(float[] value, ) { net.minecraft.world.gen.StructureWeightSampler.STRUCTURE_WEIGHT_TABLE = value; }

// public it.unimi.dsi.fastutil.objects.ObjectListIterator pieceIterator() { return wrapperContained.pieceIterator; }
// public void pieceIterator(it.unimi.dsi.fastutil.objects.ObjectListIterator value) { wrapperContained.pieceIterator = value; }
// public static it.unimi.dsi.fastutil.objects.ObjectListIterator pieceIterator() { return net.minecraft.world.gen.StructureWeightSampler.pieceIterator; }
// public static void pieceIterator(it.unimi.dsi.fastutil.objects.ObjectListIterator value, ) { net.minecraft.world.gen.StructureWeightSampler.pieceIterator = value; }

// public it.unimi.dsi.fastutil.objects.ObjectListIterator junctionIterator() { return wrapperContained.junctionIterator; }
// public void junctionIterator(it.unimi.dsi.fastutil.objects.ObjectListIterator value) { wrapperContained.junctionIterator = value; }
// public static it.unimi.dsi.fastutil.objects.ObjectListIterator junctionIterator() { return net.minecraft.world.gen.StructureWeightSampler.junctionIterator; }
// public static void junctionIterator(it.unimi.dsi.fastutil.objects.ObjectListIterator value, ) { net.minecraft.world.gen.StructureWeightSampler.junctionIterator = value; }

// public int INDEX_OFFSET() { return wrapperContained.INDEX_OFFSET; }
// public void INDEX_OFFSET(int value) { wrapperContained.INDEX_OFFSET = value; }
public static int INDEX_OFFSET() { return net.minecraft.world.gen.StructureWeightSampler.INDEX_OFFSET; }
// public static void INDEX_OFFSET(int value, ) { net.minecraft.world.gen.StructureWeightSampler.INDEX_OFFSET = value; }

// public int EDGE_LENGTH() { return wrapperContained.EDGE_LENGTH; }
// public void EDGE_LENGTH(int value) { wrapperContained.EDGE_LENGTH = value; }
// public static int EDGE_LENGTH() { return net.minecraft.world.gen.StructureWeightSampler.EDGE_LENGTH; }
// public static void EDGE_LENGTH(int value, ) { net.minecraft.world.gen.StructureWeightSampler.EDGE_LENGTH = value; }

public StructureWeightSampler(it.unimi.dsi.fastutil.objects.ObjectListIterator pieceIterator,it.unimi.dsi.fastutil.objects.ObjectListIterator junctionIterator) { this.wrapperContained = new net.minecraft.world.gen.StructureWeightSampler(pieceIterator,junctionIterator); }
// public void method_33640(float array) { wrapperContained.method_33640(array); }
// public static void method_33640(float array, ) { net.minecraft.world.gen.StructureWeightSampler.method_33640(array); }
// public double getStructureWeight(int x,int y,int z,int yy) { return wrapperContained.getStructureWeight(x,y,z,yy); }
// public static double getStructureWeight(int x,int y,int z,int yy, ) { return net.minecraft.world.gen.StructureWeightSampler.getStructureWeight(x,y,z,yy); }
// public double calculateStructureWeight(int x,int y,int z) { return wrapperContained.calculateStructureWeight(x,y,z); }
// public static double calculateStructureWeight(int x,int y,int z, ) { return net.minecraft.world.gen.StructureWeightSampler.calculateStructureWeight(x,y,z); }
// public double getMagnitudeWeight(double x,double y,double z) { return wrapperContained.getMagnitudeWeight(x,y,z); }
// public static double getMagnitudeWeight(double x,double y,double z, ) { return net.minecraft.world.gen.StructureWeightSampler.getMagnitudeWeight(x,y,z); }
// public boolean indexInBounds(int i) { return wrapperContained.indexInBounds(i); }
// public static boolean indexInBounds(int i, ) { return net.minecraft.world.gen.StructureWeightSampler.indexInBounds(i); }
// public double structureWeight(int x,double y,int z) { return wrapperContained.structureWeight(x,y,z); }
// public static double structureWeight(int x,double y,int z, ) { return net.minecraft.world.gen.StructureWeightSampler.structureWeight(x,y,z); }
// public void method_42694(yarnwrap.util.math.ChunkPos pos,it.unimi.dsi.fastutil.objects.ObjectList piecesOut,int startX,int startZ,it.unimi.dsi.fastutil.objects.ObjectList jigsawJunctionsOut,yarnwrap.structure.StructureStart start) { wrapperContained.method_42694(pos.wrapperContained,piecesOut,startX,startZ,jigsawJunctionsOut,start.wrapperContained); }
// public static void method_42694(yarnwrap.util.math.ChunkPos pos,it.unimi.dsi.fastutil.objects.ObjectList piecesOut,int startX,int startZ,it.unimi.dsi.fastutil.objects.ObjectList jigsawJunctionsOut,yarnwrap.structure.StructureStart start, ) { net.minecraft.world.gen.StructureWeightSampler.method_42694(pos.wrapperContained,piecesOut,startX,startZ,jigsawJunctionsOut,start.wrapperContained); }
// public yarnwrap.world.gen.StructureWeightSampler createStructureWeightSampler(yarnwrap.world.gen.StructureAccessor world,yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.world.gen.StructureWeightSampler(wrapperContained.createStructureWeightSampler(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.world.gen.StructureWeightSampler createStructureWeightSampler(yarnwrap.world.gen.StructureAccessor world,yarnwrap.util.math.ChunkPos pos, ) { return new yarnwrap.world.gen.StructureWeightSampler(net.minecraft.world.gen.StructureWeightSampler.createStructureWeightSampler(world.wrapperContained,pos.wrapperContained)); }
// public boolean method_42696(yarnwrap.world.gen.structure.Structure structure) { return wrapperContained.method_42696(structure.wrapperContained); }
// public static boolean method_42696(yarnwrap.world.gen.structure.Structure structure, ) { return net.minecraft.world.gen.StructureWeightSampler.method_42696(structure.wrapperContained); }

}