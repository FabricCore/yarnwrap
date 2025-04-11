package yarnwrap.structure;
public class StructurePiecesCollector { public net.minecraft.structure.StructurePiecesCollector wrapperContained; public StructurePiecesCollector(net.minecraft.structure.StructurePiecesCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List pieces() { return wrapperContained.pieces; }
// public void pieces(java.util.List value) { wrapperContained.pieces = value; }
public yarnwrap.structure.StructurePiecesList toList() { return new yarnwrap.structure.StructurePiecesList(wrapperContained.toList()); }
public void shift(int y) { wrapperContained.shift(y); }
public int shiftInto(int topY,int bottomY,yarnwrap.util.math.random.Random random,int topPenalty) { return wrapperContained.shiftInto(topY,bottomY,random.wrapperContained,topPenalty); }
public void shiftInto(yarnwrap.util.math.random.Random random,int baseY,int topY) { wrapperContained.shiftInto(random.wrapperContained,baseY,topY); }
public void clear() { wrapperContained.clear(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public yarnwrap.util.math.BlockBox getBoundingBox() { return new yarnwrap.util.math.BlockBox(wrapperContained.getBoundingBox()); }

}