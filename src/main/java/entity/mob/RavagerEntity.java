package yarnwrap.entity.mob;
public class RavagerEntity { public net.minecraft.entity.mob.RavagerEntity wrapperContained; public RavagerEntity(net.minecraft.entity.mob.RavagerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float STUNNED_PARTICLE_BLUE() { return wrapperContained.STUNNED_PARTICLE_BLUE; }
// public float STUNNED_PARTICLE_GREEN() { return wrapperContained.STUNNED_PARTICLE_GREEN; }
// public float STUNNED_PARTICLE_RED() { return wrapperContained.STUNNED_PARTICLE_RED; }
// public java.util.function.Predicate IS_NOT_RAVAGER() { return wrapperContained.IS_NOT_RAVAGER; }
// public int stunTick() { return wrapperContained.stunTick; }
// public int attackTick() { return wrapperContained.attackTick; }
// public int roarTick() { return wrapperContained.roarTick; }
public Object createRavagerAttributes() { return wrapperContained.createRavagerAttributes(); }
// public void knockBack(yarnwrap.entity.Entity entity) { wrapperContained.knockBack(entity.wrapperContained); }
public int getAttackTick() { return wrapperContained.getAttackTick(); }
// public void roar() { wrapperContained.roar(); }
public int getRoarTick() { return wrapperContained.getRoarTick(); }
// public void spawnStunnedParticles() { wrapperContained.spawnStunnedParticles(); }
public int getStunTick() { return wrapperContained.getStunTick(); }

}