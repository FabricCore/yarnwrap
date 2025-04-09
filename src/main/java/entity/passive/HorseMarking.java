package yarnwrap.entity.passive;
public class HorseMarking { public net.minecraft.entity.passive.HorseMarking wrapperContained; public HorseMarking(net.minecraft.entity.passive.HorseMarking wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public int id() { return wrapperContained.id; }
public int getId() { return wrapperContained.getId(); }
public yarnwrap.entity.passive.HorseMarking byIndex(int index) { return new yarnwrap.entity.passive.HorseMarking(wrapperContained.byIndex(index)); }

}