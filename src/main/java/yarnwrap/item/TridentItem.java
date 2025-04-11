package yarnwrap.item;
public class TridentItem { public net.minecraft.item.TridentItem wrapperContained; public TridentItem(net.minecraft.item.TridentItem wrapperContained) { this.wrapperContained = wrapperContained; }

public int MIN_DRAW_DURATION() { return wrapperContained.MIN_DRAW_DURATION; }
// public void MIN_DRAW_DURATION(int value) { wrapperContained.MIN_DRAW_DURATION = value; }
public float ATTACK_DAMAGE() { return wrapperContained.ATTACK_DAMAGE; }
// public void ATTACK_DAMAGE(float value) { wrapperContained.ATTACK_DAMAGE = value; }
public float THROW_SPEED() { return wrapperContained.THROW_SPEED; }
// public void THROW_SPEED(float value) { wrapperContained.THROW_SPEED = value; }
public yarnwrap.component.type.AttributeModifiersComponent createAttributeModifiers() { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.createAttributeModifiers()); }
public yarnwrap.component.type.ToolComponent createToolComponent() { return new yarnwrap.component.type.ToolComponent(wrapperContained.createToolComponent()); }
// public boolean isAboutToBreak(yarnwrap.item.ItemStack stack) { return wrapperContained.isAboutToBreak(stack.wrapperContained); }

}