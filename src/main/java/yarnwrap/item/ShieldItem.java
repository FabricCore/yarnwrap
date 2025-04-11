package yarnwrap.item;
public class ShieldItem { public net.minecraft.item.ShieldItem wrapperContained; public ShieldItem(net.minecraft.item.ShieldItem wrapperContained) { this.wrapperContained = wrapperContained; }

public float MIN_DAMAGE_AMOUNT_TO_BREAK() { return wrapperContained.MIN_DAMAGE_AMOUNT_TO_BREAK; }
// public void MIN_DAMAGE_AMOUNT_TO_BREAK(float value) { wrapperContained.MIN_DAMAGE_AMOUNT_TO_BREAK = value; }

}