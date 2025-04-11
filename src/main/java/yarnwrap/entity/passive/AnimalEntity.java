package yarnwrap.entity.passive;
public class AnimalEntity { public net.minecraft.entity.passive.AnimalEntity wrapperContained; public AnimalEntity(net.minecraft.entity.passive.AnimalEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int BREEDING_COOLDOWN() { return wrapperContained.BREEDING_COOLDOWN; }
// public void BREEDING_COOLDOWN(int value) { wrapperContained.BREEDING_COOLDOWN = value; }
// public java.util.UUID lovingPlayer() { return wrapperContained.lovingPlayer; }
// public void lovingPlayer(java.util.UUID value) { wrapperContained.lovingPlayer = value; }
// public int loveTicks() { return wrapperContained.loveTicks; }
// public void loveTicks(int value) { wrapperContained.loveTicks = value; }
public boolean isValidNaturalSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.isValidNaturalSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public void breed(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.AnimalEntity other) { wrapperContained.breed(world.wrapperContained,other.wrapperContained); }
public int getLoveTicks() { return wrapperContained.getLoveTicks(); }
// public boolean isLightLevelValidForNaturalSpawn(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isLightLevelValidForNaturalSpawn(world.wrapperContained,pos.wrapperContained); }
public void breed(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.AnimalEntity other,yarnwrap.entity.passive.PassiveEntity baby) { wrapperContained.breed(world.wrapperContained,other.wrapperContained,baby.wrapperContained); }
public boolean canBreedWith(yarnwrap.entity.passive.AnimalEntity other) { return wrapperContained.canBreedWith(other.wrapperContained); }
// public void eat(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack) { wrapperContained.eat(player.wrapperContained,hand.wrapperContained,stack.wrapperContained); }
public void setLoveTicks(int loveTicks) { wrapperContained.setLoveTicks(loveTicks); }
public void resetLoveTicks() { wrapperContained.resetLoveTicks(); }
public yarnwrap.server.network.ServerPlayerEntity getLovingPlayer() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getLovingPlayer()); }
public boolean isInLove() { return wrapperContained.isInLove(); }
public void lovePlayer(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.lovePlayer(player.wrapperContained); }
public boolean isBreedingItem(yarnwrap.item.ItemStack stack) { return wrapperContained.isBreedingItem(stack.wrapperContained); }
public boolean canEat() { return wrapperContained.canEat(); }

}