package yarnwrap.screen;
public class LecternScreenHandler { public net.minecraft.screen.LecternScreenHandler wrapperContained; public LecternScreenHandler(net.minecraft.screen.LecternScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
public int PREVIOUS_PAGE_BUTTON_ID() { return wrapperContained.PREVIOUS_PAGE_BUTTON_ID; }
// public void PREVIOUS_PAGE_BUTTON_ID(int value) { wrapperContained.PREVIOUS_PAGE_BUTTON_ID = value; }
public int NEXT_PAGE_BUTTON_ID() { return wrapperContained.NEXT_PAGE_BUTTON_ID; }
// public void NEXT_PAGE_BUTTON_ID(int value) { wrapperContained.NEXT_PAGE_BUTTON_ID = value; }
public int TAKE_BOOK_BUTTON_ID() { return wrapperContained.TAKE_BOOK_BUTTON_ID; }
// public void TAKE_BOOK_BUTTON_ID(int value) { wrapperContained.TAKE_BOOK_BUTTON_ID = value; }
public int BASE_JUMP_TO_PAGE_BUTTON_ID() { return wrapperContained.BASE_JUMP_TO_PAGE_BUTTON_ID; }
// public void BASE_JUMP_TO_PAGE_BUTTON_ID(int value) { wrapperContained.BASE_JUMP_TO_PAGE_BUTTON_ID = value; }
public yarnwrap.item.ItemStack getBookItem() { return new yarnwrap.item.ItemStack(wrapperContained.getBookItem()); }
public int getPage() { return wrapperContained.getPage(); }

}