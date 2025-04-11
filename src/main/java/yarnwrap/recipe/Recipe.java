package yarnwrap.recipe;
public class Recipe { public net.minecraft.recipe.Recipe wrapperContained; public Recipe(net.minecraft.recipe.Recipe wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public yarnwrap.item.ItemStack createIcon() { return new yarnwrap.item.ItemStack(wrapperContained.createIcon()); }
public yarnwrap.recipe.RecipeType getType() { return new yarnwrap.recipe.RecipeType(wrapperContained.getType()); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public boolean showNotification() { return wrapperContained.showNotification(); }
// public yarnwrap.item.ItemStack getResult(Object registriesLookup) { return new yarnwrap.item.ItemStack(wrapperContained.getResult(registriesLookup)); }
public yarnwrap.util.collection.DefaultedList getRemainder(yarnwrap.recipe.input.RecipeInput input) { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getRemainder(input.wrapperContained)); }
public java.lang.String getGroup() { return wrapperContained.getGroup(); }
public boolean fits(int width,int height) { return wrapperContained.fits(width,height); }
public boolean matches(yarnwrap.recipe.input.RecipeInput input,yarnwrap.world.World world) { return wrapperContained.matches(input.wrapperContained,world.wrapperContained); }
// public yarnwrap.item.ItemStack craft(yarnwrap.recipe.input.RecipeInput input,Object lookup) { return new yarnwrap.item.ItemStack(wrapperContained.craft(input.wrapperContained,lookup)); }
public yarnwrap.util.collection.DefaultedList getIngredients() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getIngredients()); }
public boolean isIgnoredInRecipeBook() { return wrapperContained.isIgnoredInRecipeBook(); }
public yarnwrap.recipe.RecipeSerializer getSerializer() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.getSerializer()); }

}