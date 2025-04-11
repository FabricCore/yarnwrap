package yarnwrap.entity.passive;
public class AbstractDonkeyEntity { public net.minecraft.entity.passive.AbstractDonkeyEntity wrapperContained; public AbstractDonkeyEntity(net.minecraft.entity.passive.AbstractDonkeyEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions babyBaseDimensions() { return new yarnwrap.entity.EntityDimensions(wrapperContained.babyBaseDimensions); }
// public void babyBaseDimensions(yarnwrap.entity.EntityDimensions value) { wrapperContained.babyBaseDimensions = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData CHEST() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CHEST); }
// public void CHEST(yarnwrap.entity.data.TrackedData value) { wrapperContained.CHEST = value.wrapperContained; }
public Object createAbstractDonkeyAttributes() { return wrapperContained.createAbstractDonkeyAttributes(); }
// public void addChest(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack chest) { wrapperContained.addChest(player.wrapperContained,chest.wrapperContained); }
public boolean hasChest() { return wrapperContained.hasChest(); }
public void setHasChest(boolean hasChest) { wrapperContained.setHasChest(hasChest); }
// public void playAddChestSound() { wrapperContained.playAddChestSound(); }

}