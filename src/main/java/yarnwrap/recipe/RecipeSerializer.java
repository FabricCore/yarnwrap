package yarnwrap.recipe;
public class RecipeSerializer { public net.minecraft.recipe.RecipeSerializer wrapperContained; public RecipeSerializer(net.minecraft.recipe.RecipeSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.recipe.RecipeSerializer BLASTING() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.BLASTING); }
// public void BLASTING(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.BLASTING = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer SMOKING() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.SMOKING); }
// public void SMOKING(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.SMOKING = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer CAMPFIRE_COOKING() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.CAMPFIRE_COOKING); }
// public void CAMPFIRE_COOKING(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.CAMPFIRE_COOKING = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer REPAIR_ITEM() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.REPAIR_ITEM); }
// public void REPAIR_ITEM(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.REPAIR_ITEM = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer ARMOR_DYE() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.ARMOR_DYE); }
// public void ARMOR_DYE(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.ARMOR_DYE = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer BOOK_CLONING() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.BOOK_CLONING); }
// public void BOOK_CLONING(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.BOOK_CLONING = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer SUSPICIOUS_STEW() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.SUSPICIOUS_STEW); }
// public void SUSPICIOUS_STEW(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.SUSPICIOUS_STEW = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer SHAPELESS() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.SHAPELESS); }
// public void SHAPELESS(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.SHAPELESS = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer FIREWORK_STAR_FADE() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.FIREWORK_STAR_FADE); }
// public void FIREWORK_STAR_FADE(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.FIREWORK_STAR_FADE = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer SHAPED() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.SHAPED); }
// public void SHAPED(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.SHAPED = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer FIREWORK_STAR() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.FIREWORK_STAR); }
// public void FIREWORK_STAR(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.FIREWORK_STAR = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer TIPPED_ARROW() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.TIPPED_ARROW); }
// public void TIPPED_ARROW(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.TIPPED_ARROW = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer BANNER_DUPLICATE() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.BANNER_DUPLICATE); }
// public void BANNER_DUPLICATE(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.BANNER_DUPLICATE = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer MAP_EXTENDING() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.MAP_EXTENDING); }
// public void MAP_EXTENDING(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.MAP_EXTENDING = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer SHIELD_DECORATION() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.SHIELD_DECORATION); }
// public void SHIELD_DECORATION(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.SHIELD_DECORATION = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer SHULKER_BOX() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.SHULKER_BOX); }
// public void SHULKER_BOX(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.SHULKER_BOX = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer SMELTING() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.SMELTING); }
// public void SMELTING(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.SMELTING = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer FIREWORK_ROCKET() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.FIREWORK_ROCKET); }
// public void FIREWORK_ROCKET(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.FIREWORK_ROCKET = value.wrapperContained; }
public yarnwrap.recipe.RecipeSerializer MAP_CLONING() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.MAP_CLONING); }
// public void MAP_CLONING(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.MAP_CLONING = value.wrapperContained; }
// public yarnwrap.recipe.RecipeSerializer register(java.lang.String id,yarnwrap.recipe.RecipeSerializer serializer) { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.register(id,serializer.wrapperContained)); }
public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec(); }
public yarnwrap.network.codec.PacketCodec packetCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.packetCodec()); }

}