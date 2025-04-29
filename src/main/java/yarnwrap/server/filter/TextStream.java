package yarnwrap.server.filter;
public class TextStream { public net.minecraft.server.filter.TextStream wrapperContained; public TextStream(net.minecraft.server.filter.TextStream wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.filter.TextStream UNFILTERED() { return new yarnwrap.server.filter.TextStream(wrapperContained.UNFILTERED); }
// public void UNFILTERED(yarnwrap.server.filter.TextStream value) { wrapperContained.UNFILTERED = value.wrapperContained; }
public static yarnwrap.server.filter.TextStream UNFILTERED() { return new yarnwrap.server.filter.TextStream(net.minecraft.server.filter.TextStream.UNFILTERED); }
// public static void UNFILTERED(yarnwrap.server.filter.TextStream value, ) { net.minecraft.server.filter.TextStream.UNFILTERED = value.wrapperContained; }

public void onConnect() { wrapperContained.onConnect(); }
// public static void onConnect() { net.minecraft.server.filter.TextStream.onConnect(); }
public java.util.concurrent.CompletableFuture filterText(java.lang.String text) { return wrapperContained.filterText(text); }
// public static java.util.concurrent.CompletableFuture filterText(java.lang.String text, ) { return net.minecraft.server.filter.TextStream.filterText(text); }
public java.util.concurrent.CompletableFuture filterTexts(java.util.List texts) { return wrapperContained.filterTexts(texts); }
// public static java.util.concurrent.CompletableFuture filterTexts(java.util.List texts, ) { return net.minecraft.server.filter.TextStream.filterTexts(texts); }
public void onDisconnect() { wrapperContained.onDisconnect(); }
// public static void onDisconnect() { net.minecraft.server.filter.TextStream.onDisconnect(); }

}