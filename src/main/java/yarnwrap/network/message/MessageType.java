package yarnwrap.network.message;
public class MessageType { public net.minecraft.network.message.MessageType wrapperContained; public MessageType(net.minecraft.network.message.MessageType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.network.message.MessageType.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.network.message.MessageType.CODEC = value; }

// public yarnwrap.text.Decoration CHAT_TEXT_DECORATION() { return new yarnwrap.text.Decoration(wrapperContained.CHAT_TEXT_DECORATION); }
// public void CHAT_TEXT_DECORATION(yarnwrap.text.Decoration value) { wrapperContained.CHAT_TEXT_DECORATION = value.wrapperContained; }
public static yarnwrap.text.Decoration CHAT_TEXT_DECORATION() { return new yarnwrap.text.Decoration(net.minecraft.network.message.MessageType.CHAT_TEXT_DECORATION); }
// public static void CHAT_TEXT_DECORATION(yarnwrap.text.Decoration value, ) { net.minecraft.network.message.MessageType.CHAT_TEXT_DECORATION = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.message.MessageType.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.message.MessageType.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.message.MessageType.ENTRY_PACKET_CODEC); }
// public static void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.message.MessageType.ENTRY_PACKET_CODEC = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_43843(Object instance) { return wrapperContained.method_43843(instance); }
// public static com.mojang.datafixers.kinds.App method_43843(Object instance, ) { return net.minecraft.network.message.MessageType.method_43843(instance); }
// public void bootstrap(yarnwrap.registry.Registerable messageTypeRegisterable) { wrapperContained.bootstrap(messageTypeRegisterable.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable messageTypeRegisterable, ) { net.minecraft.network.message.MessageType.bootstrap(messageTypeRegisterable.wrapperContained); }
// public yarnwrap.registry.RegistryKey register(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.register(id)); }
// public static yarnwrap.registry.RegistryKey register(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.network.message.MessageType.register(id)); }
// public Object params(yarnwrap.registry.RegistryKey typeKey,yarnwrap.entity.Entity entity) { return wrapperContained.params(typeKey.wrapperContained,entity.wrapperContained); }
// public static Object params(yarnwrap.registry.RegistryKey typeKey,yarnwrap.entity.Entity entity, ) { return net.minecraft.network.message.MessageType.params(typeKey.wrapperContained,entity.wrapperContained); }
// public Object params(yarnwrap.registry.RegistryKey typeKey,yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.params(typeKey.wrapperContained,source.wrapperContained); }
// public static Object params(yarnwrap.registry.RegistryKey typeKey,yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.network.message.MessageType.params(typeKey.wrapperContained,source.wrapperContained); }
// public Object params(yarnwrap.registry.RegistryKey typeKey,yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.text.Text name) { return wrapperContained.params(typeKey.wrapperContained,registryManager.wrapperContained,name.wrapperContained); }
// public static Object params(yarnwrap.registry.RegistryKey typeKey,yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.text.Text name, ) { return net.minecraft.network.message.MessageType.params(typeKey.wrapperContained,registryManager.wrapperContained,name.wrapperContained); }

}