package yarnwrap.entity.mob;
public class PiglinBruteEntity { public net.minecraft.entity.mob.PiglinBruteEntity wrapperContained; public PiglinBruteEntity(net.minecraft.entity.mob.PiglinBruteEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList MEMORY_MODULE_TYPES() { return wrapperContained.MEMORY_MODULE_TYPES; }
// public com.google.common.collect.ImmutableList SENSOR_TYPES() { return wrapperContained.SENSOR_TYPES; }
// public int MAX_HEALTH() { return wrapperContained.MAX_HEALTH; }
// public float MOVEMENT_SPEED() { return wrapperContained.MOVEMENT_SPEED; }
// public int ATTACK_DAMAGE() { return wrapperContained.ATTACK_DAMAGE; }
public Object createPiglinBruteAttributes() { return wrapperContained.createPiglinBruteAttributes(); }
// public void playAngrySound() { wrapperContained.playAngrySound(); }

}