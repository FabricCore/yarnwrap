package yarnwrap.structure;
public class StrongholdGenerator { public net.minecraft.structure.StrongholdGenerator wrapperContained; public StrongholdGenerator(net.minecraft.structure.StrongholdGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object STONE_BRICK_RANDOMIZER() { return wrapperContained.STONE_BRICK_RANDOMIZER; }
// // public void STONE_BRICK_RANDOMIZER(Object value) { wrapperContained.STONE_BRICK_RANDOMIZER = value; }
// public int totalWeight() { return wrapperContained.totalWeight; }
// public void totalWeight(int value) { wrapperContained.totalWeight = value; }
// public Object ALL_PIECES() { return wrapperContained.ALL_PIECES; }
// // public void ALL_PIECES(Object value) { wrapperContained.ALL_PIECES = value; }
// public java.lang.Class activePieceType() { return wrapperContained.activePieceType; }
// public void activePieceType(java.lang.Class value) { wrapperContained.activePieceType = value; }
// public java.util.List possiblePieces() { return wrapperContained.possiblePieces; }
// public void possiblePieces(java.util.List value) { wrapperContained.possiblePieces = value; }
// public Object createPiece(java.lang.Class pieceType,yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random,int x,int y,int z,yarnwrap.util.math.Direction orientation,int chainLength) { return wrapperContained.createPiece(pieceType,holder.wrapperContained,random.wrapperContained,x,y,z,orientation.wrapperContained,chainLength); }
// public Object pickPiece(Object start,yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random,int x,int y,int z,yarnwrap.util.math.Direction orientation,int chainLength) { return wrapperContained.pickPiece(start,holder.wrapperContained,random.wrapperContained,x,y,z,orientation.wrapperContained,chainLength); }
// public boolean checkRemainingPieces() { return wrapperContained.checkRemainingPieces(); }
// public yarnwrap.structure.StructurePiece pieceGenerator(Object start,yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random,int x,int y,int z,yarnwrap.util.math.Direction orientation,int chainLength) { return new yarnwrap.structure.StructurePiece(wrapperContained.pieceGenerator(start,holder.wrapperContained,random.wrapperContained,x,y,z,orientation.wrapperContained,chainLength)); }
public void init() { wrapperContained.init(); }

}