package yarnwrap.item;
public class TridentItem { public net.minecraft.item.TridentItem wrapperContained; public TridentItem(net.minecraft.item.TridentItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MIN_DRAW_DURATION() { return wrapperContained.MIN_DRAW_DURATION; }
// public void MIN_DRAW_DURATION(int value) { wrapperContained.MIN_DRAW_DURATION = value; }
public static int MIN_DRAW_DURATION() { return net.minecraft.item.TridentItem.MIN_DRAW_DURATION; }
// public static void MIN_DRAW_DURATION(int value, ) { net.minecraft.item.TridentItem.MIN_DRAW_DURATION = value; }

// public float ATTACK_DAMAGE() { return wrapperContained.ATTACK_DAMAGE; }
// public void ATTACK_DAMAGE(float value) { wrapperContained.ATTACK_DAMAGE = value; }
public static float ATTACK_DAMAGE() { return net.minecraft.item.TridentItem.ATTACK_DAMAGE; }
// public static void ATTACK_DAMAGE(float value, ) { net.minecraft.item.TridentItem.ATTACK_DAMAGE = value; }

// public float THROW_SPEED() { return wrapperContained.THROW_SPEED; }
// public void THROW_SPEED(float value) { wrapperContained.THROW_SPEED = value; }
public static float THROW_SPEED() { return net.minecraft.item.TridentItem.THROW_SPEED; }
// public static void THROW_SPEED(float value, ) { net.minecraft.item.TridentItem.THROW_SPEED = value; }

// public yarnwrap.component.type.AttributeModifiersComponent createAttributeModifiers() { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.createAttributeModifiers()); }
public static yarnwrap.component.type.AttributeModifiersComponent createAttributeModifiers() { return new yarnwrap.component.type.AttributeModifiersComponent(net.minecraft.item.TridentItem.createAttributeModifiers()); }
// public yarnwrap.component.type.ToolComponent createToolComponent() { return new yarnwrap.component.type.ToolComponent(wrapperContained.createToolComponent()); }
public static yarnwrap.component.type.ToolComponent createToolComponent() { return new yarnwrap.component.type.ToolComponent(net.minecraft.item.TridentItem.createToolComponent()); }

}