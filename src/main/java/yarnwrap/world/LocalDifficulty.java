package yarnwrap.world;
public class LocalDifficulty { public net.minecraft.world.LocalDifficulty wrapperContained; public LocalDifficulty(net.minecraft.world.LocalDifficulty wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.Difficulty globalDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.globalDifficulty); }
// public void globalDifficulty(yarnwrap.world.Difficulty value) { wrapperContained.globalDifficulty = value.wrapperContained; }
// public static yarnwrap.world.Difficulty globalDifficulty() { return new yarnwrap.world.Difficulty(net.minecraft.world.LocalDifficulty.globalDifficulty); }
// public static void globalDifficulty(yarnwrap.world.Difficulty value, ) { net.minecraft.world.LocalDifficulty.globalDifficulty = value.wrapperContained; }

// public float localDifficulty() { return wrapperContained.localDifficulty; }
// public void localDifficulty(float value) { wrapperContained.localDifficulty = value; }
// public static float localDifficulty() { return net.minecraft.world.LocalDifficulty.localDifficulty; }
// public static void localDifficulty(float value, ) { net.minecraft.world.LocalDifficulty.localDifficulty = value; }

public LocalDifficulty(yarnwrap.world.Difficulty difficulty,long timeOfDay,long inhabitedTime,float moonSize) { this.wrapperContained = new net.minecraft.world.LocalDifficulty(difficulty.wrapperContained,timeOfDay,inhabitedTime,moonSize); }
public boolean isAtLeastHard() { return wrapperContained.isAtLeastHard(); }
// public static boolean isAtLeastHard() { return net.minecraft.world.LocalDifficulty.isAtLeastHard(); }
public yarnwrap.world.Difficulty getGlobalDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.getGlobalDifficulty()); }
// public static yarnwrap.world.Difficulty getGlobalDifficulty() { return new yarnwrap.world.Difficulty(net.minecraft.world.LocalDifficulty.getGlobalDifficulty()); }
public boolean isHarderThan(float difficulty) { return wrapperContained.isHarderThan(difficulty); }
// public static boolean isHarderThan(float difficulty, ) { return net.minecraft.world.LocalDifficulty.isHarderThan(difficulty); }
// public float setLocalDifficulty(yarnwrap.world.Difficulty difficulty,long timeOfDay,long inhabitedTime,float moonSize) { return wrapperContained.setLocalDifficulty(difficulty.wrapperContained,timeOfDay,inhabitedTime,moonSize); }
// public static float setLocalDifficulty(yarnwrap.world.Difficulty difficulty,long timeOfDay,long inhabitedTime,float moonSize, ) { return net.minecraft.world.LocalDifficulty.setLocalDifficulty(difficulty.wrapperContained,timeOfDay,inhabitedTime,moonSize); }
public float getLocalDifficulty() { return wrapperContained.getLocalDifficulty(); }
// public static float getLocalDifficulty() { return net.minecraft.world.LocalDifficulty.getLocalDifficulty(); }
public float getClampedLocalDifficulty() { return wrapperContained.getClampedLocalDifficulty(); }
// public static float getClampedLocalDifficulty() { return net.minecraft.world.LocalDifficulty.getClampedLocalDifficulty(); }

}