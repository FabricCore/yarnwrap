package yarnwrap.component.type;
public class OminousBottleAmplifierComponent { public net.minecraft.component.type.OminousBottleAmplifierComponent wrapperContained; public OminousBottleAmplifierComponent(net.minecraft.component.type.OminousBottleAmplifierComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DURATION() { return wrapperContained.DURATION; }
// public void DURATION(int value) { wrapperContained.DURATION = value; }
public static int DURATION() { return net.minecraft.component.type.OminousBottleAmplifierComponent.DURATION; }
// public static void DURATION(int value, ) { net.minecraft.component.type.OminousBottleAmplifierComponent.DURATION = value; }

// public int MIN_VALUE() { return wrapperContained.MIN_VALUE; }
// public void MIN_VALUE(int value) { wrapperContained.MIN_VALUE = value; }
public static int MIN_VALUE() { return net.minecraft.component.type.OminousBottleAmplifierComponent.MIN_VALUE; }
// public static void MIN_VALUE(int value, ) { net.minecraft.component.type.OminousBottleAmplifierComponent.MIN_VALUE = value; }

// public int MAX_VALUE() { return wrapperContained.MAX_VALUE; }
// public void MAX_VALUE(int value) { wrapperContained.MAX_VALUE = value; }
public static int MAX_VALUE() { return net.minecraft.component.type.OminousBottleAmplifierComponent.MAX_VALUE; }
// public static void MAX_VALUE(int value, ) { net.minecraft.component.type.OminousBottleAmplifierComponent.MAX_VALUE = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.OminousBottleAmplifierComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.OminousBottleAmplifierComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.OminousBottleAmplifierComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.OminousBottleAmplifierComponent.PACKET_CODEC = value.wrapperContained; }


}