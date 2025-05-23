package yarnwrap.item;
public class EnderPearlItem { public net.minecraft.item.EnderPearlItem wrapperContained; public EnderPearlItem(net.minecraft.item.EnderPearlItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public float POWER() { return wrapperContained.POWER; }
// public void POWER(float value) { wrapperContained.POWER = value; }
public static float POWER() { return net.minecraft.item.EnderPearlItem.POWER; }
// public static void POWER(float value, ) { net.minecraft.item.EnderPearlItem.POWER = value; }


}