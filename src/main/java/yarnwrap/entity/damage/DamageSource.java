package yarnwrap.entity.damage;
public class DamageSource { public net.minecraft.entity.damage.DamageSource wrapperContained; public DamageSource(net.minecraft.entity.damage.DamageSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry type() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.type); }
// public void type(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry type() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.entity.damage.DamageSource.type); }
// public static void type(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.entity.damage.DamageSource.type = value.wrapperContained; }

// public yarnwrap.entity.Entity attacker() { return new yarnwrap.entity.Entity(wrapperContained.attacker); }
// public void attacker(yarnwrap.entity.Entity value) { wrapperContained.attacker = value.wrapperContained; }
// public static yarnwrap.entity.Entity attacker() { return new yarnwrap.entity.Entity(net.minecraft.entity.damage.DamageSource.attacker); }
// public static void attacker(yarnwrap.entity.Entity value, ) { net.minecraft.entity.damage.DamageSource.attacker = value.wrapperContained; }

// public yarnwrap.entity.Entity source() { return new yarnwrap.entity.Entity(wrapperContained.source); }
// public void source(yarnwrap.entity.Entity value) { wrapperContained.source = value.wrapperContained; }
// public static yarnwrap.entity.Entity source() { return new yarnwrap.entity.Entity(net.minecraft.entity.damage.DamageSource.source); }
// public static void source(yarnwrap.entity.Entity value, ) { net.minecraft.entity.damage.DamageSource.source = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d position() { return new yarnwrap.util.math.Vec3d(wrapperContained.position); }
// public void position(yarnwrap.util.math.Vec3d value) { wrapperContained.position = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d position() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.damage.DamageSource.position); }
// public static void position(yarnwrap.util.math.Vec3d value, ) { net.minecraft.entity.damage.DamageSource.position = value.wrapperContained; }

public DamageSource(yarnwrap.registry.entry.RegistryEntry type) { this.wrapperContained = new net.minecraft.entity.damage.DamageSource(type.wrapperContained); }
public DamageSource(yarnwrap.registry.entry.RegistryEntry type,yarnwrap.util.math.Vec3d position) { this.wrapperContained = new net.minecraft.entity.damage.DamageSource(type.wrapperContained,position.wrapperContained); }
public DamageSource(yarnwrap.registry.entry.RegistryEntry type,yarnwrap.entity.Entity attacker) { this.wrapperContained = new net.minecraft.entity.damage.DamageSource(type.wrapperContained,attacker.wrapperContained); }
public DamageSource(yarnwrap.registry.entry.RegistryEntry type,yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker) { this.wrapperContained = new net.minecraft.entity.damage.DamageSource(type.wrapperContained,source.wrapperContained,attacker.wrapperContained); }
// public DamageSource(yarnwrap.registry.entry.RegistryEntry type,yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker,yarnwrap.util.math.Vec3d position) { this.wrapperContained = new net.minecraft.entity.damage.DamageSource(type.wrapperContained,source.wrapperContained,attacker.wrapperContained,position.wrapperContained); }
public yarnwrap.text.Text getDeathMessage(yarnwrap.entity.LivingEntity killed) { return new yarnwrap.text.Text(wrapperContained.getDeathMessage(killed.wrapperContained)); }
// public static yarnwrap.text.Text getDeathMessage(yarnwrap.entity.LivingEntity killed, ) { return new yarnwrap.text.Text(net.minecraft.entity.damage.DamageSource.getDeathMessage(killed.wrapperContained)); }
public yarnwrap.util.math.Vec3d getPosition() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPosition()); }
// public static yarnwrap.util.math.Vec3d getPosition() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.damage.DamageSource.getPosition()); }
public boolean isScaledWithDifficulty() { return wrapperContained.isScaledWithDifficulty(); }
// public static boolean isScaledWithDifficulty() { return net.minecraft.entity.damage.DamageSource.isScaledWithDifficulty(); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.entity.damage.DamageSource.getName(); }
public yarnwrap.entity.Entity getSource() { return new yarnwrap.entity.Entity(wrapperContained.getSource()); }
// public static yarnwrap.entity.Entity getSource() { return new yarnwrap.entity.Entity(net.minecraft.entity.damage.DamageSource.getSource()); }
public float getExhaustion() { return wrapperContained.getExhaustion(); }
// public static float getExhaustion() { return net.minecraft.entity.damage.DamageSource.getExhaustion(); }
public yarnwrap.entity.Entity getAttacker() { return new yarnwrap.entity.Entity(wrapperContained.getAttacker()); }
// public static yarnwrap.entity.Entity getAttacker() { return new yarnwrap.entity.Entity(net.minecraft.entity.damage.DamageSource.getAttacker()); }
public boolean isSourceCreativePlayer() { return wrapperContained.isSourceCreativePlayer(); }
// public static boolean isSourceCreativePlayer() { return net.minecraft.entity.damage.DamageSource.isSourceCreativePlayer(); }
public boolean isIn(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.isIn(tag.wrapperContained); }
// public static boolean isIn(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.entity.damage.DamageSource.isIn(tag.wrapperContained); }
public yarnwrap.util.math.Vec3d getStoredPosition() { return new yarnwrap.util.math.Vec3d(wrapperContained.getStoredPosition()); }
// public static yarnwrap.util.math.Vec3d getStoredPosition() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.damage.DamageSource.getStoredPosition()); }
public yarnwrap.entity.damage.DamageType getType() { return new yarnwrap.entity.damage.DamageType(wrapperContained.getType()); }
// public static yarnwrap.entity.damage.DamageType getType() { return new yarnwrap.entity.damage.DamageType(net.minecraft.entity.damage.DamageSource.getType()); }
public yarnwrap.registry.entry.RegistryEntry getTypeRegistryEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getTypeRegistryEntry()); }
// public static yarnwrap.registry.entry.RegistryEntry getTypeRegistryEntry() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.entity.damage.DamageSource.getTypeRegistryEntry()); }
public boolean isOf(yarnwrap.registry.RegistryKey typeKey) { return wrapperContained.isOf(typeKey.wrapperContained); }
// public static boolean isOf(yarnwrap.registry.RegistryKey typeKey, ) { return net.minecraft.entity.damage.DamageSource.isOf(typeKey.wrapperContained); }
public boolean isDirect() { return wrapperContained.isDirect(); }
// public static boolean isDirect() { return net.minecraft.entity.damage.DamageSource.isDirect(); }
public yarnwrap.item.ItemStack getWeaponStack() { return new yarnwrap.item.ItemStack(wrapperContained.getWeaponStack()); }
// public static yarnwrap.item.ItemStack getWeaponStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.damage.DamageSource.getWeaponStack()); }

}