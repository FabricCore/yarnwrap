package yarnwrap.client.gui.screen.world;
public class LevelLoadingScreen { public net.minecraft.client.gui.screen.world.LevelLoadingScreen wrapperContained; public LevelLoadingScreen(net.minecraft.client.gui.screen.world.LevelLoadingScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.WorldGenerationProgressTracker progressProvider() { return new yarnwrap.server.WorldGenerationProgressTracker(wrapperContained.progressProvider); }
// public it.unimi.dsi.fastutil.objects.Object2IntMap STATUS_TO_COLOR() { return wrapperContained.STATUS_TO_COLOR; }
// public long lastNarrationTime() { return wrapperContained.lastNarrationTime; }
// public long NARRATION_DELAY() { return wrapperContained.NARRATION_DELAY; }
// public boolean done() { return wrapperContained.done; }
public void drawChunkMap(yarnwrap.client.gui.DrawContext context,yarnwrap.server.WorldGenerationProgressTracker progressProvider,int centerX,int centerY,int pixelSize,int pixelMargin) { wrapperContained.drawChunkMap(context.wrapperContained,progressProvider.wrapperContained,centerX,centerY,pixelSize,pixelMargin); }
// public yarnwrap.text.Text getPercentage() { return new yarnwrap.text.Text(wrapperContained.getPercentage()); }

}