package yarnwrap.item;
public class SnowballItem { public net.minecraft.item.SnowballItem wrapperContained; public SnowballItem(net.minecraft.item.SnowballItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public float POWER() { return wrapperContained.POWER; }
// public void POWER(float value) { wrapperContained.POWER = value; }
public static float POWER() { return net.minecraft.item.SnowballItem.POWER; }
// public static void POWER(float value, ) { net.minecraft.item.SnowballItem.POWER = value; }


}