package yarnwrap.structure;
public class StructureGeneratorFactory { public net.minecraft.structure.StructureGeneratorFactory wrapperContained; public StructureGeneratorFactory(net.minecraft.structure.StructureGeneratorFactory wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Predicate checkForBiomeOnTop(Object heightmapType) { return wrapperContained.checkForBiomeOnTop(heightmapType); }
// public static java.util.function.Predicate checkForBiomeOnTop(Object heightmapType, ) { return net.minecraft.structure.StructureGeneratorFactory.checkForBiomeOnTop(heightmapType); }
// public java.util.Optional createGenerator(Object context) { return wrapperContained.createGenerator(context); }
// public static java.util.Optional createGenerator(Object context, ) { return net.minecraft.structure.StructureGeneratorFactory.createGenerator(context); }
// public boolean method_39844(Object context) { return wrapperContained.method_39844(context); }
// public static boolean method_39844(Object context, ) { return net.minecraft.structure.StructureGeneratorFactory.method_39844(context); }
// public java.util.Optional method_39845(java.util.function.Predicate context) { return wrapperContained.method_39845(context); }
// public static java.util.Optional method_39845(java.util.function.Predicate context, ) { return net.minecraft.structure.StructureGeneratorFactory.method_39845(context); }
// public yarnwrap.structure.StructureGeneratorFactory simple(java.util.function.Predicate predicate,yarnwrap.structure.StructurePiecesGenerator generator) { return new yarnwrap.structure.StructureGeneratorFactory(wrapperContained.simple(predicate,generator.wrapperContained)); }
// public static yarnwrap.structure.StructureGeneratorFactory simple(java.util.function.Predicate predicate,yarnwrap.structure.StructurePiecesGenerator generator, ) { return new yarnwrap.structure.StructureGeneratorFactory(net.minecraft.structure.StructureGeneratorFactory.simple(predicate,generator.wrapperContained)); }

}