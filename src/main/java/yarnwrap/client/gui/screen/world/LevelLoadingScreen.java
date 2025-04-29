package yarnwrap.client.gui.screen.world;
public class LevelLoadingScreen { public net.minecraft.client.gui.screen.world.LevelLoadingScreen wrapperContained; public LevelLoadingScreen(net.minecraft.client.gui.screen.world.LevelLoadingScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.WorldGenerationProgressTracker progressProvider() { return new yarnwrap.server.WorldGenerationProgressTracker(wrapperContained.progressProvider); }
// public void progressProvider(yarnwrap.server.WorldGenerationProgressTracker value) { wrapperContained.progressProvider = value.wrapperContained; }
// public static yarnwrap.server.WorldGenerationProgressTracker progressProvider() { return new yarnwrap.server.WorldGenerationProgressTracker(net.minecraft.client.gui.screen.world.LevelLoadingScreen.progressProvider); }
// public static void progressProvider(yarnwrap.server.WorldGenerationProgressTracker value, ) { net.minecraft.client.gui.screen.world.LevelLoadingScreen.progressProvider = value.wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2IntMap STATUS_TO_COLOR() { return wrapperContained.STATUS_TO_COLOR; }
// public void STATUS_TO_COLOR(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.STATUS_TO_COLOR = value; }
// public static it.unimi.dsi.fastutil.objects.Object2IntMap STATUS_TO_COLOR() { return net.minecraft.client.gui.screen.world.LevelLoadingScreen.STATUS_TO_COLOR; }
// public static void STATUS_TO_COLOR(it.unimi.dsi.fastutil.objects.Object2IntMap value, ) { net.minecraft.client.gui.screen.world.LevelLoadingScreen.STATUS_TO_COLOR = value; }

// public long lastNarrationTime() { return wrapperContained.lastNarrationTime; }
// public void lastNarrationTime(long value) { wrapperContained.lastNarrationTime = value; }
// public static long lastNarrationTime() { return net.minecraft.client.gui.screen.world.LevelLoadingScreen.lastNarrationTime; }
// public static void lastNarrationTime(long value, ) { net.minecraft.client.gui.screen.world.LevelLoadingScreen.lastNarrationTime = value; }

// public long NARRATION_DELAY() { return wrapperContained.NARRATION_DELAY; }
// public void NARRATION_DELAY(long value) { wrapperContained.NARRATION_DELAY = value; }
// public static long NARRATION_DELAY() { return net.minecraft.client.gui.screen.world.LevelLoadingScreen.NARRATION_DELAY; }
// public static void NARRATION_DELAY(long value, ) { net.minecraft.client.gui.screen.world.LevelLoadingScreen.NARRATION_DELAY = value; }

// public boolean done() { return wrapperContained.done; }
// public void done(boolean value) { wrapperContained.done = value; }
// public static boolean done() { return net.minecraft.client.gui.screen.world.LevelLoadingScreen.done; }
// public static void done(boolean value, ) { net.minecraft.client.gui.screen.world.LevelLoadingScreen.done = value; }

public LevelLoadingScreen(yarnwrap.server.WorldGenerationProgressTracker progressProvider) { this.wrapperContained = new net.minecraft.client.gui.screen.world.LevelLoadingScreen(progressProvider.wrapperContained); }
// public void method_17537(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap map) { wrapperContained.method_17537(map); }
// public static void method_17537(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap map, ) { net.minecraft.client.gui.screen.world.LevelLoadingScreen.method_17537(map); }
// public void drawChunkMap(yarnwrap.client.gui.DrawContext context,yarnwrap.server.WorldGenerationProgressTracker progressProvider,int centerX,int centerY,int pixelSize,int pixelMargin) { wrapperContained.drawChunkMap(context.wrapperContained,progressProvider.wrapperContained,centerX,centerY,pixelSize,pixelMargin); }
// public static void drawChunkMap(yarnwrap.client.gui.DrawContext context,yarnwrap.server.WorldGenerationProgressTracker progressProvider,int centerX,int centerY,int pixelSize,int pixelMargin, ) { net.minecraft.client.gui.screen.world.LevelLoadingScreen.drawChunkMap(context.wrapperContained,progressProvider.wrapperContained,centerX,centerY,pixelSize,pixelMargin); }
// public yarnwrap.text.Text getPercentage() { return new yarnwrap.text.Text(wrapperContained.getPercentage()); }
// public static yarnwrap.text.Text getPercentage() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.world.LevelLoadingScreen.getPercentage()); }

}