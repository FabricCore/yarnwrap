package yarnwrap.recipe.book;
public class RecipeBookOptions { public net.minecraft.recipe.book.RecipeBookOptions wrapperContained; public RecipeBookOptions(net.minecraft.recipe.book.RecipeBookOptions wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map CATEGORY_OPTION_NAMES() { return wrapperContained.CATEGORY_OPTION_NAMES; }
// public java.util.Map categoryOptions() { return wrapperContained.categoryOptions; }
public yarnwrap.recipe.book.RecipeBookOptions copy() { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.copy()); }
public void copyFrom(yarnwrap.recipe.book.RecipeBookOptions other) { wrapperContained.copyFrom(other.wrapperContained); }
public boolean isGuiOpen(yarnwrap.recipe.book.RecipeBookCategory category) { return wrapperContained.isGuiOpen(category.wrapperContained); }
public void setGuiOpen(yarnwrap.recipe.book.RecipeBookCategory category,boolean open) { wrapperContained.setGuiOpen(category.wrapperContained,open); }
public yarnwrap.recipe.book.RecipeBookOptions fromNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.fromNbt(nbt.wrapperContained)); }
public yarnwrap.recipe.book.RecipeBookOptions fromPacket(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.fromPacket(buf.wrapperContained)); }
public boolean isFilteringCraftable(yarnwrap.recipe.book.RecipeBookCategory category) { return wrapperContained.isFilteringCraftable(category.wrapperContained); }
public void setFilteringCraftable(yarnwrap.recipe.book.RecipeBookCategory category,boolean filtering) { wrapperContained.setFilteringCraftable(category.wrapperContained,filtering); }
public void writeNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeNbt(nbt.wrapperContained); }
public void toPacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.toPacket(buf.wrapperContained); }

}