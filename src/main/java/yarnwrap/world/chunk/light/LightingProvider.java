package yarnwrap.world.chunk.light;
public class LightingProvider { public net.minecraft.world.chunk.light.LightingProvider wrapperContained; public LightingProvider(net.minecraft.world.chunk.light.LightingProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.light.ChunkLightProvider skyLightProvider() { return new yarnwrap.world.chunk.light.ChunkLightProvider(wrapperContained.skyLightProvider); }
// public void skyLightProvider(yarnwrap.world.chunk.light.ChunkLightProvider value) { wrapperContained.skyLightProvider = value.wrapperContained; }
// public static yarnwrap.world.chunk.light.ChunkLightProvider skyLightProvider() { return new yarnwrap.world.chunk.light.ChunkLightProvider(net.minecraft.world.chunk.light.LightingProvider.skyLightProvider); }
// public static void skyLightProvider(yarnwrap.world.chunk.light.ChunkLightProvider value, ) { net.minecraft.world.chunk.light.LightingProvider.skyLightProvider = value.wrapperContained; }

// public yarnwrap.world.chunk.light.ChunkLightProvider blockLightProvider() { return new yarnwrap.world.chunk.light.ChunkLightProvider(wrapperContained.blockLightProvider); }
// public void blockLightProvider(yarnwrap.world.chunk.light.ChunkLightProvider value) { wrapperContained.blockLightProvider = value.wrapperContained; }
// public static yarnwrap.world.chunk.light.ChunkLightProvider blockLightProvider() { return new yarnwrap.world.chunk.light.ChunkLightProvider(net.minecraft.world.chunk.light.LightingProvider.blockLightProvider); }
// public static void blockLightProvider(yarnwrap.world.chunk.light.ChunkLightProvider value, ) { net.minecraft.world.chunk.light.LightingProvider.blockLightProvider = value.wrapperContained; }

// public yarnwrap.world.HeightLimitView world() { return new yarnwrap.world.HeightLimitView(wrapperContained.world); }
// public void world(yarnwrap.world.HeightLimitView value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.HeightLimitView world() { return new yarnwrap.world.HeightLimitView(net.minecraft.world.chunk.light.LightingProvider.world); }
// public static void world(yarnwrap.world.HeightLimitView value, ) { net.minecraft.world.chunk.light.LightingProvider.world = value.wrapperContained; }

// public yarnwrap.world.chunk.light.LightingProvider DEFAULT() { return new yarnwrap.world.chunk.light.LightingProvider(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.world.chunk.light.LightingProvider value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.world.chunk.light.LightingProvider DEFAULT() { return new yarnwrap.world.chunk.light.LightingProvider(net.minecraft.world.chunk.light.LightingProvider.DEFAULT); }
// public static void DEFAULT(yarnwrap.world.chunk.light.LightingProvider value, ) { net.minecraft.world.chunk.light.LightingProvider.DEFAULT = value.wrapperContained; }

public LightingProvider(yarnwrap.world.chunk.ChunkProvider chunkProvider,boolean hasBlockLight,boolean hasSkyLight) { this.wrapperContained = new net.minecraft.world.chunk.light.LightingProvider(chunkProvider.wrapperContained,hasBlockLight,hasSkyLight); }
public void enqueueSectionData(yarnwrap.world.LightType lightType,yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.world.chunk.ChunkNibbleArray nibbles) { wrapperContained.enqueueSectionData(lightType.wrapperContained,pos.wrapperContained,nibbles.wrapperContained); }
// public static void enqueueSectionData(yarnwrap.world.LightType lightType,yarnwrap.util.math.ChunkSectionPos pos,yarnwrap.world.chunk.ChunkNibbleArray nibbles, ) { net.minecraft.world.chunk.light.LightingProvider.enqueueSectionData(lightType.wrapperContained,pos.wrapperContained,nibbles.wrapperContained); }
public yarnwrap.world.chunk.light.ChunkLightingView get(yarnwrap.world.LightType lightType) { return new yarnwrap.world.chunk.light.ChunkLightingView(wrapperContained.get(lightType.wrapperContained)); }
// public static yarnwrap.world.chunk.light.ChunkLightingView get(yarnwrap.world.LightType lightType, ) { return new yarnwrap.world.chunk.light.ChunkLightingView(net.minecraft.world.chunk.light.LightingProvider.get(lightType.wrapperContained)); }
public void setRetainData(yarnwrap.util.math.ChunkPos pos,boolean retainData) { wrapperContained.setRetainData(pos.wrapperContained,retainData); }
// public static void setRetainData(yarnwrap.util.math.ChunkPos pos,boolean retainData, ) { net.minecraft.world.chunk.light.LightingProvider.setRetainData(pos.wrapperContained,retainData); }
public int getLight(yarnwrap.util.math.BlockPos pos,int ambientDarkness) { return wrapperContained.getLight(pos.wrapperContained,ambientDarkness); }
// public static int getLight(yarnwrap.util.math.BlockPos pos,int ambientDarkness, ) { return net.minecraft.world.chunk.light.LightingProvider.getLight(pos.wrapperContained,ambientDarkness); }
public java.lang.String displaySectionLevel(yarnwrap.world.LightType lightType,yarnwrap.util.math.ChunkSectionPos pos) { return wrapperContained.displaySectionLevel(lightType.wrapperContained,pos.wrapperContained); }
// public static java.lang.String displaySectionLevel(yarnwrap.world.LightType lightType,yarnwrap.util.math.ChunkSectionPos pos, ) { return net.minecraft.world.chunk.light.LightingProvider.displaySectionLevel(lightType.wrapperContained,pos.wrapperContained); }
public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.world.chunk.light.LightingProvider.getHeight(); }
public int getBottomY() { return wrapperContained.getBottomY(); }
// public static int getBottomY() { return net.minecraft.world.chunk.light.LightingProvider.getBottomY(); }
public int getTopY() { return wrapperContained.getTopY(); }
// public static int getTopY() { return net.minecraft.world.chunk.light.LightingProvider.getTopY(); }
public Object getStatus(yarnwrap.world.LightType lightType,yarnwrap.util.math.ChunkSectionPos pos) { return wrapperContained.getStatus(lightType.wrapperContained,pos.wrapperContained); }
// public static Object getStatus(yarnwrap.world.LightType lightType,yarnwrap.util.math.ChunkSectionPos pos, ) { return net.minecraft.world.chunk.light.LightingProvider.getStatus(lightType.wrapperContained,pos.wrapperContained); }
public boolean isLightingEnabled(long sectionPos) { return wrapperContained.isLightingEnabled(sectionPos); }
// public static boolean isLightingEnabled(long sectionPos, ) { return net.minecraft.world.chunk.light.LightingProvider.isLightingEnabled(sectionPos); }

}