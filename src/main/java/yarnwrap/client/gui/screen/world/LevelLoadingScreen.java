package yarnwrap.client.gui.screen.world;
public class LevelLoadingScreen { public net.minecraft.client.gui.screen.world.LevelLoadingScreen wrapperContained; public LevelLoadingScreen(net.minecraft.client.gui.screen.world.LevelLoadingScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.WorldGenerationProgressTracker progressProvider() { return new yarnwrap.server.WorldGenerationProgressTracker(wrapperContained.progressProvider); }
// public void progressProvider(yarnwrap.server.WorldGenerationProgressTracker value) { wrapperContained.progressProvider = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap STATUS_TO_COLOR() { return wrapperContained.STATUS_TO_COLOR; }
// public void STATUS_TO_COLOR(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.STATUS_TO_COLOR = value; }
// public long lastNarrationTime() { return wrapperContained.lastNarrationTime; }
// public void lastNarrationTime(long value) { wrapperContained.lastNarrationTime = value; }
// public long NARRATION_DELAY() { return wrapperContained.NARRATION_DELAY; }
// public void NARRATION_DELAY(long value) { wrapperContained.NARRATION_DELAY = value; }
// public boolean done() { return wrapperContained.done; }
// public void done(boolean value) { wrapperContained.done = value; }
public LevelLoadingScreen(yarnwrap.server.WorldGenerationProgressTracker progressProvider) { this.wrapperContained = new net.minecraft.client.gui.screen.world.LevelLoadingScreen(progressProvider.wrapperContained); }
// public void method_17537(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap map) { wrapperContained.method_17537(map); }
public void drawChunkMap(yarnwrap.client.gui.DrawContext context,yarnwrap.server.WorldGenerationProgressTracker progressProvider,int centerX,int centerY,int pixelSize,int pixelMargin) { wrapperContained.drawChunkMap(context.wrapperContained,progressProvider.wrapperContained,centerX,centerY,pixelSize,pixelMargin); }
// public yarnwrap.text.Text getPercentage() { return new yarnwrap.text.Text(wrapperContained.getPercentage()); }

}