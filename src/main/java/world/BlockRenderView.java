package yarnwrap.world;
public class BlockRenderView { public net.minecraft.world.BlockRenderView wrapperContained; public BlockRenderView(net.minecraft.world.BlockRenderView wrapperContained) { this.wrapperContained = wrapperContained; }

public int getBaseLightLevel(yarnwrap.util.math.BlockPos pos,int ambientDarkness) { return wrapperContained.getBaseLightLevel(pos.wrapperContained,ambientDarkness); }
public yarnwrap.world.chunk.light.LightingProvider getLightingProvider() { return new yarnwrap.world.chunk.light.LightingProvider(wrapperContained.getLightingProvider()); }
public int getColor(yarnwrap.util.math.BlockPos pos,yarnwrap.world.biome.ColorResolver colorResolver) { return wrapperContained.getColor(pos.wrapperContained,colorResolver.wrapperContained); }
public float getBrightness(yarnwrap.util.math.Direction direction,boolean shaded) { return wrapperContained.getBrightness(direction.wrapperContained,shaded); }
public boolean isSkyVisible(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSkyVisible(pos.wrapperContained); }
public int getLightLevel(yarnwrap.world.LightType type,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getLightLevel(type.wrapperContained,pos.wrapperContained); }

}