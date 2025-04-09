package yarnwrap.recipe;
public class RecipeSerializer { public net.minecraft.recipe.RecipeSerializer wrapperContained; public RecipeSerializer(net.minecraft.recipe.RecipeSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.recipe.RecipeSerializer BLASTING() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.BLASTING); }
public yarnwrap.recipe.RecipeSerializer SMOKING() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.SMOKING); }
public yarnwrap.recipe.RecipeSerializer CAMPFIRE_COOKING() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.CAMPFIRE_COOKING); }
public yarnwrap.recipe.RecipeSerializer REPAIR_ITEM() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.REPAIR_ITEM); }
public yarnwrap.recipe.RecipeSerializer ARMOR_DYE() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.ARMOR_DYE); }
public yarnwrap.recipe.RecipeSerializer BOOK_CLONING() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.BOOK_CLONING); }
public yarnwrap.recipe.RecipeSerializer SUSPICIOUS_STEW() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.SUSPICIOUS_STEW); }
public yarnwrap.recipe.RecipeSerializer SHAPELESS() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.SHAPELESS); }
public yarnwrap.recipe.RecipeSerializer FIREWORK_STAR_FADE() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.FIREWORK_STAR_FADE); }
public yarnwrap.recipe.RecipeSerializer SHAPED() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.SHAPED); }
public yarnwrap.recipe.RecipeSerializer FIREWORK_STAR() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.FIREWORK_STAR); }
public yarnwrap.recipe.RecipeSerializer TIPPED_ARROW() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.TIPPED_ARROW); }
public yarnwrap.recipe.RecipeSerializer BANNER_DUPLICATE() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.BANNER_DUPLICATE); }
public yarnwrap.recipe.RecipeSerializer MAP_EXTENDING() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.MAP_EXTENDING); }
public yarnwrap.recipe.RecipeSerializer SHIELD_DECORATION() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.SHIELD_DECORATION); }
public yarnwrap.recipe.RecipeSerializer SHULKER_BOX() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.SHULKER_BOX); }
public yarnwrap.recipe.RecipeSerializer SMELTING() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.SMELTING); }
public yarnwrap.recipe.RecipeSerializer FIREWORK_ROCKET() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.FIREWORK_ROCKET); }
public yarnwrap.recipe.RecipeSerializer MAP_CLONING() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.MAP_CLONING); }
// public yarnwrap.recipe.RecipeSerializer register(java.lang.String id,yarnwrap.recipe.RecipeSerializer serializer) { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.register(id,serializer.wrapperContained)); }
public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec(); }
public yarnwrap.network.codec.PacketCodec packetCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.packetCodec()); }

}