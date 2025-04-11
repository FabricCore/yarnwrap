package yarnwrap.entity.damage;
public class DamageSource { public net.minecraft.entity.damage.DamageSource wrapperContained; public DamageSource(net.minecraft.entity.damage.DamageSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry type() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.type); }
// public void type(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.type = value.wrapperContained; }
// public yarnwrap.entity.Entity attacker() { return new yarnwrap.entity.Entity(wrapperContained.attacker); }
// public void attacker(yarnwrap.entity.Entity value) { wrapperContained.attacker = value.wrapperContained; }
// public yarnwrap.entity.Entity source() { return new yarnwrap.entity.Entity(wrapperContained.source); }
// public void source(yarnwrap.entity.Entity value) { wrapperContained.source = value.wrapperContained; }
// public yarnwrap.util.math.Vec3d position() { return new yarnwrap.util.math.Vec3d(wrapperContained.position); }
// public void position(yarnwrap.util.math.Vec3d value) { wrapperContained.position = value.wrapperContained; }
public boolean isIn(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.isIn(tag.wrapperContained); }
public yarnwrap.util.math.Vec3d getStoredPosition() { return new yarnwrap.util.math.Vec3d(wrapperContained.getStoredPosition()); }
public yarnwrap.entity.damage.DamageType getType() { return new yarnwrap.entity.damage.DamageType(wrapperContained.getType()); }
public yarnwrap.registry.entry.RegistryEntry getTypeRegistryEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getTypeRegistryEntry()); }
public boolean isOf(yarnwrap.registry.RegistryKey typeKey) { return wrapperContained.isOf(typeKey.wrapperContained); }
public yarnwrap.text.Text getDeathMessage(yarnwrap.entity.LivingEntity killed) { return new yarnwrap.text.Text(wrapperContained.getDeathMessage(killed.wrapperContained)); }
public yarnwrap.util.math.Vec3d getPosition() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPosition()); }
public boolean isScaledWithDifficulty() { return wrapperContained.isScaledWithDifficulty(); }
public java.lang.String getName() { return wrapperContained.getName(); }
public yarnwrap.entity.Entity getSource() { return new yarnwrap.entity.Entity(wrapperContained.getSource()); }
public float getExhaustion() { return wrapperContained.getExhaustion(); }
public yarnwrap.entity.Entity getAttacker() { return new yarnwrap.entity.Entity(wrapperContained.getAttacker()); }
public boolean isSourceCreativePlayer() { return wrapperContained.isSourceCreativePlayer(); }
public boolean isDirect() { return wrapperContained.isDirect(); }
public yarnwrap.item.ItemStack getWeaponStack() { return new yarnwrap.item.ItemStack(wrapperContained.getWeaponStack()); }

}