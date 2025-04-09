package yarnwrap.client.gui.screen.narration;
public class ScreenNarrator { public net.minecraft.client.gui.screen.narration.ScreenNarrator wrapperContained; public ScreenNarrator(net.minecraft.client.gui.screen.narration.ScreenNarrator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int currentMessageIndex() { return wrapperContained.currentMessageIndex; }
// public java.util.Map narrations() { return wrapperContained.narrations; }
public void buildNarrations(java.util.function.Consumer builderConsumer) { wrapperContained.buildNarrations(builderConsumer); }
public java.lang.String buildNarratorText(boolean includeUnchanged) { return wrapperContained.buildNarratorText(includeUnchanged); }

}