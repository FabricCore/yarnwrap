package yarnwrap.text;
public class PlainTextContent { public net.minecraft.text.PlainTextContent wrapperContained; public PlainTextContent(net.minecraft.text.PlainTextContent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object TYPE() { return wrapperContained.TYPE; }
public yarnwrap.text.PlainTextContent EMPTY() { return new yarnwrap.text.PlainTextContent(wrapperContained.EMPTY); }
public java.lang.String string() { return wrapperContained.string(); }
// public yarnwrap.text.PlainTextContent of(java.lang.String string) { return new yarnwrap.text.PlainTextContent(wrapperContained.of(string)); }

}