package yarnwrap.world.tick;
public class EmptyTickSchedulers { public net.minecraft.world.tick.EmptyTickSchedulers wrapperContained; public EmptyTickSchedulers(net.minecraft.world.tick.EmptyTickSchedulers wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.tick.BasicTickScheduler EMPTY_BASIC_TICK_SCHEDULER() { return new yarnwrap.world.tick.BasicTickScheduler(wrapperContained.EMPTY_BASIC_TICK_SCHEDULER); }
// public yarnwrap.world.tick.QueryableTickScheduler EMPTY_QUERYABLE_TICK_SCHEDULER() { return new yarnwrap.world.tick.QueryableTickScheduler(wrapperContained.EMPTY_QUERYABLE_TICK_SCHEDULER); }
public yarnwrap.world.tick.BasicTickScheduler getReadOnlyTickScheduler() { return new yarnwrap.world.tick.BasicTickScheduler(wrapperContained.getReadOnlyTickScheduler()); }
public yarnwrap.world.tick.QueryableTickScheduler getClientTickScheduler() { return new yarnwrap.world.tick.QueryableTickScheduler(wrapperContained.getClientTickScheduler()); }

}