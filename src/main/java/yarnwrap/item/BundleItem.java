package yarnwrap.item;
public class BundleItem { public net.minecraft.item.BundleItem wrapperContained; public BundleItem(net.minecraft.item.BundleItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ITEM_BAR_COLOR() { return wrapperContained.ITEM_BAR_COLOR; }
// public void ITEM_BAR_COLOR(int value) { wrapperContained.ITEM_BAR_COLOR = value; }
// public static int ITEM_BAR_COLOR() { return net.minecraft.item.BundleItem.ITEM_BAR_COLOR; }
// public static void ITEM_BAR_COLOR(int value, ) { net.minecraft.item.BundleItem.ITEM_BAR_COLOR = value; }

// public int TOOLTIP_STACKS_COLUMNS() { return wrapperContained.TOOLTIP_STACKS_COLUMNS; }
// public void TOOLTIP_STACKS_COLUMNS(int value) { wrapperContained.TOOLTIP_STACKS_COLUMNS = value; }
public static int TOOLTIP_STACKS_COLUMNS() { return net.minecraft.item.BundleItem.TOOLTIP_STACKS_COLUMNS; }
// public static void TOOLTIP_STACKS_COLUMNS(int value, ) { net.minecraft.item.BundleItem.TOOLTIP_STACKS_COLUMNS = value; }

// public int TOOLTIP_STACKS_ROWS() { return wrapperContained.TOOLTIP_STACKS_ROWS; }
// public void TOOLTIP_STACKS_ROWS(int value) { wrapperContained.TOOLTIP_STACKS_ROWS = value; }
public static int TOOLTIP_STACKS_ROWS() { return net.minecraft.item.BundleItem.TOOLTIP_STACKS_ROWS; }
// public static void TOOLTIP_STACKS_ROWS(int value, ) { net.minecraft.item.BundleItem.TOOLTIP_STACKS_ROWS = value; }

// public int MAX_TOOLTIP_STACKS_SHOWN() { return wrapperContained.MAX_TOOLTIP_STACKS_SHOWN; }
// public void MAX_TOOLTIP_STACKS_SHOWN(int value) { wrapperContained.MAX_TOOLTIP_STACKS_SHOWN = value; }
public static int MAX_TOOLTIP_STACKS_SHOWN() { return net.minecraft.item.BundleItem.MAX_TOOLTIP_STACKS_SHOWN; }
// public static void MAX_TOOLTIP_STACKS_SHOWN(int value, ) { net.minecraft.item.BundleItem.MAX_TOOLTIP_STACKS_SHOWN = value; }

// public int MAX_TOOLTIP_STACKS_SHOWN_WHEN_TOO_MANY_TYPES() { return wrapperContained.MAX_TOOLTIP_STACKS_SHOWN_WHEN_TOO_MANY_TYPES; }
// public void MAX_TOOLTIP_STACKS_SHOWN_WHEN_TOO_MANY_TYPES(int value) { wrapperContained.MAX_TOOLTIP_STACKS_SHOWN_WHEN_TOO_MANY_TYPES = value; }
public static int MAX_TOOLTIP_STACKS_SHOWN_WHEN_TOO_MANY_TYPES() { return net.minecraft.item.BundleItem.MAX_TOOLTIP_STACKS_SHOWN_WHEN_TOO_MANY_TYPES; }
// public static void MAX_TOOLTIP_STACKS_SHOWN_WHEN_TOO_MANY_TYPES(int value, ) { net.minecraft.item.BundleItem.MAX_TOOLTIP_STACKS_SHOWN_WHEN_TOO_MANY_TYPES = value; }

// public int FULL_ITEM_BAR_COLOR() { return wrapperContained.FULL_ITEM_BAR_COLOR; }
// public void FULL_ITEM_BAR_COLOR(int value) { wrapperContained.FULL_ITEM_BAR_COLOR = value; }
// public static int FULL_ITEM_BAR_COLOR() { return net.minecraft.item.BundleItem.FULL_ITEM_BAR_COLOR; }
// public static void FULL_ITEM_BAR_COLOR(int value, ) { net.minecraft.item.BundleItem.FULL_ITEM_BAR_COLOR = value; }

// public int MAX_USE_TIME() { return wrapperContained.MAX_USE_TIME; }
// public void MAX_USE_TIME(int value) { wrapperContained.MAX_USE_TIME = value; }
// public static int MAX_USE_TIME() { return net.minecraft.item.BundleItem.MAX_USE_TIME; }
// public static void MAX_USE_TIME(int value, ) { net.minecraft.item.BundleItem.MAX_USE_TIME = value; }

// public float getAmountFilled(yarnwrap.item.ItemStack stack) { return wrapperContained.getAmountFilled(stack.wrapperContained); }
// public static float getAmountFilled(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.BundleItem.getAmountFilled(stack.wrapperContained); }
// public boolean dropFirstBundledStack(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.dropFirstBundledStack(stack.wrapperContained,player.wrapperContained); }
// public static boolean dropFirstBundledStack(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.item.BundleItem.dropFirstBundledStack(stack.wrapperContained,player.wrapperContained); }
// public void playRemoveOneSound(yarnwrap.entity.Entity entity) { wrapperContained.playRemoveOneSound(entity.wrapperContained); }
// public static void playRemoveOneSound(yarnwrap.entity.Entity entity, ) { net.minecraft.item.BundleItem.playRemoveOneSound(entity.wrapperContained); }
// public void playInsertSound(yarnwrap.entity.Entity entity) { wrapperContained.playInsertSound(entity.wrapperContained); }
// public static void playInsertSound(yarnwrap.entity.Entity entity, ) { net.minecraft.item.BundleItem.playInsertSound(entity.wrapperContained); }
// public void playDropContentsSound(yarnwrap.world.World world,yarnwrap.entity.Entity entity) { wrapperContained.playDropContentsSound(world.wrapperContained,entity.wrapperContained); }
// public static void playDropContentsSound(yarnwrap.world.World world,yarnwrap.entity.Entity entity, ) { net.minecraft.item.BundleItem.playDropContentsSound(world.wrapperContained,entity.wrapperContained); }
// public void setSelectedStackIndex(yarnwrap.item.ItemStack stack,int selectedStackIndex) { wrapperContained.setSelectedStackIndex(stack.wrapperContained,selectedStackIndex); }
// public static void setSelectedStackIndex(yarnwrap.item.ItemStack stack,int selectedStackIndex, ) { net.minecraft.item.BundleItem.setSelectedStackIndex(stack.wrapperContained,selectedStackIndex); }
// public void playInsertFailSound(yarnwrap.entity.Entity entity) { wrapperContained.playInsertFailSound(entity.wrapperContained); }
// public static void playInsertFailSound(yarnwrap.entity.Entity entity, ) { net.minecraft.item.BundleItem.playInsertFailSound(entity.wrapperContained); }
// public boolean hasSelectedStack(yarnwrap.item.ItemStack stack) { return wrapperContained.hasSelectedStack(stack.wrapperContained); }
// public static boolean hasSelectedStack(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.BundleItem.hasSelectedStack(stack.wrapperContained); }
// public int getSelectedStackIndex(yarnwrap.item.ItemStack stack) { return wrapperContained.getSelectedStackIndex(stack.wrapperContained); }
// public static int getSelectedStackIndex(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.BundleItem.getSelectedStackIndex(stack.wrapperContained); }
// public yarnwrap.item.ItemStack getSelectedStack(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.getSelectedStack(stack.wrapperContained)); }
// public static yarnwrap.item.ItemStack getSelectedStack(yarnwrap.item.ItemStack stack, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.BundleItem.getSelectedStack(stack.wrapperContained)); }
// public int getNumberOfStacksShown(yarnwrap.item.ItemStack stack) { return wrapperContained.getNumberOfStacksShown(stack.wrapperContained); }
// public static int getNumberOfStacksShown(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.BundleItem.getNumberOfStacksShown(stack.wrapperContained); }
// public void dropContentsOnUse(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.dropContentsOnUse(world.wrapperContained,player.wrapperContained,stack.wrapperContained); }
// public static void dropContentsOnUse(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack, ) { net.minecraft.item.BundleItem.dropContentsOnUse(world.wrapperContained,player.wrapperContained,stack.wrapperContained); }
// public java.util.Optional popFirstBundledStack(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player,yarnwrap.component.type.BundleContentsComponent contents) { return wrapperContained.popFirstBundledStack(stack.wrapperContained,player.wrapperContained,contents.wrapperContained); }
// public static java.util.Optional popFirstBundledStack(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player,yarnwrap.component.type.BundleContentsComponent contents, ) { return net.minecraft.item.BundleItem.popFirstBundledStack(stack.wrapperContained,player.wrapperContained,contents.wrapperContained); }
// public yarnwrap.item.Item getBundle(yarnwrap.util.DyeColor color) { return new yarnwrap.item.Item(wrapperContained.getBundle(color.wrapperContained)); }
// public static yarnwrap.item.Item getBundle(yarnwrap.util.DyeColor color, ) { return new yarnwrap.item.Item(net.minecraft.item.BundleItem.getBundle(color.wrapperContained)); }
// public void onContentChanged(yarnwrap.entity.player.PlayerEntity user) { wrapperContained.onContentChanged(user.wrapperContained); }
// public static void onContentChanged(yarnwrap.entity.player.PlayerEntity user, ) { net.minecraft.item.BundleItem.onContentChanged(user.wrapperContained); }
// public yarnwrap.item.BundleItem method_64974(yarnwrap.item.Item item) { return new yarnwrap.item.BundleItem(wrapperContained.method_64974(item.wrapperContained)); }
// public static yarnwrap.item.BundleItem method_64974(yarnwrap.item.Item item, ) { return new yarnwrap.item.BundleItem(net.minecraft.item.BundleItem.method_64974(item.wrapperContained)); }
// public java.util.List getBundles() { return wrapperContained.getBundles(); }
public static java.util.List getBundles() { return net.minecraft.item.BundleItem.getBundles(); }

}