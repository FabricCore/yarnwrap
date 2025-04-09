package yarnwrap.world.tick;
public class SerializableTickScheduler { public net.minecraft.world.tick.SerializableTickScheduler wrapperContained; public SerializableTickScheduler(net.minecraft.world.tick.SerializableTickScheduler wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.nbt.NbtElement toNbt(long time,java.util.function.Function typeToNameFunction) { return new yarnwrap.nbt.NbtElement(wrapperContained.toNbt(time,typeToNameFunction)); }

}