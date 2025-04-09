package yarnwrap.client.gui.hud;
public class DebugHud { public net.minecraft.client.gui.hud.DebugHud wrapperContained; public DebugHud(net.minecraft.client.gui.hud.DebugHud wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map HEIGHT_MAP_TYPES() { return wrapperContained.HEIGHT_MAP_TYPES; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public java.util.concurrent.CompletableFuture chunkFuture() { return wrapperContained.chunkFuture; }
// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public yarnwrap.util.hit.HitResult blockHit() { return new yarnwrap.util.hit.HitResult(wrapperContained.blockHit); }
// public yarnwrap.util.hit.HitResult fluidHit() { return new yarnwrap.util.hit.HitResult(wrapperContained.fluidHit); }
// public yarnwrap.world.chunk.WorldChunk chunk() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.chunk); }
// public yarnwrap.util.math.ChunkPos pos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.pos); }
// public int TEXT_COLOR() { return wrapperContained.TEXT_COLOR; }
// public Object allocationRateCalculator() { return wrapperContained.allocationRateCalculator; }
// public yarnwrap.client.gui.hud.debug.RenderingChart renderingChart() { return new yarnwrap.client.gui.hud.debug.RenderingChart(wrapperContained.renderingChart); }
// public yarnwrap.client.gui.hud.debug.PingChart pingChart() { return new yarnwrap.client.gui.hud.debug.PingChart(wrapperContained.pingChart); }
// public yarnwrap.client.gui.hud.debug.PacketSizeChart packetSizeChart() { return new yarnwrap.client.gui.hud.debug.PacketSizeChart(wrapperContained.packetSizeChart); }
// public yarnwrap.client.gui.hud.debug.TickChart tickChart() { return new yarnwrap.client.gui.hud.debug.TickChart(wrapperContained.tickChart); }
// public boolean showDebugHud() { return wrapperContained.showDebugHud; }
// public boolean renderingChartVisible() { return wrapperContained.renderingChartVisible; }
// public boolean renderingAndTickChartsVisible() { return wrapperContained.renderingAndTickChartsVisible; }
// public boolean packetSizeAndPingChartsVisible() { return wrapperContained.packetSizeAndPingChartsVisible; }
// public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl frameNanosLog() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.frameNanosLog); }
// public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl tickNanosLog() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.tickNanosLog); }
// public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl pingLog() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.pingLog); }
// public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl packetSizeLog() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.packetSizeLog); }
// public java.util.Map receivedDebugSamples() { return wrapperContained.receivedDebugSamples; }
// public yarnwrap.world.chunk.WorldChunk getChunk() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getChunk()); }
// public java.util.List getLeftText() { return wrapperContained.getLeftText(); }
// public yarnwrap.world.chunk.WorldChunk getClientChunk() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getClientChunk()); }
// public long toMiB(long bytes) { return wrapperContained.toMiB(bytes); }
// public java.util.List getRightText() { return wrapperContained.getRightText(); }
// public yarnwrap.world.World getWorld() { return new yarnwrap.world.World(wrapperContained.getWorld()); }
public void resetChunk() { wrapperContained.resetChunk(); }
// public java.lang.String propertyToString(Object propEntry) { return wrapperContained.propertyToString(propEntry); }
public void render(yarnwrap.client.gui.DrawContext context) { wrapperContained.render(context.wrapperContained); }
// public void drawLeftText(yarnwrap.client.gui.DrawContext context) { wrapperContained.drawLeftText(context.wrapperContained); }
// public void drawRightText(yarnwrap.client.gui.DrawContext context) { wrapperContained.drawRightText(context.wrapperContained); }
// public yarnwrap.server.world.ServerWorld getServerWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getServerWorld()); }
// public java.lang.String getServerWorldDebugString() { return wrapperContained.getServerWorldDebugString(); }
// public java.lang.String getBiomeString(yarnwrap.registry.entry.RegistryEntry biome) { return wrapperContained.getBiomeString(biome.wrapperContained); }
// public void drawText(yarnwrap.client.gui.DrawContext context,java.util.List text,boolean left) { wrapperContained.drawText(context.wrapperContained,text,left); }
public void pushToFrameLog(long value) { wrapperContained.pushToFrameLog(value); }
public boolean shouldShowDebugHud() { return wrapperContained.shouldShowDebugHud(); }
public boolean shouldShowRenderingChart() { return wrapperContained.shouldShowRenderingChart(); }
public boolean shouldShowPacketSizeAndPingCharts() { return wrapperContained.shouldShowPacketSizeAndPingCharts(); }
public void toggleDebugHud() { wrapperContained.toggleDebugHud(); }
public void togglePacketSizeAndPingCharts() { wrapperContained.togglePacketSizeAndPingCharts(); }
public void toggleRenderingAndTickCharts() { wrapperContained.toggleRenderingAndTickCharts(); }
public void toggleRenderingChart() { wrapperContained.toggleRenderingChart(); }
public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl getPingLog() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.getPingLog()); }
public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl getPacketSizeLog() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.getPacketSizeLog()); }
public void clear() { wrapperContained.clear(); }
public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl getTickNanosLog() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.getTickNanosLog()); }
// public void set(long values,net.minecraft.util.profiler.log.DebugSampleType[] type) { wrapperContained.set(values,type); }
public boolean shouldRenderTickCharts() { return wrapperContained.shouldRenderTickCharts(); }

}