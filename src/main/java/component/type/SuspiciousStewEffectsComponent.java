package yarnwrap.component.type;
public class SuspiciousStewEffectsComponent { public net.minecraft.component.type.SuspiciousStewEffectsComponent wrapperContained; public SuspiciousStewEffectsComponent(net.minecraft.component.type.SuspiciousStewEffectsComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.SuspiciousStewEffectsComponent DEFAULT() { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public yarnwrap.component.type.SuspiciousStewEffectsComponent with(Object stewEffect) { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(wrapperContained.with(stewEffect)); }

}