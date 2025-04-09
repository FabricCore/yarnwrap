package yarnwrap.client.util;
public class TextCollector { public net.minecraft.client.util.TextCollector wrapperContained; public TextCollector(net.minecraft.client.util.TextCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List texts() { return wrapperContained.texts; }
public yarnwrap.text.StringVisitable getRawCombined() { return new yarnwrap.text.StringVisitable(wrapperContained.getRawCombined()); }
public void add(yarnwrap.text.StringVisitable text) { wrapperContained.add(text.wrapperContained); }
public yarnwrap.text.StringVisitable getCombined() { return new yarnwrap.text.StringVisitable(wrapperContained.getCombined()); }
public void clear() { wrapperContained.clear(); }

}