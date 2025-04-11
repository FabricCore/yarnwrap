package yarnwrap.entity.mob;
public class PiglinBruteEntity { public net.minecraft.entity.mob.PiglinBruteEntity wrapperContained; public PiglinBruteEntity(net.minecraft.entity.mob.PiglinBruteEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList MEMORY_MODULE_TYPES() { return wrapperContained.MEMORY_MODULE_TYPES; }
// public void MEMORY_MODULE_TYPES(com.google.common.collect.ImmutableList value) { wrapperContained.MEMORY_MODULE_TYPES = value; }
// public com.google.common.collect.ImmutableList SENSOR_TYPES() { return wrapperContained.SENSOR_TYPES; }
// public void SENSOR_TYPES(com.google.common.collect.ImmutableList value) { wrapperContained.SENSOR_TYPES = value; }
// public int MAX_HEALTH() { return wrapperContained.MAX_HEALTH; }
// public void MAX_HEALTH(int value) { wrapperContained.MAX_HEALTH = value; }
// public float MOVEMENT_SPEED() { return wrapperContained.MOVEMENT_SPEED; }
// public void MOVEMENT_SPEED(float value) { wrapperContained.MOVEMENT_SPEED = value; }
// public int ATTACK_DAMAGE() { return wrapperContained.ATTACK_DAMAGE; }
// public void ATTACK_DAMAGE(int value) { wrapperContained.ATTACK_DAMAGE = value; }
public Object createPiglinBruteAttributes() { return wrapperContained.createPiglinBruteAttributes(); }
// public void playAngrySound() { wrapperContained.playAngrySound(); }

}