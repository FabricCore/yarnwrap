package yarnwrap.text;
public class NbtDataSource { public net.minecraft.text.NbtDataSource wrapperContained; public NbtDataSource(net.minecraft.text.NbtDataSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.util.stream.Stream get(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.get(source.wrapperContained); }
public Object getType() { return wrapperContained.getType(); }

}