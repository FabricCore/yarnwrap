package yarnwrap.entity.damage;
public class DamageTypes { public net.minecraft.entity.damage.DamageTypes wrapperContained; public DamageTypes(net.minecraft.entity.damage.DamageTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey MOB_ATTACK_NO_AGGRO() { return new yarnwrap.registry.RegistryKey(wrapperContained.MOB_ATTACK_NO_AGGRO); }
public yarnwrap.registry.RegistryKey PLAYER_ATTACK() { return new yarnwrap.registry.RegistryKey(wrapperContained.PLAYER_ATTACK); }
public yarnwrap.registry.RegistryKey ARROW() { return new yarnwrap.registry.RegistryKey(wrapperContained.ARROW); }
public yarnwrap.registry.RegistryKey TRIDENT() { return new yarnwrap.registry.RegistryKey(wrapperContained.TRIDENT); }
public yarnwrap.registry.RegistryKey MOB_PROJECTILE() { return new yarnwrap.registry.RegistryKey(wrapperContained.MOB_PROJECTILE); }
public yarnwrap.registry.RegistryKey FIREWORKS() { return new yarnwrap.registry.RegistryKey(wrapperContained.FIREWORKS); }
public yarnwrap.registry.RegistryKey FIREBALL() { return new yarnwrap.registry.RegistryKey(wrapperContained.FIREBALL); }
public yarnwrap.registry.RegistryKey UNATTRIBUTED_FIREBALL() { return new yarnwrap.registry.RegistryKey(wrapperContained.UNATTRIBUTED_FIREBALL); }
public yarnwrap.registry.RegistryKey WITHER_SKULL() { return new yarnwrap.registry.RegistryKey(wrapperContained.WITHER_SKULL); }
public yarnwrap.registry.RegistryKey THROWN() { return new yarnwrap.registry.RegistryKey(wrapperContained.THROWN); }
public yarnwrap.registry.RegistryKey INDIRECT_MAGIC() { return new yarnwrap.registry.RegistryKey(wrapperContained.INDIRECT_MAGIC); }
public yarnwrap.registry.RegistryKey THORNS() { return new yarnwrap.registry.RegistryKey(wrapperContained.THORNS); }
public yarnwrap.registry.RegistryKey EXPLOSION() { return new yarnwrap.registry.RegistryKey(wrapperContained.EXPLOSION); }
public yarnwrap.registry.RegistryKey PLAYER_EXPLOSION() { return new yarnwrap.registry.RegistryKey(wrapperContained.PLAYER_EXPLOSION); }
public yarnwrap.registry.RegistryKey SONIC_BOOM() { return new yarnwrap.registry.RegistryKey(wrapperContained.SONIC_BOOM); }
public yarnwrap.registry.RegistryKey BAD_RESPAWN_POINT() { return new yarnwrap.registry.RegistryKey(wrapperContained.BAD_RESPAWN_POINT); }
public yarnwrap.registry.RegistryKey IN_FIRE() { return new yarnwrap.registry.RegistryKey(wrapperContained.IN_FIRE); }
public yarnwrap.registry.RegistryKey LIGHTNING_BOLT() { return new yarnwrap.registry.RegistryKey(wrapperContained.LIGHTNING_BOLT); }
public yarnwrap.registry.RegistryKey ON_FIRE() { return new yarnwrap.registry.RegistryKey(wrapperContained.ON_FIRE); }
public yarnwrap.registry.RegistryKey LAVA() { return new yarnwrap.registry.RegistryKey(wrapperContained.LAVA); }
public yarnwrap.registry.RegistryKey HOT_FLOOR() { return new yarnwrap.registry.RegistryKey(wrapperContained.HOT_FLOOR); }
public yarnwrap.registry.RegistryKey IN_WALL() { return new yarnwrap.registry.RegistryKey(wrapperContained.IN_WALL); }
public yarnwrap.registry.RegistryKey CRAMMING() { return new yarnwrap.registry.RegistryKey(wrapperContained.CRAMMING); }
public yarnwrap.registry.RegistryKey DROWN() { return new yarnwrap.registry.RegistryKey(wrapperContained.DROWN); }
public yarnwrap.registry.RegistryKey STARVE() { return new yarnwrap.registry.RegistryKey(wrapperContained.STARVE); }
public yarnwrap.registry.RegistryKey CACTUS() { return new yarnwrap.registry.RegistryKey(wrapperContained.CACTUS); }
public yarnwrap.registry.RegistryKey FALL() { return new yarnwrap.registry.RegistryKey(wrapperContained.FALL); }
public yarnwrap.registry.RegistryKey FLY_INTO_WALL() { return new yarnwrap.registry.RegistryKey(wrapperContained.FLY_INTO_WALL); }
public yarnwrap.registry.RegistryKey OUT_OF_WORLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.OUT_OF_WORLD); }
public yarnwrap.registry.RegistryKey GENERIC() { return new yarnwrap.registry.RegistryKey(wrapperContained.GENERIC); }
public yarnwrap.registry.RegistryKey MAGIC() { return new yarnwrap.registry.RegistryKey(wrapperContained.MAGIC); }
public yarnwrap.registry.RegistryKey WITHER() { return new yarnwrap.registry.RegistryKey(wrapperContained.WITHER); }
public yarnwrap.registry.RegistryKey DRAGON_BREATH() { return new yarnwrap.registry.RegistryKey(wrapperContained.DRAGON_BREATH); }
public yarnwrap.registry.RegistryKey DRY_OUT() { return new yarnwrap.registry.RegistryKey(wrapperContained.DRY_OUT); }
public yarnwrap.registry.RegistryKey SWEET_BERRY_BUSH() { return new yarnwrap.registry.RegistryKey(wrapperContained.SWEET_BERRY_BUSH); }
public yarnwrap.registry.RegistryKey FREEZE() { return new yarnwrap.registry.RegistryKey(wrapperContained.FREEZE); }
public yarnwrap.registry.RegistryKey STALAGMITE() { return new yarnwrap.registry.RegistryKey(wrapperContained.STALAGMITE); }
public yarnwrap.registry.RegistryKey FALLING_BLOCK() { return new yarnwrap.registry.RegistryKey(wrapperContained.FALLING_BLOCK); }
public yarnwrap.registry.RegistryKey FALLING_ANVIL() { return new yarnwrap.registry.RegistryKey(wrapperContained.FALLING_ANVIL); }
public yarnwrap.registry.RegistryKey FALLING_STALACTITE() { return new yarnwrap.registry.RegistryKey(wrapperContained.FALLING_STALACTITE); }
public yarnwrap.registry.RegistryKey STING() { return new yarnwrap.registry.RegistryKey(wrapperContained.STING); }
public yarnwrap.registry.RegistryKey MOB_ATTACK() { return new yarnwrap.registry.RegistryKey(wrapperContained.MOB_ATTACK); }
public yarnwrap.registry.RegistryKey OUTSIDE_BORDER() { return new yarnwrap.registry.RegistryKey(wrapperContained.OUTSIDE_BORDER); }
public yarnwrap.registry.RegistryKey GENERIC_KILL() { return new yarnwrap.registry.RegistryKey(wrapperContained.GENERIC_KILL); }
public yarnwrap.registry.RegistryKey SPIT() { return new yarnwrap.registry.RegistryKey(wrapperContained.SPIT); }
public yarnwrap.registry.RegistryKey WIND_CHARGE() { return new yarnwrap.registry.RegistryKey(wrapperContained.WIND_CHARGE); }
public yarnwrap.registry.RegistryKey CAMPFIRE() { return new yarnwrap.registry.RegistryKey(wrapperContained.CAMPFIRE); }
// public void bootstrap(yarnwrap.registry.Registerable damageTypeRegisterable) { wrapperContained.bootstrap(damageTypeRegisterable.wrapperContained); }

}