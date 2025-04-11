package yarnwrap.world.level;
public class UnmodifiableLevelProperties { public net.minecraft.world.level.UnmodifiableLevelProperties wrapperContained; public UnmodifiableLevelProperties(net.minecraft.world.level.UnmodifiableLevelProperties wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.level.ServerWorldProperties worldProperties() { return new yarnwrap.world.level.ServerWorldProperties(wrapperContained.worldProperties); }
// public void worldProperties(yarnwrap.world.level.ServerWorldProperties value) { wrapperContained.worldProperties = value.wrapperContained; }
// public yarnwrap.world.SaveProperties saveProperties() { return new yarnwrap.world.SaveProperties(wrapperContained.saveProperties); }
// public void saveProperties(yarnwrap.world.SaveProperties value) { wrapperContained.saveProperties = value.wrapperContained; }

}