package yarnwrap.server.filter;
public class TextStream { public net.minecraft.server.filter.TextStream wrapperContained; public TextStream(net.minecraft.server.filter.TextStream wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.server.filter.TextStream UNFILTERED() { return new yarnwrap.server.filter.TextStream(wrapperContained.UNFILTERED); }
// public void UNFILTERED(yarnwrap.server.filter.TextStream value) { wrapperContained.UNFILTERED = value.wrapperContained; }
public void onConnect() { wrapperContained.onConnect(); }
public java.util.concurrent.CompletableFuture filterText(java.lang.String text) { return wrapperContained.filterText(text); }
public java.util.concurrent.CompletableFuture filterTexts(java.util.List texts) { return wrapperContained.filterTexts(texts); }
public void onDisconnect() { wrapperContained.onDisconnect(); }

}