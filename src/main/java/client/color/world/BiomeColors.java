package yarnwrap.client.color.world;
public class BiomeColors { public net.minecraft.client.color.world.BiomeColors wrapperContained; public BiomeColors(net.minecraft.client.color.world.BiomeColors wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.biome.ColorResolver FOLIAGE_COLOR() { return new yarnwrap.world.biome.ColorResolver(wrapperContained.FOLIAGE_COLOR); }
public yarnwrap.world.biome.ColorResolver GRASS_COLOR() { return new yarnwrap.world.biome.ColorResolver(wrapperContained.GRASS_COLOR); }
public yarnwrap.world.biome.ColorResolver WATER_COLOR() { return new yarnwrap.world.biome.ColorResolver(wrapperContained.WATER_COLOR); }
public int getWaterColor(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getWaterColor(world.wrapperContained,pos.wrapperContained); }
public int getGrassColor(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getGrassColor(world.wrapperContained,pos.wrapperContained); }
// public int getColor(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.biome.ColorResolver resolver) { return wrapperContained.getColor(world.wrapperContained,pos.wrapperContained,resolver.wrapperContained); }
public int getFoliageColor(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getFoliageColor(world.wrapperContained,pos.wrapperContained); }

}