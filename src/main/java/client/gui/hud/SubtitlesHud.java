package yarnwrap.client.gui.hud;
public class SubtitlesHud { public net.minecraft.client.gui.hud.SubtitlesHud wrapperContained; public SubtitlesHud(net.minecraft.client.gui.hud.SubtitlesHud wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public java.util.List entries() { return wrapperContained.entries; }
// public boolean enabled() { return wrapperContained.enabled; }
// public long REMOVE_DELAY() { return wrapperContained.REMOVE_DELAY; }
// public java.util.List audibleEntries() { return wrapperContained.audibleEntries; }
public void render(yarnwrap.client.gui.DrawContext context) { wrapperContained.render(context.wrapperContained); }

}