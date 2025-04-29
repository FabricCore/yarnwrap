package yarnwrap.structure;
public class StructurePiecesGenerator { public net.minecraft.structure.StructurePiecesGenerator wrapperContained; public StructurePiecesGenerator(net.minecraft.structure.StructurePiecesGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public void generatePieces(yarnwrap.structure.StructurePiecesCollector collector,Object context) { wrapperContained.generatePieces(collector.wrapperContained,context); }
// public static void generatePieces(yarnwrap.structure.StructurePiecesCollector collector,Object context, ) { net.minecraft.structure.StructurePiecesGenerator.generatePieces(collector.wrapperContained,context); }

}