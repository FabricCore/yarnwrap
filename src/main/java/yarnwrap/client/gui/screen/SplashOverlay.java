package yarnwrap.client.gui.screen;
public class SplashOverlay { public net.minecraft.client.gui.screen.SplashOverlay wrapperContained; public SplashOverlay(net.minecraft.client.gui.screen.SplashOverlay wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.ResourceReload reload() { return new yarnwrap.resource.ResourceReload(wrapperContained.reload); }
// public void reload(yarnwrap.resource.ResourceReload value) { wrapperContained.reload = value.wrapperContained; }
// public float progress() { return wrapperContained.progress; }
// public void progress(float value) { wrapperContained.progress = value; }
// public long reloadCompleteTime() { return wrapperContained.reloadCompleteTime; }
// public void reloadCompleteTime(long value) { wrapperContained.reloadCompleteTime = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.util.function.Consumer exceptionHandler() { return wrapperContained.exceptionHandler; }
// public void exceptionHandler(java.util.function.Consumer value) { wrapperContained.exceptionHandler = value; }
// public boolean reloading() { return wrapperContained.reloading; }
// public void reloading(boolean value) { wrapperContained.reloading = value; }
// public long reloadStartTime() { return wrapperContained.reloadStartTime; }
// public void reloadStartTime(long value) { wrapperContained.reloadStartTime = value; }
// public yarnwrap.util.Identifier LOGO() { return new yarnwrap.util.Identifier(wrapperContained.LOGO); }
// public void LOGO(yarnwrap.util.Identifier value) { wrapperContained.LOGO = value.wrapperContained; }
// public java.util.function.IntSupplier BRAND_ARGB() { return wrapperContained.BRAND_ARGB; }
// public void BRAND_ARGB(java.util.function.IntSupplier value) { wrapperContained.BRAND_ARGB = value; }
public long RELOAD_COMPLETE_FADE_DURATION() { return wrapperContained.RELOAD_COMPLETE_FADE_DURATION; }
// public void RELOAD_COMPLETE_FADE_DURATION(long value) { wrapperContained.RELOAD_COMPLETE_FADE_DURATION = value; }
public long RELOAD_START_FADE_DURATION() { return wrapperContained.RELOAD_START_FADE_DURATION; }
// public void RELOAD_START_FADE_DURATION(long value) { wrapperContained.RELOAD_START_FADE_DURATION = value; }
// public int MOJANG_RED() { return wrapperContained.MOJANG_RED; }
// public void MOJANG_RED(int value) { wrapperContained.MOJANG_RED = value; }
// public int MONOCHROME_BLACK() { return wrapperContained.MONOCHROME_BLACK; }
// public void MONOCHROME_BLACK(int value) { wrapperContained.MONOCHROME_BLACK = value; }
// public float LOGO_RIGHT_HALF_V() { return wrapperContained.LOGO_RIGHT_HALF_V; }
// public void LOGO_RIGHT_HALF_V(float value) { wrapperContained.LOGO_RIGHT_HALF_V = value; }
// public float LOGO_OVERLAP() { return wrapperContained.LOGO_OVERLAP; }
// public void LOGO_OVERLAP(float value) { wrapperContained.LOGO_OVERLAP = value; }
// public float PROGRESS_LERP_DELTA() { return wrapperContained.PROGRESS_LERP_DELTA; }
// public void PROGRESS_LERP_DELTA(float value) { wrapperContained.PROGRESS_LERP_DELTA = value; }
// public void renderProgressBar(yarnwrap.client.gui.DrawContext minX,int minY,int maxX,int maxY,int opacity) { wrapperContained.renderProgressBar(minX.wrapperContained,minY,maxX,maxY,opacity); }
public void init(yarnwrap.client.MinecraftClient client) { wrapperContained.init(client.wrapperContained); }
// public int withAlpha(int color,int alpha) { return wrapperContained.withAlpha(color,alpha); }

}