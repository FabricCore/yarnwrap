package yarnwrap.component.type;
public class UseRemainderComponent { public net.minecraft.component.type.UseRemainderComponent wrapperContained; public UseRemainderComponent(net.minecraft.component.type.UseRemainderComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.UseRemainderComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.UseRemainderComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.UseRemainderComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.UseRemainderComponent.PACKET_CODEC = value.wrapperContained; }

public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.component.type.UseRemainderComponent.equals(o); }
// public yarnwrap.item.ItemStack convert(yarnwrap.item.ItemStack stack,int oldCount,boolean inCreative,Object inserter) { return new yarnwrap.item.ItemStack(wrapperContained.convert(stack.wrapperContained,oldCount,inCreative,inserter)); }
// public static yarnwrap.item.ItemStack convert(yarnwrap.item.ItemStack stack,int oldCount,boolean inCreative,Object inserter, ) { return new yarnwrap.item.ItemStack(net.minecraft.component.type.UseRemainderComponent.convert(stack.wrapperContained,oldCount,inCreative,inserter)); }

}