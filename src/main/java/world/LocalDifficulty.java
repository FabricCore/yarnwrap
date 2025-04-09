package yarnwrap.world;
public class LocalDifficulty { public net.minecraft.world.LocalDifficulty wrapperContained; public LocalDifficulty(net.minecraft.world.LocalDifficulty wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.Difficulty globalDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.globalDifficulty); }
// public float localDifficulty() { return wrapperContained.localDifficulty; }
public boolean isAtLeastHard() { return wrapperContained.isAtLeastHard(); }
public yarnwrap.world.Difficulty getGlobalDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.getGlobalDifficulty()); }
public boolean isHarderThan(float difficulty) { return wrapperContained.isHarderThan(difficulty); }
// public float setLocalDifficulty(yarnwrap.world.Difficulty difficulty,long timeOfDay,long inhabitedTime,float moonSize) { return wrapperContained.setLocalDifficulty(difficulty.wrapperContained,timeOfDay,inhabitedTime,moonSize); }
public float getLocalDifficulty() { return wrapperContained.getLocalDifficulty(); }
public float getClampedLocalDifficulty() { return wrapperContained.getClampedLocalDifficulty(); }

}