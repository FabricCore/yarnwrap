package yarnwrap.world.tick;
public class Tick { public net.minecraft.world.tick.Tick wrapperContained; public Tick(net.minecraft.world.tick.Tick wrapperContained) { this.wrapperContained = wrapperContained; }

public Object HASH_STRATEGY() { return wrapperContained.HASH_STRATEGY; }
// public java.lang.String TYPE_NBT_KEY() { return wrapperContained.TYPE_NBT_KEY; }
// public java.lang.String X_NBT_KEY() { return wrapperContained.X_NBT_KEY; }
// public java.lang.String Y_NBT_KEY() { return wrapperContained.Y_NBT_KEY; }
// public java.lang.String Z_NBT_KEY() { return wrapperContained.Z_NBT_KEY; }
// public java.lang.String DELAY_NBT_KEY() { return wrapperContained.DELAY_NBT_KEY; }
// public java.lang.String PRIORITY_NBT_KEY() { return wrapperContained.PRIORITY_NBT_KEY; }
public yarnwrap.world.tick.OrderedTick createOrderedTick(long time,long subTickOrder) { return new yarnwrap.world.tick.OrderedTick(wrapperContained.createOrderedTick(time,subTickOrder)); }
public yarnwrap.nbt.NbtCompound orderedTickToNbt(yarnwrap.world.tick.OrderedTick orderedTick,java.util.function.Function typeToNameFunction,long delay) { return new yarnwrap.nbt.NbtCompound(wrapperContained.orderedTickToNbt(orderedTick.wrapperContained,typeToNameFunction,delay)); }
public yarnwrap.world.tick.Tick create(java.lang.Object type,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.world.tick.Tick(wrapperContained.create(type,pos.wrapperContained)); }
// public yarnwrap.nbt.NbtCompound toNbt(java.lang.String type,yarnwrap.util.math.BlockPos pos,int delay,yarnwrap.world.tick.TickPriority priority) { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt(type,pos.wrapperContained,delay,priority.wrapperContained)); }
public yarnwrap.nbt.NbtCompound toNbt(java.util.function.Function typeToNameFunction) { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt(typeToNameFunction)); }
public void tick(yarnwrap.nbt.NbtList tickList,java.util.function.Function nameToTypeFunction,yarnwrap.util.math.ChunkPos pos,java.util.function.Consumer tickConsumer) { wrapperContained.tick(tickList.wrapperContained,nameToTypeFunction,pos.wrapperContained,tickConsumer); }
public java.util.Optional fromNbt(yarnwrap.nbt.NbtCompound nbt,java.util.function.Function nameToType) { return wrapperContained.fromNbt(nbt.wrapperContained,nameToType); }

}