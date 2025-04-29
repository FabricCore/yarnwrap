package yarnwrap.entity.mob;
public class RavagerEntity { public net.minecraft.entity.mob.RavagerEntity wrapperContained; public RavagerEntity(net.minecraft.entity.mob.RavagerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float STUNNED_PARTICLE_BLUE() { return wrapperContained.STUNNED_PARTICLE_BLUE; }
// public void STUNNED_PARTICLE_BLUE(float value) { wrapperContained.STUNNED_PARTICLE_BLUE = value; }
// public static float STUNNED_PARTICLE_BLUE() { return net.minecraft.entity.mob.RavagerEntity.STUNNED_PARTICLE_BLUE; }
// public static void STUNNED_PARTICLE_BLUE(float value, ) { net.minecraft.entity.mob.RavagerEntity.STUNNED_PARTICLE_BLUE = value; }

// public float STUNNED_PARTICLE_GREEN() { return wrapperContained.STUNNED_PARTICLE_GREEN; }
// public void STUNNED_PARTICLE_GREEN(float value) { wrapperContained.STUNNED_PARTICLE_GREEN = value; }
// public static float STUNNED_PARTICLE_GREEN() { return net.minecraft.entity.mob.RavagerEntity.STUNNED_PARTICLE_GREEN; }
// public static void STUNNED_PARTICLE_GREEN(float value, ) { net.minecraft.entity.mob.RavagerEntity.STUNNED_PARTICLE_GREEN = value; }

// public float STUNNED_PARTICLE_RED() { return wrapperContained.STUNNED_PARTICLE_RED; }
// public void STUNNED_PARTICLE_RED(float value) { wrapperContained.STUNNED_PARTICLE_RED = value; }
// public static float STUNNED_PARTICLE_RED() { return net.minecraft.entity.mob.RavagerEntity.STUNNED_PARTICLE_RED; }
// public static void STUNNED_PARTICLE_RED(float value, ) { net.minecraft.entity.mob.RavagerEntity.STUNNED_PARTICLE_RED = value; }

// public java.util.function.Predicate IS_NOT_RAVAGER() { return wrapperContained.IS_NOT_RAVAGER; }
// public void IS_NOT_RAVAGER(java.util.function.Predicate value) { wrapperContained.IS_NOT_RAVAGER = value; }
// public static java.util.function.Predicate IS_NOT_RAVAGER() { return net.minecraft.entity.mob.RavagerEntity.IS_NOT_RAVAGER; }
// public static void IS_NOT_RAVAGER(java.util.function.Predicate value, ) { net.minecraft.entity.mob.RavagerEntity.IS_NOT_RAVAGER = value; }

// public int stunTick() { return wrapperContained.stunTick; }
// public void stunTick(int value) { wrapperContained.stunTick = value; }
// public static int stunTick() { return net.minecraft.entity.mob.RavagerEntity.stunTick; }
// public static void stunTick(int value, ) { net.minecraft.entity.mob.RavagerEntity.stunTick = value; }

// public int attackTick() { return wrapperContained.attackTick; }
// public void attackTick(int value) { wrapperContained.attackTick = value; }
// public static int attackTick() { return net.minecraft.entity.mob.RavagerEntity.attackTick; }
// public static void attackTick(int value, ) { net.minecraft.entity.mob.RavagerEntity.attackTick = value; }

// public int roarTick() { return wrapperContained.roarTick; }
// public void roarTick(int value) { wrapperContained.roarTick = value; }
// public static int roarTick() { return net.minecraft.entity.mob.RavagerEntity.roarTick; }
// public static void roarTick(int value, ) { net.minecraft.entity.mob.RavagerEntity.roarTick = value; }

// public Object createRavagerAttributes() { return wrapperContained.createRavagerAttributes(); }
public static Object createRavagerAttributes() { return net.minecraft.entity.mob.RavagerEntity.createRavagerAttributes(); }
// public boolean method_39955(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_39955(entity.wrapperContained); }
// public static boolean method_39955(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.mob.RavagerEntity.method_39955(entity.wrapperContained); }
// public void knockBack(yarnwrap.entity.Entity entity) { wrapperContained.knockBack(entity.wrapperContained); }
// public static void knockBack(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.mob.RavagerEntity.knockBack(entity.wrapperContained); }
// public boolean method_7069(yarnwrap.entity.Entity entity) { return wrapperContained.method_7069(entity.wrapperContained); }
// public static boolean method_7069(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.mob.RavagerEntity.method_7069(entity.wrapperContained); }
public int getAttackTick() { return wrapperContained.getAttackTick(); }
// public static int getAttackTick() { return net.minecraft.entity.mob.RavagerEntity.getAttackTick(); }
// public void roar() { wrapperContained.roar(); }
// public static void roar() { net.minecraft.entity.mob.RavagerEntity.roar(); }
public int getRoarTick() { return wrapperContained.getRoarTick(); }
// public static int getRoarTick() { return net.minecraft.entity.mob.RavagerEntity.getRoarTick(); }
// public void spawnStunnedParticles() { wrapperContained.spawnStunnedParticles(); }
// public static void spawnStunnedParticles() { net.minecraft.entity.mob.RavagerEntity.spawnStunnedParticles(); }
public int getStunTick() { return wrapperContained.getStunTick(); }
// public static int getStunTick() { return net.minecraft.entity.mob.RavagerEntity.getStunTick(); }

}