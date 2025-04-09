package yarnwrap.world.explosion;
public class AdvancedExplosionBehavior { public net.minecraft.world.explosion.AdvancedExplosionBehavior wrapperContained; public AdvancedExplosionBehavior(net.minecraft.world.explosion.AdvancedExplosionBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean destroyBlocks() { return wrapperContained.destroyBlocks; }
// public boolean damageEntities() { return wrapperContained.damageEntities; }
// public java.util.Optional knockbackModifier() { return wrapperContained.knockbackModifier; }
// public java.util.Optional immuneBlocks() { return wrapperContained.immuneBlocks; }

}