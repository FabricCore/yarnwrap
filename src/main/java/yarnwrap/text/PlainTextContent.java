package yarnwrap.text;
public class PlainTextContent { public net.minecraft.text.PlainTextContent wrapperContained; public PlainTextContent(net.minecraft.text.PlainTextContent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object TYPE() { return wrapperContained.TYPE; }
// // public void TYPE(Object value) { wrapperContained.TYPE = value; }
public yarnwrap.text.PlainTextContent EMPTY() { return new yarnwrap.text.PlainTextContent(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.text.PlainTextContent value) { wrapperContained.EMPTY = value.wrapperContained; }
public java.lang.String string() { return wrapperContained.string(); }
// public yarnwrap.text.PlainTextContent of(java.lang.String string) { return new yarnwrap.text.PlainTextContent(wrapperContained.of(string)); }

}