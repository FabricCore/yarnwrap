package yarnwrap.world.gen.structure;
public class OceanMonumentStructure { public net.minecraft.world.gen.structure.OceanMonumentStructure wrapperContained; public OceanMonumentStructure(net.minecraft.world.gen.structure.OceanMonumentStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.structure.StructurePiecesList modifyPiecesOnRead(yarnwrap.util.math.ChunkPos pos,long worldSeed,yarnwrap.structure.StructurePiecesList pieces) { return new yarnwrap.structure.StructurePiecesList(wrapperContained.modifyPiecesOnRead(pos.wrapperContained,worldSeed,pieces.wrapperContained)); }
// public yarnwrap.structure.StructurePiece createBasePiece(yarnwrap.util.math.ChunkPos pos,yarnwrap.util.math.random.ChunkRandom random) { return new yarnwrap.structure.StructurePiece(wrapperContained.createBasePiece(pos.wrapperContained,random.wrapperContained)); }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.addPieces(collector.wrapperContained,context); }

}