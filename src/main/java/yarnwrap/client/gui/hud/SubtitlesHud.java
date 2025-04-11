package yarnwrap.client.gui.hud;
public class SubtitlesHud { public net.minecraft.client.gui.hud.SubtitlesHud wrapperContained; public SubtitlesHud(net.minecraft.client.gui.hud.SubtitlesHud wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
// public boolean enabled() { return wrapperContained.enabled; }
// public void enabled(boolean value) { wrapperContained.enabled = value; }
// public long REMOVE_DELAY() { return wrapperContained.REMOVE_DELAY; }
// public void REMOVE_DELAY(long value) { wrapperContained.REMOVE_DELAY = value; }
// public java.util.List audibleEntries() { return wrapperContained.audibleEntries; }
// public void audibleEntries(java.util.List value) { wrapperContained.audibleEntries = value; }
public void render(yarnwrap.client.gui.DrawContext context) { wrapperContained.render(context.wrapperContained); }

}