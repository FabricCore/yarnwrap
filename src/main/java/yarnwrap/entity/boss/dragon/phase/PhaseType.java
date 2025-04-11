package yarnwrap.entity.boss.dragon.phase;
public class PhaseType { public net.minecraft.entity.boss.dragon.phase.PhaseType wrapperContained; public PhaseType(net.minecraft.entity.boss.dragon.phase.PhaseType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public java.lang.Class phaseClass() { return wrapperContained.phaseClass; }
// public void phaseClass(java.lang.Class value) { wrapperContained.phaseClass = value; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public net.minecraft.entity.boss.dragon.phase.PhaseType[] types() { return wrapperContained.types; }
// public void types(net.minecraft.entity.boss.dragon.phase.PhaseType[] value) { wrapperContained.types = value; }
public yarnwrap.entity.boss.dragon.phase.Phase create(yarnwrap.entity.boss.dragon.EnderDragonEntity dragon) { return new yarnwrap.entity.boss.dragon.phase.Phase(wrapperContained.create(dragon.wrapperContained)); }
// public java.lang.reflect.Constructor getConstructor() { return wrapperContained.getConstructor(); }
public yarnwrap.entity.boss.dragon.phase.PhaseType getFromId(int id) { return new yarnwrap.entity.boss.dragon.phase.PhaseType(wrapperContained.getFromId(id)); }
public int count() { return wrapperContained.count(); }
// public yarnwrap.entity.boss.dragon.phase.PhaseType register(java.lang.Class phaseClass,java.lang.String name) { return new yarnwrap.entity.boss.dragon.phase.PhaseType(wrapperContained.register(phaseClass,name)); }
public int getTypeId() { return wrapperContained.getTypeId(); }

}