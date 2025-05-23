package yarnwrap.block.entity;
public class LecternBlockEntity { public net.minecraft.block.entity.LecternBlockEntity wrapperContained; public LecternBlockEntity(net.minecraft.block.entity.LecternBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(net.minecraft.block.entity.LecternBlockEntity.inventory); }
// public static void inventory(yarnwrap.inventory.Inventory value, ) { net.minecraft.block.entity.LecternBlockEntity.inventory = value.wrapperContained; }

// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
// public static yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(net.minecraft.block.entity.LecternBlockEntity.propertyDelegate); }
// public static void propertyDelegate(yarnwrap.screen.PropertyDelegate value, ) { net.minecraft.block.entity.LecternBlockEntity.propertyDelegate = value.wrapperContained; }

// public yarnwrap.item.ItemStack book() { return new yarnwrap.item.ItemStack(wrapperContained.book); }
// public void book(yarnwrap.item.ItemStack value) { wrapperContained.book = value.wrapperContained; }
// public static yarnwrap.item.ItemStack book() { return new yarnwrap.item.ItemStack(net.minecraft.block.entity.LecternBlockEntity.book); }
// public static void book(yarnwrap.item.ItemStack value, ) { net.minecraft.block.entity.LecternBlockEntity.book = value.wrapperContained; }

// public int currentPage() { return wrapperContained.currentPage; }
// public void currentPage(int value) { wrapperContained.currentPage = value; }
// public static int currentPage() { return net.minecraft.block.entity.LecternBlockEntity.currentPage; }
// public static void currentPage(int value, ) { net.minecraft.block.entity.LecternBlockEntity.currentPage = value; }

// public int pageCount() { return wrapperContained.pageCount; }
// public void pageCount(int value) { wrapperContained.pageCount = value; }
// public static int pageCount() { return net.minecraft.block.entity.LecternBlockEntity.pageCount; }
// public static void pageCount(int value, ) { net.minecraft.block.entity.LecternBlockEntity.pageCount = value; }

public LecternBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.LecternBlockEntity(pos.wrapperContained,state.wrapperContained); }
// public void setCurrentPage(int currentPage) { wrapperContained.setCurrentPage(currentPage); }
// public static void setCurrentPage(int currentPage, ) { net.minecraft.block.entity.LecternBlockEntity.setCurrentPage(currentPage); }
// public yarnwrap.server.command.ServerCommandSource getCommandSource(yarnwrap.entity.player.PlayerEntity player,yarnwrap.server.world.ServerWorld world) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.getCommandSource(player.wrapperContained,world.wrapperContained)); }
// public static yarnwrap.server.command.ServerCommandSource getCommandSource(yarnwrap.entity.player.PlayerEntity player,yarnwrap.server.world.ServerWorld world, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.block.entity.LecternBlockEntity.getCommandSource(player.wrapperContained,world.wrapperContained)); }
public void setBook(yarnwrap.item.ItemStack book) { wrapperContained.setBook(book.wrapperContained); }
// public static void setBook(yarnwrap.item.ItemStack book, ) { net.minecraft.block.entity.LecternBlockEntity.setBook(book.wrapperContained); }
public void setBook(yarnwrap.item.ItemStack book,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.setBook(book.wrapperContained,player.wrapperContained); }
// public static void setBook(yarnwrap.item.ItemStack book,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.block.entity.LecternBlockEntity.setBook(book.wrapperContained,player.wrapperContained); }
// public yarnwrap.item.ItemStack resolveBook(yarnwrap.item.ItemStack book,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.item.ItemStack(wrapperContained.resolveBook(book.wrapperContained,player.wrapperContained)); }
// public static yarnwrap.item.ItemStack resolveBook(yarnwrap.item.ItemStack book,yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.item.ItemStack(net.minecraft.block.entity.LecternBlockEntity.resolveBook(book.wrapperContained,player.wrapperContained)); }
public yarnwrap.item.ItemStack getBook() { return new yarnwrap.item.ItemStack(wrapperContained.getBook()); }
// public static yarnwrap.item.ItemStack getBook() { return new yarnwrap.item.ItemStack(net.minecraft.block.entity.LecternBlockEntity.getBook()); }
public boolean hasBook() { return wrapperContained.hasBook(); }
// public static boolean hasBook() { return net.minecraft.block.entity.LecternBlockEntity.hasBook(); }
public int getCurrentPage() { return wrapperContained.getCurrentPage(); }
// public static int getCurrentPage() { return net.minecraft.block.entity.LecternBlockEntity.getCurrentPage(); }
public int getComparatorOutput() { return wrapperContained.getComparatorOutput(); }
// public static int getComparatorOutput() { return net.minecraft.block.entity.LecternBlockEntity.getComparatorOutput(); }
// public void onBookRemoved() { wrapperContained.onBookRemoved(); }
// public static void onBookRemoved() { net.minecraft.block.entity.LecternBlockEntity.onBookRemoved(); }
// public int getPageCount(yarnwrap.item.ItemStack stack) { return wrapperContained.getPageCount(stack.wrapperContained); }
// public static int getPageCount(yarnwrap.item.ItemStack stack, ) { return net.minecraft.block.entity.LecternBlockEntity.getPageCount(stack.wrapperContained); }

}