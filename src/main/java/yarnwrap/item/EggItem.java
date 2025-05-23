package yarnwrap.item;
public class EggItem { public net.minecraft.item.EggItem wrapperContained; public EggItem(net.minecraft.item.EggItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public float POWER() { return wrapperContained.POWER; }
// public void POWER(float value) { wrapperContained.POWER = value; }
public static float POWER() { return net.minecraft.item.EggItem.POWER; }
// public static void POWER(float value, ) { net.minecraft.item.EggItem.POWER = value; }


}