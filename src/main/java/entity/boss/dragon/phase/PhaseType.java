package yarnwrap.entity.boss.dragon.phase;
public class PhaseType { public net.minecraft.entity.boss.dragon.phase.PhaseType wrapperContained; public PhaseType(net.minecraft.entity.boss.dragon.phase.PhaseType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public java.lang.Class phaseClass() { return wrapperContained.phaseClass; }
// public int id() { return wrapperContained.id; }
// public net.minecraft.entity.boss.dragon.phase.PhaseType[] types() { return wrapperContained.types; }
public yarnwrap.entity.boss.dragon.phase.Phase create(yarnwrap.entity.boss.dragon.EnderDragonEntity dragon) { return new yarnwrap.entity.boss.dragon.phase.Phase(wrapperContained.create(dragon.wrapperContained)); }
// public java.lang.reflect.Constructor getConstructor() { return wrapperContained.getConstructor(); }
public yarnwrap.entity.boss.dragon.phase.PhaseType getFromId(int id) { return new yarnwrap.entity.boss.dragon.phase.PhaseType(wrapperContained.getFromId(id)); }
public int count() { return wrapperContained.count(); }
// public yarnwrap.entity.boss.dragon.phase.PhaseType register(java.lang.Class phaseClass,java.lang.String name) { return new yarnwrap.entity.boss.dragon.phase.PhaseType(wrapperContained.register(phaseClass,name)); }
public int getTypeId() { return wrapperContained.getTypeId(); }

}