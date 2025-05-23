package yarnwrap.item.consume;
public class ConsumeEffect { public net.minecraft.item.consume.ConsumeEffect wrapperContained; public ConsumeEffect(net.minecraft.item.consume.ConsumeEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.item.consume.ConsumeEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.consume.ConsumeEffect.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.consume.ConsumeEffect.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.consume.ConsumeEffect.PACKET_CODEC = value.wrapperContained; }

public Object getType() { return wrapperContained.getType(); }
// public static Object getType() { return net.minecraft.item.consume.ConsumeEffect.getType(); }
public boolean onConsume(yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity user) { return wrapperContained.onConsume(world.wrapperContained,stack.wrapperContained,user.wrapperContained); }
// public static boolean onConsume(yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity user, ) { return net.minecraft.item.consume.ConsumeEffect.onConsume(world.wrapperContained,stack.wrapperContained,user.wrapperContained); }

}