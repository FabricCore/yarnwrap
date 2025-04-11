package yarnwrap.item;
public class MiningToolItem { public net.minecraft.item.MiningToolItem wrapperContained; public MiningToolItem(net.minecraft.item.MiningToolItem wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.AttributeModifiersComponent createAttributeModifiers(yarnwrap.item.ToolMaterial material,float baseAttackDamage,float attackSpeed) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.createAttributeModifiers(material.wrapperContained,baseAttackDamage,attackSpeed)); }

}