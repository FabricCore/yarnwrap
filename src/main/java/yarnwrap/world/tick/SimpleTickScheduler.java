package yarnwrap.world.tick;
public class SimpleTickScheduler { public net.minecraft.world.tick.SimpleTickScheduler wrapperContained; public SimpleTickScheduler(net.minecraft.world.tick.SimpleTickScheduler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List scheduledTicks() { return wrapperContained.scheduledTicks; }
// public void scheduledTicks(java.util.List value) { wrapperContained.scheduledTicks = value; }
// public java.util.Set scheduledTicksSet() { return wrapperContained.scheduledTicksSet; }
// public void scheduledTicksSet(java.util.Set value) { wrapperContained.scheduledTicksSet = value; }
// public void scheduleTick(yarnwrap.world.tick.Tick tick) { wrapperContained.scheduleTick(tick.wrapperContained); }
public yarnwrap.world.tick.SimpleTickScheduler tick(yarnwrap.nbt.NbtList tickList,java.util.function.Function typeToNameFunction,yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.world.tick.SimpleTickScheduler(wrapperContained.tick(tickList.wrapperContained,typeToNameFunction,pos.wrapperContained)); }
public java.util.List getTicks() { return wrapperContained.getTicks(); }

}