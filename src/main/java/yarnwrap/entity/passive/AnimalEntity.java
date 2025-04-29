package yarnwrap.entity.passive;
public class AnimalEntity { public net.minecraft.entity.passive.AnimalEntity wrapperContained; public AnimalEntity(net.minecraft.entity.passive.AnimalEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int BREEDING_COOLDOWN() { return wrapperContained.BREEDING_COOLDOWN; }
// public void BREEDING_COOLDOWN(int value) { wrapperContained.BREEDING_COOLDOWN = value; }
// public static int BREEDING_COOLDOWN() { return net.minecraft.entity.passive.AnimalEntity.BREEDING_COOLDOWN; }
// public static void BREEDING_COOLDOWN(int value, ) { net.minecraft.entity.passive.AnimalEntity.BREEDING_COOLDOWN = value; }

// public java.util.UUID lovingPlayer() { return wrapperContained.lovingPlayer; }
// public void lovingPlayer(java.util.UUID value) { wrapperContained.lovingPlayer = value; }
// public static java.util.UUID lovingPlayer() { return net.minecraft.entity.passive.AnimalEntity.lovingPlayer; }
// public static void lovingPlayer(java.util.UUID value, ) { net.minecraft.entity.passive.AnimalEntity.lovingPlayer = value; }

// public int loveTicks() { return wrapperContained.loveTicks; }
// public void loveTicks(int value) { wrapperContained.loveTicks = value; }
// public static int loveTicks() { return net.minecraft.entity.passive.AnimalEntity.loveTicks; }
// public static void loveTicks(int value, ) { net.minecraft.entity.passive.AnimalEntity.loveTicks = value; }

// public boolean isValidNaturalSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.isValidNaturalSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean isValidNaturalSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.AnimalEntity.isValidNaturalSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public void breed(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.AnimalEntity other) { wrapperContained.breed(world.wrapperContained,other.wrapperContained); }
// public static void breed(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.AnimalEntity other, ) { net.minecraft.entity.passive.AnimalEntity.breed(world.wrapperContained,other.wrapperContained); }
public int getLoveTicks() { return wrapperContained.getLoveTicks(); }
// public static int getLoveTicks() { return net.minecraft.entity.passive.AnimalEntity.getLoveTicks(); }
// public boolean isLightLevelValidForNaturalSpawn(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isLightLevelValidForNaturalSpawn(world.wrapperContained,pos.wrapperContained); }
// public static boolean isLightLevelValidForNaturalSpawn(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.passive.AnimalEntity.isLightLevelValidForNaturalSpawn(world.wrapperContained,pos.wrapperContained); }
public void breed(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.AnimalEntity other,yarnwrap.entity.passive.PassiveEntity baby) { wrapperContained.breed(world.wrapperContained,other.wrapperContained,baby.wrapperContained); }
// public static void breed(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.AnimalEntity other,yarnwrap.entity.passive.PassiveEntity baby, ) { net.minecraft.entity.passive.AnimalEntity.breed(world.wrapperContained,other.wrapperContained,baby.wrapperContained); }
// public void method_49795(yarnwrap.entity.passive.AnimalEntity player) { wrapperContained.method_49795(player.wrapperContained); }
// public static void method_49795(yarnwrap.entity.passive.AnimalEntity player, ) { net.minecraft.entity.passive.AnimalEntity.method_49795(player.wrapperContained); }
public boolean canBreedWith(yarnwrap.entity.passive.AnimalEntity other) { return wrapperContained.canBreedWith(other.wrapperContained); }
// public static boolean canBreedWith(yarnwrap.entity.passive.AnimalEntity other, ) { return net.minecraft.entity.passive.AnimalEntity.canBreedWith(other.wrapperContained); }
// public void eat(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack) { wrapperContained.eat(player.wrapperContained,hand.wrapperContained,stack.wrapperContained); }
// public static void eat(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.passive.AnimalEntity.eat(player.wrapperContained,hand.wrapperContained,stack.wrapperContained); }
public void setLoveTicks(int loveTicks) { wrapperContained.setLoveTicks(loveTicks); }
// public static void setLoveTicks(int loveTicks, ) { net.minecraft.entity.passive.AnimalEntity.setLoveTicks(loveTicks); }
public void resetLoveTicks() { wrapperContained.resetLoveTicks(); }
// public static void resetLoveTicks() { net.minecraft.entity.passive.AnimalEntity.resetLoveTicks(); }
public yarnwrap.server.network.ServerPlayerEntity getLovingPlayer() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getLovingPlayer()); }
// public static yarnwrap.server.network.ServerPlayerEntity getLovingPlayer() { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.entity.passive.AnimalEntity.getLovingPlayer()); }
public boolean isInLove() { return wrapperContained.isInLove(); }
// public static boolean isInLove() { return net.minecraft.entity.passive.AnimalEntity.isInLove(); }
public void lovePlayer(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.lovePlayer(player.wrapperContained); }
// public static void lovePlayer(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.entity.passive.AnimalEntity.lovePlayer(player.wrapperContained); }
public boolean isBreedingItem(yarnwrap.item.ItemStack stack) { return wrapperContained.isBreedingItem(stack.wrapperContained); }
// public static boolean isBreedingItem(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.passive.AnimalEntity.isBreedingItem(stack.wrapperContained); }
public boolean canEat() { return wrapperContained.canEat(); }
// public static boolean canEat() { return net.minecraft.entity.passive.AnimalEntity.canEat(); }

}