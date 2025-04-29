package yarnwrap.item;
public class ToolMaterial { public net.minecraft.item.ToolMaterial wrapperContained; public ToolMaterial(net.minecraft.item.ToolMaterial wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.ToolComponent createComponent(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.component.type.ToolComponent(wrapperContained.createComponent(tag.wrapperContained)); }
// public static yarnwrap.component.type.ToolComponent createComponent(yarnwrap.registry.tag.TagKey tag, ) { return new yarnwrap.component.type.ToolComponent(net.minecraft.item.ToolMaterial.createComponent(tag.wrapperContained)); }
public yarnwrap.registry.tag.TagKey getInverseTag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.getInverseTag()); }
// public static yarnwrap.registry.tag.TagKey getInverseTag() { return new yarnwrap.registry.tag.TagKey(net.minecraft.item.ToolMaterial.getInverseTag()); }
public yarnwrap.recipe.Ingredient getRepairIngredient() { return new yarnwrap.recipe.Ingredient(wrapperContained.getRepairIngredient()); }
// public static yarnwrap.recipe.Ingredient getRepairIngredient() { return new yarnwrap.recipe.Ingredient(net.minecraft.item.ToolMaterial.getRepairIngredient()); }
public int getDurability() { return wrapperContained.getDurability(); }
// public static int getDurability() { return net.minecraft.item.ToolMaterial.getDurability(); }
public int getEnchantability() { return wrapperContained.getEnchantability(); }
// public static int getEnchantability() { return net.minecraft.item.ToolMaterial.getEnchantability(); }
public float getMiningSpeedMultiplier() { return wrapperContained.getMiningSpeedMultiplier(); }
// public static float getMiningSpeedMultiplier() { return net.minecraft.item.ToolMaterial.getMiningSpeedMultiplier(); }
public float getAttackDamage() { return wrapperContained.getAttackDamage(); }
// public static float getAttackDamage() { return net.minecraft.item.ToolMaterial.getAttackDamage(); }

}