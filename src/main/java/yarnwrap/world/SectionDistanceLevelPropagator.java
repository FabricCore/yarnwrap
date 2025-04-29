package yarnwrap.world;
public class SectionDistanceLevelPropagator { public net.minecraft.world.SectionDistanceLevelPropagator wrapperContained; public SectionDistanceLevelPropagator(net.minecraft.world.SectionDistanceLevelPropagator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int getInitialLevel(long id) { return wrapperContained.getInitialLevel(id); }
// public static int getInitialLevel(long id, ) { return net.minecraft.world.SectionDistanceLevelPropagator.getInitialLevel(id); }
public void update(long id,int level,boolean decrease) { wrapperContained.update(id,level,decrease); }
// public static void update(long id,int level,boolean decrease, ) { net.minecraft.world.SectionDistanceLevelPropagator.update(id,level,decrease); }

}