package yarnwrap.structure;
public class MineshaftGenerator { public net.minecraft.structure.MineshaftGenerator wrapperContained; public MineshaftGenerator(net.minecraft.structure.MineshaftGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.structure.MineshaftGenerator.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.structure.MineshaftGenerator.LOGGER = value; }

// public Object pieceGenerator(yarnwrap.structure.StructurePiece start,yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random,int x,int y,int z,yarnwrap.util.math.Direction orientation,int chainLength) { return wrapperContained.pieceGenerator(start.wrapperContained,holder.wrapperContained,random.wrapperContained,x,y,z,orientation.wrapperContained,chainLength); }
// public static Object pieceGenerator(yarnwrap.structure.StructurePiece start,yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random,int x,int y,int z,yarnwrap.util.math.Direction orientation,int chainLength, ) { return net.minecraft.structure.MineshaftGenerator.pieceGenerator(start.wrapperContained,holder.wrapperContained,random.wrapperContained,x,y,z,orientation.wrapperContained,chainLength); }
// public Object pickPiece(yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random,int x,int y,int z,yarnwrap.util.math.Direction orientation,int chainLength,Object type) { return wrapperContained.pickPiece(holder.wrapperContained,random.wrapperContained,x,y,z,orientation.wrapperContained,chainLength,type); }
// public static Object pickPiece(yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random,int x,int y,int z,yarnwrap.util.math.Direction orientation,int chainLength,Object type, ) { return net.minecraft.structure.MineshaftGenerator.pickPiece(holder.wrapperContained,random.wrapperContained,x,y,z,orientation.wrapperContained,chainLength,type); }

}