package yarnwrap.item;
public class MiningToolItem { public net.minecraft.item.MiningToolItem wrapperContained; public MiningToolItem(net.minecraft.item.MiningToolItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public MiningToolItem(yarnwrap.item.ToolMaterial material,yarnwrap.registry.tag.TagKey effectiveBlocks,Object settings) { this.wrapperContained = new net.minecraft.item.MiningToolItem(material.wrapperContained,effectiveBlocks.wrapperContained,settings); }
// public yarnwrap.component.type.AttributeModifiersComponent createAttributeModifiers(yarnwrap.item.ToolMaterial material,float baseAttackDamage,float attackSpeed) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.createAttributeModifiers(material.wrapperContained,baseAttackDamage,attackSpeed)); }
// public static yarnwrap.component.type.AttributeModifiersComponent createAttributeModifiers(yarnwrap.item.ToolMaterial material,float baseAttackDamage,float attackSpeed, ) { return new yarnwrap.component.type.AttributeModifiersComponent(net.minecraft.item.MiningToolItem.createAttributeModifiers(material.wrapperContained,baseAttackDamage,attackSpeed)); }

}