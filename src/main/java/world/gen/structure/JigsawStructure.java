package yarnwrap.world.gen.structure;
public class JigsawStructure { public net.minecraft.world.gen.structure.JigsawStructure wrapperContained; public JigsawStructure(net.minecraft.world.gen.structure.JigsawStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.registry.entry.RegistryEntry startPool() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.startPool); }
// public int size() { return wrapperContained.size; }
// public yarnwrap.world.gen.heightprovider.HeightProvider startHeight() { return new yarnwrap.world.gen.heightprovider.HeightProvider(wrapperContained.startHeight); }
// public boolean useExpansionHack() { return wrapperContained.useExpansionHack; }
// public java.util.Optional projectStartToHeightmap() { return wrapperContained.projectStartToHeightmap; }
// public int maxDistanceFromCenter() { return wrapperContained.maxDistanceFromCenter; }
public int MAX_SIZE() { return wrapperContained.MAX_SIZE; }
// public java.util.Optional startJigsawName() { return wrapperContained.startJigsawName; }
// public java.util.List poolAliasBindings() { return wrapperContained.poolAliasBindings; }
public int MAX_GENERATION_DEPTH() { return wrapperContained.MAX_GENERATION_DEPTH; }
public yarnwrap.world.gen.structure.DimensionPadding DEFAULT_DIMENSION_PADDING() { return new yarnwrap.world.gen.structure.DimensionPadding(wrapperContained.DEFAULT_DIMENSION_PADDING); }
// public yarnwrap.world.gen.structure.DimensionPadding dimensionPadding() { return new yarnwrap.world.gen.structure.DimensionPadding(wrapperContained.dimensionPadding); }
public yarnwrap.structure.StructureLiquidSettings DEFAULT_LIQUID_SETTINGS() { return new yarnwrap.structure.StructureLiquidSettings(wrapperContained.DEFAULT_LIQUID_SETTINGS); }
// public yarnwrap.structure.StructureLiquidSettings liquidSettings() { return new yarnwrap.structure.StructureLiquidSettings(wrapperContained.liquidSettings); }
// public com.mojang.serialization.DataResult validate(yarnwrap.world.gen.structure.JigsawStructure structure) { return wrapperContained.validate(structure.wrapperContained); }

}