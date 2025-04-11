package yarnwrap.text;
public class BlockNbtDataSource { public net.minecraft.text.BlockNbtDataSource wrapperContained; public BlockNbtDataSource(net.minecraft.text.BlockNbtDataSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String rawPos() { return wrapperContained.rawPos; }
// public void rawPos(java.lang.String value) { wrapperContained.rawPos = value; }
// public yarnwrap.command.argument.PosArgument pos() { return new yarnwrap.command.argument.PosArgument(wrapperContained.pos); }
// public void pos(yarnwrap.command.argument.PosArgument value) { wrapperContained.pos = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object TYPE() { return wrapperContained.TYPE; }
// // public void TYPE(Object value) { wrapperContained.TYPE = value; }
public BlockNbtDataSource(java.lang.String rawPath) { this.wrapperContained = new net.minecraft.text.BlockNbtDataSource(rawPath); }
// public BlockNbtDataSource(java.lang.String rawPath) { this.wrapperContained = new net.minecraft.text.BlockNbtDataSource(rawPath); }
// public java.lang.String rawPos() { return wrapperContained.rawPos(); }
// public yarnwrap.command.argument.PosArgument pos() { return new yarnwrap.command.argument.PosArgument(wrapperContained.pos()); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public yarnwrap.command.argument.PosArgument parsePos(java.lang.String string) { return new yarnwrap.command.argument.PosArgument(wrapperContained.parsePos(string)); }
// public com.mojang.datafixers.kinds.App method_54226(Object instance) { return wrapperContained.method_54226(instance); }

}