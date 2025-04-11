package yarnwrap.entity.passive;
public class AllayEntity { public net.minecraft.entity.passive.AllayEntity wrapperContained; public AllayEntity(net.minecraft.entity.passive.AllayEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList SENSORS() { return wrapperContained.SENSORS; }
// public void SENSORS(com.google.common.collect.ImmutableList value) { wrapperContained.SENSORS = value; }
// public yarnwrap.util.math.Vec3i ITEM_PICKUP_RANGE_EXPANDER() { return new yarnwrap.util.math.Vec3i(wrapperContained.ITEM_PICKUP_RANGE_EXPANDER); }
// public void ITEM_PICKUP_RANGE_EXPANDER(yarnwrap.util.math.Vec3i value) { wrapperContained.ITEM_PICKUP_RANGE_EXPANDER = value.wrapperContained; }
// public yarnwrap.world.event.listener.EntityGameEventHandler gameEventHandler() { return new yarnwrap.world.event.listener.EntityGameEventHandler(wrapperContained.gameEventHandler); }
// public void gameEventHandler(yarnwrap.world.event.listener.EntityGameEventHandler value) { wrapperContained.gameEventHandler = value.wrapperContained; }
// public yarnwrap.inventory.SimpleInventory inventory() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.SimpleInventory value) { wrapperContained.inventory = value.wrapperContained; }
// public com.google.common.collect.ImmutableList MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
// public void MEMORY_MODULES(com.google.common.collect.ImmutableList value) { wrapperContained.MEMORY_MODULES = value; }
public com.google.common.collect.ImmutableList THROW_SOUND_PITCHES() { return wrapperContained.THROW_SOUND_PITCHES; }
// public void THROW_SOUND_PITCHES(com.google.common.collect.ImmutableList value) { wrapperContained.THROW_SOUND_PITCHES = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.recipe.Ingredient DUPLICATION_INGREDIENT() { return new yarnwrap.recipe.Ingredient(wrapperContained.DUPLICATION_INGREDIENT); }
// public void DUPLICATION_INGREDIENT(yarnwrap.recipe.Ingredient value) { wrapperContained.DUPLICATION_INGREDIENT = value.wrapperContained; }
// public int DUPLICATION_COOLDOWN() { return wrapperContained.DUPLICATION_COOLDOWN; }
// public void DUPLICATION_COOLDOWN(int value) { wrapperContained.DUPLICATION_COOLDOWN = value; }
// public yarnwrap.entity.data.TrackedData DANCING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DANCING); }
// public void DANCING(yarnwrap.entity.data.TrackedData value) { wrapperContained.DANCING = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData CAN_DUPLICATE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CAN_DUPLICATE); }
// public void CAN_DUPLICATE(yarnwrap.entity.data.TrackedData value) { wrapperContained.CAN_DUPLICATE = value.wrapperContained; }
// public Object vibrationCallback() { return wrapperContained.vibrationCallback; }
// // public void vibrationCallback(Object value) { wrapperContained.vibrationCallback = value; }
// public yarnwrap.world.event.listener.EntityGameEventHandler jukeboxEventHandler() { return new yarnwrap.world.event.listener.EntityGameEventHandler(wrapperContained.jukeboxEventHandler); }
// public void jukeboxEventHandler(yarnwrap.world.event.listener.EntityGameEventHandler value) { wrapperContained.jukeboxEventHandler = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos jukeboxPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.jukeboxPos); }
// public void jukeboxPos(yarnwrap.util.math.BlockPos value) { wrapperContained.jukeboxPos = value.wrapperContained; }
// public long duplicationCooldown() { return wrapperContained.duplicationCooldown; }
// public void duplicationCooldown(long value) { wrapperContained.duplicationCooldown = value; }
// public float danceTicks() { return wrapperContained.danceTicks; }
// public void danceTicks(float value) { wrapperContained.danceTicks = value; }
// public Object vibrationListenerData() { return wrapperContained.vibrationListenerData; }
// // public void vibrationListenerData(Object value) { wrapperContained.vibrationListenerData = value; }
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