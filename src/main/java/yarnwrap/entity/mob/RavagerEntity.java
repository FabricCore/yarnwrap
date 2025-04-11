package yarnwrap.entity.mob;
public class RavagerEntity { public net.minecraft.entity.mob.RavagerEntity wrapperContained; public RavagerEntity(net.minecraft.entity.mob.RavagerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float STUNNED_PARTICLE_BLUE() { return wrapperContained.STUNNED_PARTICLE_BLUE; }
// public void STUNNED_PARTICLE_BLUE(float value) { wrapperContained.STUNNED_PARTICLE_BLUE = value; }
// public float STUNNED_PARTICLE_GREEN() { return wrapperContained.STUNNED_PARTICLE_GREEN; }
// public void STUNNED_PARTICLE_GREEN(float value) { wrapperContained.STUNNED_PARTICLE_GREEN = value; }
// public float STUNNED_PARTICLE_RED() { return wrapperContained.STUNNED_PARTICLE_RED; }
// public void STUNNED_PARTICLE_RED(float value) { wrapperContained.STUNNED_PARTICLE_RED = value; }
// public java.util.function.Predicate IS_NOT_RAVAGER() { return wrapperContained.IS_NOT_RAVAGER; }
// public void IS_NOT_RAVAGER(java.util.function.Predicate value) { wrapperContained.IS_NOT_RAVAGER = value; }
// public int stunTick() { return wrapperContained.stunTick; }
// public void stunTick(int value) { wrapperContained.stunTick = value; }
// public int attackTick() { return wrapperContained.attackTick; }
// public void attackTick(int value) { wrapperContained.attackTick = value; }
// public int roarTick() { return wrapperContained.roarTick; }
// public void roarTick(int value) { wrapperContained.roarTick = value; }
public Object createRavagerAttributes() { return wrapperContained.createRavagerAttributes(); }
// public void knockBack(yarnwrap.entity.Entity entity) { wrapperContained.knockBack(entity.wrapperContained); }
public int getAttackTick() { return wrapperContained.getAttackTick(); }
// public void roar() { wrapperContained.roar(); }
public int getRoarTick() { return wrapperContained.getRoarTick(); }
// public void spawnStunnedParticles() { wrapperContained.spawnStunnedParticles(); }
public int getStunTick() { return wrapperContained.getStunTick(); }

}