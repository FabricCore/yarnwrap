package yarnwrap.item;
public class SpyglassItem { public net.minecraft.item.SpyglassItem wrapperContained; public SpyglassItem(net.minecraft.item.SpyglassItem wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_USE_TIME() { return wrapperContained.MAX_USE_TIME; }
public float FOV_MULTIPLIER() { return wrapperContained.FOV_MULTIPLIER; }
// public void playStopUsingSound(yarnwrap.entity.LivingEntity user) { wrapperContained.playStopUsingSound(user.wrapperContained); }

}