package yarnwrap.world.tick;
public class OrderedTick { public net.minecraft.world.tick.OrderedTick wrapperContained; public OrderedTick(net.minecraft.world.tick.OrderedTick wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Comparator TRIGGER_TICK_COMPARATOR() { return wrapperContained.TRIGGER_TICK_COMPARATOR; }
// public void TRIGGER_TICK_COMPARATOR(java.util.Comparator value) { wrapperContained.TRIGGER_TICK_COMPARATOR = value; }
public java.util.Comparator BASIC_COMPARATOR() { return wrapperContained.BASIC_COMPARATOR; }
// public void BASIC_COMPARATOR(java.util.Comparator value) { wrapperContained.BASIC_COMPARATOR = value; }
public Object HASH_STRATEGY() { return wrapperContained.HASH_STRATEGY; }
// // public void HASH_STRATEGY(Object value) { wrapperContained.HASH_STRATEGY = value; }
public yarnwrap.world.tick.OrderedTick create(java.lang.Object type,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.world.tick.OrderedTick(wrapperContained.create(type,pos.wrapperContained)); }

}