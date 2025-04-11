package yarnwrap.world.gen.structure;
public class JigsawStructure { public net.minecraft.world.gen.structure.JigsawStructure wrapperContained; public JigsawStructure(net.minecraft.world.gen.structure.JigsawStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.registry.entry.RegistryEntry startPool() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.startPool); }
// public void startPool(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.startPool = value.wrapperContained; }
// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public yarnwrap.world.gen.heightprovider.HeightProvider startHeight() { return new yarnwrap.world.gen.heightprovider.HeightProvider(wrapperContained.startHeight); }
// public void startHeight(yarnwrap.world.gen.heightprovider.HeightProvider value) { wrapperContained.startHeight = value.wrapperContained; }
// public boolean useExpansionHack() { return wrapperContained.useExpansionHack; }
// public void useExpansionHack(boolean value) { wrapperContained.useExpansionHack = value; }
// public java.util.Optional projectStartToHeightmap() { return wrapperContained.projectStartToHeightmap; }
// public void projectStartToHeightmap(java.util.Optional value) { wrapperContained.projectStartToHeightmap = value; }
// public int maxDistanceFromCenter() { return wrapperContained.maxDistanceFromCenter; }
// public void maxDistanceFromCenter(int value) { wrapperContained.maxDistanceFromCenter = value; }
public int MAX_SIZE() { return wrapperContained.MAX_SIZE; }
// public void MAX_SIZE(int value) { wrapperContained.MAX_SIZE = value; }
// public java.util.Optional startJigsawName() { return wrapperContained.startJigsawName; }
// public void startJigsawName(java.util.Optional value) { wrapperContained.startJigsawName = value; }
// public java.util.List poolAliasBindings() { return wrapperContained.poolAliasBindings; }
// public void poolAliasBindings(java.util.List value) { wrapperContained.poolAliasBindings = value; }
public int MAX_GENERATION_DEPTH() { return wrapperContained.MAX_GENERATION_DEPTH; }
// public void MAX_GENERATION_DEPTH(int value) { wrapperContained.MAX_GENERATION_DEPTH = value; }
public yarnwrap.world.gen.structure.DimensionPadding DEFAULT_DIMENSION_PADDING() { return new yarnwrap.world.gen.structure.DimensionPadding(wrapperContained.DEFAULT_DIMENSION_PADDING); }
// public void DEFAULT_DIMENSION_PADDING(yarnwrap.world.gen.structure.DimensionPadding value) { wrapperContained.DEFAULT_DIMENSION_PADDING = value.wrapperContained; }
// public yarnwrap.world.gen.structure.DimensionPadding dimensionPadding() { return new yarnwrap.world.gen.structure.DimensionPadding(wrapperContained.dimensionPadding); }
// public void dimensionPadding(yarnwrap.world.gen.structure.DimensionPadding value) { wrapperContained.dimensionPadding = value.wrapperContained; }
public yarnwrap.structure.StructureLiquidSettings DEFAULT_LIQUID_SETTINGS() { return new yarnwrap.structure.StructureLiquidSettings(wrapperContained.DEFAULT_LIQUID_SETTINGS); }
// public void DEFAULT_LIQUID_SETTINGS(yarnwrap.structure.StructureLiquidSettings value) { wrapperContained.DEFAULT_LIQUID_SETTINGS = value.wrapperContained; }
// public yarnwrap.structure.StructureLiquidSettings liquidSettings() { return new yarnwrap.structure.StructureLiquidSettings(wrapperContained.liquidSettings); }
// public void liquidSettings(yarnwrap.structure.StructureLiquidSettings value) { wrapperContained.liquidSettings = value.wrapperContained; }
// public com.mojang.serialization.DataResult validate(yarnwrap.world.gen.structure.JigsawStructure structure) { return wrapperContained.validate(structure.wrapperContained); }

}