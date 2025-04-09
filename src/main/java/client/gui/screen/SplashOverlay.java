package yarnwrap.client.gui.screen;
public class SplashOverlay { public net.minecraft.client.gui.screen.SplashOverlay wrapperContained; public SplashOverlay(net.minecraft.client.gui.screen.SplashOverlay wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.ResourceReload reload() { return new yarnwrap.resource.ResourceReload(wrapperContained.reload); }
// public float progress() { return wrapperContained.progress; }
// public long reloadCompleteTime() { return wrapperContained.reloadCompleteTime; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public java.util.function.Consumer exceptionHandler() { return wrapperContained.exceptionHandler; }
// public boolean reloading() { return wrapperContained.reloading; }
// public long reloadStartTime() { return wrapperContained.reloadStartTime; }
// public yarnwrap.util.Identifier LOGO() { return new yarnwrap.util.Identifier(wrapperContained.LOGO); }
// public java.util.function.IntSupplier BRAND_ARGB() { return wrapperContained.BRAND_ARGB; }
public long RELOAD_COMPLETE_FADE_DURATION() { return wrapperContained.RELOAD_COMPLETE_FADE_DURATION; }
public long RELOAD_START_FADE_DURATION() { return wrapperContained.RELOAD_START_FADE_DURATION; }
// public int MOJANG_RED() { return wrapperContained.MOJANG_RED; }
// public int MONOCHROME_BLACK() { return wrapperContained.MONOCHROME_BLACK; }
// public float LOGO_RIGHT_HALF_V() { return wrapperContained.LOGO_RIGHT_HALF_V; }
// public float LOGO_OVERLAP() { return wrapperContained.LOGO_OVERLAP; }
// public float PROGRESS_LERP_DELTA() { return wrapperContained.PROGRESS_LERP_DELTA; }
// public void renderProgressBar(yarnwrap.client.gui.DrawContext minX,int minY,int maxX,int maxY,int opacity) { wrapperContained.renderProgressBar(minX.wrapperContained,minY,maxX,maxY,opacity); }
public void init(yarnwrap.client.MinecraftClient client) { wrapperContained.init(client.wrapperContained); }
// public int withAlpha(int color,int alpha) { return wrapperContained.withAlpha(color,alpha); }

}