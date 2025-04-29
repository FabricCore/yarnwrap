package yarnwrap.recipe.book;
public class RecipeBookOptions { public net.minecraft.recipe.book.RecipeBookOptions wrapperContained; public RecipeBookOptions(net.minecraft.recipe.book.RecipeBookOptions wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map CATEGORY_OPTION_NAMES() { return wrapperContained.CATEGORY_OPTION_NAMES; }
// public void CATEGORY_OPTION_NAMES(java.util.Map value) { wrapperContained.CATEGORY_OPTION_NAMES = value; }
// public static java.util.Map CATEGORY_OPTION_NAMES() { return net.minecraft.recipe.book.RecipeBookOptions.CATEGORY_OPTION_NAMES; }
// public static void CATEGORY_OPTION_NAMES(java.util.Map value, ) { net.minecraft.recipe.book.RecipeBookOptions.CATEGORY_OPTION_NAMES = value; }

// public java.util.Map categoryOptions() { return wrapperContained.categoryOptions; }
// public void categoryOptions(java.util.Map value) { wrapperContained.categoryOptions = value; }
// public static java.util.Map categoryOptions() { return net.minecraft.recipe.book.RecipeBookOptions.categoryOptions; }
// public static void categoryOptions(java.util.Map value, ) { net.minecraft.recipe.book.RecipeBookOptions.categoryOptions = value; }

// public RecipeBookOptions(java.util.Map categoryOptions) { this.wrapperContained = new net.minecraft.recipe.book.RecipeBookOptions(categoryOptions); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.recipe.book.RecipeBookOptions.equals(o); }
public yarnwrap.recipe.book.RecipeBookOptions copy() { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.copy()); }
// public static yarnwrap.recipe.book.RecipeBookOptions copy() { return new yarnwrap.recipe.book.RecipeBookOptions(net.minecraft.recipe.book.RecipeBookOptions.copy()); }
public void copyFrom(yarnwrap.recipe.book.RecipeBookOptions other) { wrapperContained.copyFrom(other.wrapperContained); }
// public static void copyFrom(yarnwrap.recipe.book.RecipeBookOptions other, ) { net.minecraft.recipe.book.RecipeBookOptions.copyFrom(other.wrapperContained); }
public boolean isGuiOpen(yarnwrap.recipe.book.RecipeBookCategory category) { return wrapperContained.isGuiOpen(category.wrapperContained); }
// public static boolean isGuiOpen(yarnwrap.recipe.book.RecipeBookCategory category, ) { return net.minecraft.recipe.book.RecipeBookOptions.isGuiOpen(category.wrapperContained); }
public void setGuiOpen(yarnwrap.recipe.book.RecipeBookCategory category,boolean open) { wrapperContained.setGuiOpen(category.wrapperContained,open); }
// public static void setGuiOpen(yarnwrap.recipe.book.RecipeBookCategory category,boolean open, ) { net.minecraft.recipe.book.RecipeBookOptions.setGuiOpen(category.wrapperContained,open); }
// public void method_30182(java.util.EnumMap categoryOptions) { wrapperContained.method_30182(categoryOptions); }
// public static void method_30182(java.util.EnumMap categoryOptions, ) { net.minecraft.recipe.book.RecipeBookOptions.method_30182(categoryOptions); }
// public yarnwrap.recipe.book.RecipeBookOptions fromNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.fromNbt(nbt.wrapperContained)); }
// public static yarnwrap.recipe.book.RecipeBookOptions fromNbt(yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.recipe.book.RecipeBookOptions(net.minecraft.recipe.book.RecipeBookOptions.fromNbt(nbt.wrapperContained)); }
// public void method_30184(yarnwrap.nbt.NbtCompound category,yarnwrap.recipe.book.RecipeBookCategory pair) { wrapperContained.method_30184(category.wrapperContained,pair.wrapperContained); }
// public static void method_30184(yarnwrap.nbt.NbtCompound category,yarnwrap.recipe.book.RecipeBookCategory pair, ) { net.minecraft.recipe.book.RecipeBookOptions.method_30184(category.wrapperContained,pair.wrapperContained); }
// public void method_30185(yarnwrap.nbt.NbtCompound category,java.util.Map pair) { wrapperContained.method_30185(category.wrapperContained,pair); }
// public static void method_30185(yarnwrap.nbt.NbtCompound category,java.util.Map pair, ) { net.minecraft.recipe.book.RecipeBookOptions.method_30185(category.wrapperContained,pair); }
// public yarnwrap.recipe.book.RecipeBookOptions fromPacket(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.fromPacket(buf.wrapperContained)); }
// public static yarnwrap.recipe.book.RecipeBookOptions fromPacket(yarnwrap.network.PacketByteBuf buf, ) { return new yarnwrap.recipe.book.RecipeBookOptions(net.minecraft.recipe.book.RecipeBookOptions.fromPacket(buf.wrapperContained)); }
public boolean isFilteringCraftable(yarnwrap.recipe.book.RecipeBookCategory category) { return wrapperContained.isFilteringCraftable(category.wrapperContained); }
// public static boolean isFilteringCraftable(yarnwrap.recipe.book.RecipeBookCategory category, ) { return net.minecraft.recipe.book.RecipeBookOptions.isFilteringCraftable(category.wrapperContained); }
public void setFilteringCraftable(yarnwrap.recipe.book.RecipeBookCategory category,boolean filtering) { wrapperContained.setFilteringCraftable(category.wrapperContained,filtering); }
// public static void setFilteringCraftable(yarnwrap.recipe.book.RecipeBookCategory category,boolean filtering, ) { net.minecraft.recipe.book.RecipeBookOptions.setFilteringCraftable(category.wrapperContained,filtering); }
public void writeNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeNbt(nbt.wrapperContained); }
// public static void writeNbt(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.recipe.book.RecipeBookOptions.writeNbt(nbt.wrapperContained); }
public void toPacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.toPacket(buf.wrapperContained); }
// public static void toPacket(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.recipe.book.RecipeBookOptions.toPacket(buf.wrapperContained); }

}