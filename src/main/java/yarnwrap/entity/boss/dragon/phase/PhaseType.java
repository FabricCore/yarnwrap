package yarnwrap.entity.boss.dragon.phase;
public class PhaseType { public net.minecraft.entity.boss.dragon.phase.PhaseType wrapperContained; public PhaseType(net.minecraft.entity.boss.dragon.phase.PhaseType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.entity.boss.dragon.phase.PhaseType.name; }
// public static void name(java.lang.String value, ) { net.minecraft.entity.boss.dragon.phase.PhaseType.name = value; }

// public java.lang.Class phaseClass() { return wrapperContained.phaseClass; }
// public void phaseClass(java.lang.Class value) { wrapperContained.phaseClass = value; }
// public static java.lang.Class phaseClass() { return net.minecraft.entity.boss.dragon.phase.PhaseType.phaseClass; }
// public static void phaseClass(java.lang.Class value, ) { net.minecraft.entity.boss.dragon.phase.PhaseType.phaseClass = value; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.entity.boss.dragon.phase.PhaseType.id; }
// public static void id(int value, ) { net.minecraft.entity.boss.dragon.phase.PhaseType.id = value; }

// public net.minecraft.entity.boss.dragon.phase.PhaseType[] types() { return wrapperContained.types; }
// public void types(net.minecraft.entity.boss.dragon.phase.PhaseType[] value) { wrapperContained.types = value; }
// public static net.minecraft.entity.boss.dragon.phase.PhaseType[] types() { return net.minecraft.entity.boss.dragon.phase.PhaseType.types; }
// public static void types(net.minecraft.entity.boss.dragon.phase.PhaseType[] value, ) { net.minecraft.entity.boss.dragon.phase.PhaseType.types = value; }

// public PhaseType(int id,java.lang.Class phaseClass,java.lang.String name) { this.wrapperContained = new net.minecraft.entity.boss.dragon.phase.PhaseType(id,phaseClass,name); }
public yarnwrap.entity.boss.dragon.phase.Phase create(yarnwrap.entity.boss.dragon.EnderDragonEntity dragon) { return new yarnwrap.entity.boss.dragon.phase.Phase(wrapperContained.create(dragon.wrapperContained)); }
// public static yarnwrap.entity.boss.dragon.phase.Phase create(yarnwrap.entity.boss.dragon.EnderDragonEntity dragon, ) { return new yarnwrap.entity.boss.dragon.phase.Phase(net.minecraft.entity.boss.dragon.phase.PhaseType.create(dragon.wrapperContained)); }
// public java.lang.reflect.Constructor getConstructor() { return wrapperContained.getConstructor(); }
// public static java.lang.reflect.Constructor getConstructor() { return net.minecraft.entity.boss.dragon.phase.PhaseType.getConstructor(); }
// public yarnwrap.entity.boss.dragon.phase.PhaseType getFromId(int id) { return new yarnwrap.entity.boss.dragon.phase.PhaseType(wrapperContained.getFromId(id)); }
// public static yarnwrap.entity.boss.dragon.phase.PhaseType getFromId(int id, ) { return new yarnwrap.entity.boss.dragon.phase.PhaseType(net.minecraft.entity.boss.dragon.phase.PhaseType.getFromId(id)); }
// public int count() { return wrapperContained.count(); }
public static int count() { return net.minecraft.entity.boss.dragon.phase.PhaseType.count(); }
// public yarnwrap.entity.boss.dragon.phase.PhaseType register(java.lang.Class phaseClass,java.lang.String name) { return new yarnwrap.entity.boss.dragon.phase.PhaseType(wrapperContained.register(phaseClass,name)); }
// public static yarnwrap.entity.boss.dragon.phase.PhaseType register(java.lang.Class phaseClass,java.lang.String name, ) { return new yarnwrap.entity.boss.dragon.phase.PhaseType(net.minecraft.entity.boss.dragon.phase.PhaseType.register(phaseClass,name)); }
public int getTypeId() { return wrapperContained.getTypeId(); }
// public static int getTypeId() { return net.minecraft.entity.boss.dragon.phase.PhaseType.getTypeId(); }

}