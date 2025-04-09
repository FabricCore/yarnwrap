package yarnwrap.item;
public class ToolMaterial { public net.minecraft.item.ToolMaterial wrapperContained; public ToolMaterial(net.minecraft.item.ToolMaterial wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.ToolComponent createComponent(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.component.type.ToolComponent(wrapperContained.createComponent(tag.wrapperContained)); }
public yarnwrap.registry.tag.TagKey getInverseTag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.getInverseTag()); }
public yarnwrap.recipe.Ingredient getRepairIngredient() { return new yarnwrap.recipe.Ingredient(wrapperContained.getRepairIngredient()); }
public int getDurability() { return wrapperContained.getDurability(); }
public int getEnchantability() { return wrapperContained.getEnchantability(); }
public float getMiningSpeedMultiplier() { return wrapperContained.getMiningSpeedMultiplier(); }
public float getAttackDamage() { return wrapperContained.getAttackDamage(); }

}