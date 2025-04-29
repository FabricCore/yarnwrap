package yarnwrap.structure;
public class StructurePiecesCollector { public net.minecraft.structure.StructurePiecesCollector wrapperContained; public StructurePiecesCollector(net.minecraft.structure.StructurePiecesCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List pieces() { return wrapperContained.pieces; }
// public void pieces(java.util.List value) { wrapperContained.pieces = value; }
// public static java.util.List pieces() { return net.minecraft.structure.StructurePiecesCollector.pieces; }
// public static void pieces(java.util.List value, ) { net.minecraft.structure.StructurePiecesCollector.pieces = value; }

public yarnwrap.structure.StructurePiecesList toList() { return new yarnwrap.structure.StructurePiecesList(wrapperContained.toList()); }
// public static yarnwrap.structure.StructurePiecesList toList() { return new yarnwrap.structure.StructurePiecesList(net.minecraft.structure.StructurePiecesCollector.toList()); }
public void shift(int y) { wrapperContained.shift(y); }
// public static void shift(int y, ) { net.minecraft.structure.StructurePiecesCollector.shift(y); }
public int shiftInto(int topY,int bottomY,yarnwrap.util.math.random.Random random,int topPenalty) { return wrapperContained.shiftInto(topY,bottomY,random.wrapperContained,topPenalty); }
// public static int shiftInto(int topY,int bottomY,yarnwrap.util.math.random.Random random,int topPenalty, ) { return net.minecraft.structure.StructurePiecesCollector.shiftInto(topY,bottomY,random.wrapperContained,topPenalty); }
public void shiftInto(yarnwrap.util.math.random.Random random,int baseY,int topY) { wrapperContained.shiftInto(random.wrapperContained,baseY,topY); }
// public static void shiftInto(yarnwrap.util.math.random.Random random,int baseY,int topY, ) { net.minecraft.structure.StructurePiecesCollector.shiftInto(random.wrapperContained,baseY,topY); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.structure.StructurePiecesCollector.clear(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.structure.StructurePiecesCollector.isEmpty(); }
public yarnwrap.util.math.BlockBox getBoundingBox() { return new yarnwrap.util.math.BlockBox(wrapperContained.getBoundingBox()); }
// public static yarnwrap.util.math.BlockBox getBoundingBox() { return new yarnwrap.util.math.BlockBox(net.minecraft.structure.StructurePiecesCollector.getBoundingBox()); }

}