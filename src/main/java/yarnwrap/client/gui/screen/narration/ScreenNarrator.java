package yarnwrap.client.gui.screen.narration;
public class ScreenNarrator { public net.minecraft.client.gui.screen.narration.ScreenNarrator wrapperContained; public ScreenNarrator(net.minecraft.client.gui.screen.narration.ScreenNarrator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int currentMessageIndex() { return wrapperContained.currentMessageIndex; }
// public void currentMessageIndex(int value) { wrapperContained.currentMessageIndex = value; }
// public java.util.Map narrations() { return wrapperContained.narrations; }
// public void narrations(java.util.Map value) { wrapperContained.narrations = value; }
// public java.lang.Integer method_37043(Object partIndex) { return wrapperContained.method_37043(partIndex); }
public void buildNarrations(java.util.function.Consumer builderConsumer) { wrapperContained.buildNarrations(builderConsumer); }
public java.lang.String buildNarratorText(boolean includeUnchanged) { return wrapperContained.buildNarratorText(includeUnchanged); }
// public void method_37046(boolean partIndex,java.util.function.Consumer message) { wrapperContained.method_37046(partIndex,message); }
// public yarnwrap.client.gui.screen.narration.NarrationPart method_37047(Object partIndex) { return new yarnwrap.client.gui.screen.narration.NarrationPart(wrapperContained.method_37047(partIndex)); }

}