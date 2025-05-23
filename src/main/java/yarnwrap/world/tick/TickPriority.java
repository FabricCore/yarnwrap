package yarnwrap.world.tick;
public class TickPriority { public net.minecraft.world.tick.TickPriority wrapperContained; public TickPriority(net.minecraft.world.tick.TickPriority wrapperContained) { this.wrapperContained = wrapperContained; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.world.tick.TickPriority.index; }
// public static void index(int value, ) { net.minecraft.world.tick.TickPriority.index = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.tick.TickPriority.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.tick.TickPriority.CODEC = value; }

// // public TickPriority(java.lang.String index) { this.wrapperContained = new net.minecraft.world.tick.TickPriority(index); }
// public yarnwrap.world.tick.TickPriority byIndex(int index) { return new yarnwrap.world.tick.TickPriority(wrapperContained.byIndex(index)); }
// public static yarnwrap.world.tick.TickPriority byIndex(int index, ) { return new yarnwrap.world.tick.TickPriority(net.minecraft.world.tick.TickPriority.byIndex(index)); }
public int getIndex() { return wrapperContained.getIndex(); }
// public static int getIndex() { return net.minecraft.world.tick.TickPriority.getIndex(); }

}