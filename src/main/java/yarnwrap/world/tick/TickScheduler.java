package yarnwrap.world.tick;
public class TickScheduler { public net.minecraft.world.tick.TickScheduler wrapperContained; public TickScheduler(net.minecraft.world.tick.TickScheduler wrapperContained) { this.wrapperContained = wrapperContained; }

public int getTickCount() { return wrapperContained.getTickCount(); }
// public static int getTickCount() { return net.minecraft.world.tick.TickScheduler.getTickCount(); }
public void scheduleTick(yarnwrap.world.tick.OrderedTick orderedTick) { wrapperContained.scheduleTick(orderedTick.wrapperContained); }
// public static void scheduleTick(yarnwrap.world.tick.OrderedTick orderedTick, ) { net.minecraft.world.tick.TickScheduler.scheduleTick(orderedTick.wrapperContained); }
public boolean isQueued(yarnwrap.util.math.BlockPos pos,java.lang.Object type) { return wrapperContained.isQueued(pos.wrapperContained,type); }
// public static boolean isQueued(yarnwrap.util.math.BlockPos pos,java.lang.Object type, ) { return net.minecraft.world.tick.TickScheduler.isQueued(pos.wrapperContained,type); }

}