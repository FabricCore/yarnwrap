package yarnwrap.item;
public class ItemGroup { public net.minecraft.item.ItemGroup wrapperContained; public ItemGroup(net.minecraft.item.ItemGroup wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean renderName() { return wrapperContained.renderName; }
// public void renderName(boolean value) { wrapperContained.renderName = value; }
// public static boolean renderName() { return net.minecraft.item.ItemGroup.renderName; }
// public static void renderName(boolean value, ) { net.minecraft.item.ItemGroup.renderName = value; }

// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
// public void texture(yarnwrap.util.Identifier value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(net.minecraft.item.ItemGroup.texture); }
// public static void texture(yarnwrap.util.Identifier value, ) { net.minecraft.item.ItemGroup.texture = value.wrapperContained; }

// public boolean scrollbar() { return wrapperContained.scrollbar; }
// public void scrollbar(boolean value) { wrapperContained.scrollbar = value; }
// public static boolean scrollbar() { return net.minecraft.item.ItemGroup.scrollbar; }
// public static void scrollbar(boolean value, ) { net.minecraft.item.ItemGroup.scrollbar = value; }

// public yarnwrap.item.ItemStack icon() { return new yarnwrap.item.ItemStack(wrapperContained.icon); }
// public void icon(yarnwrap.item.ItemStack value) { wrapperContained.icon = value.wrapperContained; }
// public static yarnwrap.item.ItemStack icon() { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemGroup.icon); }
// public static void icon(yarnwrap.item.ItemStack value, ) { net.minecraft.item.ItemGroup.icon = value.wrapperContained; }

// public yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(wrapperContained.displayName); }
// public void displayName(yarnwrap.text.Text value) { wrapperContained.displayName = value.wrapperContained; }
// public static yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(net.minecraft.item.ItemGroup.displayName); }
// public static void displayName(yarnwrap.text.Text value, ) { net.minecraft.item.ItemGroup.displayName = value.wrapperContained; }

// public java.util.Collection displayStacks() { return wrapperContained.displayStacks; }
// public void displayStacks(java.util.Collection value) { wrapperContained.displayStacks = value; }
// public static java.util.Collection displayStacks() { return net.minecraft.item.ItemGroup.displayStacks; }
// public static void displayStacks(java.util.Collection value, ) { net.minecraft.item.ItemGroup.displayStacks = value; }

// public java.util.Set searchTabStacks() { return wrapperContained.searchTabStacks; }
// public void searchTabStacks(java.util.Set value) { wrapperContained.searchTabStacks = value; }
// public static java.util.Set searchTabStacks() { return net.minecraft.item.ItemGroup.searchTabStacks; }
// public static void searchTabStacks(java.util.Set value, ) { net.minecraft.item.ItemGroup.searchTabStacks = value; }

// public boolean special() { return wrapperContained.special; }
// public void special(boolean value) { wrapperContained.special = value; }
// public static boolean special() { return net.minecraft.item.ItemGroup.special; }
// public static void special(boolean value, ) { net.minecraft.item.ItemGroup.special = value; }

// public Object row() { return wrapperContained.row; }
// // public void row(Object value) { wrapperContained.row = value; }
// // public static Object row() { return net.minecraft.item.ItemGroup.row; }
// // public static void row(Object value, ) { net.minecraft.item.ItemGroup.row = value; }

// public int column() { return wrapperContained.column; }
// public void column(int value) { wrapperContained.column = value; }
// public static int column() { return net.minecraft.item.ItemGroup.column; }
// public static void column(int value, ) { net.minecraft.item.ItemGroup.column = value; }

// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.item.ItemGroup.type; }
// // public static void type(Object value, ) { net.minecraft.item.ItemGroup.type = value; }

// public java.util.function.Supplier iconSupplier() { return wrapperContained.iconSupplier; }
// public void iconSupplier(java.util.function.Supplier value) { wrapperContained.iconSupplier = value; }
// public static java.util.function.Supplier iconSupplier() { return net.minecraft.item.ItemGroup.iconSupplier; }
// public static void iconSupplier(java.util.function.Supplier value, ) { net.minecraft.item.ItemGroup.iconSupplier = value; }

// public Object entryCollector() { return wrapperContained.entryCollector; }
// // public void entryCollector(Object value) { wrapperContained.entryCollector = value; }
// // public static Object entryCollector() { return net.minecraft.item.ItemGroup.entryCollector; }
// // public static void entryCollector(Object value, ) { net.minecraft.item.ItemGroup.entryCollector = value; }

// public ItemGroup(Object row,int column,Object type,yarnwrap.text.Text displayName,java.util.function.Supplier iconSupplier,Object entryCollector) { this.wrapperContained = new net.minecraft.item.ItemGroup(row,column,type,displayName.wrapperContained,iconSupplier,entryCollector); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
// public static yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(net.minecraft.item.ItemGroup.getDisplayName()); }
public yarnwrap.util.Identifier getTexture() { return new yarnwrap.util.Identifier(wrapperContained.getTexture()); }
// public static yarnwrap.util.Identifier getTexture() { return new yarnwrap.util.Identifier(net.minecraft.item.ItemGroup.getTexture()); }
public int getColumn() { return wrapperContained.getColumn(); }
// public static int getColumn() { return net.minecraft.item.ItemGroup.getColumn(); }
public yarnwrap.item.ItemStack getIcon() { return new yarnwrap.item.ItemStack(wrapperContained.getIcon()); }
// public static yarnwrap.item.ItemStack getIcon() { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemGroup.getIcon()); }
public boolean isSpecial() { return wrapperContained.isSpecial(); }
// public static boolean isSpecial() { return net.minecraft.item.ItemGroup.isSpecial(); }
public boolean shouldRenderName() { return wrapperContained.shouldRenderName(); }
// public static boolean shouldRenderName() { return net.minecraft.item.ItemGroup.shouldRenderName(); }
public boolean hasScrollbar() { return wrapperContained.hasScrollbar(); }
// public static boolean hasScrollbar() { return net.minecraft.item.ItemGroup.hasScrollbar(); }
public boolean contains(yarnwrap.item.ItemStack stack) { return wrapperContained.contains(stack.wrapperContained); }
// public static boolean contains(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.ItemGroup.contains(stack.wrapperContained); }
public java.util.Collection getSearchTabStacks() { return wrapperContained.getSearchTabStacks(); }
// public static java.util.Collection getSearchTabStacks() { return net.minecraft.item.ItemGroup.getSearchTabStacks(); }
// public void updateEntries(Object displayContext) { wrapperContained.updateEntries(displayContext); }
// public static void updateEntries(Object displayContext, ) { net.minecraft.item.ItemGroup.updateEntries(displayContext); }
// public Object create(Object location,int column) { return wrapperContained.create(location,column); }
// public static Object create(Object location,int column, ) { return net.minecraft.item.ItemGroup.create(location,column); }
public Object getRow() { return wrapperContained.getRow(); }
// public static Object getRow() { return net.minecraft.item.ItemGroup.getRow(); }
public boolean hasStacks() { return wrapperContained.hasStacks(); }
// public static boolean hasStacks() { return net.minecraft.item.ItemGroup.hasStacks(); }
public boolean shouldDisplay() { return wrapperContained.shouldDisplay(); }
// public static boolean shouldDisplay() { return net.minecraft.item.ItemGroup.shouldDisplay(); }
public Object getType() { return wrapperContained.getType(); }
// public static Object getType() { return net.minecraft.item.ItemGroup.getType(); }
public java.util.Collection getDisplayStacks() { return wrapperContained.getDisplayStacks(); }
// public static java.util.Collection getDisplayStacks() { return net.minecraft.item.ItemGroup.getDisplayStacks(); }
// public yarnwrap.util.Identifier getTabTextureId(java.lang.String name) { return new yarnwrap.util.Identifier(wrapperContained.getTabTextureId(name)); }
// public static yarnwrap.util.Identifier getTabTextureId(java.lang.String name, ) { return new yarnwrap.util.Identifier(net.minecraft.item.ItemGroup.getTabTextureId(name)); }

}