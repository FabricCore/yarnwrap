package yarnwrap.screen;
public class LecternScreenHandler { public net.minecraft.screen.LecternScreenHandler wrapperContained; public LecternScreenHandler(net.minecraft.screen.LecternScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
public int PREVIOUS_PAGE_BUTTON_ID() { return wrapperContained.PREVIOUS_PAGE_BUTTON_ID; }
public int NEXT_PAGE_BUTTON_ID() { return wrapperContained.NEXT_PAGE_BUTTON_ID; }
public int TAKE_BOOK_BUTTON_ID() { return wrapperContained.TAKE_BOOK_BUTTON_ID; }
public int BASE_JUMP_TO_PAGE_BUTTON_ID() { return wrapperContained.BASE_JUMP_TO_PAGE_BUTTON_ID; }
public yarnwrap.item.ItemStack getBookItem() { return new yarnwrap.item.ItemStack(wrapperContained.getBookItem()); }
public int getPage() { return wrapperContained.getPage(); }

}