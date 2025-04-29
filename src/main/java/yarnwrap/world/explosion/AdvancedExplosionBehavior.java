package yarnwrap.world.explosion;
public class AdvancedExplosionBehavior { public net.minecraft.world.explosion.AdvancedExplosionBehavior wrapperContained; public AdvancedExplosionBehavior(net.minecraft.world.explosion.AdvancedExplosionBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean destroyBlocks() { return wrapperContained.destroyBlocks; }
// public void destroyBlocks(boolean value) { wrapperContained.destroyBlocks = value; }
// public static boolean destroyBlocks() { return net.minecraft.world.explosion.AdvancedExplosionBehavior.destroyBlocks; }
// public static void destroyBlocks(boolean value, ) { net.minecraft.world.explosion.AdvancedExplosionBehavior.destroyBlocks = value; }

// public boolean damageEntities() { return wrapperContained.damageEntities; }
// public void damageEntities(boolean value) { wrapperContained.damageEntities = value; }
// public static boolean damageEntities() { return net.minecraft.world.explosion.AdvancedExplosionBehavior.damageEntities; }
// public static void damageEntities(boolean value, ) { net.minecraft.world.explosion.AdvancedExplosionBehavior.damageEntities = value; }

// public java.util.Optional knockbackModifier() { return wrapperContained.knockbackModifier; }
// public void knockbackModifier(java.util.Optional value) { wrapperContained.knockbackModifier = value; }
// public static java.util.Optional knockbackModifier() { return net.minecraft.world.explosion.AdvancedExplosionBehavior.knockbackModifier; }
// public static void knockbackModifier(java.util.Optional value, ) { net.minecraft.world.explosion.AdvancedExplosionBehavior.knockbackModifier = value; }

// public java.util.Optional immuneBlocks() { return wrapperContained.immuneBlocks; }
// public void immuneBlocks(java.util.Optional value) { wrapperContained.immuneBlocks = value; }
// public static java.util.Optional immuneBlocks() { return net.minecraft.world.explosion.AdvancedExplosionBehavior.immuneBlocks; }
// public static void immuneBlocks(java.util.Optional value, ) { net.minecraft.world.explosion.AdvancedExplosionBehavior.immuneBlocks = value; }

public AdvancedExplosionBehavior(boolean destroyBlocks,boolean damageEntities,java.util.Optional knockbackModifier,java.util.Optional immuneBlocks) { this.wrapperContained = new net.minecraft.world.explosion.AdvancedExplosionBehavior(destroyBlocks,damageEntities,knockbackModifier,immuneBlocks); }

}