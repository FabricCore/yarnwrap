package yarnwrap.component.type;
public class InstrumentComponent { public net.minecraft.component.type.InstrumentComponent wrapperContained; public InstrumentComponent(net.minecraft.component.type.InstrumentComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.InstrumentComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.InstrumentComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.InstrumentComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.InstrumentComponent.PACKET_CODEC = value.wrapperContained; }

public InstrumentComponent(yarnwrap.registry.RegistryKey instrument) { this.wrapperContained = new net.minecraft.component.type.InstrumentComponent(instrument.wrapperContained); }
public InstrumentComponent(yarnwrap.registry.entry.RegistryEntry instrument) { this.wrapperContained = new net.minecraft.component.type.InstrumentComponent(instrument.wrapperContained); }
// public java.util.Optional getInstrument(Object registries) { return wrapperContained.getInstrument(registries); }
// public static java.util.Optional getInstrument(Object registries, ) { return net.minecraft.component.type.InstrumentComponent.getInstrument(registries); }

}