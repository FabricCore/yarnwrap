package yarnwrap.client.gui.hud;
public class SubtitlesHud { public net.minecraft.client.gui.hud.SubtitlesHud wrapperContained; public SubtitlesHud(net.minecraft.client.gui.hud.SubtitlesHud wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.gui.hud.SubtitlesHud.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.gui.hud.SubtitlesHud.client = value.wrapperContained; }

// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
// public static java.util.List entries() { return net.minecraft.client.gui.hud.SubtitlesHud.entries; }
// public static void entries(java.util.List value, ) { net.minecraft.client.gui.hud.SubtitlesHud.entries = value; }

// public boolean enabled() { return wrapperContained.enabled; }
// public void enabled(boolean value) { wrapperContained.enabled = value; }
// public static boolean enabled() { return net.minecraft.client.gui.hud.SubtitlesHud.enabled; }
// public static void enabled(boolean value, ) { net.minecraft.client.gui.hud.SubtitlesHud.enabled = value; }

// public long REMOVE_DELAY() { return wrapperContained.REMOVE_DELAY; }
// public void REMOVE_DELAY(long value) { wrapperContained.REMOVE_DELAY = value; }
// public static long REMOVE_DELAY() { return net.minecraft.client.gui.hud.SubtitlesHud.REMOVE_DELAY; }
// public static void REMOVE_DELAY(long value, ) { net.minecraft.client.gui.hud.SubtitlesHud.REMOVE_DELAY = value; }

// public java.util.List audibleEntries() { return wrapperContained.audibleEntries; }
// public void audibleEntries(java.util.List value) { wrapperContained.audibleEntries = value; }
// public static java.util.List audibleEntries() { return net.minecraft.client.gui.hud.SubtitlesHud.audibleEntries; }
// public static void audibleEntries(java.util.List value, ) { net.minecraft.client.gui.hud.SubtitlesHud.audibleEntries = value; }

public SubtitlesHud(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.gui.hud.SubtitlesHud(client.wrapperContained); }
public void render(yarnwrap.client.gui.DrawContext context) { wrapperContained.render(context.wrapperContained); }
// public static void render(yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.gui.hud.SubtitlesHud.render(context.wrapperContained); }

}