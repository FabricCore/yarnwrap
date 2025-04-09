package yarnwrap.item;
public class SwordItem { public net.minecraft.item.SwordItem wrapperContained; public SwordItem(net.minecraft.item.SwordItem wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.AttributeModifiersComponent createAttributeModifiers(yarnwrap.item.ToolMaterial material,int baseAttackDamage,float attackSpeed) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.createAttributeModifiers(material.wrapperContained,baseAttackDamage,attackSpeed)); }
// public yarnwrap.component.type.ToolComponent createToolComponent() { return new yarnwrap.component.type.ToolComponent(wrapperContained.createToolComponent()); }

}