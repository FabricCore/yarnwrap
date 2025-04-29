package yarnwrap.command.argument.serialize;
public class ArgumentSerializer { public net.minecraft.command.argument.serialize.ArgumentSerializer wrapperContained; public ArgumentSerializer(net.minecraft.command.argument.serialize.ArgumentSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

public Object fromPacket(yarnwrap.network.PacketByteBuf buf) { return wrapperContained.fromPacket(buf.wrapperContained); }
// public static Object fromPacket(yarnwrap.network.PacketByteBuf buf, ) { return net.minecraft.command.argument.serialize.ArgumentSerializer.fromPacket(buf.wrapperContained); }
// public void writeJson(Object properties,com.google.gson.JsonObject json) { wrapperContained.writeJson(properties,json); }
// public static void writeJson(Object properties,com.google.gson.JsonObject json, ) { net.minecraft.command.argument.serialize.ArgumentSerializer.writeJson(properties,json); }
// public void writePacket(Object properties,yarnwrap.network.PacketByteBuf buf) { wrapperContained.writePacket(properties,buf.wrapperContained); }
// public static void writePacket(Object properties,yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.command.argument.serialize.ArgumentSerializer.writePacket(properties,buf.wrapperContained); }
public Object getArgumentTypeProperties(com.mojang.brigadier.arguments.ArgumentType argumentType) { return wrapperContained.getArgumentTypeProperties(argumentType); }
// public static Object getArgumentTypeProperties(com.mojang.brigadier.arguments.ArgumentType argumentType, ) { return net.minecraft.command.argument.serialize.ArgumentSerializer.getArgumentTypeProperties(argumentType); }

}