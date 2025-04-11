package yarnwrap.world;
public class LunarWorldView { public net.minecraft.world.LunarWorldView wrapperContained; public LunarWorldView(net.minecraft.world.LunarWorldView wrapperContained) { this.wrapperContained = wrapperContained; }

public long getLunarTime() { return wrapperContained.getLunarTime(); }
public float getMoonSize() { return wrapperContained.getMoonSize(); }
public int getMoonPhase() { return wrapperContained.getMoonPhase(); }
public float getSkyAngle(float tickDelta) { return wrapperContained.getSkyAngle(tickDelta); }

}