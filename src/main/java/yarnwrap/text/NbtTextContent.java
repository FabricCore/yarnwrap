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
// public NbtTextContent(java.lang.String rawPath,Object path,boolean interpret,java.util.Optional separator,yarnwrap.text.NbtDataSource dataSource) { this.wrapperContained = new net.minecraft.text.NbtTextContent(rawPath,path,interpret,separator,dataSource.wrapperContained); }
public NbtTextContent(java.lang.String rawPath,boolean interpret,java.util.Optional separator,yarnwrap.text.NbtDataSource dataSource) { this.wrapperContained = new net.minecraft.text.NbtTextContent(rawPath,interpret,separator,dataSource.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public java.util.stream.Stream method_10917(yarnwrap.server.command.ServerCommandSource text) { return wrapperContained.method_10917(text.wrapperContained); }
// public java.util.stream.Stream method_10918(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.method_10918(nbt.wrapperContained); }
// public Object parsePath(java.lang.String rawPath) { return wrapperContained.parsePath(rawPath); }
public java.lang.String getPath() { return wrapperContained.getPath(); }
public boolean shouldInterpret() { return wrapperContained.shouldInterpret(); }
// public yarnwrap.text.MutableText method_15880(yarnwrap.text.Text accumulator,yarnwrap.text.MutableText current) { return new yarnwrap.text.MutableText(wrapperContained.method_15880(accumulator.wrapperContained,current.wrapperContained)); }
// public yarnwrap.text.MutableText method_36334(java.util.stream.Stream text) { return new yarnwrap.text.MutableText(wrapperContained.method_36334(text)); }
// public yarnwrap.text.MutableText method_36335(yarnwrap.text.MutableText accumulator,yarnwrap.text.MutableText current) { return new yarnwrap.text.MutableText(wrapperContained.method_36335(accumulator.wrapperContained,current.wrapperContained)); }
public java.util.Optional getSeparator() { return wrapperContained.getSeparator(); }
public yarnwrap.text.NbtDataSource getDataSource() { return new yarnwrap.text.NbtDataSource(wrapperContained.getDataSource()); }
// public com.mojang.datafixers.kinds.App method_54230(Object instance) { return wrapperContained.method_54230(instance); }

}