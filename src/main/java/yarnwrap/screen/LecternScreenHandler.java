package yarnwrap.screen;
public class LecternScreenHandler { public net.minecraft.screen.LecternScreenHandler wrapperContained; public LecternScreenHandler(net.minecraft.screen.LecternScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(net.minecraft.screen.LecternScreenHandler.inventory); }
// public static void inventory(yarnwrap.inventory.Inventory value, ) { net.minecraft.screen.LecternScreenHandler.inventory = value.wrapperContained; }

// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
// public static yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(net.minecraft.screen.LecternScreenHandler.propertyDelegate); }
// public static void propertyDelegate(yarnwrap.screen.PropertyDelegate value, ) { net.minecraft.screen.LecternScreenHandler.propertyDelegate = value.wrapperContained; }

// public int PREVIOUS_PAGE_BUTTON_ID() { return wrapperContained.PREVIOUS_PAGE_BUTTON_ID; }
// public void PREVIOUS_PAGE_BUTTON_ID(int value) { wrapperContained.PREVIOUS_PAGE_BUTTON_ID = value; }
public static int PREVIOUS_PAGE_BUTTON_ID() { return net.minecraft.screen.LecternScreenHandler.PREVIOUS_PAGE_BUTTON_ID; }
// public static void PREVIOUS_PAGE_BUTTON_ID(int value, ) { net.minecraft.screen.LecternScreenHandler.PREVIOUS_PAGE_BUTTON_ID = value; }

// public int NEXT_PAGE_BUTTON_ID() { return wrapperContained.NEXT_PAGE_BUTTON_ID; }
// public void NEXT_PAGE_BUTTON_ID(int value) { wrapperContained.NEXT_PAGE_BUTTON_ID = value; }
public static int NEXT_PAGE_BUTTON_ID() { return net.minecraft.screen.LecternScreenHandler.NEXT_PAGE_BUTTON_ID; }
// public static void NEXT_PAGE_BUTTON_ID(int value, ) { net.minecraft.screen.LecternScreenHandler.NEXT_PAGE_BUTTON_ID = value; }

// public int TAKE_BOOK_BUTTON_ID() { return wrapperContained.TAKE_BOOK_BUTTON_ID; }
// public void TAKE_BOOK_BUTTON_ID(int value) { wrapperContained.TAKE_BOOK_BUTTON_ID = value; }
public static int TAKE_BOOK_BUTTON_ID() { return net.minecraft.screen.LecternScreenHandler.TAKE_BOOK_BUTTON_ID; }
// public static void TAKE_BOOK_BUTTON_ID(int value, ) { net.minecraft.screen.LecternScreenHandler.TAKE_BOOK_BUTTON_ID = value; }

// public int BASE_JUMP_TO_PAGE_BUTTON_ID() { return wrapperContained.BASE_JUMP_TO_PAGE_BUTTON_ID; }
// public void BASE_JUMP_TO_PAGE_BUTTON_ID(int value) { wrapperContained.BASE_JUMP_TO_PAGE_BUTTON_ID = value; }
public static int BASE_JUMP_TO_PAGE_BUTTON_ID() { return net.minecraft.screen.LecternScreenHandler.BASE_JUMP_TO_PAGE_BUTTON_ID; }
// public static void BASE_JUMP_TO_PAGE_BUTTON_ID(int value, ) { net.minecraft.screen.LecternScreenHandler.BASE_JUMP_TO_PAGE_BUTTON_ID = value; }

public LecternScreenHandler(int syncId) { this.wrapperContained = new net.minecraft.screen.LecternScreenHandler(syncId); }
public LecternScreenHandler(int syncId,yarnwrap.inventory.Inventory inventory,yarnwrap.screen.PropertyDelegate propertyDelegate) { this.wrapperContained = new net.minecraft.screen.LecternScreenHandler(syncId,inventory.wrapperContained,propertyDelegate.wrapperContained); }
public yarnwrap.item.ItemStack getBookItem() { return new yarnwrap.item.ItemStack(wrapperContained.getBookItem()); }
// public static yarnwrap.item.ItemStack getBookItem() { return new yarnwrap.item.ItemStack(net.minecraft.screen.LecternScreenHandler.getBookItem()); }
public int getPage() { return wrapperContained.getPage(); }
// public static int getPage() { return net.minecraft.screen.LecternScreenHandler.getPage(); }

}