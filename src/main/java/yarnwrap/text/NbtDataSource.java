package yarnwrap.text;
public class NbtDataSource { public net.minecraft.text.NbtDataSource wrapperContained; public NbtDataSource(net.minecraft.text.NbtDataSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.text.NbtDataSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.text.NbtDataSource.CODEC = value; }

// public java.util.stream.Stream get(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.get(source.wrapperContained); }
// public static java.util.stream.Stream get(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.text.NbtDataSource.get(source.wrapperContained); }
public Object getType() { return wrapperContained.getType(); }
// public static Object getType() { return net.minecraft.text.NbtDataSource.getType(); }

}