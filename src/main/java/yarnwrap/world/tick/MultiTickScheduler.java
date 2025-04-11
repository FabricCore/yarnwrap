package yarnwrap.world.tick;
public class MultiTickScheduler { public net.minecraft.world.tick.MultiTickScheduler wrapperContained; public MultiTickScheduler(net.minecraft.world.tick.MultiTickScheduler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function mapper() { return wrapperContained.mapper; }
// public void mapper(java.util.function.Function value) { wrapperContained.mapper = value; }

}