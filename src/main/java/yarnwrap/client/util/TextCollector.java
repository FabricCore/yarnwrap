package yarnwrap.client.util;
public class TextCollector { public net.minecraft.client.util.TextCollector wrapperContained; public TextCollector(net.minecraft.client.util.TextCollector wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List texts() { return wrapperContained.texts; }
// public void texts(java.util.List value) { wrapperContained.texts = value; }
// public static java.util.List texts() { return net.minecraft.client.util.TextCollector.texts; }
// public static void texts(java.util.List value, ) { net.minecraft.client.util.TextCollector.texts = value; }

public yarnwrap.text.StringVisitable getRawCombined() { return new yarnwrap.text.StringVisitable(wrapperContained.getRawCombined()); }
// public static yarnwrap.text.StringVisitable getRawCombined() { return new yarnwrap.text.StringVisitable(net.minecraft.client.util.TextCollector.getRawCombined()); }
public void add(yarnwrap.text.StringVisitable text) { wrapperContained.add(text.wrapperContained); }
// public static void add(yarnwrap.text.StringVisitable text, ) { net.minecraft.client.util.TextCollector.add(text.wrapperContained); }
public yarnwrap.text.StringVisitable getCombined() { return new yarnwrap.text.StringVisitable(wrapperContained.getCombined()); }
// public static yarnwrap.text.StringVisitable getCombined() { return new yarnwrap.text.StringVisitable(net.minecraft.client.util.TextCollector.getCombined()); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.util.TextCollector.clear(); }

}