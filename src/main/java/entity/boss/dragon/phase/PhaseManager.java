package yarnwrap.entity.boss.dragon.phase;
public class PhaseManager { public net.minecraft.entity.boss.dragon.phase.PhaseManager wrapperContained; public PhaseManager(net.minecraft.entity.boss.dragon.phase.PhaseManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.boss.dragon.phase.Phase current() { return new yarnwrap.entity.boss.dragon.phase.Phase(wrapperContained.current); }
// public net.minecraft.entity.boss.dragon.phase.Phase[] phases() { return wrapperContained.phases; }
// public yarnwrap.entity.boss.dragon.EnderDragonEntity dragon() { return new yarnwrap.entity.boss.dragon.EnderDragonEntity(wrapperContained.dragon); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public void setPhase(yarnwrap.entity.boss.dragon.phase.PhaseType type) { wrapperContained.setPhase(type.wrapperContained); }
public yarnwrap.entity.boss.dragon.phase.Phase getCurrent() { return new yarnwrap.entity.boss.dragon.phase.Phase(wrapperContained.getCurrent()); }
public yarnwrap.entity.boss.dragon.phase.Phase create(yarnwrap.entity.boss.dragon.phase.PhaseType type) { return new yarnwrap.entity.boss.dragon.phase.Phase(wrapperContained.create(type.wrapperContained)); }

}