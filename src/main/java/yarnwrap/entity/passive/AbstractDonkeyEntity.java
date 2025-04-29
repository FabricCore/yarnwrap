package yarnwrap.entity.passive;
public class AbstractDonkeyEntity { public net.minecraft.entity.passive.AbstractDonkeyEntity wrapperContained; public AbstractDonkeyEntity(net.minecraft.entity.passive.AbstractDonkeyEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions babyBaseDimensions() { return new yarnwrap.entity.EntityDimensions(wrapperContained.babyBaseDimensions); }
// public void babyBaseDimensions(yarnwrap.entity.EntityDimensions value) { wrapperContained.babyBaseDimensions = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions babyBaseDimensions() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.passive.AbstractDonkeyEntity.babyBaseDimensions); }
// public static void babyBaseDimensions(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.passive.AbstractDonkeyEntity.babyBaseDimensions = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData CHEST() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CHEST); }
// public void CHEST(yarnwrap.entity.data.TrackedData value) { wrapperContained.CHEST = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData CHEST() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.AbstractDonkeyEntity.CHEST); }
// public static void CHEST(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.AbstractDonkeyEntity.CHEST = value.wrapperContained; }

// public Object createAbstractDonkeyAttributes() { return wrapperContained.createAbstractDonkeyAttributes(); }
public static Object createAbstractDonkeyAttributes() { return net.minecraft.entity.passive.AbstractDonkeyEntity.createAbstractDonkeyAttributes(); }
// public void addChest(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack chest) { wrapperContained.addChest(player.wrapperContained,chest.wrapperContained); }
// public static void addChest(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack chest, ) { net.minecraft.entity.passive.AbstractDonkeyEntity.addChest(player.wrapperContained,chest.wrapperContained); }
public boolean hasChest() { return wrapperContained.hasChest(); }
// public static boolean hasChest() { return net.minecraft.entity.passive.AbstractDonkeyEntity.hasChest(); }
public void setHasChest(boolean hasChest) { wrapperContained.setHasChest(hasChest); }
// public static void setHasChest(boolean hasChest, ) { net.minecraft.entity.passive.AbstractDonkeyEntity.setHasChest(hasChest); }
// public void playAddChestSound() { wrapperContained.playAddChestSound(); }
// public static void playAddChestSound() { net.minecraft.entity.passive.AbstractDonkeyEntity.playAddChestSound(); }

}