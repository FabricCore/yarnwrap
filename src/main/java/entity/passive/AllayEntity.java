package yarnwrap.entity.passive;
public class AllayEntity { public net.minecraft.entity.passive.AllayEntity wrapperContained; public AllayEntity(net.minecraft.entity.passive.AllayEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList SENSORS() { return wrapperContained.SENSORS; }
// public yarnwrap.util.math.Vec3i ITEM_PICKUP_RANGE_EXPANDER() { return new yarnwrap.util.math.Vec3i(wrapperContained.ITEM_PICKUP_RANGE_EXPANDER); }
// public yarnwrap.world.event.listener.EntityGameEventHandler gameEventHandler() { return new yarnwrap.world.event.listener.EntityGameEventHandler(wrapperContained.gameEventHandler); }
// public yarnwrap.inventory.SimpleInventory inventory() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.inventory); }
// public com.google.common.collect.ImmutableList MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
public com.google.common.collect.ImmutableList THROW_SOUND_PITCHES() { return wrapperContained.THROW_SOUND_PITCHES; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.recipe.Ingredient DUPLICATION_INGREDIENT() { return new yarnwrap.recipe.Ingredient(wrapperContained.DUPLICATION_INGREDIENT); }
// public int DUPLICATION_COOLDOWN() { return wrapperContained.DUPLICATION_COOLDOWN; }
// public yarnwrap.entity.data.TrackedData DANCING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DANCING); }
// public yarnwrap.entity.data.TrackedData CAN_DUPLICATE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CAN_DUPLICATE); }
// public Object vibrationCallback() { return wrapperContained.vibrationCallback; }
// public yarnwrap.world.event.listener.EntityGameEventHandler jukeboxEventHandler() { return new yarnwrap.world.event.listener.EntityGameEventHandler(wrapperContained.jukeboxEventHandler); }
// public yarnwrap.util.math.BlockPos jukeboxPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.jukeboxPos); }
// public long duplicationCooldown() { return wrapperContained.duplicationCooldown; }
// public float danceTicks() { return wrapperContained.danceTicks; }
// public Object vibrationListenerData() { return wrapperContained.vibrationListenerData; }
// public boolean isItemPickupCoolingDown() { return wrapperContained.isItemPickupCoolingDown(); }
public Object createAllayAttributes() { return wrapperContained.createAllayAttributes(); }
public boolean isHoldingItem() { return wrapperContained.isHoldingItem(); }
// public void decrementStackUnlessInCreative(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.decrementStackUnlessInCreative(player.wrapperContained,stack.wrapperContained); }
public void updateJukeboxPos(yarnwrap.util.math.BlockPos jukeboxPos,boolean playing) { wrapperContained.updateJukeboxPos(jukeboxPos.wrapperContained,playing); }
public boolean isDancing() { return wrapperContained.isDancing(); }
public boolean isSpinning() { return wrapperContained.isSpinning(); }
// public boolean shouldStopDancing() { return wrapperContained.shouldStopDancing(); }
// public void tickDuplicationCooldown() { wrapperContained.tickDuplicationCooldown(); }
// public void duplicate() { wrapperContained.duplicate(); }
// public void startDuplicationCooldown() { wrapperContained.startDuplicationCooldown(); }
// public boolean canDuplicate() { return wrapperContained.canDuplicate(); }
// public boolean matchesDuplicationIngredient(yarnwrap.item.ItemStack stack) { return wrapperContained.matchesDuplicationIngredient(stack.wrapperContained); }
public void setDancing(boolean dancing) { wrapperContained.setDancing(dancing); }
// public void addHeartParticle() { wrapperContained.addHeartParticle(); }
// public boolean areItemsEqual(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack stack2) { return wrapperContained.areItemsEqual(stack.wrapperContained,stack2.wrapperContained); }
// public boolean areDifferentPotions(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack stack2) { return wrapperContained.areDifferentPotions(stack.wrapperContained,stack2.wrapperContained); }

}