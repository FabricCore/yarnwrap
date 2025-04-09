package yarnwrap.component.type;
public class FoodComponent { public net.minecraft.component.type.FoodComponent wrapperContained; public FoodComponent(net.minecraft.component.type.FoodComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public float DEFAULT_EAT_SECONDS() { return wrapperContained.DEFAULT_EAT_SECONDS; }
public int getEatTicks() { return wrapperContained.getEatTicks(); }

}