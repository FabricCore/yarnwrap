package yarnwrap.item;
public class OminousBottleItem { public net.minecraft.item.OminousBottleItem wrapperContained; public OminousBottleItem(net.minecraft.item.OminousBottleItem wrapperContained) { this.wrapperContained = wrapperContained; }

public int BAD_OMEN_LENGTH() { return wrapperContained.BAD_OMEN_LENGTH; }
// public int MAX_USE_TIME() { return wrapperContained.MAX_USE_TIME; }

}