package yarnwrap.item;
public class ToolMaterial { public net.minecraft.item.ToolMaterial wrapperContained; public ToolMaterial(net.minecraft.item.ToolMaterial wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ToolMaterial WOOD() { return new yarnwrap.item.ToolMaterial(wrapperContained.WOOD); }
// public void WOOD(yarnwrap.item.ToolMaterial value) { wrapperContained.WOOD = value.wrapperContained; }
public static yarnwrap.item.ToolMaterial WOOD() { return new yarnwrap.item.ToolMaterial(net.minecraft.item.ToolMaterial.WOOD); }
// public static void WOOD(yarnwrap.item.ToolMaterial value, ) { net.minecraft.item.ToolMaterial.WOOD = value.wrapperContained; }

// public yarnwrap.item.ToolMaterial STONE() { return new yarnwrap.item.ToolMaterial(wrapperContained.STONE); }
// public void STONE(yarnwrap.item.ToolMaterial value) { wrapperContained.STONE = value.wrapperContained; }
public static yarnwrap.item.ToolMaterial STONE() { return new yarnwrap.item.ToolMaterial(net.minecraft.item.ToolMaterial.STONE); }
// public static void STONE(yarnwrap.item.ToolMaterial value, ) { net.minecraft.item.ToolMaterial.STONE = value.wrapperContained; }

// public yarnwrap.item.ToolMaterial IRON() { return new yarnwrap.item.ToolMaterial(wrapperContained.IRON); }
// public void IRON(yarnwrap.item.ToolMaterial value) { wrapperContained.IRON = value.wrapperContained; }
public static yarnwrap.item.ToolMaterial IRON() { return new yarnwrap.item.ToolMaterial(net.minecraft.item.ToolMaterial.IRON); }
// public static void IRON(yarnwrap.item.ToolMaterial value, ) { net.minecraft.item.ToolMaterial.IRON = value.wrapperContained; }

// public yarnwrap.item.ToolMaterial DIAMOND() { return new yarnwrap.item.ToolMaterial(wrapperContained.DIAMOND); }
// public void DIAMOND(yarnwrap.item.ToolMaterial value) { wrapperContained.DIAMOND = value.wrapperContained; }
public static yarnwrap.item.ToolMaterial DIAMOND() { return new yarnwrap.item.ToolMaterial(net.minecraft.item.ToolMaterial.DIAMOND); }
// public static void DIAMOND(yarnwrap.item.ToolMaterial value, ) { net.minecraft.item.ToolMaterial.DIAMOND = value.wrapperContained; }

// public yarnwrap.item.ToolMaterial GOLD() { return new yarnwrap.item.ToolMaterial(wrapperContained.GOLD); }
// public void GOLD(yarnwrap.item.ToolMaterial value) { wrapperContained.GOLD = value.wrapperContained; }
public static yarnwrap.item.ToolMaterial GOLD() { return new yarnwrap.item.ToolMaterial(net.minecraft.item.ToolMaterial.GOLD); }
// public static void GOLD(yarnwrap.item.ToolMaterial value, ) { net.minecraft.item.ToolMaterial.GOLD = value.wrapperContained; }

// public yarnwrap.item.ToolMaterial NETHERITE() { return new yarnwrap.item.ToolMaterial(wrapperContained.NETHERITE); }
// public void NETHERITE(yarnwrap.item.ToolMaterial value) { wrapperContained.NETHERITE = value.wrapperContained; }
public static yarnwrap.item.ToolMaterial NETHERITE() { return new yarnwrap.item.ToolMaterial(net.minecraft.item.ToolMaterial.NETHERITE); }
// public static void NETHERITE(yarnwrap.item.ToolMaterial value, ) { net.minecraft.item.ToolMaterial.NETHERITE = value.wrapperContained; }

// public yarnwrap.component.type.AttributeModifiersComponent createToolAttributeModifiers(float attackDamage,float attackSpeed) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.createToolAttributeModifiers(attackDamage,attackSpeed)); }
// public static yarnwrap.component.type.AttributeModifiersComponent createToolAttributeModifiers(float attackDamage,float attackSpeed, ) { return new yarnwrap.component.type.AttributeModifiersComponent(net.minecraft.item.ToolMaterial.createToolAttributeModifiers(attackDamage,attackSpeed)); }
// public Object applyBaseSettings(Object settings) { return wrapperContained.applyBaseSettings(settings); }
// public static Object applyBaseSettings(Object settings, ) { return net.minecraft.item.ToolMaterial.applyBaseSettings(settings); }
// public Object applySwordSettings(Object settings,float attackDamage,float attackSpeed) { return wrapperContained.applySwordSettings(settings,attackDamage,attackSpeed); }
// public static Object applySwordSettings(Object settings,float attackDamage,float attackSpeed, ) { return net.minecraft.item.ToolMaterial.applySwordSettings(settings,attackDamage,attackSpeed); }
// public Object applyToolSettings(Object settings,yarnwrap.registry.tag.TagKey effectiveBlocks,float attackDamage,float attackSpeed,float disableBlockingForSeconds) { return wrapperContained.applyToolSettings(settings,effectiveBlocks.wrapperContained,attackDamage,attackSpeed,disableBlockingForSeconds); }
// public static Object applyToolSettings(Object settings,yarnwrap.registry.tag.TagKey effectiveBlocks,float attackDamage,float attackSpeed,float disableBlockingForSeconds, ) { return net.minecraft.item.ToolMaterial.applyToolSettings(settings,effectiveBlocks.wrapperContained,attackDamage,attackSpeed,disableBlockingForSeconds); }
// public yarnwrap.component.type.AttributeModifiersComponent createSwordAttributeModifiers(float attackDamage,float attackSpeed) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.createSwordAttributeModifiers(attackDamage,attackSpeed)); }
// public static yarnwrap.component.type.AttributeModifiersComponent createSwordAttributeModifiers(float attackDamage,float attackSpeed, ) { return new yarnwrap.component.type.AttributeModifiersComponent(net.minecraft.item.ToolMaterial.createSwordAttributeModifiers(attackDamage,attackSpeed)); }

}