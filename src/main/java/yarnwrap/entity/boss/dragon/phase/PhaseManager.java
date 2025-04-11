package yarnwrap.entity.boss.dragon.phase;
public class PhaseManager { public net.minecraft.entity.boss.dragon.phase.PhaseManager wrapperContained; public PhaseManager(net.minecraft.entity.boss.dragon.phase.PhaseManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.boss.dragon.phase.Phase current() { return new yarnwrap.entity.boss.dragon.phase.Phase(wrapperContained.current); }
// public void current(yarnwrap.entity.boss.dragon.phase.Phase value) { wrapperContained.current = value.wrapperContained; }
// public net.minecraft.entity.boss.dragon.phase.Phase[] phases() { return wrapperContained.phases; }
// public void phases(net.minecraft.entity.boss.dragon.phase.Phase[] value) { wrapperContained.phases = value; }
// public yarnwrap.entity.boss.dragon.EnderDragonEntity dragon() { return new yarnwrap.entity.boss.dragon.EnderDragonEntity(wrapperContained.dragon); }
// public void dragon(yarnwrap.entity.boss.dragon.EnderDragonEntity value) { wrapperContained.dragon = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public PhaseManager(yarnwrap.entity.boss.dragon.EnderDragonEntity dragon) { this.wrapperContained = new net.minecraft.entity.boss.dragon.phase.PhaseManager(dragon.wrapperContained); }
public void setPhase(yarnwrap.entity.boss.dragon.phase.PhaseType type) { wrapperContained.setPhase(type.wrapperContained); }
public yarnwrap.entity.boss.dragon.phase.Phase getCurrent() { return new yarnwrap.entity.boss.dragon.phase.Phase(wrapperContained.getCurrent()); }
public yarnwrap.entity.boss.dragon.phase.Phase create(yarnwrap.entity.boss.dragon.phase.PhaseType type) { return new yarnwrap.entity.boss.dragon.phase.Phase(wrapperContained.create(type.wrapperContained)); }

}