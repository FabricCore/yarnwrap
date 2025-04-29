package yarnwrap.world.tick;
public class EmptyTickSchedulers { public net.minecraft.world.tick.EmptyTickSchedulers wrapperContained; public EmptyTickSchedulers(net.minecraft.world.tick.EmptyTickSchedulers wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.tick.BasicTickScheduler EMPTY_BASIC_TICK_SCHEDULER() { return new yarnwrap.world.tick.BasicTickScheduler(wrapperContained.EMPTY_BASIC_TICK_SCHEDULER); }
// public void EMPTY_BASIC_TICK_SCHEDULER(yarnwrap.world.tick.BasicTickScheduler value) { wrapperContained.EMPTY_BASIC_TICK_SCHEDULER = value.wrapperContained; }
// public static yarnwrap.world.tick.BasicTickScheduler EMPTY_BASIC_TICK_SCHEDULER() { return new yarnwrap.world.tick.BasicTickScheduler(net.minecraft.world.tick.EmptyTickSchedulers.EMPTY_BASIC_TICK_SCHEDULER); }
// public static void EMPTY_BASIC_TICK_SCHEDULER(yarnwrap.world.tick.BasicTickScheduler value, ) { net.minecraft.world.tick.EmptyTickSchedulers.EMPTY_BASIC_TICK_SCHEDULER = value.wrapperContained; }

// public yarnwrap.world.tick.QueryableTickScheduler EMPTY_QUERYABLE_TICK_SCHEDULER() { return new yarnwrap.world.tick.QueryableTickScheduler(wrapperContained.EMPTY_QUERYABLE_TICK_SCHEDULER); }
// public void EMPTY_QUERYABLE_TICK_SCHEDULER(yarnwrap.world.tick.QueryableTickScheduler value) { wrapperContained.EMPTY_QUERYABLE_TICK_SCHEDULER = value.wrapperContained; }
// public static yarnwrap.world.tick.QueryableTickScheduler EMPTY_QUERYABLE_TICK_SCHEDULER() { return new yarnwrap.world.tick.QueryableTickScheduler(net.minecraft.world.tick.EmptyTickSchedulers.EMPTY_QUERYABLE_TICK_SCHEDULER); }
// public static void EMPTY_QUERYABLE_TICK_SCHEDULER(yarnwrap.world.tick.QueryableTickScheduler value, ) { net.minecraft.world.tick.EmptyTickSchedulers.EMPTY_QUERYABLE_TICK_SCHEDULER = value.wrapperContained; }

// public yarnwrap.world.tick.BasicTickScheduler getReadOnlyTickScheduler() { return new yarnwrap.world.tick.BasicTickScheduler(wrapperContained.getReadOnlyTickScheduler()); }
public static yarnwrap.world.tick.BasicTickScheduler getReadOnlyTickScheduler() { return new yarnwrap.world.tick.BasicTickScheduler(net.minecraft.world.tick.EmptyTickSchedulers.getReadOnlyTickScheduler()); }
// public yarnwrap.world.tick.QueryableTickScheduler getClientTickScheduler() { return new yarnwrap.world.tick.QueryableTickScheduler(wrapperContained.getClientTickScheduler()); }
public static yarnwrap.world.tick.QueryableTickScheduler getClientTickScheduler() { return new yarnwrap.world.tick.QueryableTickScheduler(net.minecraft.world.tick.EmptyTickSchedulers.getClientTickScheduler()); }

}