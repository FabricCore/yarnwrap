package yarnwrap.particle;
public class ItemStackParticleEffect { public net.minecraft.particle.ItemStackParticleEffect wrapperContained; public ItemStackParticleEffect(net.minecraft.particle.ItemStackParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public void stack(yarnwrap.item.ItemStack value) { wrapperContained.stack = value.wrapperContained; }
// public yarnwrap.particle.ParticleType type() { return new yarnwrap.particle.ParticleType(wrapperContained.type); }
// public void type(yarnwrap.particle.ParticleType value) { wrapperContained.type = value.wrapperContained; }
// public com.mojang.serialization.Codec ITEM_STACK_CODEC() { return wrapperContained.ITEM_STACK_CODEC; }
// public void ITEM_STACK_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ITEM_STACK_CODEC = value; }
public yarnwrap.item.ItemStack getItemStack() { return new yarnwrap.item.ItemStack(wrapperContained.getItemStack()); }
public com.mojang.serialization.MapCodec createCodec(yarnwrap.particle.ParticleType type) { return wrapperContained.createCodec(type.wrapperContained); }
public yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.particle.ParticleType type) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(type.wrapperContained)); }

}