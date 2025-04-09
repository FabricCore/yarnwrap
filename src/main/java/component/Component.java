package yarnwrap.component;
public class Component { public net.minecraft.component.Component wrapperContained; public Component(net.minecraft.component.Component wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public com.mojang.serialization.DataResult encode(com.mojang.serialization.DynamicOps ops) { return wrapperContained.encode(ops); }
// public yarnwrap.component.Component of(Object entry) { return new yarnwrap.component.Component(wrapperContained.of(entry)); }
public yarnwrap.component.Component of(yarnwrap.component.ComponentType type,java.lang.Object value) { return new yarnwrap.component.Component(wrapperContained.of(type.wrapperContained,value)); }
public void apply(yarnwrap.component.ComponentMapImpl components) { wrapperContained.apply(components.wrapperContained); }

}