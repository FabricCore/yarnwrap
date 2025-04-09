package yarnwrap.entity.mob;
public class PiglinBrain { public net.minecraft.entity.mob.PiglinBrain wrapperContained; public PiglinBrain(net.minecraft.entity.mob.PiglinBrain wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.UniformIntProvider HUNT_MEMORY_DURATION() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.HUNT_MEMORY_DURATION); }
// public yarnwrap.util.math.intprovider.UniformIntProvider MEMORY_TRANSFER_TASK_DURATION() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.MEMORY_TRANSFER_TASK_DURATION); }
// public yarnwrap.util.math.intprovider.UniformIntProvider RIDE_TARGET_MEMORY_DURATION() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.RIDE_TARGET_MEMORY_DURATION); }
// public yarnwrap.util.math.intprovider.UniformIntProvider AVOID_MEMORY_DURATION() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.AVOID_MEMORY_DURATION); }
public yarnwrap.item.Item BARTERING_ITEM() { return new yarnwrap.item.Item(wrapperContained.BARTERING_ITEM); }
// public yarnwrap.util.math.intprovider.UniformIntProvider GO_TO_ZOMBIFIED_MEMORY_DURATION() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.GO_TO_ZOMBIFIED_MEMORY_DURATION); }
// public yarnwrap.util.math.intprovider.UniformIntProvider GO_TO_NEMESIS_MEMORY_DURATION() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.GO_TO_NEMESIS_MEMORY_DURATION); }
// public float START_RIDING_SPEED() { return wrapperContained.START_RIDING_SPEED; }
// public int AVOID_TARGET_EXPIRY() { return wrapperContained.AVOID_TARGET_EXPIRY; }
// public int ADMIRING_DISABLED_EXPIRY() { return wrapperContained.ADMIRING_DISABLED_EXPIRY; }
// public float CROSSBOW_ATTACK_FORWARD_MOVEMENT() { return wrapperContained.CROSSBOW_ATTACK_FORWARD_MOVEMENT; }
// public boolean hasBeenHitByPlayer(yarnwrap.entity.mob.PiglinEntity piglin) { return wrapperContained.hasBeenHitByPlayer(piglin.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.RandomTask makeRandomFollowTask() { return new yarnwrap.entity.ai.brain.task.RandomTask(wrapperContained.makeRandomFollowTask()); }
// public yarnwrap.entity.ai.brain.task.RandomTask makeRandomWanderTask() { return new yarnwrap.entity.ai.brain.task.RandomTask(wrapperContained.makeRandomWanderTask()); }
public boolean wearsGoldArmor(yarnwrap.entity.LivingEntity entity) { return wrapperContained.wearsGoldArmor(entity.wrapperContained); }
// public void tickActivities(yarnwrap.entity.mob.PiglinEntity piglin) { wrapperContained.tickActivities(piglin.wrapperContained); }
// public boolean canRide(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.entity.Entity ridden) { return wrapperContained.canRide(piglin.wrapperContained,ridden.wrapperContained); }
// public void onAttacked(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.entity.LivingEntity attacker) { wrapperContained.onAttacked(piglin.wrapperContained,attacker.wrapperContained); }
// public void addCoreActivities(yarnwrap.entity.ai.brain.Brain piglin) { wrapperContained.addCoreActivities(piglin.wrapperContained); }
// public void loot(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.entity.ItemEntity drop) { wrapperContained.loot(piglin.wrapperContained,drop.wrapperContained); }
// public void dropBarteredItem(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.entity.player.PlayerEntity player,java.util.List items) { wrapperContained.dropBarteredItem(piglin.wrapperContained,player.wrapperContained,items); }
public yarnwrap.util.ActionResult playerInteract(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.playerInteract(piglin.wrapperContained,player.wrapperContained,hand.wrapperContained)); }
// public boolean canGather(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.item.ItemStack stack) { return wrapperContained.canGather(piglin.wrapperContained,stack.wrapperContained); }
// public void drop(yarnwrap.entity.mob.PiglinEntity piglin,java.util.List items,yarnwrap.util.math.Vec3d pos) { wrapperContained.drop(piglin.wrapperContained,items,pos.wrapperContained); }
// public yarnwrap.entity.ai.brain.Brain create(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.entity.ai.brain.Brain brain) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.create(piglin.wrapperContained,brain.wrapperContained)); }
public void onGuardedBlockInteracted(yarnwrap.entity.player.PlayerEntity player,boolean blockOpen) { wrapperContained.onGuardedBlockInteracted(player.wrapperContained,blockOpen); }
// public boolean isGoldenItem(yarnwrap.item.ItemStack stack) { return wrapperContained.isGoldenItem(stack.wrapperContained); }
// public void setHuntedRecently(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.util.math.random.Random random) { wrapperContained.setHuntedRecently(piglin.wrapperContained,random.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.Task makeRememberRideableHoglinTask() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.makeRememberRideableHoglinTask()); }
// public yarnwrap.entity.ai.brain.task.Task makeGoToSoulFireTask() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.makeGoToSoulFireTask()); }
public boolean isGoldHoldingPlayer(yarnwrap.entity.LivingEntity target) { return wrapperContained.isGoldHoldingPlayer(target.wrapperContained); }
// public void consumeOffHandItem(yarnwrap.entity.mob.PiglinEntity piglin,boolean barter) { wrapperContained.consumeOffHandItem(piglin.wrapperContained,barter); }
// public void angerAtCloserTargets(yarnwrap.entity.mob.AbstractPiglinEntity piglin,yarnwrap.entity.LivingEntity target) { wrapperContained.angerAtCloserTargets(piglin.wrapperContained,target.wrapperContained); }
// public void addIdleActivities(yarnwrap.entity.ai.brain.Brain piglin) { wrapperContained.addIdleActivities(piglin.wrapperContained); }
// public boolean acceptsForBarter(yarnwrap.item.ItemStack stack) { return wrapperContained.acceptsForBarter(stack.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.Task makeFleeFromZombifiedPiglinTask() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.makeFleeFromZombifiedPiglinTask()); }
// public boolean isHoldingCrossbow(yarnwrap.entity.LivingEntity piglin) { return wrapperContained.isHoldingCrossbow(piglin.wrapperContained); }
// public void becomeAngryWith(yarnwrap.entity.mob.AbstractPiglinEntity piglin,yarnwrap.entity.LivingEntity target) { wrapperContained.becomeAngryWith(piglin.wrapperContained,target.wrapperContained); }
// public void addFightActivities(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addFightActivities(piglin.wrapperContained,brain.wrapperContained); }
// public boolean isFood(yarnwrap.item.ItemStack stack) { return wrapperContained.isFood(stack.wrapperContained); }
// public void setAdmiringItem(yarnwrap.entity.LivingEntity entity) { wrapperContained.setAdmiringItem(entity.wrapperContained); }
// public boolean isPreferredAttackTarget(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.entity.LivingEntity target) { return wrapperContained.isPreferredAttackTarget(piglin.wrapperContained,target.wrapperContained); }
// public void addCelebrateActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addCelebrateActivities(brain.wrapperContained); }
// public void tryRevenge(yarnwrap.entity.mob.AbstractPiglinEntity piglin,yarnwrap.entity.LivingEntity target) { wrapperContained.tryRevenge(piglin.wrapperContained,target.wrapperContained); }
// public void addAdmireItemActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addAdmireItemActivities(brain.wrapperContained); }
// public boolean hasPlayerHoldingWantedItemNearby(yarnwrap.entity.LivingEntity entity) { return wrapperContained.hasPlayerHoldingWantedItemNearby(entity.wrapperContained); }
// public void rememberHunting(yarnwrap.entity.mob.AbstractPiglinEntity piglin) { wrapperContained.rememberHunting(piglin.wrapperContained); }
// public void angerAtIfCloser(yarnwrap.entity.mob.AbstractPiglinEntity piglin,yarnwrap.entity.LivingEntity target) { wrapperContained.angerAtIfCloser(piglin.wrapperContained,target.wrapperContained); }
// public void addAvoidActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addAvoidActivities(brain.wrapperContained); }
// public boolean canWander(yarnwrap.entity.LivingEntity piglin) { return wrapperContained.canWander(piglin.wrapperContained); }
// public boolean hasIdleActivity(yarnwrap.entity.mob.AbstractPiglinEntity piglin) { return wrapperContained.hasIdleActivity(piglin.wrapperContained); }
// public void groupRunAwayFrom(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.entity.LivingEntity target) { wrapperContained.groupRunAwayFrom(piglin.wrapperContained,target.wrapperContained); }
// public void addRideActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addRideActivities(brain.wrapperContained); }
// public boolean hasBeenHurt(yarnwrap.entity.LivingEntity piglin) { return wrapperContained.hasBeenHurt(piglin.wrapperContained); }
// public void runAwayFromClosestTarget(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.entity.LivingEntity target) { wrapperContained.runAwayFromClosestTarget(piglin.wrapperContained,target.wrapperContained); }
// public void doBarter(yarnwrap.entity.mob.PiglinEntity piglin,java.util.List items) { wrapperContained.doBarter(piglin.wrapperContained,items); }
// public void runAwayFrom(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.entity.LivingEntity target) { wrapperContained.runAwayFrom(piglin.wrapperContained,target.wrapperContained); }
// public void dropBarteredItem(yarnwrap.entity.mob.PiglinEntity piglin,java.util.List items) { wrapperContained.dropBarteredItem(piglin.wrapperContained,items); }
// public java.util.List getBarteredItem(yarnwrap.entity.mob.PiglinEntity piglin) { return wrapperContained.getBarteredItem(piglin.wrapperContained); }
// public java.util.Optional getPreferredTarget(yarnwrap.entity.mob.PiglinEntity piglin) { return wrapperContained.getPreferredTarget(piglin.wrapperContained); }
// public java.util.List getNearbyVisiblePiglins(yarnwrap.entity.mob.PiglinEntity piglin) { return wrapperContained.getNearbyVisiblePiglins(piglin.wrapperContained); }
// public void stopWalking(yarnwrap.entity.mob.PiglinEntity piglin) { wrapperContained.stopWalking(piglin.wrapperContained); }
// public java.util.Optional getAngryAt(yarnwrap.entity.mob.AbstractPiglinEntity piglin) { return wrapperContained.getAngryAt(piglin.wrapperContained); }
// public boolean shouldRunAwayFromHoglins(yarnwrap.entity.mob.PiglinEntity piglin) { return wrapperContained.shouldRunAwayFromHoglins(piglin.wrapperContained); }
// public boolean hasNoAdvantageAgainstHoglins(yarnwrap.entity.mob.PiglinEntity piglin) { return wrapperContained.hasNoAdvantageAgainstHoglins(piglin.wrapperContained); }
// public boolean hasOutnumberedHoglins(yarnwrap.entity.mob.PiglinEntity piglins) { return wrapperContained.hasOutnumberedHoglins(piglins.wrapperContained); }
// public void setEatenRecently(yarnwrap.entity.mob.PiglinEntity piglin) { wrapperContained.setEatenRecently(piglin.wrapperContained); }
// public yarnwrap.util.math.Vec3d findGround(yarnwrap.entity.mob.PiglinEntity piglin) { return new yarnwrap.util.math.Vec3d(wrapperContained.findGround(piglin.wrapperContained)); }
// public boolean hasAteRecently(yarnwrap.entity.mob.PiglinEntity piglin) { return wrapperContained.hasAteRecently(piglin.wrapperContained); }
// public boolean isAdmiringItem(yarnwrap.entity.mob.PiglinEntity entity) { return wrapperContained.isAdmiringItem(entity.wrapperContained); }
// public boolean hasSoulFireNearby(yarnwrap.entity.mob.PiglinEntity piglin) { return wrapperContained.hasSoulFireNearby(piglin.wrapperContained); }
// public yarnwrap.item.ItemStack getItemFromStack(yarnwrap.entity.ItemEntity stack) { return new yarnwrap.item.ItemStack(wrapperContained.getItemFromStack(stack.wrapperContained)); }
// public void barterItem(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.item.ItemStack stack) { wrapperContained.barterItem(piglin.wrapperContained,stack.wrapperContained); }
// public boolean doesNotHaveGoldInOffHand(yarnwrap.entity.mob.PiglinEntity piglin) { return wrapperContained.doesNotHaveGoldInOffHand(piglin.wrapperContained); }
// public boolean hasItemInOffHand(yarnwrap.entity.mob.PiglinEntity piglin) { return wrapperContained.hasItemInOffHand(piglin.wrapperContained); }
// public void pickupItemWithOffHand(yarnwrap.entity.mob.PiglinEntity piglin) { wrapperContained.pickupItemWithOffHand(piglin.wrapperContained); }
// public java.util.List getNearbyPiglins(yarnwrap.entity.mob.AbstractPiglinEntity piglin) { return wrapperContained.getNearbyPiglins(piglin.wrapperContained); }
// public boolean isWillingToTrade(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.item.ItemStack nearbyItems) { return wrapperContained.isWillingToTrade(piglin.wrapperContained,nearbyItems.wrapperContained); }
// public boolean isHuntingTarget(yarnwrap.entity.LivingEntity piglin,yarnwrap.entity.LivingEntity target) { return wrapperContained.isHuntingTarget(piglin.wrapperContained,target.wrapperContained); }
// public boolean canRideHoglin(yarnwrap.entity.mob.PiglinEntity piglin) { return wrapperContained.canRideHoglin(piglin.wrapperContained); }
public boolean isZombified(yarnwrap.entity.EntityType entityType) { return wrapperContained.isZombified(entityType.wrapperContained); }
public java.util.Optional getAvoiding(yarnwrap.entity.mob.PiglinEntity piglin) { return wrapperContained.getAvoiding(piglin.wrapperContained); }
// public boolean getNearestZombifiedPiglin(yarnwrap.entity.mob.PiglinEntity piglin) { return wrapperContained.getNearestZombifiedPiglin(piglin.wrapperContained); }
// public boolean hasTargetToAvoid(yarnwrap.entity.mob.PiglinEntity piglin) { return wrapperContained.hasTargetToAvoid(piglin.wrapperContained); }
// public void angerNearbyPiglins(yarnwrap.entity.mob.AbstractPiglinEntity piglin) { wrapperContained.angerNearbyPiglins(piglin.wrapperContained); }
// public void becomeAngryWithPlayer(yarnwrap.entity.mob.AbstractPiglinEntity piglin,yarnwrap.entity.LivingEntity player) { wrapperContained.becomeAngryWithPlayer(piglin.wrapperContained,player.wrapperContained); }
public java.util.Optional getNearestDetectedPlayer(yarnwrap.entity.mob.AbstractPiglinEntity piglin) { return wrapperContained.getNearestDetectedPlayer(piglin.wrapperContained); }
// public yarnwrap.sound.SoundEvent getSound(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.entity.ai.brain.Activity activity) { return new yarnwrap.sound.SoundEvent(wrapperContained.getSound(piglin.wrapperContained,activity.wrapperContained)); }
// public void swapItemWithOffHand(yarnwrap.entity.mob.PiglinEntity piglin,yarnwrap.item.ItemStack stack) { wrapperContained.swapItemWithOffHand(piglin.wrapperContained,stack.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.Task goToNemesisTask() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.goToNemesisTask()); }
public java.util.Optional getCurrentActivitySound(yarnwrap.entity.mob.PiglinEntity piglin) { return wrapperContained.getCurrentActivitySound(piglin.wrapperContained); }
// public com.google.common.collect.ImmutableList makeFollowTasks() { return wrapperContained.makeFollowTasks(); }

}