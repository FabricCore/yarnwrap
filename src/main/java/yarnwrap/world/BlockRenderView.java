package yarnwrap.world;
public class BlockRenderView { public net.minecraft.world.BlockRenderView wrapperContained; public BlockRenderView(net.minecraft.world.BlockRenderView wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isSkyVisible(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSkyVisible(pos.wrapperContained); }
// public static boolean isSkyVisible(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.BlockRenderView.isSkyVisible(pos.wrapperContained); }
public int getLightLevel(yarnwrap.world.LightType type,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getLightLevel(type.wrapperContained,pos.wrapperContained); }
// public static int getLightLevel(yarnwrap.world.LightType type,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.BlockRenderView.getLightLevel(type.wrapperContained,pos.wrapperContained); }
public int getBaseLightLevel(yarnwrap.util.math.BlockPos pos,int ambientDarkness) { return wrapperContained.getBaseLightLevel(pos.wrapperContained,ambientDarkness); }
// public static int getBaseLightLevel(yarnwrap.util.math.BlockPos pos,int ambientDarkness, ) { return net.minecraft.world.BlockRenderView.getBaseLightLevel(pos.wrapperContained,ambientDarkness); }
public yarnwrap.world.chunk.light.LightingProvider getLightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(wrapperContained.getLightingProvider()); }
// public static yarnwrap.world.chunk.light.LightingProvider getLightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(net.minecraft.world.BlockRenderView.getLightingProvider()); }
public int getColor(yarnwrap.util.math.BlockPos pos,yarnwrap.world.biome.ColorResolver colorResolver) { return wrapperContained.getColor(pos.wrapperContained,colorResolver.wrapperContained); }
// public static int getColor(yarnwrap.util.math.BlockPos pos,yarnwrap.world.biome.ColorResolver colorResolver, ) { return net.minecraft.world.BlockRenderView.getColor(pos.wrapperContained,colorResolver.wrapperContained); }
public float getBrightness(yarnwrap.util.math.Direction direction,boolean shaded) { return wrapperContained.getBrightness(direction.wrapperContained,shaded); }
// public static float getBrightness(yarnwrap.util.math.Direction direction,boolean shaded, ) { return net.minecraft.world.BlockRenderView.getBrightness(direction.wrapperContained,shaded); }

}