package yarnwrap.item.equipment;
public class ArmorMaterial { public net.minecraft.item.equipment.ArmorMaterial wrapperContained; public ArmorMaterial(net.minecraft.item.equipment.ArmorMaterial wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.AttributeModifiersComponent createAttributeModifiers(yarnwrap.item.equipment.EquipmentType equipmentType) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.createAttributeModifiers(equipmentType.wrapperContained)); }
// public static yarnwrap.component.type.AttributeModifiersComponent createAttributeModifiers(yarnwrap.item.equipment.EquipmentType equipmentType, ) { return new yarnwrap.component.type.AttributeModifiersComponent(net.minecraft.item.equipment.ArmorMaterial.createAttributeModifiers(equipmentType.wrapperContained)); }

}