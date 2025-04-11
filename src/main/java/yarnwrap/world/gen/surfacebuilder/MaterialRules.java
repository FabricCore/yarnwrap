package yarnwrap.world.gen.surfacebuilder;
public class MaterialRules { public net.minecraft.world.gen.surfacebuilder.MaterialRules wrapperContained; public MaterialRules(net.minecraft.world.gen.surfacebuilder.MaterialRules wrapperContained) { this.wrapperContained = wrapperContained; }

public Object STONE_DEPTH_FLOOR() { return wrapperContained.STONE_DEPTH_FLOOR; }
// // public void STONE_DEPTH_FLOOR(Object value) { wrapperContained.STONE_DEPTH_FLOOR = value; }
public Object STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH() { return wrapperContained.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH; }
// // public void STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH(Object value) { wrapperContained.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH = value; }
public Object STONE_DEPTH_CEILING_WITH_SURFACE_DEPTH() { return wrapperContained.STONE_DEPTH_CEILING_WITH_SURFACE_DEPTH; }
// // public void STONE_DEPTH_CEILING_WITH_SURFACE_DEPTH(Object value) { wrapperContained.STONE_DEPTH_CEILING_WITH_SURFACE_DEPTH = value; }
public Object STONE_DEPTH_CEILING() { return wrapperContained.STONE_DEPTH_CEILING; }
// // public void STONE_DEPTH_CEILING(Object value) { wrapperContained.STONE_DEPTH_CEILING = value; }
public Object STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6() { return wrapperContained.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6; }
// // public void STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6(Object value) { wrapperContained.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6 = value; }
public Object STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_30() { return wrapperContained.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_30; }
// // public void STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_30(Object value) { wrapperContained.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_30 = value; }
public Object steepSlope() { return wrapperContained.steepSlope(); }
public Object water(int offset,int runDepthMultiplier) { return wrapperContained.water(offset,runDepthMultiplier); }
public Object block(yarnwrap.block.BlockState state) { return wrapperContained.block(state.wrapperContained); }
// public Object not(Object target) { return wrapperContained.not(target); }
// public Object condition(Object condition,Object rule) { return wrapperContained.condition(condition,rule); }
// public Object sequence(Object[] rules) { return wrapperContained.sequence(rules); }
public Object aboveY(yarnwrap.world.gen.YOffset anchor,int runDepthMultiplier) { return wrapperContained.aboveY(anchor.wrapperContained,runDepthMultiplier); }
public Object noiseThreshold(yarnwrap.registry.RegistryKey noise,double min) { return wrapperContained.noiseThreshold(noise.wrapperContained,min); }
public Object noiseThreshold(yarnwrap.registry.RegistryKey noise,double min,double max) { return wrapperContained.noiseThreshold(noise.wrapperContained,min,max); }
// public Object biome(java.util.List biomes) { return wrapperContained.biome(biomes); }
public Object biome(net.minecraft.registry.RegistryKey[] biomes) { return wrapperContained.biome(biomes); }
public Object hole() { return wrapperContained.hole(); }
public Object waterWithStoneDepth(int offset,int runDepthMultiplier) { return wrapperContained.waterWithStoneDepth(offset,runDepthMultiplier); }
public Object aboveYWithStoneDepth(yarnwrap.world.gen.YOffset anchor,int runDepthMultiplier) { return wrapperContained.aboveYWithStoneDepth(anchor.wrapperContained,runDepthMultiplier); }
public Object temperature() { return wrapperContained.temperature(); }
public Object terracottaBands() { return wrapperContained.terracottaBands(); }
public Object verticalGradient(java.lang.String id,yarnwrap.world.gen.YOffset trueAtAndBelow,yarnwrap.world.gen.YOffset falseAtAndAbove) { return wrapperContained.verticalGradient(id,trueAtAndBelow.wrapperContained,falseAtAndAbove.wrapperContained); }
public Object surface() { return wrapperContained.surface(); }
public Object stoneDepth(int offset,boolean addSurfaceDepth,yarnwrap.util.math.VerticalSurfaceType verticalSurfaceType) { return wrapperContained.stoneDepth(offset,addSurfaceDepth,verticalSurfaceType.wrapperContained); }
public Object stoneDepth(int offset,boolean addSurfaceDepth,int secondaryDepthRange,yarnwrap.util.math.VerticalSurfaceType verticalSurfaceType) { return wrapperContained.stoneDepth(offset,addSurfaceDepth,secondaryDepthRange,verticalSurfaceType.wrapperContained); }
// public com.mojang.serialization.MapCodec register(yarnwrap.registry.Registry registry,java.lang.String id,yarnwrap.util.dynamic.CodecHolder codecHolder) { return wrapperContained.register(registry.wrapperContained,id,codecHolder.wrapperContained); }

}