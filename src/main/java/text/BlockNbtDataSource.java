package yarnwrap.text;
public class BlockNbtDataSource { public net.minecraft.text.BlockNbtDataSource wrapperContained; public BlockNbtDataSource(net.minecraft.text.BlockNbtDataSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String rawPos() { return wrapperContained.rawPos; }
// public yarnwrap.command.argument.PosArgument pos() { return new yarnwrap.command.argument.PosArgument(wrapperContained.pos); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object TYPE() { return wrapperContained.TYPE; }
// public java.lang.String rawPos() { return wrapperContained.rawPos(); }
// public yarnwrap.command.argument.PosArgument pos() { return new yarnwrap.command.argument.PosArgument(wrapperContained.pos()); }
// public yarnwrap.command.argument.PosArgument parsePos(java.lang.String string) { return new yarnwrap.command.argument.PosArgument(wrapperContained.parsePos(string)); }

}