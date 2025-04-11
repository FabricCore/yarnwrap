package yarnwrap.text;
public class NbtTextContent { public net.minecraft.text.NbtTextContent wrapperContained; public NbtTextContent(net.minecraft.text.NbtTextContent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String rawPath() { return wrapperContained.rawPath; }
// public void rawPath(java.lang.String value) { wrapperContained.rawPath = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public boolean interpret() { return wrapperContained.interpret; }
// public void interpret(boolean value) { wrapperContained.interpret = value; }
// public Object path() { return wrapperContained.path; }
// // public void path(Object value) { wrapperContained.path = value; }
// public java.util.Optional separator() { return wrapperContained.separator; }
// public void separator(java.util.Optional value) { wrapperContained.separator = value; }
// public yarnwrap.text.NbtDataSource dataSource() { return new yarnwrap.text.NbtDataSource(wrapperContained.dataSource); }
// public void dataSource(yarnwrap.text.NbtDataSource value) { wrapperContained.dataSource = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object TYPE() { return wrapperContained.TYPE; }
// // public void TYPE(Object value) { wrapperContained.TYPE = value; }
// public Object parsePath(java.lang.String rawPath) { return wrapperContained.parsePath(rawPath); }
public java.lang.String getPath() { return wrapperContained.getPath(); }
public boolean shouldInterpret() { return wrapperContained.shouldInterpret(); }
public java.util.Optional getSeparator() { return wrapperContained.getSeparator(); }
public yarnwrap.text.NbtDataSource getDataSource() { return new yarnwrap.text.NbtDataSource(wrapperContained.getDataSource()); }

}