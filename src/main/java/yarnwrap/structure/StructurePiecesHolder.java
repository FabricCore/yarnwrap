package yarnwrap.structure;
public class StructurePiecesHolder { public net.minecraft.structure.StructurePiecesHolder wrapperContained; public StructurePiecesHolder(net.minecraft.structure.StructurePiecesHolder wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.StructurePiece getIntersecting(yarnwrap.util.math.BlockBox box) { return new yarnwrap.structure.StructurePiece(wrapperContained.getIntersecting(box.wrapperContained)); }
// public static yarnwrap.structure.StructurePiece getIntersecting(yarnwrap.util.math.BlockBox box, ) { return new yarnwrap.structure.StructurePiece(net.minecraft.structure.StructurePiecesHolder.getIntersecting(box.wrapperContained)); }
public void addPiece(yarnwrap.structure.StructurePiece piece) { wrapperContained.addPiece(piece.wrapperContained); }
// public static void addPiece(yarnwrap.structure.StructurePiece piece, ) { net.minecraft.structure.StructurePiecesHolder.addPiece(piece.wrapperContained); }

}