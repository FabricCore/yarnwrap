package yarnwrap.entity.damage;
public class DamageTracker { public net.minecraft.entity.damage.DamageTracker wrapperContained; public DamageTracker(net.minecraft.entity.damage.DamageTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DAMAGE_COOLDOWN() { return wrapperContained.DAMAGE_COOLDOWN; }
// public void DAMAGE_COOLDOWN(int value) { wrapperContained.DAMAGE_COOLDOWN = value; }
public static int DAMAGE_COOLDOWN() { return net.minecraft.entity.damage.DamageTracker.DAMAGE_COOLDOWN; }
// public static void DAMAGE_COOLDOWN(int value, ) { net.minecraft.entity.damage.DamageTracker.DAMAGE_COOLDOWN = value; }

// public int ATTACK_DAMAGE_COOLDOWN() { return wrapperContained.ATTACK_DAMAGE_COOLDOWN; }
// public void ATTACK_DAMAGE_COOLDOWN(int value) { wrapperContained.ATTACK_DAMAGE_COOLDOWN = value; }
public static int ATTACK_DAMAGE_COOLDOWN() { return net.minecraft.entity.damage.DamageTracker.ATTACK_DAMAGE_COOLDOWN; }
// public static void ATTACK_DAMAGE_COOLDOWN(int value, ) { net.minecraft.entity.damage.DamageTracker.ATTACK_DAMAGE_COOLDOWN = value; }

// public yarnwrap.text.Style INTENTIONAL_GAME_DESIGN_ISSUE_LINK_STYLE() { return new yarnwrap.text.Style(wrapperContained.INTENTIONAL_GAME_DESIGN_ISSUE_LINK_STYLE); }
// public void INTENTIONAL_GAME_DESIGN_ISSUE_LINK_STYLE(yarnwrap.text.Style value) { wrapperContained.INTENTIONAL_GAME_DESIGN_ISSUE_LINK_STYLE = value.wrapperContained; }
// public static yarnwrap.text.Style INTENTIONAL_GAME_DESIGN_ISSUE_LINK_STYLE() { return new yarnwrap.text.Style(net.minecraft.entity.damage.DamageTracker.INTENTIONAL_GAME_DESIGN_ISSUE_LINK_STYLE); }
// public static void INTENTIONAL_GAME_DESIGN_ISSUE_LINK_STYLE(yarnwrap.text.Style value, ) { net.minecraft.entity.damage.DamageTracker.INTENTIONAL_GAME_DESIGN_ISSUE_LINK_STYLE = value.wrapperContained; }

// public java.util.List recentDamage() { return wrapperContained.recentDamage; }
// public void recentDamage(java.util.List value) { wrapperContained.recentDamage = value; }
// public static java.util.List recentDamage() { return net.minecraft.entity.damage.DamageTracker.recentDamage; }
// public static void recentDamage(java.util.List value, ) { net.minecraft.entity.damage.DamageTracker.recentDamage = value; }

// public boolean hasDamage() { return wrapperContained.hasDamage; }
// public void hasDamage(boolean value) { wrapperContained.hasDamage = value; }
// public static boolean hasDamage() { return net.minecraft.entity.damage.DamageTracker.hasDamage; }
// public static void hasDamage(boolean value, ) { net.minecraft.entity.damage.DamageTracker.hasDamage = value; }

// public int ageOnLastUpdate() { return wrapperContained.ageOnLastUpdate; }
// public void ageOnLastUpdate(int value) { wrapperContained.ageOnLastUpdate = value; }
// public static int ageOnLastUpdate() { return net.minecraft.entity.damage.DamageTracker.ageOnLastUpdate; }
// public static void ageOnLastUpdate(int value, ) { net.minecraft.entity.damage.DamageTracker.ageOnLastUpdate = value; }

// public boolean recentlyAttacked() { return wrapperContained.recentlyAttacked; }
// public void recentlyAttacked(boolean value) { wrapperContained.recentlyAttacked = value; }
// public static boolean recentlyAttacked() { return net.minecraft.entity.damage.DamageTracker.recentlyAttacked; }
// public static void recentlyAttacked(boolean value, ) { net.minecraft.entity.damage.DamageTracker.recentlyAttacked = value; }

// public int ageOnLastAttacked() { return wrapperContained.ageOnLastAttacked; }
// public void ageOnLastAttacked(int value) { wrapperContained.ageOnLastAttacked = value; }
// public static int ageOnLastAttacked() { return net.minecraft.entity.damage.DamageTracker.ageOnLastAttacked; }
// public static void ageOnLastAttacked(int value, ) { net.minecraft.entity.damage.DamageTracker.ageOnLastAttacked = value; }

// public int ageOnLastDamage() { return wrapperContained.ageOnLastDamage; }
// public void ageOnLastDamage(int value) { wrapperContained.ageOnLastDamage = value; }
// public static int ageOnLastDamage() { return net.minecraft.entity.damage.DamageTracker.ageOnLastDamage; }
// public static void ageOnLastDamage(int value, ) { net.minecraft.entity.damage.DamageTracker.ageOnLastDamage = value; }

// public yarnwrap.entity.LivingEntity entity() { return new yarnwrap.entity.LivingEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.LivingEntity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity entity() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.damage.DamageTracker.entity); }
// public static void entity(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.damage.DamageTracker.entity = value.wrapperContained; }

public DamageTracker(yarnwrap.entity.LivingEntity entity) { this.wrapperContained = new net.minecraft.entity.damage.DamageTracker(entity.wrapperContained); }
// public yarnwrap.text.Text getFallDeathMessage(yarnwrap.entity.damage.DamageRecord damageRecord,yarnwrap.entity.Entity attacker) { return new yarnwrap.text.Text(wrapperContained.getFallDeathMessage(damageRecord.wrapperContained,attacker.wrapperContained)); }
// public static yarnwrap.text.Text getFallDeathMessage(yarnwrap.entity.damage.DamageRecord damageRecord,yarnwrap.entity.Entity attacker, ) { return new yarnwrap.text.Text(net.minecraft.entity.damage.DamageTracker.getFallDeathMessage(damageRecord.wrapperContained,attacker.wrapperContained)); }
// public boolean isAttackerLiving(yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.isAttackerLiving(damageSource.wrapperContained); }
// public static boolean isAttackerLiving(yarnwrap.entity.damage.DamageSource damageSource, ) { return net.minecraft.entity.damage.DamageTracker.isAttackerLiving(damageSource.wrapperContained); }
// public yarnwrap.text.Text getDisplayName(yarnwrap.entity.Entity entity) { return new yarnwrap.text.Text(wrapperContained.getDisplayName(entity.wrapperContained)); }
// public static yarnwrap.text.Text getDisplayName(yarnwrap.entity.Entity entity, ) { return new yarnwrap.text.Text(net.minecraft.entity.damage.DamageTracker.getDisplayName(entity.wrapperContained)); }
// public yarnwrap.text.Text getAttackedFallDeathMessage(yarnwrap.entity.Entity attacker,yarnwrap.text.Text attackerDisplayName,java.lang.String itemDeathTranslationKey,java.lang.String deathTranslationKey) { return new yarnwrap.text.Text(wrapperContained.getAttackedFallDeathMessage(attacker.wrapperContained,attackerDisplayName.wrapperContained,itemDeathTranslationKey,deathTranslationKey)); }
// public static yarnwrap.text.Text getAttackedFallDeathMessage(yarnwrap.entity.Entity attacker,yarnwrap.text.Text attackerDisplayName,java.lang.String itemDeathTranslationKey,java.lang.String deathTranslationKey, ) { return new yarnwrap.text.Text(net.minecraft.entity.damage.DamageTracker.getAttackedFallDeathMessage(attacker.wrapperContained,attackerDisplayName.wrapperContained,itemDeathTranslationKey,deathTranslationKey)); }
public void update() { wrapperContained.update(); }
// public static void update() { net.minecraft.entity.damage.DamageTracker.update(); }
// public yarnwrap.entity.damage.DamageRecord getBiggestFall() { return new yarnwrap.entity.damage.DamageRecord(wrapperContained.getBiggestFall()); }
// public static yarnwrap.entity.damage.DamageRecord getBiggestFall() { return new yarnwrap.entity.damage.DamageRecord(net.minecraft.entity.damage.DamageTracker.getBiggestFall()); }
public int getTimeSinceLastAttack() { return wrapperContained.getTimeSinceLastAttack(); }
// public static int getTimeSinceLastAttack() { return net.minecraft.entity.damage.DamageTracker.getTimeSinceLastAttack(); }
public void onDamage(yarnwrap.entity.damage.DamageSource damageSource,float damage) { wrapperContained.onDamage(damageSource.wrapperContained,damage); }
// public static void onDamage(yarnwrap.entity.damage.DamageSource damageSource,float damage, ) { net.minecraft.entity.damage.DamageTracker.onDamage(damageSource.wrapperContained,damage); }
public yarnwrap.text.Text getDeathMessage() { return new yarnwrap.text.Text(wrapperContained.getDeathMessage()); }
// public static yarnwrap.text.Text getDeathMessage() { return new yarnwrap.text.Text(net.minecraft.entity.damage.DamageTracker.getDeathMessage()); }

}