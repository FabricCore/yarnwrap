package yarnwrap.world.tick;
public class QueryableTickScheduler { public net.minecraft.world.tick.QueryableTickScheduler wrapperContained; public QueryableTickScheduler(net.minecraft.world.tick.QueryableTickScheduler wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isTicking(yarnwrap.util.math.BlockPos pos,java.lang.Object type) { return wrapperContained.isTicking(pos.wrapperContained,type); }

}