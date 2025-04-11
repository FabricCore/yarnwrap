package yarnwrap.block.entity;
public class LecternBlockEntity { public net.minecraft.block.entity.LecternBlockEntity wrapperContained; public LecternBlockEntity(net.minecraft.block.entity.LecternBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
// public yarnwrap.item.ItemStack book() { return new yarnwrap.item.ItemStack(wrapperContained.book); }
// public void book(yarnwrap.item.ItemStack value) { wrapperContained.book = value.wrapperContained; }
// public int currentPage() { return wrapperContained.currentPage; }
// public void currentPage(int value) { wrapperContained.currentPage = value; }
// public int pageCount() { return wrapperContained.pageCount; }
// public void pageCount(int value) { wrapperContained.pageCount = value; }
public LecternBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.LecternBlockEntity(pos.wrapperContained,state.wrapperContained); }
// public void setCurrentPage(int currentPage) { wrapperContained.setCurrentPage(currentPage); }
// public yarnwrap.server.command.ServerCommandSource getCommandSource(yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.getCommandSource(player.wrapperContained)); }
public void setBook(yarnwrap.item.ItemStack book) { wrapperContained.setBook(book.wrapperContained); }
public void setBook(yarnwrap.item.ItemStack book,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.setBook(book.wrapperContained,player.wrapperContained); }
// public yarnwrap.item.ItemStack resolveBook(yarnwrap.item.ItemStack book,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.item.ItemStack(wrapperContained.resolveBook(book.wrapperContained,player.wrapperContained)); }
public yarnwrap.item.ItemStack getBook() { return new yarnwrap.item.ItemStack(wrapperContained.getBook()); }
public boolean hasBook() { return wrapperContained.hasBook(); }
public int getCurrentPage() { return wrapperContained.getCurrentPage(); }
public int getComparatorOutput() { return wrapperContained.getComparatorOutput(); }
// public void onBookRemoved() { wrapperContained.onBookRemoved(); }
// public int getPageCount(yarnwrap.item.ItemStack stack) { return wrapperContained.getPageCount(stack.wrapperContained); }

}