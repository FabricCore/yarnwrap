package yarnwrap.world.tick;
public class OrderedTick { public net.minecraft.world.tick.OrderedTick wrapperContained; public OrderedTick(net.minecraft.world.tick.OrderedTick wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Comparator TRIGGER_TICK_COMPARATOR() { return wrapperContained.TRIGGER_TICK_COMPARATOR; }
// public void TRIGGER_TICK_COMPARATOR(java.util.Comparator value) { wrapperContained.TRIGGER_TICK_COMPARATOR = value; }
public static java.util.Comparator TRIGGER_TICK_COMPARATOR() { return net.minecraft.world.tick.OrderedTick.TRIGGER_TICK_COMPARATOR; }
// public static void TRIGGER_TICK_COMPARATOR(java.util.Comparator value, ) { net.minecraft.world.tick.OrderedTick.TRIGGER_TICK_COMPARATOR = value; }

// public java.util.Comparator BASIC_COMPARATOR() { return wrapperContained.BASIC_COMPARATOR; }
// public void BASIC_COMPARATOR(java.util.Comparator value) { wrapperContained.BASIC_COMPARATOR = value; }
public static java.util.Comparator BASIC_COMPARATOR() { return net.minecraft.world.tick.OrderedTick.BASIC_COMPARATOR; }
// public static void BASIC_COMPARATOR(java.util.Comparator value, ) { net.minecraft.world.tick.OrderedTick.BASIC_COMPARATOR = value; }

// public Object HASH_STRATEGY() { return wrapperContained.HASH_STRATEGY; }
// // public void HASH_STRATEGY(Object value) { wrapperContained.HASH_STRATEGY = value; }
// public static Object HASH_STRATEGY() { return net.minecraft.world.tick.OrderedTick.HASH_STRATEGY; }
// // public static void HASH_STRATEGY(Object value, ) { net.minecraft.world.tick.OrderedTick.HASH_STRATEGY = value; }

public OrderedTick(java.lang.Object type,yarnwrap.util.math.BlockPos pos,long triggerTick,long subTickOrder) { this.wrapperContained = new net.minecraft.world.tick.OrderedTick(type,pos.wrapperContained,triggerTick,subTickOrder); }
// public int method_39409(yarnwrap.world.tick.OrderedTick first,yarnwrap.world.tick.OrderedTick second) { return wrapperContained.method_39409(first.wrapperContained,second.wrapperContained); }
// public static int method_39409(yarnwrap.world.tick.OrderedTick first,yarnwrap.world.tick.OrderedTick second, ) { return net.minecraft.world.tick.OrderedTick.method_39409(first.wrapperContained,second.wrapperContained); }
// public yarnwrap.world.tick.OrderedTick create(java.lang.Object type,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.world.tick.OrderedTick(wrapperContained.create(type,pos.wrapperContained)); }
// public static yarnwrap.world.tick.OrderedTick create(java.lang.Object type,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.world.tick.OrderedTick(net.minecraft.world.tick.OrderedTick.create(type,pos.wrapperContained)); }
// public int method_39412(yarnwrap.world.tick.OrderedTick first,yarnwrap.world.tick.OrderedTick second) { return wrapperContained.method_39412(first.wrapperContained,second.wrapperContained); }
// public static int method_39412(yarnwrap.world.tick.OrderedTick first,yarnwrap.world.tick.OrderedTick second, ) { return net.minecraft.world.tick.OrderedTick.method_39412(first.wrapperContained,second.wrapperContained); }
public yarnwrap.world.tick.Tick toTick(long time) { return new yarnwrap.world.tick.Tick(wrapperContained.toTick(time)); }
// public static yarnwrap.world.tick.Tick toTick(long time, ) { return new yarnwrap.world.tick.Tick(net.minecraft.world.tick.OrderedTick.toTick(time)); }

}