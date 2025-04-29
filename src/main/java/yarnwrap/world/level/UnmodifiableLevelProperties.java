package yarnwrap.world.level;
public class UnmodifiableLevelProperties { public net.minecraft.world.level.UnmodifiableLevelProperties wrapperContained; public UnmodifiableLevelProperties(net.minecraft.world.level.UnmodifiableLevelProperties wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.level.ServerWorldProperties worldProperties() { return new yarnwrap.world.level.ServerWorldProperties(wrapperContained.worldProperties); }
// public void worldProperties(yarnwrap.world.level.ServerWorldProperties value) { wrapperContained.worldProperties = value.wrapperContained; }
// public static yarnwrap.world.level.ServerWorldProperties worldProperties() { return new yarnwrap.world.level.ServerWorldProperties(net.minecraft.world.level.UnmodifiableLevelProperties.worldProperties); }
// public static void worldProperties(yarnwrap.world.level.ServerWorldProperties value, ) { net.minecraft.world.level.UnmodifiableLevelProperties.worldProperties = value.wrapperContained; }

// public yarnwrap.world.SaveProperties saveProperties() { return new yarnwrap.world.SaveProperties(wrapperContained.saveProperties); }
// public void saveProperties(yarnwrap.world.SaveProperties value) { wrapperContained.saveProperties = value.wrapperContained; }
// public static yarnwrap.world.SaveProperties saveProperties() { return new yarnwrap.world.SaveProperties(net.minecraft.world.level.UnmodifiableLevelProperties.saveProperties); }
// public static void saveProperties(yarnwrap.world.SaveProperties value, ) { net.minecraft.world.level.UnmodifiableLevelProperties.saveProperties = value.wrapperContained; }

public UnmodifiableLevelProperties(yarnwrap.world.SaveProperties saveProperties,yarnwrap.world.level.ServerWorldProperties worldProperties) { this.wrapperContained = new net.minecraft.world.level.UnmodifiableLevelProperties(saveProperties.wrapperContained,worldProperties.wrapperContained); }

}