package yarnwrap.client.gui;
public class Narratable { public net.minecraft.client.gui.Narratable wrapperContained; public Narratable(net.minecraft.client.gui.Narratable wrapperContained) { this.wrapperContained = wrapperContained; }

public void appendNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder) { wrapperContained.appendNarrations(builder.wrapperContained); }
// public static void appendNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder, ) { net.minecraft.client.gui.Narratable.appendNarrations(builder.wrapperContained); }

}