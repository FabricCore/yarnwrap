package yarnwrap.item;
public class ItemGroup { public net.minecraft.item.ItemGroup wrapperContained; public ItemGroup(net.minecraft.item.ItemGroup wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(wrapperContained.displayName); }
// public java.util.Collection displayStacks() { return wrapperContained.displayStacks; }
// public java.util.Set searchTabStacks() { return wrapperContained.searchTabStacks; }
// public boolean special() { return wrapperContained.special; }
// public Object row() { return wrapperContained.row; }
// public int column() { return wrapperContained.column; }
// public Object type() { return wrapperContained.type; }
// public java.util.function.Supplier iconSupplier() { return wrapperContained.iconSupplier; }
// public Object entryCollector() { return wrapperContained.entryCollector; }
// public boolean renderName() { return wrapperContained.renderName; }
// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
// public boolean scrollbar() { return wrapperContained.scrollbar; }
// public yarnwrap.item.ItemStack icon() { return new yarnwrap.item.ItemStack(wrapperContained.icon); }
public boolean contains(yarnwrap.item.ItemStack stack) { return wrapperContained.contains(stack.wrapperContained); }
public java.util.Collection getSearchTabStacks() { return wrapperContained.getSearchTabStacks(); }
// public void updateEntries(Object displayContext) { wrapperContained.updateEntries(displayContext); }
// public Object create(Object location,int column) { return wrapperContained.create(location,column); }
public Object getRow() { return wrapperContained.getRow(); }
public boolean hasStacks() { return wrapperContained.hasStacks(); }
public boolean shouldDisplay() { return wrapperContained.shouldDisplay(); }
public Object getType() { return wrapperContained.getType(); }
public java.util.Collection getDisplayStacks() { return wrapperContained.getDisplayStacks(); }
public yarnwrap.util.Identifier getTabTextureId(java.lang.String name) { return new yarnwrap.util.Identifier(wrapperContained.getTabTextureId(name)); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
public yarnwrap.util.Identifier getTexture() { return new yarnwrap.util.Identifier(wrapperContained.getTexture()); }
public int getColumn() { return wrapperContained.getColumn(); }
public yarnwrap.item.ItemStack getIcon() { return new yarnwrap.item.ItemStack(wrapperContained.getIcon()); }
public boolean isSpecial() { return wrapperContained.isSpecial(); }
public boolean shouldRenderName() { return wrapperContained.shouldRenderName(); }
public boolean hasScrollbar() { return wrapperContained.hasScrollbar(); }

}