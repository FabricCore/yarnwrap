package yarnwrap.item;
public class BundleItem { public net.minecraft.item.BundleItem wrapperContained; public BundleItem(net.minecraft.item.BundleItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ITEM_BAR_COLOR() { return wrapperContained.ITEM_BAR_COLOR; }
public float getAmountFilled(yarnwrap.item.ItemStack stack) { return wrapperContained.getAmountFilled(stack.wrapperContained); }
// public boolean dropAllBundledItems(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.dropAllBundledItems(stack.wrapperContained,player.wrapperContained); }
// public void playRemoveOneSound(yarnwrap.entity.Entity entity) { wrapperContained.playRemoveOneSound(entity.wrapperContained); }
// public void playInsertSound(yarnwrap.entity.Entity entity) { wrapperContained.playInsertSound(entity.wrapperContained); }
// public void playDropContentsSound(yarnwrap.entity.Entity entity) { wrapperContained.playDropContentsSound(entity.wrapperContained); }

}