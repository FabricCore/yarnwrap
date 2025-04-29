package yarnwrap.item;
public class SpyglassItem { public net.minecraft.item.SpyglassItem wrapperContained; public SpyglassItem(net.minecraft.item.SpyglassItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_USE_TIME() { return wrapperContained.MAX_USE_TIME; }
// public void MAX_USE_TIME(int value) { wrapperContained.MAX_USE_TIME = value; }
public static int MAX_USE_TIME() { return net.minecraft.item.SpyglassItem.MAX_USE_TIME; }
// public static void MAX_USE_TIME(int value, ) { net.minecraft.item.SpyglassItem.MAX_USE_TIME = value; }

// public float FOV_MULTIPLIER() { return wrapperContained.FOV_MULTIPLIER; }
// public void FOV_MULTIPLIER(float value) { wrapperContained.FOV_MULTIPLIER = value; }
public static float FOV_MULTIPLIER() { return net.minecraft.item.SpyglassItem.FOV_MULTIPLIER; }
// public static void FOV_MULTIPLIER(float value, ) { net.minecraft.item.SpyglassItem.FOV_MULTIPLIER = value; }

// public void playStopUsingSound(yarnwrap.entity.LivingEntity user) { wrapperContained.playStopUsingSound(user.wrapperContained); }
// public static void playStopUsingSound(yarnwrap.entity.LivingEntity user, ) { net.minecraft.item.SpyglassItem.playStopUsingSound(user.wrapperContained); }

}