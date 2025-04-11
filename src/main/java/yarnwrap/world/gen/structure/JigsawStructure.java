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
// public JigsawStructure(Object config,yarnwrap.registry.entry.RegistryEntry startPool,int size,yarnwrap.world.gen.heightprovider.HeightProvider startHeight,boolean useExpansionHack) { this.wrapperContained = new net.minecraft.world.gen.structure.JigsawStructure(config,startPool.wrapperContained,size,startHeight.wrapperContained,useExpansionHack); }
// public JigsawStructure(Object config,yarnwrap.registry.entry.RegistryEntry startPool,int size,yarnwrap.world.gen.heightprovider.HeightProvider startHeight,boolean useExpansionHack,Object projectStartToHeightmap) { this.wrapperContained = new net.minecraft.world.gen.structure.JigsawStructure(config,startPool.wrapperContained,size,startHeight.wrapperContained,useExpansionHack,projectStartToHeightmap); }
// public JigsawStructure(Object config,yarnwrap.registry.entry.RegistryEntry startPool,java.util.Optional startJigsawName,int size,yarnwrap.world.gen.heightprovider.HeightProvider startHeight,boolean useExpansionHack,java.util.Optional projectStartToHeightmap,int maxDistanceFromCenter,java.util.List poolAliasBindings,yarnwrap.world.gen.structure.DimensionPadding dimensionPadding,yarnwrap.structure.StructureLiquidSettings liquidSettings) { this.wrapperContained = new net.minecraft.world.gen.structure.JigsawStructure(config,startPool.wrapperContained,startJigsawName,size,startHeight.wrapperContained,useExpansionHack,projectStartToHeightmap,maxDistanceFromCenter,poolAliasBindings,dimensionPadding.wrapperContained,liquidSettings.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_41662(Object instance) { return wrapperContained.method_41662(instance); }
// public java.lang.Integer method_42704(yarnwrap.world.gen.structure.JigsawStructure structure) { return wrapperContained.method_42704(structure.wrapperContained); }
// public java.util.Optional method_42705(yarnwrap.world.gen.structure.JigsawStructure structure) { return wrapperContained.method_42705(structure.wrapperContained); }
// public java.lang.Boolean method_42706(yarnwrap.world.gen.structure.JigsawStructure structure) { return wrapperContained.method_42706(structure.wrapperContained); }
// public yarnwrap.world.gen.heightprovider.HeightProvider method_42707(yarnwrap.world.gen.structure.JigsawStructure structure) { return new yarnwrap.world.gen.heightprovider.HeightProvider(wrapperContained.method_42707(structure.wrapperContained)); }
// public com.mojang.serialization.DataResult validate(yarnwrap.world.gen.structure.JigsawStructure structure) { return wrapperContained.validate(structure.wrapperContained); }
// public java.lang.Integer method_42709(yarnwrap.world.gen.structure.JigsawStructure structure) { return wrapperContained.method_42709(structure.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry method_42710(yarnwrap.world.gen.structure.JigsawStructure structure) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_42710(structure.wrapperContained)); }
// public java.util.Optional method_43567(yarnwrap.world.gen.structure.JigsawStructure structure) { return wrapperContained.method_43567(structure.wrapperContained); }
// public java.util.List method_54520(yarnwrap.world.gen.structure.JigsawStructure structure) { return wrapperContained.method_54520(structure.wrapperContained); }
// public yarnwrap.world.gen.structure.DimensionPadding method_60567(yarnwrap.world.gen.structure.JigsawStructure structure) { return new yarnwrap.world.gen.structure.DimensionPadding(wrapperContained.method_60567(structure.wrapperContained)); }

}