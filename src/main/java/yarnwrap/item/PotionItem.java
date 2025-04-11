package yarnwrap.item;
public class PotionItem { public net.minecraft.item.PotionItem wrapperContained; public PotionItem(net.minecraft.item.PotionItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_USE_TIME() { return wrapperContained.MAX_USE_TIME; }
// public void MAX_USE_TIME(int value) { wrapperContained.MAX_USE_TIME = value; }

}