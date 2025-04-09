package yarnwrap.world.chunk.light;
public class LightingProvider { public net.minecraft.world.chunk.light.LightingProvider wrapperContained; public LightingProvider(net.minecraft.world.chunk.light.LightingProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.light.ChunkLightProvider skyLightProvider() { return new yarnwrap.world.chunk.light.ChunkLightProvider(wrapperContained.skyLightProvider); }
// public yarnwrap.world.chunk.light.ChunkLightProvider blockLightProvider() { return new yarnwrap.world.chunk.light.ChunkLightProvider(wrapperContained.blockLightProvider); }
// public yarnwrap.world.HeightLimitView world() { return new yarnwrap.world.HeightLimitView(wrapperContained.world); }
public void enqueueSectionData(yarnwrap.world.LightType lightType,yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.world.chunk.ChunkNibbleArray nibbles) { wrapperContained.enqueueSectionData(lightType.wrapperContained,pos.wrapperContained,nibbles.wrapperContained); }
public yarnwrap.world.chunk.light.ChunkLightingView get(yarnwrap.world.LightType lightType) { return new yarnwrap.world.chunk.light.ChunkLightingView(wrapperContained.get(lightType.wrapperContained)); }
public void setRetainData(yarnwrap.util.math.ChunkPos pos,boolean retainData) { wrapperContained.setRetainData(pos.wrapperContained,retainData); }
public int getLight(yarnwrap.util.math.BlockPos pos,int ambientDarkness) { return wrapperContained.getLight(pos.wrapperContained,ambientDarkness); }
public java.lang.String displaySectionLevel(yarnwrap.world.LightType lightType,yarnwrap.util.math.ChunkSectionPos pos) { return wrapperContained.displaySectionLevel(lightType.wrapperContained,pos.wrapperContained); }
public int getHeight() { return wrapperContained.getHeight(); }
public int getBottomY() { return wrapperContained.getBottomY(); }
public int getTopY() { return wrapperContained.getTopY(); }
public boolean isLightingEnabled(yarnwrap.util.math.ChunkSectionPos sectionPos) { return wrapperContained.isLightingEnabled(sectionPos.wrapperContained); }
public Object getStatus(yarnwrap.world.LightType lightType,yarnwrap.util.math.ChunkSectionPos pos) { return wrapperContained.getStatus(lightType.wrapperContained,pos.wrapperContained); }

}