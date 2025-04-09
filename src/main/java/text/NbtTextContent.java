package yarnwrap.text;
public class NbtTextContent { public net.minecraft.text.NbtTextContent wrapperContained; public NbtTextContent(net.minecraft.text.NbtTextContent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String rawPath() { return wrapperContained.rawPath; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public boolean interpret() { return wrapperContained.interpret; }
// public Object path() { return wrapperContained.path; }
// public java.util.Optional separator() { return wrapperContained.separator; }
// public yarnwrap.text.NbtDataSource dataSource() { return new yarnwrap.text.NbtDataSource(wrapperContained.dataSource); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object TYPE() { return wrapperContained.TYPE; }
// public Object parsePath(java.lang.String rawPath) { return wrapperContained.parsePath(rawPath); }
public java.lang.String getPath() { return wrapperContained.getPath(); }
public boolean shouldInterpret() { return wrapperContained.shouldInterpret(); }
public java.util.Optional getSeparator() { return wrapperContained.getSeparator(); }
public yarnwrap.text.NbtDataSource getDataSource() { return new yarnwrap.text.NbtDataSource(wrapperContained.getDataSource()); }

}