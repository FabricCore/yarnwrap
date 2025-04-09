package yarnwrap.item;
public class TridentItem { public net.minecraft.item.TridentItem wrapperContained; public TridentItem(net.minecraft.item.TridentItem wrapperContained) { this.wrapperContained = wrapperContained; }

public int MIN_DRAW_DURATION() { return wrapperContained.MIN_DRAW_DURATION; }
public float ATTACK_DAMAGE() { return wrapperContained.ATTACK_DAMAGE; }
public float THROW_SPEED() { return wrapperContained.THROW_SPEED; }
public yarnwrap.component.type.AttributeModifiersComponent createAttributeModifiers() { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.createAttributeModifiers()); }
public yarnwrap.component.type.ToolComponent createToolComponent() { return new yarnwrap.component.type.ToolComponent(wrapperContained.createToolComponent()); }
// public boolean isAboutToBreak(yarnwrap.item.ItemStack stack) { return wrapperContained.isAboutToBreak(stack.wrapperContained); }

}