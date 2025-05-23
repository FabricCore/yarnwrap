package yarnwrap.entity.mob;
public class Hoglin { public net.minecraft.entity.mob.Hoglin wrapperContained; public Hoglin(net.minecraft.entity.mob.Hoglin wrapperContained) { this.wrapperContained = wrapperContained; }

public int getMovementCooldownTicks() { return wrapperContained.getMovementCooldownTicks(); }
// public static int getMovementCooldownTicks() { return net.minecraft.entity.mob.Hoglin.getMovementCooldownTicks(); }
// public boolean tryAttack(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity attacker,yarnwrap.entity.LivingEntity target) { return wrapperContained.tryAttack(world.wrapperContained,attacker.wrapperContained,target.wrapperContained); }
// public static boolean tryAttack(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity attacker,yarnwrap.entity.LivingEntity target, ) { return net.minecraft.entity.mob.Hoglin.tryAttack(world.wrapperContained,attacker.wrapperContained,target.wrapperContained); }
// public void knockback(yarnwrap.entity.LivingEntity attacker,yarnwrap.entity.LivingEntity target) { wrapperContained.knockback(attacker.wrapperContained,target.wrapperContained); }
// public static void knockback(yarnwrap.entity.LivingEntity attacker,yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.mob.Hoglin.knockback(attacker.wrapperContained,target.wrapperContained); }

}