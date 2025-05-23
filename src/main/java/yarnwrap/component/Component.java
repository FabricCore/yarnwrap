package yarnwrap.component;
public class Component { public net.minecraft.component.Component wrapperContained; public Component(net.minecraft.component.Component wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.Component.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.Component.PACKET_CODEC = value.wrapperContained; }

public com.mojang.serialization.DataResult encode(com.mojang.serialization.DynamicOps ops) { return wrapperContained.encode(ops); }
// public static com.mojang.serialization.DataResult encode(com.mojang.serialization.DynamicOps ops, ) { return net.minecraft.component.Component.encode(ops); }
// public yarnwrap.component.Component of(Object entry) { return new yarnwrap.component.Component(wrapperContained.of(entry)); }
// public static yarnwrap.component.Component of(Object entry, ) { return new yarnwrap.component.Component(net.minecraft.component.Component.of(entry)); }
// public yarnwrap.component.Component of(yarnwrap.component.ComponentType type,java.lang.Object value) { return new yarnwrap.component.Component(wrapperContained.of(type.wrapperContained,value)); }
// public static yarnwrap.component.Component of(yarnwrap.component.ComponentType type,java.lang.Object value, ) { return new yarnwrap.component.Component(net.minecraft.component.Component.of(type.wrapperContained,value)); }
public void apply(yarnwrap.component.MergedComponentMap components) { wrapperContained.apply(components.wrapperContained); }
// public static void apply(yarnwrap.component.MergedComponentMap components, ) { net.minecraft.component.Component.apply(components.wrapperContained); }

}