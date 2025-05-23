package yarnwrap.client.gui.screen.narration;
public class ScreenNarrator { public net.minecraft.client.gui.screen.narration.ScreenNarrator wrapperContained; public ScreenNarrator(net.minecraft.client.gui.screen.narration.ScreenNarrator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int currentMessageIndex() { return wrapperContained.currentMessageIndex; }
// public void currentMessageIndex(int value) { wrapperContained.currentMessageIndex = value; }
// public static int currentMessageIndex() { return net.minecraft.client.gui.screen.narration.ScreenNarrator.currentMessageIndex; }
// public static void currentMessageIndex(int value, ) { net.minecraft.client.gui.screen.narration.ScreenNarrator.currentMessageIndex = value; }

// public java.util.Map narrations() { return wrapperContained.narrations; }
// public void narrations(java.util.Map value) { wrapperContained.narrations = value; }
// public static java.util.Map narrations() { return net.minecraft.client.gui.screen.narration.ScreenNarrator.narrations; }
// public static void narrations(java.util.Map value, ) { net.minecraft.client.gui.screen.narration.ScreenNarrator.narrations = value; }

public void buildNarrations(java.util.function.Consumer builderConsumer) { wrapperContained.buildNarrations(builderConsumer); }
// public static void buildNarrations(java.util.function.Consumer builderConsumer, ) { net.minecraft.client.gui.screen.narration.ScreenNarrator.buildNarrations(builderConsumer); }
public java.lang.String buildNarratorText(boolean includeUnchanged) { return wrapperContained.buildNarratorText(includeUnchanged); }
// public static java.lang.String buildNarratorText(boolean includeUnchanged, ) { return net.minecraft.client.gui.screen.narration.ScreenNarrator.buildNarratorText(includeUnchanged); }
// public void method_37046(boolean partIndex,java.util.function.Consumer message) { wrapperContained.method_37046(partIndex,message); }
// public static void method_37046(boolean partIndex,java.util.function.Consumer message, ) { net.minecraft.client.gui.screen.narration.ScreenNarrator.method_37046(partIndex,message); }
// public java.lang.Integer method_68701(Object partIndex) { return wrapperContained.method_68701(partIndex); }
// public static java.lang.Integer method_68701(Object partIndex, ) { return net.minecraft.client.gui.screen.narration.ScreenNarrator.method_68701(partIndex); }
// public yarnwrap.client.gui.screen.narration.NarrationPart method_68702(Object partIndex) { return new yarnwrap.client.gui.screen.narration.NarrationPart(wrapperContained.method_68702(partIndex)); }
// public static yarnwrap.client.gui.screen.narration.NarrationPart method_68702(Object partIndex, ) { return new yarnwrap.client.gui.screen.narration.NarrationPart(net.minecraft.client.gui.screen.narration.ScreenNarrator.method_68702(partIndex)); }

}