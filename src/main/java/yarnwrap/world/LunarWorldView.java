package yarnwrap.world;
public class LunarWorldView { public net.minecraft.world.LunarWorldView wrapperContained; public LunarWorldView(net.minecraft.world.LunarWorldView wrapperContained) { this.wrapperContained = wrapperContained; }

public long getLunarTime() { return wrapperContained.getLunarTime(); }
// public static long getLunarTime() { return net.minecraft.world.LunarWorldView.getLunarTime(); }
public float getMoonSize() { return wrapperContained.getMoonSize(); }
// public static float getMoonSize() { return net.minecraft.world.LunarWorldView.getMoonSize(); }
public int getMoonPhase() { return wrapperContained.getMoonPhase(); }
// public static int getMoonPhase() { return net.minecraft.world.LunarWorldView.getMoonPhase(); }
public float getSkyAngle(float tickProgress) { return wrapperContained.getSkyAngle(tickProgress); }
// public static float getSkyAngle(float tickProgress, ) { return net.minecraft.world.LunarWorldView.getSkyAngle(tickProgress); }

}