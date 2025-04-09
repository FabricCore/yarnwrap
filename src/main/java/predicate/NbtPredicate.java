package yarnwrap.predicate;
public class NbtPredicate { public net.minecraft.predicate.NbtPredicate wrapperContained; public NbtPredicate(net.minecraft.predicate.NbtPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt()); }
public boolean test(yarnwrap.entity.Entity entity) { return wrapperContained.test(entity.wrapperContained); }
public boolean test(yarnwrap.item.ItemStack stack) { return wrapperContained.test(stack.wrapperContained); }
public yarnwrap.nbt.NbtCompound entityToNbt(yarnwrap.entity.Entity entity) { return new yarnwrap.nbt.NbtCompound(wrapperContained.entityToNbt(entity.wrapperContained)); }
public boolean test(yarnwrap.nbt.NbtElement element) { return wrapperContained.test(element.wrapperContained); }

}