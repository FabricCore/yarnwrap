package yarnwrap.component.type;
public class FoodComponent { public net.minecraft.component.type.FoodComponent wrapperContained; public FoodComponent(net.minecraft.component.type.FoodComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.FoodComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.FoodComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.FoodComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.FoodComponent.PACKET_CODEC = value.wrapperContained; }

// public float DEFAULT_EAT_SECONDS() { return wrapperContained.DEFAULT_EAT_SECONDS; }
// public void DEFAULT_EAT_SECONDS(float value) { wrapperContained.DEFAULT_EAT_SECONDS = value; }
// public static float DEFAULT_EAT_SECONDS() { return net.minecraft.component.type.FoodComponent.DEFAULT_EAT_SECONDS; }
// public static void DEFAULT_EAT_SECONDS(float value, ) { net.minecraft.component.type.FoodComponent.DEFAULT_EAT_SECONDS = value; }

public FoodComponent(int nutrition,float saturation,boolean canAlwaysEat,float eatSeconds,java.util.Optional usingConvertsTo,java.util.List effects) { this.wrapperContained = new net.minecraft.component.type.FoodComponent(nutrition,saturation,canAlwaysEat,eatSeconds,usingConvertsTo,effects); }
public int getEatTicks() { return wrapperContained.getEatTicks(); }
// public static int getEatTicks() { return net.minecraft.component.type.FoodComponent.getEatTicks(); }
// public com.mojang.datafixers.kinds.App method_58400(Object instance) { return wrapperContained.method_58400(instance); }
// public static com.mojang.datafixers.kinds.App method_58400(Object instance, ) { return net.minecraft.component.type.FoodComponent.method_58400(instance); }

}