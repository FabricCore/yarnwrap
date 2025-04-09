package yarnwrap.world.tick;
public class TickPriority { public net.minecraft.world.tick.TickPriority wrapperContained; public TickPriority(net.minecraft.world.tick.TickPriority wrapperContained) { this.wrapperContained = wrapperContained; }

// public int index() { return wrapperContained.index; }
public yarnwrap.world.tick.TickPriority byIndex(int index) { return new yarnwrap.world.tick.TickPriority(wrapperContained.byIndex(index)); }
public int getIndex() { return wrapperContained.getIndex(); }

}