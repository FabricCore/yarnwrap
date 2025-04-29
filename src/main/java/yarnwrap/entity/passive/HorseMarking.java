package yarnwrap.entity.passive;
public class HorseMarking { public net.minecraft.entity.passive.HorseMarking wrapperContained; public HorseMarking(net.minecraft.entity.passive.HorseMarking wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public void BY_ID(java.util.function.IntFunction value) { wrapperContained.BY_ID = value; }
// public static java.util.function.IntFunction BY_ID() { return net.minecraft.entity.passive.HorseMarking.BY_ID; }
// public static void BY_ID(java.util.function.IntFunction value, ) { net.minecraft.entity.passive.HorseMarking.BY_ID = value; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.entity.passive.HorseMarking.id; }
// public static void id(int value, ) { net.minecraft.entity.passive.HorseMarking.id = value; }

// // public HorseMarking(java.lang.String id) { this.wrapperContained = new net.minecraft.entity.passive.HorseMarking(id); }
public int getId() { return wrapperContained.getId(); }
// public static int getId() { return net.minecraft.entity.passive.HorseMarking.getId(); }
// public yarnwrap.entity.passive.HorseMarking byIndex(int index) { return new yarnwrap.entity.passive.HorseMarking(wrapperContained.byIndex(index)); }
// public static yarnwrap.entity.passive.HorseMarking byIndex(int index, ) { return new yarnwrap.entity.passive.HorseMarking(net.minecraft.entity.passive.HorseMarking.byIndex(index)); }

}