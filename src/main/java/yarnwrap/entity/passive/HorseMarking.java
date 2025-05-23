package yarnwrap.entity.passive;
public class HorseMarking { public net.minecraft.entity.passive.HorseMarking wrapperContained; public HorseMarking(net.minecraft.entity.passive.HorseMarking wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction INDEX_MAPPER() { return wrapperContained.INDEX_MAPPER; }
// public void INDEX_MAPPER(java.util.function.IntFunction value) { wrapperContained.INDEX_MAPPER = value; }
// public static java.util.function.IntFunction INDEX_MAPPER() { return net.minecraft.entity.passive.HorseMarking.INDEX_MAPPER; }
// public static void INDEX_MAPPER(java.util.function.IntFunction value, ) { net.minecraft.entity.passive.HorseMarking.INDEX_MAPPER = value; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.entity.passive.HorseMarking.index; }
// public static void index(int value, ) { net.minecraft.entity.passive.HorseMarking.index = value; }

// // public HorseMarking(java.lang.String index) { this.wrapperContained = new net.minecraft.entity.passive.HorseMarking(index); }
public int getIndex() { return wrapperContained.getIndex(); }
// public static int getIndex() { return net.minecraft.entity.passive.HorseMarking.getIndex(); }
// public yarnwrap.entity.passive.HorseMarking byIndex(int index) { return new yarnwrap.entity.passive.HorseMarking(wrapperContained.byIndex(index)); }
// public static yarnwrap.entity.passive.HorseMarking byIndex(int index, ) { return new yarnwrap.entity.passive.HorseMarking(net.minecraft.entity.passive.HorseMarking.byIndex(index)); }

}