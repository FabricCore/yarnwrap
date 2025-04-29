package yarnwrap.item;
public class PotionItem { public net.minecraft.item.PotionItem wrapperContained; public PotionItem(net.minecraft.item.PotionItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_USE_TIME() { return wrapperContained.MAX_USE_TIME; }
// public void MAX_USE_TIME(int value) { wrapperContained.MAX_USE_TIME = value; }
// public static int MAX_USE_TIME() { return net.minecraft.item.PotionItem.MAX_USE_TIME; }
// public static void MAX_USE_TIME(int value, ) { net.minecraft.item.PotionItem.MAX_USE_TIME = value; }

// public void method_57389(yarnwrap.entity.player.PlayerEntity effect) { wrapperContained.method_57389(effect.wrapperContained); }
// public static void method_57389(yarnwrap.entity.player.PlayerEntity effect, ) { net.minecraft.item.PotionItem.method_57389(effect.wrapperContained); }

}