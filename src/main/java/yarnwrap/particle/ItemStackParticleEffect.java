package yarnwrap.particle;
public class ItemStackParticleEffect { public net.minecraft.particle.ItemStackParticleEffect wrapperContained; public ItemStackParticleEffect(net.minecraft.particle.ItemStackParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public void stack(yarnwrap.item.ItemStack value) { wrapperContained.stack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(net.minecraft.particle.ItemStackParticleEffect.stack); }
// public static void stack(yarnwrap.item.ItemStack value, ) { net.minecraft.particle.ItemStackParticleEffect.stack = value.wrapperContained; }

// public yarnwrap.particle.ParticleType type() { return new yarnwrap.particle.ParticleType(wrapperContained.type); }
// public void type(yarnwrap.particle.ParticleType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.particle.ParticleType type() { return new yarnwrap.particle.ParticleType(net.minecraft.particle.ItemStackParticleEffect.type); }
// public static void type(yarnwrap.particle.ParticleType value, ) { net.minecraft.particle.ItemStackParticleEffect.type = value.wrapperContained; }

// public com.mojang.serialization.Codec ITEM_STACK_CODEC() { return wrapperContained.ITEM_STACK_CODEC; }
// public void ITEM_STACK_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ITEM_STACK_CODEC = value; }
// public static com.mojang.serialization.Codec ITEM_STACK_CODEC() { return net.minecraft.particle.ItemStackParticleEffect.ITEM_STACK_CODEC; }
// public static void ITEM_STACK_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.particle.ItemStackParticleEffect.ITEM_STACK_CODEC = value; }

public ItemStackParticleEffect(yarnwrap.particle.ParticleType type,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.particle.ItemStackParticleEffect(type.wrapperContained,stack.wrapperContained); }
public yarnwrap.item.ItemStack getItemStack() { return new yarnwrap.item.ItemStack(wrapperContained.getItemStack()); }
// public static yarnwrap.item.ItemStack getItemStack() { return new yarnwrap.item.ItemStack(net.minecraft.particle.ItemStackParticleEffect.getItemStack()); }
// public yarnwrap.item.ItemStack method_29135(yarnwrap.particle.ItemStackParticleEffect effect) { return new yarnwrap.item.ItemStack(wrapperContained.method_29135(effect.wrapperContained)); }
// public static yarnwrap.item.ItemStack method_29135(yarnwrap.particle.ItemStackParticleEffect effect, ) { return new yarnwrap.item.ItemStack(net.minecraft.particle.ItemStackParticleEffect.method_29135(effect.wrapperContained)); }
// public com.mojang.serialization.MapCodec createCodec(yarnwrap.particle.ParticleType type) { return wrapperContained.createCodec(type.wrapperContained); }
// public static com.mojang.serialization.MapCodec createCodec(yarnwrap.particle.ParticleType type, ) { return net.minecraft.particle.ItemStackParticleEffect.createCodec(type.wrapperContained); }
// public yarnwrap.particle.ItemStackParticleEffect method_29137(yarnwrap.particle.ParticleType stack) { return new yarnwrap.particle.ItemStackParticleEffect(wrapperContained.method_29137(stack.wrapperContained)); }
// public static yarnwrap.particle.ItemStackParticleEffect method_29137(yarnwrap.particle.ParticleType stack, ) { return new yarnwrap.particle.ItemStackParticleEffect(net.minecraft.particle.ItemStackParticleEffect.method_29137(stack.wrapperContained)); }
// public yarnwrap.item.ItemStack method_56176(yarnwrap.particle.ItemStackParticleEffect effect) { return new yarnwrap.item.ItemStack(wrapperContained.method_56176(effect.wrapperContained)); }
// public static yarnwrap.item.ItemStack method_56176(yarnwrap.particle.ItemStackParticleEffect effect, ) { return new yarnwrap.item.ItemStack(net.minecraft.particle.ItemStackParticleEffect.method_56176(effect.wrapperContained)); }
// public yarnwrap.particle.ItemStackParticleEffect method_56177(yarnwrap.particle.ParticleType stack) { return new yarnwrap.particle.ItemStackParticleEffect(wrapperContained.method_56177(stack.wrapperContained)); }
// public static yarnwrap.particle.ItemStackParticleEffect method_56177(yarnwrap.particle.ParticleType stack, ) { return new yarnwrap.particle.ItemStackParticleEffect(net.minecraft.particle.ItemStackParticleEffect.method_56177(stack.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.particle.ParticleType type) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(type.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.particle.ParticleType type, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.particle.ItemStackParticleEffect.createPacketCodec(type.wrapperContained)); }

}