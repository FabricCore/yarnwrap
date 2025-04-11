package yarnwrap.client.gui.hud;
public class DebugHud { public net.minecraft.client.gui.hud.DebugHud wrapperContained; public DebugHud(net.minecraft.client.gui.hud.DebugHud wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map HEIGHT_MAP_TYPES() { return wrapperContained.HEIGHT_MAP_TYPES; }
// public void HEIGHT_MAP_TYPES(java.util.Map value) { wrapperContained.HEIGHT_MAP_TYPES = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.util.concurrent.CompletableFuture chunkFuture() { return wrapperContained.chunkFuture; }
// public void chunkFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.chunkFuture = value; }
// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public yarnwrap.util.hit.HitResult blockHit() { return new yarnwrap.util.hit.HitResult(wrapperContained.blockHit); }
// public void blockHit(yarnwrap.util.hit.HitResult value) { wrapperContained.blockHit = value.wrapperContained; }
// public yarnwrap.util.hit.HitResult fluidHit() { return new yarnwrap.util.hit.HitResult(wrapperContained.fluidHit); }
// public void fluidHit(yarnwrap.util.hit.HitResult value) { wrapperContained.fluidHit = value.wrapperContained; }
// public yarnwrap.world.chunk.WorldChunk chunk() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.chunk); }
// public void chunk(yarnwrap.world.chunk.WorldChunk value) { wrapperContained.chunk = value.wrapperContained; }
// public yarnwrap.util.math.ChunkPos pos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.ChunkPos value) { wrapperContained.pos = value.wrapperContained; }
// public int TEXT_COLOR() { return wrapperContained.TEXT_COLOR; }
// public void TEXT_COLOR(int value) { wrapperContained.TEXT_COLOR = value; }
// public Object allocationRateCalculator() { return wrapperContained.allocationRateCalculator; }
// // public void allocationRateCalculator(Object value) { wrapperContained.allocationRateCalculator = value; }
// public yarnwrap.client.gui.hud.debug.RenderingChart renderingChart() { return new yarnwrap.client.gui.hud.debug.RenderingChart(wrapperContained.renderingChart); }
// public void renderingChart(yarnwrap.client.gui.hud.debug.RenderingChart value) { wrapperContained.renderingChart = value.wrapperContained; }
// public yarnwrap.client.gui.hud.debug.PingChart pingChart() { return new yarnwrap.client.gui.hud.debug.PingChart(wrapperContained.pingChart); }
// public void pingChart(yarnwrap.client.gui.hud.debug.PingChart value) { wrapperContained.pingChart = value.wrapperContained; }
// public yarnwrap.client.gui.hud.debug.PacketSizeChart packetSizeChart() { return new yarnwrap.client.gui.hud.debug.PacketSizeChart(wrapperContained.packetSizeChart); }
// public void packetSizeChart(yarnwrap.client.gui.hud.debug.PacketSizeChart value) { wrapperContained.packetSizeChart = value.wrapperContained; }
// public yarnwrap.client.gui.hud.debug.TickChart tickChart() { return new yarnwrap.client.gui.hud.debug.TickChart(wrapperContained.tickChart); }
// public void tickChart(yarnwrap.client.gui.hud.debug.TickChart value) { wrapperContained.tickChart = value.wrapperContained; }
// public boolean showDebugHud() { return wrapperContained.showDebugHud; }
// public void showDebugHud(boolean value) { wrapperContained.showDebugHud = value; }
// public boolean renderingChartVisible() { return wrapperContained.renderingChartVisible; }
// public void renderingChartVisible(boolean value) { wrapperContained.renderingChartVisible = value; }
// public boolean renderingAndTickChartsVisible() { return wrapperContained.renderingAndTickChartsVisible; }
// public void renderingAndTickChartsVisible(boolean value) { wrapperContained.renderingAndTickChartsVisible = value; }
// public boolean packetSizeAndPingChartsVisible() { return wrapperContained.packetSizeAndPingChartsVisible; }
// public void packetSizeAndPingChartsVisible(boolean value) { wrapperContained.packetSizeAndPingChartsVisible = value; }
// public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl frameNanosLog() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.frameNanosLog); }
// public void frameNanosLog(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl value) { wrapperContained.frameNanosLog = value.wrapperContained; }
// public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl tickNanosLog() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.tickNanosLog); }
// public void tickNanosLog(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl value) { wrapperContained.tickNanosLog = value.wrapperContained; }
// public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl pingLog() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.pingLog); }
// public void pingLog(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl value) { wrapperContained.pingLog = value.wrapperContained; }
// public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl packetSizeLog() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.packetSizeLog); }
// public void packetSizeLog(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl value) { wrapperContained.packetSizeLog = value.wrapperContained; }
// public java.util.Map receivedDebugSamples() { return wrapperContained.receivedDebugSamples; }
// public void receivedDebugSamples(java.util.Map value) { wrapperContained.receivedDebugSamples = value; }
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